package com.example.bigdataprojectuit.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bigdataprojectuit.data.remote.dto.LoginRequest
import com.example.bigdataprojectuit.domain.model.User
import com.example.bigdataprojectuit.domain.usecase.GetUsersListUseCase
import com.example.bigdataprojectuit.domain.usecase.LoginUserUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getUsersListUseCase: GetUsersListUseCase
) : ViewModel() {

    private val _obsUserList: MutableLiveData<List<User>> = MutableLiveData()
    val obsUserList: LiveData<List<User>> = _obsUserList

    init {
        getListUser()
    }

    private fun getListUser() {
        viewModelScope.launch {
            try {
                val listUsers = getUsersListUseCase.invoke()
                _obsUserList.value = listUsers
            } catch (ex: Exception) {
                ex.printStackTrace()
            }
        }
    }
}