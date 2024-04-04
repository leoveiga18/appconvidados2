package com.example.appconvidadosfinal

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAdd = findViewById<FloatingActionButton>(R.id.btnAdd)
        btnAdd.setOnClickListener {
            // Iniciar a próxima atividade
            val intent = Intent(this@MainActivity, Guest_form::class.java)
            startActivity(intent)
        }

        val btnListar = findViewById<FloatingActionButton>(R.id.btnListar)
        btnListar.setOnClickListener {
            // Iniciar a próxima atividade
            val intent = Intent(this@MainActivity, list_form_activity::class.java)
            startActivity(intent)
        }

    }
}