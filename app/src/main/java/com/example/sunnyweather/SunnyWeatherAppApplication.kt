package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherAppApplication :Application(){

    @SuppressLint("StaticFieldLeak")
    companion object{
        lateinit var context : Context
        const val token = "uRJBgqdzbRsX7gyP"
    }
    override fun onCreate() {
        super.onCreate()
        context =applicationContext
    }
}