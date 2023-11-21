package com.example.kotlindivers

fun main()
{

    val nom :String ="Sabir"
    val prenom : String by lazy {
        "Omar"
    }

    println("Bonjour. On veut afficher le nom")
    println(nom)
    println("Bonjour. On veut afficher le prénom")
    println(prenom)

}