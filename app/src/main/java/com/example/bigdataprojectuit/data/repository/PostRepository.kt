package com.example.bigdataprojectuit.data.repository

import com.example.bigdataprojectuit.data.remote.dto.RegisterUserRequestDto
import com.example.bigdataprojectuit.domain.model.User

interface PostRepository {
    suspend fun getUsers(): List<User>

    suspend fun addUser(request: RegisterUserRequestDto): User?
}