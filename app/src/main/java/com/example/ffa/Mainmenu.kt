package com.example.ffa

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Mainmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mainmenu)

        val btnapp = findViewById<TextView>(R.id.app)
        val btnweb = findViewById<TextView>(R.id.web)
        val btnchain = findViewById<TextView>(R.id.chain)
        val btnmach = findViewById<TextView>(R.id.mach)
        val btninfo = findViewById<TextView>(R.id.info)
        val btnimg = findViewById<ImageView>(R.id.imageView2)


        btnapp.setOnClickListener{
            val intent = Intent(applicationContext , apppage :: class.java)
            startActivity(intent)
        }

        btnweb.setOnClickListener{
            val intent = Intent(applicationContext , apppage :: class.java)
            startActivity(intent)
        }

        btnapp.setOnClickListener{
            val intent = Intent(applicationContext , apppage :: class.java)
            startActivity(intent)
        }
        btnapp.setOnClickListener{
            val intent = Intent(applicationContext , apppage :: class.java)
            startActivity(intent)
        }
        btnapp.setOnClickListener{
            val intent = Intent(applicationContext , apppage :: class.java)
            startActivity(intent)
        }
        btnapp.setOnClickListener{
            val intent = Intent(applicationContext , apppage :: class.java)
            startActivity(intent)
        }




    }
}