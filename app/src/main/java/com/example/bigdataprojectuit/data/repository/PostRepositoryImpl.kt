package com.example.bigdataprojectuit.data.repository

import com.example.bigdataprojectuit.data.remote.ApiService
import com.example.bigdataprojectuit.data.remote.dto.toDomain
import com.example.bigdataprojectuit.domain.model.User

class PostRepositoryImpl(private val apiService: ApiService) : PostRepository {
    override suspend fun getUsers(): List<User> {
        return apiService.getUsers().map { it.toDomain() }
    }
}