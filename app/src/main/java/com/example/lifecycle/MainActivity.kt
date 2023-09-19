package com.example.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.lifecycle.databinding.ActivityMainBinding
import com.example.lifecycle.fragment.AFragment
import com.example.lifecycle.fragment.BFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var flag = 0

    /*
* when flag is 0 : 처음
* when flag is 1 : FragmentA
* when flag is 2 : FragmentB
* */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.toast.setOnClickListener {
                showToast("토스트 짠", Toast.LENGTH_SHORT)
        }


        binding.switchFragment.setOnClickListener {
            switchFragment()
        }

        binding.removeFragment.setOnClickListener {
            removeFragment()
        }

        val toDetail = findViewById<Button>(R.id.to_detail)
        toDetail.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
            finish()
            Log.d("sooj", "click_the_Detail_btn")
        }

    }

    private fun switchFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        when (flag) {
            0 -> {
                transaction.add(R.id.frameLayout, AFragment())
                flag = 1
            }
            1 -> {
                transaction.replace(R.id.frameLayout, BFragment())
                flag = 2
            }
            2 ->{
                transaction.replace(R.id.frameLayout, AFragment())
                flag = 1
            }
        }
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun removeFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        val frameLayout = supportFragmentManager.findFragmentById(R.id.frameLayout)
        transaction.remove(frameLayout!!)
        transaction.commit()
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