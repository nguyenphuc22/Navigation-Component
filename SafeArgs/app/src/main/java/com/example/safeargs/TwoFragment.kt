package com.example.safeargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs


class TwoFragment : Fragment() {

    lateinit var textView: TextView
    lateinit var button: Button
    val twoFragmentArgs : TwoFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_two, container, false)
        // Inflate the layout for this fragment
        button = view.findViewById(R.id.button2)
        textView = view.findViewById(R.id.textView);
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = twoFragmentArgs.message + twoFragmentArgs.number.toString()
        button.setOnClickListener {
            Navigation.findNavController(button).navigate(R.id.action_twoFragment_to_firstFragment)
        }
    }

}