package com.ctt.ghiblirank

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GhibliService {
    @GET("tituloInserido/json/")
    fun buscarTitulo(
        @Path("tituloInserido") titulo: String
    ): Call<Ghibli>
}