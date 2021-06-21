package com.example.recipes.presentation.ui.recipe_list;

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
public final class RecipeListViewModel_AssistedFactory implements ViewModelAssistedFactory<RecipeListViewModel> {
  private final Provider<RecipeRepository> repository;

  private final Provider<String> token;

  @Inject
  RecipeListViewModel_AssistedFactory(Provider<RecipeRepository> repository,
      @Named("auth_token") Provider<String> token) {
    this.repository = repository;
    this.token = token;
  }

  @Override
  @NonNull
  public RecipeListViewModel create(@NonNull SavedStateHandle arg0) {
    return new RecipeListViewModel(repository.get(), token.get(), arg0);
  }
}
