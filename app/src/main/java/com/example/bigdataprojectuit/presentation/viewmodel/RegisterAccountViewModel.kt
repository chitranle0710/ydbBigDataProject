package com.example.bigdataprojectuit.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bigdataprojectuit.data.remote.dto.RegisterUserRequestDto
import com.example.bigdataprojectuit.domain.usecase.RegisterUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterAccountViewModel @Inject constructor(
    private val registerUserUseCase: RegisterUserUseCase
) : ViewModel() {

    private val _obsNavigateToLogin: MutableLiveData<Boolean> = MutableLiveData()
    val obsNavigateToLogin: LiveData<Boolean> = _obsNavigateToLogin

    fun registerAccount(
        name: String,
        userName: String,
        password: String
    ) {
        viewModelScope.launch {
            val user = registerUserUseCase.invoke(
                RegisterUserRequestDto(
                    username = name,
                    name = userName,
                    password = password
                )
            )

            _obsNavigateToLogin.value = user != null
        }
    }
}