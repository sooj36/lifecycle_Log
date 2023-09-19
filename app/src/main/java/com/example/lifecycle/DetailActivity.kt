package com.example.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val toMain = findViewById<Button>(R.id.to_main)
        toMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            Log.d("sooj","Click_the_Main_btn")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("sooj", "onStart()_In_detail")
    }

    override fun onResume() {
        super.onResume()
        Log.d("sooj","onResume()_In_detail")
    }

    override fun onPause() {
        super.onPause()
        Log.d("sooj","onPause()_In_detail")
    }

    override fun onStop() {
        super.onStop()
        Log.d("sooj","onStop()_In_detail")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("sooj","onDestroy()_In_detail")
    }

}



