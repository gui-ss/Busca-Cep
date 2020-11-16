package com.example.buscacep

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    lateinit var navigation : FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation = findViewById<FragmentContainerView>(R.id.nav_host_fragment)

        }

    fun telaHistorico(view : View){
        navigation.findNavController().navigate(R.id.action_home2_to_historic)
    }

    fun voltarTelaHome(view : View){
        navigation.findNavController().navigate(R.id.action_historic_to_home2)
    }

    }

