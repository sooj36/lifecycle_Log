package com.example.lifecycle.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.lifecycle.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
            Log.d("sooj", "onCreate()_in_A")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("sooj", "onCreateView()_in_A")
        return inflater.inflate(R.layout.fragment_a, container, false)

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment AFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            AFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("sooj", "onViewCreate()_in_A")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("sooj", "onViewStateRestored()_in_A")
    }

    override fun onStart() {
        super.onStart()
        Log.d("sooj", "onStart()_in_A")
    }

    override fun onResume() {
        super.onResume()
        Log.d("sooj", "onResume()_in_A")
    }

    override fun onPause() {
        super.onPause()
        Log.d("sooj", "onPause()_in_A")
    }

    override fun onStop() {
        super.onStop()
        Log.d("sooj", "onStop()_in_A")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("sooj", "onSaveInstanceState_in_A")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("sooj", "onDestroyView()_in_A")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("sooj", "onDestroy()_in_A")
    }
}