package com.macandswiss.secretmessage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import org.w3c.dom.Text

class EncryptedFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState : Bundle?) : View? {
        val view = inflater.inflate(R.layout.fragment_encrypted, container, false) //Equivalent to setContentView() in activities

        val message = EncryptedFragmentArgs.fromBundle(requireArguments()).message
        val encryptedTextView = view.findViewById<TextView>(R.id.encrypted_text)
        encryptedTextView.text = message.reversed()

        return view
    }
}