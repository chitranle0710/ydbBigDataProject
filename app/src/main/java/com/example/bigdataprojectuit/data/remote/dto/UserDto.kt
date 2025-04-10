package com.example.bigdataprojectuit.data.remote.dto

import com.example.bigdataprojectuit.domain.model.User
import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("username")
    val username: String,
    @SerializedName("password")
    val password: String
)

fun UserDto.toDomain(): User {
    return User(
        id = id,
        name = name,
        username = username,
        password = password
    )
}