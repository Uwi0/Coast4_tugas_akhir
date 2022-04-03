package com.kakapo.coast.core.data.api.model

import com.google.gson.annotations.SerializedName

data class FoodRecipe(
    val id: Int,
    val sourceName: String?,
    val title: String,
    val readyInMinutes: Int?,
    val servings: Int?,
    val sourceUrl: String?,
    @SerializedName("image")
    val imageUrl: String,
    val summary: String?,
    @SerializedName("spoonacularScore")
    val score: Float?,
    @SerializedName("analyzedInstructions")
    val instructions: List<RecipeInstructions>?,
    @SerializedName("extendedIngredients")
    val ingredients: List<FoodIngredient>?
)

data class RecipeInstructions(
    val steps: List<RecipeStep>
)

data class RecipeStep(
    val number: Int,
    val step: String,
    val ingredients: List<FoodRecipeElement>,
    val equipment: List<FoodRecipeElement>
)

data class FoodRecipeElement(
    val id: Int,
    val name: String,
    val image: String
)

data class FoodIngredient(
    val id: Int,
    val name: String,
    val original: String,
    val amount: Float,
    val unit: String
)