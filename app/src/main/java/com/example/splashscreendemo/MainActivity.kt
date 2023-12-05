package com.example.splashscreendemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        Thread.sleep(1000)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}