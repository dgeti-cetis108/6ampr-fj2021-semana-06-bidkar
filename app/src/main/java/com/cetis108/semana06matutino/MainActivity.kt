package com.cetis108.semana06matutino

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // obtener acceso al botón saludar
        val btn_saludar = findViewById<Button>(R.id.btnSaludar)
        // agregar funcionalidad al evento click del botón saludar
        btn_saludar.setOnClickListener {
            //val saludo = "Hola Android desde Kotlin"
            // TODO: mostrar el valor Fulano cuando la caja de texto esté vacía (if-else)
            val nombre = findViewById<EditText>(R.id.txtNombre).text.toString()
            val saludo = "Hola $nombre desde Kotlin!"
            Toast.makeText(this, saludo, Toast.LENGTH_LONG).show()
        }
    }
}