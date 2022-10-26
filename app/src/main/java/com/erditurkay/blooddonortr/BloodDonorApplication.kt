package com.erditurkay.blooddonortr

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

@HiltAndroidApp
class BloodDonorApplication: Application() {

}

interface BloodDonorAPIService {
    @POST("users")
    suspend fun createUser(@Body user: RequestBody): Response<ResponseBody>
}