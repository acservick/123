package com.example.proschedules


import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:ImageButton=findViewById(R.id.patsbutton)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
        }

    }
