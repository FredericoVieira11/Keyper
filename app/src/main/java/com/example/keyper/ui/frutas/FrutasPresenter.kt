package com.example.keyper.ui.frutas

import com.example.keyper.model.RepositorioFrutas

class FrutasPresenter(private val view: FrutasContrato.View,
                      private val repositorioFrutas: RepositorioFrutas) : FrutasContrato.Presenter {

    override fun getFrutas() {
        val frutas = repositorioFrutas.getFrutas()

        frutas.sortBy { it.length }

        view.mostrarDados(frutas)
    }

}