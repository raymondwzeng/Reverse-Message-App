package com.macandswiss.secretmessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class MessageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState : Bundle?) : View? {
        val view = inflater.inflate(R.layout.fragment_message, container, false) //Equivalent to setContentView() in activities

        val messageBox = view.findViewById<EditText>(R.id.message)
        val submit = view.findViewById<Button>(R.id.next)
        submit.setOnClickListener {
            val message = messageBox.text.toString()
            val action = MessageFragmentDirections.actionMessageFragmentToEncryptedFragment(message = message)
            view.findNavController().navigate(action)
        }
        return view
    }
}