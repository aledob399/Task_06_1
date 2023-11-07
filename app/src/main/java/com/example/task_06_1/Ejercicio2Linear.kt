package com.example.task_06_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ejercicio2Linear : AppCompatActivity() {

    private lateinit var btnVolver : Button




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2_linear)

        btnVolver = findViewById(R.id.btnVolver)

        btnVolver.setOnClickListener {

            val intent = Intent(this@Ejercicio2Linear, MainActivity::class.java)
            startActivity(intent)
        }
    }
}