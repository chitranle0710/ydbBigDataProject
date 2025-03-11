package com.example.bigdataprojectuit.data.repository

import com.example.bigdataprojectuit.data.remote.ApiService
import com.example.bigdataprojectuit.data.remote.dto.toDomain
import com.example.bigdataprojectuit.domain.model.Post

class PostRepositoryImpl(private val apiService: ApiService) : PostRepository {
    override suspend fun getPosts(): List<Post> {
        return apiService.getPosts().map { it.toDomain() }
    }
}