package com.ctt.ghiblirank

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Network {
    companion object{
        fun RetrofitConfig(s:String): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://ghibliapi.herokuapp.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}