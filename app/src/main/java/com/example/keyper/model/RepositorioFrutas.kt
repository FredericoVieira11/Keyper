package com.example.keyper.model

class RepositorioFrutas {
    private val frutas = arrayOf(
        "Banana",
        "Manga",
        "Pêra",
        "Pêssego"
    )

    fun getFrutas(): Array<String>{
        return frutas
    }
}