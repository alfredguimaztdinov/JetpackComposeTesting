package com.example.recipes.presentation.ui.recipe_list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/recipes/presentation/ui/recipe_list/RecipeListEvent;", "", "()V", "NewSearchEvent", "NextPageEvent", "RestoreStateEvent", "Lcom/example/recipes/presentation/ui/recipe_list/RecipeListEvent$NewSearchEvent;", "Lcom/example/recipes/presentation/ui/recipe_list/RecipeListEvent$NextPageEvent;", "Lcom/example/recipes/presentation/ui/recipe_list/RecipeListEvent$RestoreStateEvent;", "app_debug"})
public abstract class RecipeListEvent {
    
    private RecipeListEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/recipes/presentation/ui/recipe_list/RecipeListEvent$NewSearchEvent;", "Lcom/example/recipes/presentation/ui/recipe_list/RecipeListEvent;", "()V", "app_debug"})
    public static final class NewSearchEvent extends com.example.recipes.presentation.ui.recipe_list.RecipeListEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.recipes.presentation.ui.recipe_list.RecipeListEvent.NewSearchEvent INSTANCE = null;
        
        private NewSearchEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/recipes/presentation/ui/recipe_list/RecipeListEvent$NextPageEvent;", "Lcom/example/recipes/presentation/ui/recipe_list/RecipeListEvent;", "()V", "app_debug"})
    public static final class NextPageEvent extends com.example.recipes.presentation.ui.recipe_list.RecipeListEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.recipes.presentation.ui.recipe_list.RecipeListEvent.NextPageEvent INSTANCE = null;
        
        private NextPageEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/recipes/presentation/ui/recipe_list/RecipeListEvent$RestoreStateEvent;", "Lcom/example/recipes/presentation/ui/recipe_list/RecipeListEvent;", "()V", "app_debug"})
    public static final class RestoreStateEvent extends com.example.recipes.presentation.ui.recipe_list.RecipeListEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.recipes.presentation.ui.recipe_list.RecipeListEvent.RestoreStateEvent INSTANCE = null;
        
        private RestoreStateEvent() {
            super();
        }
    }
}