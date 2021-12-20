package com.example.sunnyweather.logic.network


import com.example.sunnyweather.SunnyWeatherAppApplication
import com.example.sunnyweather.logic.model.PlaceResponse.PlaceResponse1
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherAppApplication.token}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse1>
}