package com.example.lifecycle.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifecycle.R


class FirstFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("sooj", "onCreate()")

    }

    //CREATED - Initalize
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        Log.d("sooj", "onCreateView()")
        val view = inflater.inflate(R.layout.fragment_first, container, false)
        return view
    }

    //CREATED - Create
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
    }

    //STARTED - Started
    override fun onStart() {

        Log.d("sooj", "onStart()")
        super.onStart()
    }

    //RESUMED - Resumed
    override fun onResume() {
        Log.d("sooj", "onResume()")
        super.onResume()
    }

    //CREATED - Create(1)
    override fun onPause() {
        Log.d("sooj", "onPause()")
        super.onPause()
    }

    //CREATED - Create(2)
    override fun onSaveInstanceState(outState: Bundle) {
        Log.d("sooj", "onSaveInstanceState()")
        super.onSaveInstanceState(outState)
    }


    //CREATED - Destroyed
    override fun onDestroyView() {
        Log.d("sooj", "onDestroyView()")
        super.onDestroyView()
    }

    //DESTROYED
    override fun onDestroy() {
        Log.d("sooj", "onDestroy()")
        super.onDestroy()
    }

}