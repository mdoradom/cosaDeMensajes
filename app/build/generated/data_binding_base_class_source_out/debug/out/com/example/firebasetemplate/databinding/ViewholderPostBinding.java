// Generated by view binder compiler. Do not edit!
package com.example.firebasetemplate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.firebasetemplate.R;
import com.google.android.material.checkbox.MaterialCheckBox;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewholderPostBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView autor;

  @NonNull
  public final ImageView autorFoto;

  @NonNull
  public final TextView contenido;

  @NonNull
  public final MaterialCheckBox favorito;

  @NonNull
  public final ImageView imagen;

  private ViewholderPostBinding(@NonNull CardView rootView, @NonNull TextView autor,
      @NonNull ImageView autorFoto, @NonNull TextView contenido, @NonNull MaterialCheckBox favorito,
      @NonNull ImageView imagen) {
    this.rootView = rootView;
    this.autor = autor;
    this.autorFoto = autorFoto;
    this.contenido = contenido;
    this.favorito = favorito;
    this.imagen = imagen;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewholderPostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewholderPostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.viewholder_post, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewholderPostBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.autor;
      TextView autor = ViewBindings.findChildViewById(rootView, id);
      if (autor == null) {
        break missingId;
      }

      id = R.id.autorFoto;
      ImageView autorFoto = ViewBindings.findChildViewById(rootView, id);
      if (autorFoto == null) {
        break missingId;
      }

      id = R.id.contenido;
      TextView contenido = ViewBindings.findChildViewById(rootView, id);
      if (contenido == null) {
        break missingId;
      }

      id = R.id.favorito;
      MaterialCheckBox favorito = ViewBindings.findChildViewById(rootView, id);
      if (favorito == null) {
        break missingId;
      }

      id = R.id.imagen;
      ImageView imagen = ViewBindings.findChildViewById(rootView, id);
      if (imagen == null) {
        break missingId;
      }

      return new ViewholderPostBinding((CardView) rootView, autor, autorFoto, contenido, favorito,
          imagen);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}