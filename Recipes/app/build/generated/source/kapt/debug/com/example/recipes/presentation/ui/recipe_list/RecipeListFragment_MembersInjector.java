package com.example.recipes.presentation.ui.recipe_list;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import error.NonExistentClass;
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
public final class RecipeListFragment_MembersInjector implements MembersInjector<RecipeListFragment> {
  private final Provider<NonExistentClass> applicationProvider;

  public RecipeListFragment_MembersInjector(Provider<NonExistentClass> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  public static MembersInjector<RecipeListFragment> create(
      Provider<NonExistentClass> applicationProvider) {
    return new RecipeListFragment_MembersInjector(applicationProvider);
  }

  @Override
  public void injectMembers(RecipeListFragment instance) {
    injectApplication(instance, applicationProvider.get());
  }

  @InjectedFieldSignature("com.example.recipes.presentation.ui.recipe_list.RecipeListFragment.application")
  public static void injectApplication(RecipeListFragment instance, NonExistentClass application) {
    instance.application = application;
  }
}
