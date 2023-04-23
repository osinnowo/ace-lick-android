package com.osinnowo.app.ace.contract

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Response<out T>(
    @Expose
    @SerializedName("data")
    val data: T?
)