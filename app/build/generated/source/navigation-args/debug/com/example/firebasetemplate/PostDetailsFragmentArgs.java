package com.example.firebasetemplate;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class PostDetailsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private PostDetailsFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private PostDetailsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PostDetailsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    PostDetailsFragmentArgs __result = new PostDetailsFragmentArgs();
    bundle.setClassLoader(PostDetailsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("postid")) {
      String postid;
      postid = bundle.getString("postid");
      if (postid == null) {
        throw new IllegalArgumentException("Argument \"postid\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("postid", postid);
    } else {
      __result.arguments.put("postid", "0");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static PostDetailsFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    PostDetailsFragmentArgs __result = new PostDetailsFragmentArgs();
    if (savedStateHandle.contains("postid")) {
      String postid;
      postid = savedStateHandle.get("postid");
      if (postid == null) {
        throw new IllegalArgumentException("Argument \"postid\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("postid", postid);
    } else {
      __result.arguments.put("postid", "0");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getPostid() {
    return (String) arguments.get("postid");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("postid")) {
      String postid = (String) arguments.get("postid");
      __result.putString("postid", postid);
    } else {
      __result.putString("postid", "0");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("postid")) {
      String postid = (String) arguments.get("postid");
      __result.set("postid", postid);
    } else {
      __result.set("postid", "0");
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    PostDetailsFragmentArgs that = (PostDetailsFragmentArgs) object;
    if (arguments.containsKey("postid") != that.arguments.containsKey("postid")) {
      return false;
    }
    if (getPostid() != null ? !getPostid().equals(that.getPostid()) : that.getPostid() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getPostid() != null ? getPostid().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "PostDetailsFragmentArgs{"
        + "postid=" + getPostid()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull PostDetailsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder() {
    }

    @NonNull
    public PostDetailsFragmentArgs build() {
      PostDetailsFragmentArgs result = new PostDetailsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setPostid(@NonNull String postid) {
      if (postid == null) {
        throw new IllegalArgumentException("Argument \"postid\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("postid", postid);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public String getPostid() {
      return (String) arguments.get("postid");
    }
  }
}
