package com.example.ffa

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        val letsgo = findViewById<TextView>(R.id.letsgo)

        letsgo.setOnClickListener{ val intent = Intent( applicationContext , Mainmenu::class.java )
        startActivity(intent)}


        }
    }
