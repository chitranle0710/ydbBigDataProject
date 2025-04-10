package com.example.bigdataprojectuit.data.repository

import com.example.bigdataprojectuit.domain.model.User

interface PostRepository {
    suspend fun getUsers(): List<User>
}