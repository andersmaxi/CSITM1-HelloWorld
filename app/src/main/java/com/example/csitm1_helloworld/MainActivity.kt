package com.example.csitm1_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick : Button = findViewById(R.id.button)

        btnClick.setOnClickListener(){
            Toast.makeText(this@MainActivity, "M1: Homework - Github and Android Studio", Toast.LENGTH_LONG).show()
        }

        //Toast.makeText(this@MainActivity, "M1: Homework - Github and Android Studio", Toast.LENGTH_LONG).show()
    }
}