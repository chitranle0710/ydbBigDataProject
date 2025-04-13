package com.example.bigdataprojectuit.domain.usecase

import com.example.bigdataprojectuit.data.repository.PostRepository
import com.example.bigdataprojectuit.domain.model.User

class GetUsersListUseCase(private val repository: PostRepository) {
    suspend operator fun invoke(): List<User> {
        return repository.getUsers()
    }
}