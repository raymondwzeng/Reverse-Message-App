package com.macandswiss.secretmessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class WelcomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState : Bundle?) : View? {
       val view = inflater.inflate(R.layout.fragment_welcome, container, false) //Equivalent to setContentView() in activities

        val startButton = view.findViewById<Button>(R.id.start)
        startButton.setOnClickListener {
            //Note: view.findNavController() does not work and *will* crash your app if it runs outside of the setOnClickListener. Idk why.
            view.findNavController().navigate(R.id.action_welcomeFragment_to_messageFragment)
        }

        return view
    }
}