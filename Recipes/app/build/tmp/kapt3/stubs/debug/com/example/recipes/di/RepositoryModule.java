package com.example.recipes.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/recipes/di/RepositoryModule;", "", "()V", "provideRecipeRepository", "Lcom/example/recipes/repository/RecipeRepository;", "recipeService", "Lcom/example/recipes/network/RecipeService;", "recipeMapper", "Lcom/example/recipes/network/model/RecipeDtoMapper;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.recipes.di.RepositoryModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.recipes.repository.RecipeRepository provideRecipeRepository(@org.jetbrains.annotations.NotNull()
    com.example.recipes.network.RecipeService recipeService, @org.jetbrains.annotations.NotNull()
    com.example.recipes.network.model.RecipeDtoMapper recipeMapper) {
        return null;
    }
    
    private RepositoryModule() {
        super();
    }
}