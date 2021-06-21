package com.example.recipes.presentation.ui.recipe_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u001f\u001a\u00020 2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\b\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020 H\u0002J\u0011\u0010#\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0011\u0010%\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u000e\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u000fJ\u000e\u0010(\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\u0005J\u000e\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020 H\u0002J\u0011\u0010/\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0010\u00100\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u000fH\u0002J\u0010\u00101\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u00102\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0005H\u0002J\u0012\u00103\u001a\u00020 2\b\u0010*\u001a\u0004\u0018\u00010\u001dH\u0002R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lcom/example/recipes/presentation/ui/recipe_list/RecipeListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/recipes/repository/RecipeRepository;", "token", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/example/recipes/repository/RecipeRepository;Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;)V", "loading", "Landroidx/compose/runtime/MutableState;", "", "getLoading", "()Landroidx/compose/runtime/MutableState;", "page", "", "getPage", "query", "getQuery", "recipeListScrollPosition", "getRecipeListScrollPosition", "()I", "setRecipeListScrollPosition", "(I)V", "recipes", "", "Lcom/example/recipes/domain/model/Recipe;", "getRecipes", "selectedCategory", "Lcom/example/recipes/presentation/ui/recipe_list/FoodCategory;", "getSelectedCategory", "appendRecipes", "", "clearSelectedCategory", "incrementPage", "newSearch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nextPage", "onChangeRecipeScrollPosition", "position", "onQueryChanged", "onSelectedCategoryChanged", "category", "onTriggerEvent", "event", "Lcom/example/recipes/presentation/ui/recipe_list/RecipeListEvent;", "resetSearchState", "restoreState", "setListScrollPosition", "setPage", "setQuery", "setSelectedCategory", "app_debug"})
public final class RecipeListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.util.List<com.example.recipes.domain.model.Recipe>> recipes = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.String> query = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<com.example.recipes.presentation.ui.recipe_list.FoodCategory> selectedCategory = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.MutableState<java.lang.Integer> page = null;
    private int recipeListScrollPosition = 0;
    private final com.example.recipes.repository.RecipeRepository repository = null;
    private final java.lang.String token = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.util.List<com.example.recipes.domain.model.Recipe>> getRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.String> getQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<com.example.recipes.presentation.ui.recipe_list.FoodCategory> getSelectedCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.MutableState<java.lang.Integer> getPage() {
        return null;
    }
    
    public final int getRecipeListScrollPosition() {
        return 0;
    }
    
    public final void setRecipeListScrollPosition(int p0) {
    }
    
    public final void onTriggerEvent(@org.jetbrains.annotations.NotNull()
    com.example.recipes.presentation.ui.recipe_list.RecipeListEvent event) {
    }
    
    /**
     * Append new recipes to the current list of recipes
     */
    private final void appendRecipes(java.util.List<com.example.recipes.domain.model.Recipe> recipes) {
    }
    
    private final void incrementPage() {
    }
    
    public final void onChangeRecipeScrollPosition(int position) {
    }
    
    /**
     * Called when a new search is executed.
     */
    private final void resetSearchState() {
    }
    
    private final void clearSelectedCategory() {
    }
    
    public final void onQueryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void onSelectedCategoryChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
    }
    
    private final void setListScrollPosition(int position) {
    }
    
    private final void setPage(int page) {
    }
    
    private final void setSelectedCategory(com.example.recipes.presentation.ui.recipe_list.FoodCategory category) {
    }
    
    private final void setQuery(java.lang.String query) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public RecipeListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.recipes.repository.RecipeRepository repository, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "auth_token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @androidx.hilt.Assisted()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}