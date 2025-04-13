package com.example.bigdataprojectuit.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bigdataprojectuit.domain.model.User
import com.example.bigdataprojectuit.domain.usecase.GetUsersListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getUsersListUseCase: GetUsersListUseCase
) : ViewModel() {

    private val _usersStateFlow = MutableStateFlow<List<User>>(emptyList())
    val posts: StateFlow<List<User>> get() = _usersStateFlow

    fun fetchPosts() {
        viewModelScope.launch {
            try {
                _usersStateFlow.value = getUsersListUseCase.invoke()
                println("DEBUG ------ ${getUsersListUseCase.invoke()}")
            } catch (e: Exception) {
                println("Error: ${e.message}")
            }
        }
    }
}