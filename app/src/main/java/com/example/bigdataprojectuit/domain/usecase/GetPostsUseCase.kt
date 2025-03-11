package com.example.bigdataprojectuit.domain.usecase

import com.example.bigdataprojectuit.data.repository.PostRepository
import com.example.bigdataprojectuit.domain.model.Post

class GetPostsUseCase(private val repository: PostRepository) {
    suspend operator fun invoke(): List<Post> {
        return repository.getPosts()
    }
}