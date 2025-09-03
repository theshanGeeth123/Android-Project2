package com.example.y2s2_assignment2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main21)

        val image1 = findViewById<ImageView>(R.id.imageView1)
        val btn1   = findViewById<Button>(R.id.button2)

        image1.setOnClickListener {
            startActivity(Intent(this, MainActivity6::class.java))
        }

        btn1.setOnClickListener {

            startActivity(Intent(this, MainActivity22::class.java))
        }

    }
}