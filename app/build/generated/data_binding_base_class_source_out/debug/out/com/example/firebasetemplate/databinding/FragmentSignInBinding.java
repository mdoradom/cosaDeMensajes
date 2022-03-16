// Generated by view binder compiler. Do not edit!
package com.example.firebasetemplate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.firebasetemplate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final View divider;

  @NonNull
  public final EditText email;

  @NonNull
  public final Button emailSignIn;

  @NonNull
  public final TextView goToRegister;

  @NonNull
  public final Button googleSignIn;

  @NonNull
  public final EditText password;

  @NonNull
  public final LinearLayout signInForm;

  @NonNull
  public final ProgressBar signInProgressBar;

  private FragmentSignInBinding(@NonNull ConstraintLayout rootView, @NonNull View divider,
      @NonNull EditText email, @NonNull Button emailSignIn, @NonNull TextView goToRegister,
      @NonNull Button googleSignIn, @NonNull EditText password, @NonNull LinearLayout signInForm,
      @NonNull ProgressBar signInProgressBar) {
    this.rootView = rootView;
    this.divider = divider;
    this.email = email;
    this.emailSignIn = emailSignIn;
    this.goToRegister = goToRegister;
    this.googleSignIn = googleSignIn;
    this.password = password;
    this.signInForm = signInForm;
    this.signInProgressBar = signInProgressBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.divider;
      View divider = ViewBindings.findChildViewById(rootView, id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.email;
      EditText email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.emailSignIn;
      Button emailSignIn = ViewBindings.findChildViewById(rootView, id);
      if (emailSignIn == null) {
        break missingId;
      }

      id = R.id.goToRegister;
      TextView goToRegister = ViewBindings.findChildViewById(rootView, id);
      if (goToRegister == null) {
        break missingId;
      }

      id = R.id.googleSignIn;
      Button googleSignIn = ViewBindings.findChildViewById(rootView, id);
      if (googleSignIn == null) {
        break missingId;
      }

      id = R.id.password;
      EditText password = ViewBindings.findChildViewById(rootView, id);
      if (password == null) {
        break missingId;
      }

      id = R.id.signInForm;
      LinearLayout signInForm = ViewBindings.findChildViewById(rootView, id);
      if (signInForm == null) {
        break missingId;
      }

      id = R.id.signInProgressBar;
      ProgressBar signInProgressBar = ViewBindings.findChildViewById(rootView, id);
      if (signInProgressBar == null) {
        break missingId;
      }

      return new FragmentSignInBinding((ConstraintLayout) rootView, divider, email, emailSignIn,
          goToRegister, googleSignIn, password, signInForm, signInProgressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}