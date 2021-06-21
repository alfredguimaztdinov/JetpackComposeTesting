package com.example.recipes.di;

import com.example.recipes.network.RecipeService;
import com.example.recipes.network.model.RecipeDtoMapper;
import com.example.recipes.repository.RecipeRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RepositoryModule_ProvideRecipeRepositoryFactory implements Factory<RecipeRepository> {
  private final Provider<RecipeService> recipeServiceProvider;

  private final Provider<RecipeDtoMapper> recipeMapperProvider;

  public RepositoryModule_ProvideRecipeRepositoryFactory(
      Provider<RecipeService> recipeServiceProvider,
      Provider<RecipeDtoMapper> recipeMapperProvider) {
    this.recipeServiceProvider = recipeServiceProvider;
    this.recipeMapperProvider = recipeMapperProvider;
  }

  @Override
  public RecipeRepository get() {
    return provideRecipeRepository(recipeServiceProvider.get(), recipeMapperProvider.get());
  }

  public static RepositoryModule_ProvideRecipeRepositoryFactory create(
      Provider<RecipeService> recipeServiceProvider,
      Provider<RecipeDtoMapper> recipeMapperProvider) {
    return new RepositoryModule_ProvideRecipeRepositoryFactory(recipeServiceProvider, recipeMapperProvider);
  }

  public static RecipeRepository provideRecipeRepository(RecipeService recipeService,
      RecipeDtoMapper recipeMapper) {
    return Preconditions.checkNotNull(RepositoryModule.INSTANCE.provideRecipeRepository(recipeService, recipeMapper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
