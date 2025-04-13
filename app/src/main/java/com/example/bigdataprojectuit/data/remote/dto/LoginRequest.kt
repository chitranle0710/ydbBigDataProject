package com.example.bigdataprojectuit.data.remote.dto

import com.google.gson.annotations.SerializedName

data class LoginRequest(
    @SerializedName("username")
    val userName: String,
    @SerializedName("password")
    val password: String
)