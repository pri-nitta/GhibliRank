package com.ctt.ghiblirank

import com.google.gson.annotations.SerializedName

class Ghibli (
    @SerializedName("Titulo em inglês")
    @SerializedName("Nome original")
    @SerializedName("Titulo em romaji")
    @SerializedName("Descrição")
    @SerializedName("Diretor")
    @SerializedName("Ano")
        ){
    override fun toSting()
}