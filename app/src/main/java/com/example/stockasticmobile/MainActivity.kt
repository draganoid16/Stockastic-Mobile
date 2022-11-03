package com.example.stockasticmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //sleeps for 2s and activates splash screen from google api
        Thread.sleep(2000)
        val splashScreen = installSplashScreen()
        setContentView(R.layout.activity_main)
    }



}