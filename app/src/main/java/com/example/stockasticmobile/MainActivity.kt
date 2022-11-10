package com.example.stockasticmobile

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //sleeps for 2s and activates splash screen from google api
        Thread.sleep(2000)
        val splashScreen = installSplashScreen()
        setContentView(R.layout.activity_main)
        //animation
        val constraintLayout: ConstraintLayout = findViewById(R.id.mainLayout)

        val animationDrawable: AnimationDrawable = constraintLayout.background as AnimationDrawable

        animationDrawable.setEnterFadeDuration(2500)

        animationDrawable.setExitFadeDuration(5000)

        animationDrawable.start()
    }


}