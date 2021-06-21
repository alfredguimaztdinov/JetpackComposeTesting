package com.example.recipes.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {SingletonComponent.class})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/example/recipes/di/NetworkModule;", "", "()V", "provideAuthToken", "", "provideRecipeMapper", "Lcom/example/recipes/network/model/RecipeDtoMapper;", "provideRecipeService", "Lcom/example/recipes/network/RecipeService;", "app_debug"})
@dagger.Module()
public final class NetworkModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.recipes.di.NetworkModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.recipes.network.model.RecipeDtoMapper provideRecipeMapper() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.example.recipes.network.RecipeService provideRecipeService() {
        return null;
    }
    
    /**
     * I might include proper authentication later on food2fork.ca
     * For now just hard code a token.
     */
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "auth_token")
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.lang.String provideAuthToken() {
        return null;
    }
    
    private NetworkModule() {
        super();
    }
}