package com.example.sunnyweather

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.core.view.ViewCompat

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor= Color.TRANSPARENT
        val controller = ViewCompat.getWindowInsetsController(window.decorView)
        controller?.hide(android.view.WindowInsets.Type.statusBars())
        setContentView(R.layout.activity_main)

    }
}