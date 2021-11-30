package com.example.navigationcomponentnested

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class OneFragment : Fragment() {
    lateinit var btnToThree: Button
    lateinit var btnToTwo: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        btnToThree = view.findViewById(R.id.btnToThree)
        btnToTwo = view.findViewById(R.id.btnToTwo)
        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnToThree.setOnClickListener {
            Navigation.findNavController(btnToThree).navigate(R.id.action_oneFragment_to_threeFragment)
        }
        btnToTwo.setOnClickListener {
            Navigation.findNavController(btnToTwo).navigate(R.id.action_oneFragment_to_twoFragment)
        }
    }

}