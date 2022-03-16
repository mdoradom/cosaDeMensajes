package com.example.firebasetemplate;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class NavGraphDirections {
  private NavGraphDirections() {
  }

  @NonNull
  public static ActionGlobalPostDetailsFragment actionGlobalPostDetailsFragment() {
    return new ActionGlobalPostDetailsFragment();
  }

  public static class ActionGlobalPostDetailsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionGlobalPostDetailsFragment() {
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionGlobalPostDetailsFragment setPostid(@NonNull String postid) {
      if (postid == null) {
        throw new IllegalArgumentException("Argument \"postid\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("postid", postid);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("postid")) {
        String postid = (String) arguments.get("postid");
        __result.putString("postid", postid);
      } else {
        __result.putString("postid", "0");
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_global_postDetailsFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getPostid() {
      return (String) arguments.get("postid");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionGlobalPostDetailsFragment that = (ActionGlobalPostDetailsFragment) object;
      if (arguments.containsKey("postid") != that.arguments.containsKey("postid")) {
        return false;
      }
      if (getPostid() != null ? !getPostid().equals(that.getPostid()) : that.getPostid() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getPostid() != null ? getPostid().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionGlobalPostDetailsFragment(actionId=" + getActionId() + "){"
          + "postid=" + getPostid()
          + "}";
    }
  }
}
