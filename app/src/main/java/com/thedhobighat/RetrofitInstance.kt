package com.thedhobighat

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    fun getInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://tdg-api.onrender.com/api/v1/usr/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}