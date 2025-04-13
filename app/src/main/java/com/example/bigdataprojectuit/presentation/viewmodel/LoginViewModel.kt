package com.example.bigdataprojectuit.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bigdataprojectuit.data.remote.dto.LoginRequest
import com.example.bigdataprojectuit.domain.usecase.LoginUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val loginUserUseCase: LoginUserUseCase
) : ViewModel() {

    private val _obsNavigateToLogin: MutableLiveData<Boolean> = MutableLiveData()
    val obsNavigateToLogin: LiveData<Boolean> = _obsNavigateToLogin

    fun login(
        userName: String,
        password: String
    ) {
        viewModelScope.launch {
            val user = loginUserUseCase.invoke(
                LoginRequest(
                    userName = userName,
                    password = password
                )
            )

            _obsNavigateToLogin.value = user != null
        }
    }
}