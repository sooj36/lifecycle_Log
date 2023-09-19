package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toDetail = findViewById<Button>(R.id.to_detail)
        toDetail.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
            finish()
            Log.d("sooj", "click_the_Detail_btn")
        }
    }


    override fun onStart() {
        Log.d("sooj", "onStart()_In_main")
        super.onStart()
    }

    override fun onResume() {
        Log.d("sooj", "onResume()_In_main")
        super.onResume()
    }

    override fun onPause() {
        Log.d("sooj", "onPause()_In_main")
        super.onPause()
    }

    override fun onStop() {
        Log.d("sooj", "onStop()_In_main")
        super.onStop()
    }


    override fun onDestroy() {
        Log.d("sooj", "onDestroy()_In__In_main")
        super.onDestroy()
    }
}