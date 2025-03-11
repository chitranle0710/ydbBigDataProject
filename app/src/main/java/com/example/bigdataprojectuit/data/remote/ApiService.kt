package com.example.bigdataprojectuit.data.remote

import com.example.bigdataprojectuit.data.remote.dto.PostDto
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<PostDto>
}