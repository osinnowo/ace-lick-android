package com.osinnowo.app.ace.service

import com.osinnowo.app.ace.model.network.FoodSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {
    @GET("/food/search")
    suspend fun searchFood(@Query("apiKey") apiKey: String = "8305f420e8ef48f39ab087ea1af4fdee"): FoodSearchResponse
}