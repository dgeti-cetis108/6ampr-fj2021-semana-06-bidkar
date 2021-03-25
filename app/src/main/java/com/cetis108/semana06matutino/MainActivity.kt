package com.cetis108.semana06matutino

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    fun mostrarMensaje(mensaje: String) {
        val dialogBuilder = AlertDialog.Builder(this)
        dialogBuilder.setMessage(mensaje)
            .setCancelable(false)
            .setPositiveButton("OK", DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
            })
        val alert = dialogBuilder.create()
        //alert.setMessage("Atención")
        alert.show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // obtener acceso al botón saludar
        val btn_saludar = findViewById<Button>(R.id.btnSaludar)
        // agregar funcionalidad al evento click del botón saludar
        btn_saludar.setOnClickListener {
            var nombre = findViewById<EditText>(R.id.txtNombre).text.toString()

            // Kevin Omar Cabanillas Nuñez
            if (nombre == "") {
                nombre = "Fulano"
            }
            val saludo = "Hola $nombre desde Kotlin"
            mostrarMensaje(saludo)
        }
    }
}