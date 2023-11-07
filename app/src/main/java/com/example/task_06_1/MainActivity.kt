package com.example.task_06_1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    private lateinit var txtNombre : EditText
    private lateinit var btnTarea1Linear : Button
    private lateinit var btnTarea2Linear : Button
    private lateinit var btnTarea1Table : Button
    private lateinit var btnTarea2Table : Button
    private lateinit var btnTarea1Constrain : Button
    private lateinit var btnTarea2Constrain : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnTarea1Linear = findViewById(R.id.btnTarea1Linear)
        btnTarea2Linear = findViewById(R.id.btnTarea2Linear)
        btnTarea1Table = findViewById(R.id.btnTarea1Table)
        btnTarea2Table = findViewById(R.id.btnTarea2Table)
        btnTarea1Constrain = findViewById(R.id.btnTarea1Constrain)
        btnTarea2Constrain = findViewById(R.id.btnTarea2Constrain)


        btnTarea1Linear.setOnClickListener {

            val intent = Intent(this@MainActivity, Ejercicio1Linear::class.java)
            startActivity(intent)
        }
        btnTarea2Linear.setOnClickListener {

            val intent = Intent(this@MainActivity, Ejercicio2Linear::class.java)
            startActivity(intent)
        }
        btnTarea1Table.setOnClickListener {

            val intent = Intent(this@MainActivity, Ejercicio1Table::class.java)
            startActivity(intent)
        }
        btnTarea2Table.setOnClickListener {

            val intent = Intent(this@MainActivity, Ejercicio2Table::class.java)
            startActivity(intent)
        }
        btnTarea1Constrain.setOnClickListener {

            val intent = Intent(this@MainActivity, Ejercicio1Constrain::class.java)
            startActivity(intent)
        }
        btnTarea2Constrain.setOnClickListener {

            val intent = Intent(this@MainActivity, Ejercicio2Constrain::class.java)
            startActivity(intent)
        }
    }
}