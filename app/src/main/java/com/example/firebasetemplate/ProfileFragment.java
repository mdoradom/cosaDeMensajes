package com.example.firebasetemplate;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.example.firebasetemplate.databinding.FragmentProfileBinding;
import com.example.firebasetemplate.model.Post;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.storage.FirebaseStorage;
import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public class ProfileFragment extends AppFragment {

    private FragmentProfileBinding binding;
    private Uri uriImagen;
    private List<Post> postsList = new ArrayList<>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentProfileBinding.inflate(inflater, container, false)).getRoot();
    }

    private final ActivityResultLauncher<String> galeria = registerForActivityResult(new ActivityResultContracts.GetContent(), uri -> {
        appViewModel.setUriImagenSeleccionada(uri);
    });

    Query setQuery() {
        return db.collection("posts").whereEqualTo("authorName", auth.getCurrentUser().getEmail());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        Glide.with(this).load(user.getPhotoUrl()).circleCrop().into(binding.profilePic);
        Glide.with(this).load(R.drawable.ic_baseline_photo_camera_24).circleCrop().into(binding.cameraIcon);
        binding.username.setHint(user.getDisplayName());

        binding.cameraIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                galeria.launch("image/*");

                updateProfPic();
            }
        });

        binding.editUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateUsername(String.valueOf(binding.username.getText()));
            }
        });

    }

    public void updateUsername(String userName) {

        // PROBAR COSAS
        UserProfileChangeRequest profileChangeRequest = new UserProfileChangeRequest.Builder()
                .setDisplayName(userName)
                .build();

        FirebaseAuth.getInstance().getCurrentUser().updateProfile(profileChangeRequest)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getContext(), "Updated Profile Name", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getContext(), "Error. Try again.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    public void updatePostsPic(String postId, String authorImage) {
        db.collection("posts")
                .document(postId)
                .update("authorImage", authorImage);
    }

    public void updateProfPic() {
        // lanzar galeria

        // cambiar imagen de perfil antigua por la nueva
        appViewModel.uriImagenSeleccionada.observe(getViewLifecycleOwner(), uri -> {
            uriImagen = uri;

            // sube la imagen a firebase
            FirebaseStorage.getInstance()
                    .getReference("/images/" + UUID.randomUUID() + ".jpg")
                    .putFile(uriImagen)
                    .continueWithTask(task -> task.getResult().getStorage().getDownloadUrl())
                    .addOnCompleteListener(uriDescarga -> {
                        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

                        // crea petición para cambiar imagen
                        UserProfileChangeRequest profileChangeRequest = new UserProfileChangeRequest.Builder()
                                .setPhotoUri(uriDescarga.getResult())
                                .build();

                        // envia la petición
                        user.updateProfile(profileChangeRequest)
                                .addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {
                                        if (task.isSuccessful()) {
                                            Glide.with(getContext()).load(uri).circleCrop().into(binding.profilePic);
                                            Toast.makeText(getContext(), "Updated Profile Picture", Toast.LENGTH_SHORT).show();

                                            // update all photos from all the posts from the user
                                            setQuery().addSnapshotListener((collectionSnapshot, e) -> {
                                                postsList.clear();
                                                for (DocumentSnapshot documentSnapshot: collectionSnapshot) {
                                                    Post post = documentSnapshot.toObject(Post.class);
                                                    post.postid = documentSnapshot.getId();
                                                    postsList.add(post);
                                                }

                                                for (Post x : postsList) {
                                                    updatePostsPic(x.postid, String.valueOf(user.getPhotoUrl()));
                                                }
                                            });

                                        } else {
                                            Toast.makeText(getContext(), "Error. Try again.", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });

                    });
        });

    }
}