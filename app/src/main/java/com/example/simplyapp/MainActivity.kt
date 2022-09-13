package com.example.simplyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            greeting()
        }
    }


    private fun greeting(){
        val messageView = findViewById<TextView>(R.id.textView)
        val nameText = findViewById<TextView>(R.id.name_edit_text)
        messageView.text = "Hello " + nameText.text
    }
}