package com.example.buscacep

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CepInterface {

    @GET("ws/{cep}/json/")
    fun groupList(@Path("cep") cep: String?): Call<Cep>
}
