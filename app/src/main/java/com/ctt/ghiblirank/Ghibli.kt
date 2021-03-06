package com.ctt.ghiblirank

import com.google.gson.annotations.SerializedName

class Ghibli (
    @SerializedName("Titulo em inglês") val titulo: String,
    @SerializedName("Nome original") val nomeJap: String,
    @SerializedName("Titulo em romaji") val tituloRom: String,
    @SerializedName("Descrição") val descricao:String,
    @SerializedName("Diretor") val diretor: String,
    @SerializedName("Ano") val ano: String
        ){
    override fun toSting(): String{
        return "Titulo: $titulo,\nNome Japonês: $nomeJap,\n" +
                "Título em romaji: $tituloRom,\n" +
                "Descrição: $descricao,\n" +
                "Diretor: $diretor,\n" +
                "Ano: $ano"
    }
}