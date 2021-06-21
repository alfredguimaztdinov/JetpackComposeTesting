package com.example.recipes.presentation.ui.recipe;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.example.recipes.repository.RecipeRepository;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class RecipeViewModel_AssistedFactory implements ViewModelAssistedFactory<RecipeViewModel> {
  private final Provider<RecipeRepository> recipeRepository;

  private final Provider<String> token;

  @Inject
  RecipeViewModel_AssistedFactory(Provider<RecipeRepository> recipeRepository,
      @Named("auth_token") Provider<String> token) {
    this.recipeRepository = recipeRepository;
    this.token = token;
  }

  @Override
  @NonNull
  public RecipeViewModel create(@NonNull SavedStateHandle arg0) {
    return new RecipeViewModel(recipeRepository.get(), token.get(), arg0);
  }
}
