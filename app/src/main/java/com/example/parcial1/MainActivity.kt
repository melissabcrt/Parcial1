package com.example.parcial1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Button
import android.widget.TextView
import android.widget.ImageView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvCapital = findViewById<TextView>(R.id.tvCapitalCine)
        tvCapital.setOnClickListener{
            val i = Intent(this,MainActivity::class.java)
            finish()
        }

        var ivHSM = findViewById<ImageView>(R.id.ivHSM)
        ivHSM.setOnClickListener{
            val i = Intent(this,MainActivity::class.java)
            ivHSM.setImageResource(R.drawable.hsm2)
        }

        var bnComprar = findViewById<Button>(R.id.bnComprar)
        bnComprar.setOnClickListener{

        }

    }
}


