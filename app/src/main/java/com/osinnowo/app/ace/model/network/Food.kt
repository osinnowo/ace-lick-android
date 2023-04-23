package com.osinnowo.app.ace.model.network

import com.google.gson.annotations.Expose

data class Food (
    @Expose
    val content: String?,

    @Expose
    val id: Int?,

    @Expose
    val image: String?,

    @Expose
    val link: String?,

    @Expose
    val name: String?,

    @Expose
    val relevance: Int?,

    @Expose
    val type: String?
)