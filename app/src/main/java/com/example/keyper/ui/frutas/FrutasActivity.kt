package com.example.keyper.ui.frutas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.keyper.R
import com.example.keyper.model.RepositorioFrutas

class FrutasActivity : AppCompatActivity(), FrutasContrato.View {

    private lateinit var presenter: FrutasPresenter
    private lateinit var adapter: ArrayAdapter<String>
    private lateinit var lista: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frutas)

        // Iniciliza o Presenter
        presenter = FrutasPresenter(this, RepositorioFrutas())

        lista = findViewById<ListView>(R.id.lista_frutas)

        // Carrega/faz loading as/das frutas
        presenter.getFrutas()
    }

    override fun mostrarDados(frutas: Array<String>) {
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,
                android.R.id.text1, frutas)

        lista.adapter = adapter
    }
}
