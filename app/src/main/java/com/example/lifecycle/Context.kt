package com.example.lifecycle

import android.content.Context
import android.util.Log
import android.widget.Toast

fun Context.showToast(message : String, time : Int) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    Log.d("sooj", "토스트 띄우기")
}

