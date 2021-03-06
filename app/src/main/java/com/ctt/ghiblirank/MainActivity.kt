package com.ctt.ghiblirank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var filme: EditText
    private lateinit var botaoBuscar: Button
    private lateinit var respostaFilme: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        filme = findViewById(R.id.edtTitulo)
        botaoBuscar = findViewById(R.id.btnBuscarTitulo)
        respostaFilme = findViewById(R.id.txtResposta01)

        botaoBuscar.setOnClickListener {
            val titulo = filme.text.toString()
            if (titulo.isNotEmpty()) {
                buscarTitulo(titulo)
            } else {
                filme.error = "Titulo não encontrado :("
            }
        }
    }

    fun buscarTitulo(titulo:String){
        val retrofitClient = Network.RetrofitConfig("https://ghibliapi.herokuapp.com")
        val servico = retrofitClient.create(GhibliService::class.java)
        val chamada = servico.buscarTitulo(titulo)
        chamada.enqueue(
            object:Callback<Ghibli>{
                override fun onResponse(call: Call<Ghibli>, response: Response<Ghibli>) {
                    val dados = response.body()?.toString()
                    dados?.let {
                        if (it.isNotEmpty()) {
                            respostaFilme.text = dados
                        } else {
                            filme.error = "Infos erradas!"
                        }
                    }
                }
                    override fun onFailure(call: Call<Ghibli>, t: Throwable) {
                        respostaFilme.text = "Falhas técnicas!"
                    }
            }
        )
    }
}