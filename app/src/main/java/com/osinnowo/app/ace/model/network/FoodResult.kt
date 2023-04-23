package com.osinnowo.app.ace.model.network

import com.google.gson.annotations.Expose

data class FoodResult(

    @Expose
    val name: String,

    @Expose
    val totalResults: Int,

    @Expose
    val totalResultsVariants: Int,

    @Expose
    val type: String,

    @Expose
    val results: List<Food>
)