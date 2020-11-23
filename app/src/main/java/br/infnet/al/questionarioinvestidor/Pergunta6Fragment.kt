package br.infnet.al.questionarioinvestidor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Pergunta6Fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pergunta6, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var btnProximaPergunta = view.findViewById<Button>(R.id.btnProximaPergunta)

        btnProximaPergunta.setOnClickListener {
            findNavController().navigate(R.id.pergunta7Fragment)
        }
    }
}