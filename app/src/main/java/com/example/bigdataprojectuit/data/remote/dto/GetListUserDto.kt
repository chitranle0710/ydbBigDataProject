package com.example.bigdataprojectuit.data.remote.dto

import com.example.bigdataprojectuit.domain.model.User
import com.google.gson.annotations.SerializedName

data class GetListUserDto(
    @SerializedName("id")
    val id: Neo4jId? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("username")
    val username: String? = null,

    @SerializedName("password")
    val password: String? = null
)

data class Neo4jId(
    @SerializedName("low")
    val low: Long,

    @SerializedName("high")
    val high: Long,

    @SerializedName("unsigned")
    val unsigned: Boolean
)

fun GetListUserDto.toDomain(): User {
    return User(
        id = id?.low.toString(),
        name = name ?: "",
        username = username ?: "",
        password = password ?: ""
    )
}