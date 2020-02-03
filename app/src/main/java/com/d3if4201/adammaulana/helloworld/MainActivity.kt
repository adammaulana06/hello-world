package com.d3if4201.adammaulana.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text : TextView = findViewById(R.id.nama) as TextView
        text.setText("Hello Adam")
    }
}
