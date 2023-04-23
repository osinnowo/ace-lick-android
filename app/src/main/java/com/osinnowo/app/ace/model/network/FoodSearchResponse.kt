package com.osinnowo.app.ace.model.network

import com.google.gson.annotations.Expose

data class FoodSearchResponse(
    @Expose
    val expires: Long,

    @Expose
    val isStale: Boolean,

    @Expose
    val limit: Int,

    @Expose
    val offset: Int,

    @Expose
    val query: String,

    @Expose
    val searchResults: List<FoodResult>,

    @Expose
    val sorting: String,

    @Expose
    val totalResults: Int
)