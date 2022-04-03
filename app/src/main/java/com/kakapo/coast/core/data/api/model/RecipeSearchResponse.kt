package com.kakapo.coast.core.data.api.model

import com.google.gson.annotations.SerializedName

data class RecipeSearchResponse(
    @SerializedName("results")
    val results: List<FoodRecipe>,
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("number")
    val number: Int,
    @SerializedName("totalResults")
    val totalResults: Int
)