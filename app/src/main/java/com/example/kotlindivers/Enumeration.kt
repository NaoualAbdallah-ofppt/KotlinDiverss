package com.example.kotlindivers



fun main()
{

    var  js : JOURSEMAINE?=null
    //Traitement
    println(partOfWeek(JOURSEMAINE.LUNDI))
    println(partOfWeek(JOURSEMAINE.SAMEDI))
   // println(partOfWeek("ttt"))
    //Erreur il faut que la valeur fournie soit du type JOURSemaine
    var js2 : JOURSEMAINE2=JOURSEMAINE2.MERCREDI
    println(js2.code)
    var js3 : JOURSEMAINE3=JOURSEMAINE3.MERCREDI
    println(js3.code)
    println(js3.inEnglish)
    var js4 : JOURSEMAINE4=JOURSEMAINE4.VENDREDI
    println(js4.code)
   js4.descriptionJour()


}
fun partOfWeek (js: JOURSEMAINE)
=when{
    js ==JOURSEMAINE.DIMANCHE || js==JOURSEMAINE.SAMEDI -> "WEEK-END"
    else -> "Milieu Semaine"
}

enum class JOURSEMAINE{
    LUNDI,
    MARDI ,
    MERCREDI ,
    JEUDI ,
    VENDREDI,
    SAMEDI,
    DIMANCHE
   }










enum class JOURSEMAINE2(val code :Int){
    LUNDI(1),
    MARDI(2) ,
    MERCREDI(3) ,
    JEUDI(4) ,
    VENDREDI(5),
    SAMEDI(6),
    DIMANCHE(7)
}

enum class JOURSEMAINE3(val code :Int, val inEnglish :String ){
    LUNDI(1,"MONDAY"),
    MARDI(2,"TUESDAY") ,
    MERCREDI(3,"WEDNESDAY") ,
    JEUDI(4,"THURSDAY") ,
    VENDREDI(5,"FRIDAY"),
    SAMEDI(6,"SATURDAY"),
    DIMANCHE(7,"SUNDAY")
}


enum class JOURSEMAINE4(val code:Int){
    LUNDI(1)
    {
        override fun descriptionJour() {
            print("Aujourd'hui c'est le premier jour de la semaine")
        }
    },
    MARDI(2) {
        override fun descriptionJour() {
            print("Mardi c'est c'est le deuxième jour de la semaine")
        }
    },
    MERCREDI(3){
        override fun descriptionJour() {
            print("Aujourd'hui c'est le premier jour de la semaine")
        }
    },
    JEUDI(4)
    {
        override fun descriptionJour() {
            print("Aujourd'hui c'est le premier jour de la semaine")
        }
    },
    VENDREDI(5)
    {
        override fun descriptionJour() {
            print("c'est le cinquième jour de la semaine. Jour sacré pour les musulmans")
        }
    },
    SAMEDI(6){
        override fun descriptionJour() {
            print("c'est le 6 de la semaine")
        }
    },
    DIMANCHE(7){
        override fun descriptionJour() {
            print(" c'est le 7 jour de la semaine")
        }
    };
    //; pour séparer les méthodes des constantes
    abstract fun descriptionJour()


}


