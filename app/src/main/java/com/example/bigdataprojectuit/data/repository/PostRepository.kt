package com.example.bigdataprojectuit.data.repository

import com.example.bigdataprojectuit.domain.model.Post

interface PostRepository {
    suspend fun getPosts(): List<Post>
}