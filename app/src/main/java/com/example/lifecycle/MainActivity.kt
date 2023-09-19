package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //////
    override fun onStart() {
        Log.d("sooj", "onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.d("sooj", "onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.d("sooj", "onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.d("sooj", "onStop()")
        super.onStop()
    }


    override fun onDestroy() {
        Log.d("sooj", "onDestroy()")
        super.onDestroy()
    }
}