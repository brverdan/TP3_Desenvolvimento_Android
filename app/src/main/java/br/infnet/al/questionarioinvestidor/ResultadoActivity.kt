package br.infnet.al.questionarioinvestidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var nome = intent.getStringExtra("nome")

        var txtNomeInvestidor = findViewById<TextView>(R.id.txtNomeInvestidor)
        var txtResultado = findViewById<TextView>(R.id.txtResultado)

        txtNomeInvestidor.text = nome
    }
}