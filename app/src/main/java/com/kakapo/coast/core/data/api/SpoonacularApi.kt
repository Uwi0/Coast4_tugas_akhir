package com.kakapo.coast.core.data.api

import com.kakapo.coast.core.data.api.model.RecipeSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface SpoonacularApi {

    @GET(ApiConstants.COMPLEX_SEARCH_END_POINT)
    suspend fun searchComplexRecipe(
        @Query(ApiParameters.QUERY) query: String,
        @Query(ApiParameters.ADD_RECIPE_INFORMATION) addReceiptInformation: Boolean,
        @Query(ApiParameters.NUMBER) number: Int,
        @Query(ApiParameters.OFFSET) offset: Int
    ): RecipeSearchResponse

}