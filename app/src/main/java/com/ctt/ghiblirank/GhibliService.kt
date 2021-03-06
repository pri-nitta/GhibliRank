package com.ctt.ghiblirank

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GhibliService {
    @GET("/films/{tituloInserido}")
    fun buscarTitulo(
        @Path("tituloInserido") titulo: String
    ): Call<Ghibli>
}