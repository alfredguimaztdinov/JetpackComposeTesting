package com.example.recipes.presentation.ui.recipe;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/recipes/presentation/ui/recipe/RecipeViewModel;", "Landroidx/lifecycle/ViewModel;", "recipeRepository", "Lcom/example/recipes/repository/RecipeRepository;", "token", "", "state", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/recipes/repository/RecipeRepository;Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;)V", "loading", "Landroidx/compose/runtime/MutableState;", "", "getLoading", "()Landroidx/compose/runtime/MutableState;", "recipe", "Lcom/example/recipes/domain/model/Recipe;", "getRecipe", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTriggerEvent", "event", "Lcom/example/recipes/presentation/ui/recipe/RecipeEvent;", "app_debug"})
public final class RecipeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.example.recipes.domain.model.Recipe> recipe = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> loading = null;
    private final com.example.recipes.repository.RecipeRepository recipeRepository = null;
    private final java.lang.String token = null;
    private final androidx.lifecycle.SavedStateHandle state = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.example.recipes.domain.model.Recipe> getRecipe() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getLoading() {
        return null;
    }
    
    public final void onTriggerEvent(@org.jetbrains.annotations.NotNull()
    com.example.recipes.presentation.ui.recipe.RecipeEvent event) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public RecipeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.recipes.repository.RecipeRepository recipeRepository, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle state) {
        super();
    }
}