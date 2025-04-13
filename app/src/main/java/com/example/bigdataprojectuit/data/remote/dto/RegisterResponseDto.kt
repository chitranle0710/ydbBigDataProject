package com.example.bigdataprojectuit.data.remote.dto

import com.google.gson.annotations.SerializedName

data class RegisterResponseDto(
    @SerializedName("message")
    val username: String? = null,
    @SerializedName("user")
    val user: UserDto? = null
)