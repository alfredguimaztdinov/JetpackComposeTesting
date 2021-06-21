package com.example.recipes.di

import com.example.recipes.network.RecipeService
import com.example.recipes.network.model.RecipeDtoMapper
import com.example.recipes.repository.RecipeRepository
import com.example.recipes.repository.RecipeRepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideRecipeRepository(
        recipeService: RecipeService,
        recipeMapper: RecipeDtoMapper,
    ): RecipeRepository{
        return RecipeRepositoryImp(
            recipeService = recipeService,
            mapper = recipeMapper
        )
    }
}
