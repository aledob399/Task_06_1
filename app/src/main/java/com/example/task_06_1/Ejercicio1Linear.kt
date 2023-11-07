package com.example.task_06_1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class Ejercicio1Linear : AppCompatActivity() {

    private lateinit var btnVolver : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio1_linear)

        btnVolver = findViewById(R.id.btnVolver)

        btnVolver.setOnClickListener {

            val intent = Intent(this@Ejercicio1Linear, MainActivity::class.java)
            startActivity(intent)
        }
    }
}