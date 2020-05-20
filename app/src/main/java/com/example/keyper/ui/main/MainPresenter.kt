package com.example.keyper.ui.main

import com.example.keyper.model.RepositorioSessao

class MainPresenter(private val view: MainContrato.View) : MainContrato.Presenter {

    private var repositorioSessao: RepositorioSessao = RepositorioSessao()

    override fun loginClicado(nome: String, senha: String) {
        // Verificação dos textfields, nomeadamente, nome e senha
        if (nome.isEmpty()){
            view.mostrarMensagem(texto = "Nome Inválido")
            return
        }
        if (senha.isEmpty()){
            view.mostrarMensagem(texto = "Digite uma senha")
            return
        }
        // Se tudo tiver certo vai para outra view senao mostra erro
        val loginComSucesso = repositorioSessao.login(nome, senha)
        if (loginComSucesso){
            view.mostrarMensagem(texto = "Login Efetuado!")
            view.iniciaAtividadeFrutas()
        }else{
            view.mostrarMensagem(texto = "Falha no Login!")
        }
    }
}