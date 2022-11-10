package com.example.stockasticmobile

import android.app.Activity
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //sleeps for 1s and activates splash screen from google api
        Thread.sleep(1000)
        val splashScreen = installSplashScreen()
        setContentView(R.layout.activity_main)
        //animation
        val constraintLayout: ConstraintLayout = findViewById(R.id.mainLayout)

        val animationDrawable: AnimationDrawable = constraintLayout.background as AnimationDrawable

        animationDrawable.setEnterFadeDuration(1500)

        animationDrawable.setExitFadeDuration(3000)

        animationDrawable.start()

        //hide action bar
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        supportActionBar?.hide()
    }


}