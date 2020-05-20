package com.example.keyper.ui.frutas

class FrutasContrato {

    interface View{
        fun mostrarDados(frutas: Array<String>)
    }

    interface Presenter{
        fun getFrutas()
    }
}