// Generated by view binder compiler. Do not edit!
package com.example.firebasetemplate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.firebasetemplate.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final ImageView cameraIcon;

  @NonNull
  public final ImageView editUsername;

  @NonNull
  public final ImageView profilePic;

  @NonNull
  public final TextInputEditText username;

  @NonNull
  public final TextInputLayout usernameBox;

  private FragmentProfileBinding(@NonNull FrameLayout rootView, @NonNull ImageView cameraIcon,
      @NonNull ImageView editUsername, @NonNull ImageView profilePic,
      @NonNull TextInputEditText username, @NonNull TextInputLayout usernameBox) {
    this.rootView = rootView;
    this.cameraIcon = cameraIcon;
    this.editUsername = editUsername;
    this.profilePic = profilePic;
    this.username = username;
    this.usernameBox = usernameBox;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cameraIcon;
      ImageView cameraIcon = ViewBindings.findChildViewById(rootView, id);
      if (cameraIcon == null) {
        break missingId;
      }

      id = R.id.editUsername;
      ImageView editUsername = ViewBindings.findChildViewById(rootView, id);
      if (editUsername == null) {
        break missingId;
      }

      id = R.id.profilePic;
      ImageView profilePic = ViewBindings.findChildViewById(rootView, id);
      if (profilePic == null) {
        break missingId;
      }

      id = R.id.username;
      TextInputEditText username = ViewBindings.findChildViewById(rootView, id);
      if (username == null) {
        break missingId;
      }

      id = R.id.usernameBox;
      TextInputLayout usernameBox = ViewBindings.findChildViewById(rootView, id);
      if (usernameBox == null) {
        break missingId;
      }

      return new FragmentProfileBinding((FrameLayout) rootView, cameraIcon, editUsername,
          profilePic, username, usernameBox);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
