package com.example.firebasetemplate;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class NavigationDirections {
  private NavigationDirections() {
  }

  @NonNull
  public static NavDirections actionPostsHomeFragmentToNewPostFragment() {
    return new ActionOnlyNavDirections(R.id.action_postsHomeFragment_to_newPostFragment);
  }

  @NonNull
  public static NavDirections actionPostsHomeFragmentToSignOutFragment() {
    return new ActionOnlyNavDirections(R.id.action_postsHomeFragment_to_signOutFragment);
  }

  @NonNull
  public static NavDirections actionPostsHomeFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_postsHomeFragment_to_profileFragment);
  }

  @NonNull
  public static NavGraphDirections.ActionGlobalPostDetailsFragment actionGlobalPostDetailsFragment(
      ) {
    return NavGraphDirections.actionGlobalPostDetailsFragment();
  }
}
