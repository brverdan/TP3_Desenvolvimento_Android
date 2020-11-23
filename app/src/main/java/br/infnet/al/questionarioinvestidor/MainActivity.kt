package br.infnet.al.questionarioinvestidor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnIniciar = findViewById<Button>(R.id.btnIniciar)

        var lblNomeUsuario = findViewById<EditText>(R.id.lblNomeUsuario)

        btnIniciar.setOnClickListener {
            var nome = lblNomeUsuario.text.toString()

            var intent = Intent(this, QuestionarioActivity::class.java)

            intent.putExtra("nome", nome)
            startActivity(intent)
        }
    }
}