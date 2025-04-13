package com.example.bigdataprojectuit.data.remote

import com.example.bigdataprojectuit.data.remote.dto.RegisterResponseDto
import com.example.bigdataprojectuit.data.remote.dto.RegisterUserRequestDto
import com.example.bigdataprojectuit.data.remote.dto.UserDto
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<UserDto>

    @POST("adduser")
    suspend fun addUsers(
        @Body register: RegisterUserRequestDto
    ): RegisterResponseDto
}