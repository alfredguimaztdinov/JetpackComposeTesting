package com.example.recipes.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ/\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/recipes/repository/RecipeRepositoryImp;", "Lcom/example/recipes/repository/RecipeRepository;", "recipeService", "Lcom/example/recipes/network/RecipeService;", "mapper", "Lcom/example/recipes/network/model/RecipeDtoMapper;", "(Lcom/example/recipes/network/RecipeService;Lcom/example/recipes/network/model/RecipeDtoMapper;)V", "get", "Lcom/example/recipes/domain/model/Recipe;", "token", "", "id", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "", "page", "query", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RecipeRepositoryImp implements com.example.recipes.repository.RecipeRepository {
    private final com.example.recipes.network.RecipeService recipeService = null;
    private final com.example.recipes.network.model.RecipeDtoMapper mapper = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object search(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int page, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.recipes.domain.model.Recipe>> p3) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object get(@org.jetbrains.annotations.NotNull()
    java.lang.String token, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.recipes.domain.model.Recipe> p2) {
        return null;
    }
    
    public RecipeRepositoryImp(@org.jetbrains.annotations.NotNull()
    com.example.recipes.network.RecipeService recipeService, @org.jetbrains.annotations.NotNull()
    com.example.recipes.network.model.RecipeDtoMapper mapper) {
        super();
    }
}