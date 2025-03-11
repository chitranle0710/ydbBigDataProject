package com.example.bigdataprojectuit.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bigdataprojectuit.domain.model.Post
import com.example.bigdataprojectuit.domain.usecase.GetPostsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getPostsUseCase: GetPostsUseCase
) : ViewModel() {

    private val _posts = MutableStateFlow<List<Post>>(emptyList())
    val posts: StateFlow<List<Post>> get() = _posts

    fun fetchPosts() {
        viewModelScope.launch {
            try {
                _posts.value = getPostsUseCase.invoke()
            } catch (e: Exception) {
                println("Error: ${e.message}")
            }
        }
    }
}