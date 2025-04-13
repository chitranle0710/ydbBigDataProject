package com.example.bigdataprojectuit.di

import com.example.bigdataprojectuit.data.remote.ApiService
import com.example.bigdataprojectuit.data.remote.dto.Neo4jId
import com.example.bigdataprojectuit.data.remote.dto.Neo4jIdDeserializer
import com.example.bigdataprojectuit.data.repository.PostRepository
import com.example.bigdataprojectuit.data.repository.PostRepositoryImpl
import com.example.bigdataprojectuit.domain.usecase.GetUsersListUseCase
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        val gson = GsonBuilder()
            .registerTypeAdapter(Neo4jId::class.java, Neo4jIdDeserializer())
            .create()
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3000")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun providePostRepository(apiService: ApiService): PostRepository {
        return PostRepositoryImpl(apiService)
    }

    @Provides
    @Singleton
    fun provideGetPostsUseCase(repository: PostRepository): GetUsersListUseCase {
        return GetUsersListUseCase(repository)
    }
}
