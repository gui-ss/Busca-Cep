package com.example.buscacep

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ControllerRetrofit {

    val retrofit = Retrofit
        .Builder()
        .baseUrl("http://viacep.com.br/")
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(CepInterface::class.java)


}



