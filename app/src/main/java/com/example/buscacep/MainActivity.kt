package com.example.buscacep

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Editable
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    lateinit var navigation : FragmentContainerView
    lateinit var cepString : String
    lateinit var cepUser: EditText
    lateinit var cepText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation = findViewById<FragmentContainerView>(R.id.nav_host_fragment)
        }

    fun buscarCep(view: View){
        cepUser = findViewById(R.id.search_input)
        cepText = findViewById(R.id.tv_street)
        cepString = cepUser.text.toString()


        ControllerRetrofit().retrofit.groupList(cep = cepString).enqueue(object : Callback<Cep>{
            override fun onFailure(call: Call<Cep>, t: Throwable) {
                TODO("Not yet implemented")
            }

            @SuppressLint("SetTextI18n")
            override fun onResponse(call: Call<Cep>, response: Response<Cep>) {
                val response = response.body()
                cepText.text = "Cep: "+response?.cepNumber+
                        "\nRua: "+response?.street+
                        "\nBairro: "+response?.neighborhood+
                        "\nCidade: "+response?.city+
                        "\nUF: "+response?.state
                //Toast.makeText(baseContext, response?.street, Toast.LENGTH_LONG).show()

            }
        })
    }


    fun telaHistorico(view : View){
        navigation.findNavController().navigate(R.id.action_home2_to_historic)
    }

    fun voltarTelaHome(view : View){
        navigation.findNavController().navigate(R.id.action_historic_to_home2)
    }



    }

