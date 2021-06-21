package com.example.recipes.presentation.ui.recipe;

import com.example.recipes.BaseApplication;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RecipeFragment_MembersInjector implements MembersInjector<RecipeFragment> {
  private final Provider<BaseApplication> applicationProvider;

  public RecipeFragment_MembersInjector(Provider<BaseApplication> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  public static MembersInjector<RecipeFragment> create(
      Provider<BaseApplication> applicationProvider) {
    return new RecipeFragment_MembersInjector(applicationProvider);
  }

  @Override
  public void injectMembers(RecipeFragment instance) {
    injectApplication(instance, applicationProvider.get());
  }

  @InjectedFieldSignature("com.example.recipes.presentation.ui.recipe.RecipeFragment.application")
  public static void injectApplication(RecipeFragment instance, BaseApplication application) {
    instance.application = application;
  }
}
