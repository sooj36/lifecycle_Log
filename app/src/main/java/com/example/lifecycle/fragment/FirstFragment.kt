package com.example.lifecycle.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.lifecycle.R


class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("sooj", "onCreate()_In_fragment")

    }

    //CREATED - Initalize
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        Log.d("sooj", "onCreateView()_In_fragment")
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("sooj", "onViewCreated()_In_fragment")
        super.onViewCreated(view, savedInstanceState)

        }

    }
    //CREATED - Create
    fun onViewStateRestored(savedInstanceState: Bundle?) {
        onViewStateRestored(savedInstanceState)
    }


//STARTED - Started
fun onStart() {

    Log.d("sooj", "onStart()_In_fragment")
    onStart()
}

//RESUMED - Resumed
fun onResume() {
    Log.d("sooj", "onResume()_In_fragment")
    onResume()
}

//CREATED - Create(1)
fun onPause() {
    Log.d("sooj", "onPause()_In_fragment")
    onPause()
}

//CREATED - Create(2)
fun onSaveInstanceState(outState: Bundle) {
    Log.d("sooj", "onSaveInstanceState()_In_fragment")
    onSaveInstanceState(outState)
}


//CREATED - Destroyed
fun onDestroyView() {
    Log.d("sooj", "onDestroyView()")
    onDestroyView()
}

//DESTROYED
fun onDestroy() {
    Log.d("sooj", "onDestroy()")
    onDestroy()
}