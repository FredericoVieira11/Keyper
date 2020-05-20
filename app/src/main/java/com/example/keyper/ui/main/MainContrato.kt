package com.example.keyper.ui.main

interface MainContrato {

    interface View{
        fun mostrarMensagem(texto: String)

        fun iniciaAtividadeFrutas()
    }

    interface Presenter{
        // será chamado quando o botao de login for clicado
        fun loginClicado(nome: String, senha: String)
    }
}