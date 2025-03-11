package com.example.bigdataprojectuit.data.remote.dto

import com.example.bigdataprojectuit.domain.model.Post

data class PostDto(
    val id: Int,
    val title: String,
    val body: String
)

fun PostDto.toDomain(): Post {
    return Post(
        id = id,
        title = title,
        body = body
    )
}