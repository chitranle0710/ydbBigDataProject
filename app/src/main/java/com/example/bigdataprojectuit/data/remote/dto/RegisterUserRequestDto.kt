package com.example.bigdataprojectuit.data.remote.dto

import com.google.gson.annotations.SerializedName

data class RegisterUserRequestDto(
    @SerializedName("username")
    val username: String? = "",
    @SerializedName("password")
    val password: String? = "",
    @SerializedName("name")
    val name: String? = ""
)