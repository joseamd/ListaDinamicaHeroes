package com.example.listadinamicaheroes

import java.util.*

data class Heroe (var name:String, var alterEgo:String, var url:String) {
    fun getFullName():String = "$alterEgo $name"
}