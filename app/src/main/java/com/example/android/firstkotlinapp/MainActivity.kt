package com.example.android.firstkotlinapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.android.firstkotlinapp.DataClass
import com.example.android.firstkotlinapp.R

class MainActivity : AppCompatActivity() {
    val dataClass = DataClass("Frank", "Kerry")
    val copy = dataClass.copy("Charles")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1 = findViewById<TextView>(R.id.data)
        val textCopy = findViewById<TextView>(R.id.data_copy)

        val button = findViewById<Button>(R.id.button_btn)
        button.setOnClickListener {
            Toast.makeText(this, "SUPER CLICK", Toast.LENGTH_SHORT).show()
            text1.text = dataClass.firstName + " " + dataClass.lastName
            textCopy.text = copy.firstName + " " + dataClass.lastName
        }

    }
}