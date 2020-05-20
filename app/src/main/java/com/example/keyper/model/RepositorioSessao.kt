package com.example.keyper.model

class RepositorioSessao {
    val nome = "aula"
    val senha = "1234"

    fun login(mNome: String, mSenha: String) : Boolean{
        return mNome.equals(nome) && mSenha.equals(senha)
    }
}