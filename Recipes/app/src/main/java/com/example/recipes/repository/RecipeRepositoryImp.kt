package com.example.recipes.repository

import com.example.recipes.domain.model.Recipe
import com.example.recipes.network.RecipeService
import com.example.recipes.network.model.RecipeDtoMapper


class RecipeRepositoryImp (
    private val recipeService: RecipeService,
    private val mapper: RecipeDtoMapper,
): RecipeRepository {

    override suspend fun search(token: String, page: Int, query: String): List<Recipe> {
        return mapper.toDomainList(recipeService.search(token = token, page = page, query = query).recipes)
    }

    override suspend fun get(token: String, id: Int): Recipe {
        return mapper.mapToDomainModel(recipeService.get(token = token, id))
    }

}