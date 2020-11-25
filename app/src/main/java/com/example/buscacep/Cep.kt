package com.example.buscacep

import com.google.gson.annotations.SerializedName

data class Cep(
    @SerializedName("cep") val cepNumber : String,
    @SerializedName("logradouro") val street: String,
    @SerializedName("complemento") val complement: String,
    @SerializedName("bairro") val neighborhood: String,
    @SerializedName("localidade") val city: String,
    @SerializedName("uf") val state: String
)
    /*
     {
      "cep": "01001-000",
      "logradouro": "Praça da Sé",
      "complemento": "lado ímpar",
      "bairro": "Sé",
      "localidade": "São Paulo",
      "uf": "SP",
    }
    * */




