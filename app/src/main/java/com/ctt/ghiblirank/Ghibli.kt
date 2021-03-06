package com.ctt.ghiblirank

import com.google.gson.annotations.SerializedName

data class Ghibli (
    @SerializedName("title") val titulo: String,
    @SerializedName("original_title_romanised") val tituloRom: String,
    @SerializedName("description") val descricao:String,
    @SerializedName("director") val diretor: String,
    @SerializedName("release_date") val ano: String
        ) {
    override fun toString(): String {
        return "Titulo: $titulo,\n" +
                "Título em romaji: $tituloRom,\n" +
                "Diretor: $diretor,\n" +
                "Ano: $ano,\n\n"+
                "Descrição: $descricao"
    }
}