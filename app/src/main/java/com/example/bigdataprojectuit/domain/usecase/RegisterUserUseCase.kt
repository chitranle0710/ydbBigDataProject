package com.example.bigdataprojectuit.domain.usecase

import com.example.bigdataprojectuit.data.remote.dto.RegisterUserRequestDto
import com.example.bigdataprojectuit.data.repository.PostRepository
import com.example.bigdataprojectuit.domain.model.User
import javax.inject.Inject

class RegisterUserUseCase @Inject constructor(private val repository: PostRepository) {
    suspend operator fun invoke(
        requestDto: RegisterUserRequestDto
    ): User? {
        return repository.addUser(requestDto)
    }
}