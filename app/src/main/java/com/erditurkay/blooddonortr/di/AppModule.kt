package com.erditurkay.blooddonortr.di

import com.erditurkay.blooddonortr.BloodDonorAPIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideAPI(): BloodDonorAPIService {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://blood-donor-tr.herokuapp.com/api/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit.create(BloodDonorAPIService::class.java)
    }
}
