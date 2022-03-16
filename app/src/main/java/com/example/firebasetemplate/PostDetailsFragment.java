package com.example.firebasetemplate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.firebasetemplate.databinding.FragmentPostDetailsBinding;
import com.example.firebasetemplate.databinding.FragmentPostsBinding;
import com.example.firebasetemplate.databinding.FragmentProfileBinding;
import com.example.firebasetemplate.model.Post;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PostDetailsFragment extends AppFragment {

    private FragmentPostDetailsBinding binding;
    private String postid;
    private Post post;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return (binding = FragmentPostDetailsBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        postid = PostDetailsFragmentArgs.fromBundle(getArguments()).getPostid();

        db.collection("posts").document(postid).addSnapshotListener((value, error) -> {
            post = value.toObject(Post.class);
            // set values
            Glide.with(this).load(post.authorImage)
                    .circleCrop()
                    .into(binding.autorFoto);

            binding.autor.setText(post.authorName);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            SimpleDateFormat output = new SimpleDateFormat("HH:mm · d MMM YYYY");

            Date d = null;
            try {
                d = sdf.parse(post.date);
            } catch (ParseException parseException) {
                parseException.printStackTrace();
            }

            String formattedTime = output.format(d);

            binding.date.setText(formattedTime.toLowerCase());

            binding.contenido.setText(post.content);

            Glide.with(this).load(post.imageUrl)
                    .centerCrop()
                    .into(binding.imagen);

            binding.numLikes.setText(String.valueOf(post.likes.size()));


        });

    }

}