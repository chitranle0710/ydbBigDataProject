package com.example.bigdataprojectuit.domain.usecase

import com.example.bigdataprojectuit.data.remote.dto.LoginRequest
import com.example.bigdataprojectuit.data.repository.PostRepository
import com.example.bigdataprojectuit.domain.model.User
import javax.inject.Inject

class LoginUserUseCase @Inject constructor(private val repository: PostRepository) {
    suspend operator fun invoke(
        requestDto: LoginRequest
    ): User? {
        return repository.loginUser(requestDto)
    }
}