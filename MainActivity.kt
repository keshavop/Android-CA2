package com.example.touchdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var touchDemo: TouchDemo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        touchDemo = TouchDemo(this)
        setContentView(touchDemo)

    }
}