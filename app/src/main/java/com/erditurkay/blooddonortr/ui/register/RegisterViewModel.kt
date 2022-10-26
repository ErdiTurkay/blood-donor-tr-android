package com.erditurkay.blooddonortr.ui.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.erditurkay.blooddonortr.BloodDonorAPIService
import com.erditurkay.blooddonortr.models.User
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    var api: BloodDonorAPIService
) : ViewModel() {
    fun register(user: User) {
        val gsonString = Gson().toJson(user)
        val requestBody = gsonString.toRequestBody("application/json".toMediaTypeOrNull())

        viewModelScope.launch(Dispatchers.IO) {
            val response = api.createUser(requestBody)
        }
    }
}