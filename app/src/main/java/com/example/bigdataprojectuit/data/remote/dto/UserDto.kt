package com.example.bigdataprojectuit.data.remote.dto

import com.example.bigdataprojectuit.domain.model.User
import com.google.gson.annotations.SerializedName

data class UserDto(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("username")
    val username: String? = null,
    @SerializedName("password")
    val password: String? = null
)

fun UserDto.toDomain(): User {
    return User(
        id = id ?: "",
        name = name ?: "",
        username = username ?: "",
        password = password ?: ""
    )
}