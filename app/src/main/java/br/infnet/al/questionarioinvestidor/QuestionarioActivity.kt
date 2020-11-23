package br.infnet.al.questionarioinvestidor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class QuestionarioActivity : AppCompatActivity() {
    private var total = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionario)

        var nome = intent.getStringExtra("nome")

        var txtNome = findViewById<TextView>(R.id.txtNome)

        txtNome.text = nome
    }
}