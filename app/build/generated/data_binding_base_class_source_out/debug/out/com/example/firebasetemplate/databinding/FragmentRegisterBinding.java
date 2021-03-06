// Generated by view binder compiler. Do not edit!
package com.example.firebasetemplate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.firebasetemplate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRegisterBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button createAccountButton;

  @NonNull
  public final EditText emailEditText;

  @NonNull
  public final EditText nameEditText;

  @NonNull
  public final EditText passwordEditText;

  @NonNull
  public final ImageView previsualizacion;

  @NonNull
  public final Button verifyEmailButton;

  private FragmentRegisterBinding(@NonNull FrameLayout rootView,
      @NonNull Button createAccountButton, @NonNull EditText emailEditText,
      @NonNull EditText nameEditText, @NonNull EditText passwordEditText,
      @NonNull ImageView previsualizacion, @NonNull Button verifyEmailButton) {
    this.rootView = rootView;
    this.createAccountButton = createAccountButton;
    this.emailEditText = emailEditText;
    this.nameEditText = nameEditText;
    this.passwordEditText = passwordEditText;
    this.previsualizacion = previsualizacion;
    this.verifyEmailButton = verifyEmailButton;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.createAccountButton;
      Button createAccountButton = ViewBindings.findChildViewById(rootView, id);
      if (createAccountButton == null) {
        break missingId;
      }

      id = R.id.emailEditText;
      EditText emailEditText = ViewBindings.findChildViewById(rootView, id);
      if (emailEditText == null) {
        break missingId;
      }

      id = R.id.nameEditText;
      EditText nameEditText = ViewBindings.findChildViewById(rootView, id);
      if (nameEditText == null) {
        break missingId;
      }

      id = R.id.passwordEditText;
      EditText passwordEditText = ViewBindings.findChildViewById(rootView, id);
      if (passwordEditText == null) {
        break missingId;
      }

      id = R.id.previsualizacion;
      ImageView previsualizacion = ViewBindings.findChildViewById(rootView, id);
      if (previsualizacion == null) {
        break missingId;
      }

      id = R.id.verifyEmailButton;
      Button verifyEmailButton = ViewBindings.findChildViewById(rootView, id);
      if (verifyEmailButton == null) {
        break missingId;
      }

      return new FragmentRegisterBinding((FrameLayout) rootView, createAccountButton, emailEditText,
          nameEditText, passwordEditText, previsualizacion, verifyEmailButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
