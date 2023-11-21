package com.example.kotlindivers

class user(var num:Int, var nom:String)
{
    var cat :String
    var test1:String
    //var test2 : String
    //erreur aucune initialisation fournie ni ici ni
    //dans le bloc init
    lateinit var test3:String
    //On peut utiliser lateinit pour dire que l'initialisation viendra plus tard

    //lateinit var test4 : Int
    //Erreur lateinit ne fonctionne pas avec les types primitifs
    //Int, ...

    init{
        test1=""
        //je peux initialiser
        //mais je peux aussi écrire un code pour faire une initialisation
        if (num<1000)
            cat="admin"
        else
            cat="normal User"
    }


}