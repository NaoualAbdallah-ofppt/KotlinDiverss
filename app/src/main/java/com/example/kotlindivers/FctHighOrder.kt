package com.example.kotlindivers

/* Une fonction d'ordre supérieur (higher order ) est
une fonction qui prend des fonctions comme paramètres,
ou qui renvoie une fonction*/
val difference = { x: Int, y: Int ->
    if (x>y) {x - y} else {y-x}}
/*ou
val difference2 : (Int,Int) -> Int = {x,y ->
    if (x>y) {x - y} else {y-x}}

 */

val somme = { x: Int ,y:Int-> x + y }
val produit = { x: Int, y: Int -> x / y }
fun concat (a:Int,b:Int) = a+b+1


//UNe fonction d'ordre supérieur
fun operation(n1:Int,n2:Int,
              op:(Int,Int)->Int)
        =op(n1,n2)

//UNe fonction d'ordre supérieur
fun exemple2 (s:String, fct: (String)->String)
= //return
    "********" + fct(s) + "***************"




fun main()
{


    println(operation(2, 5, difference) )
    println(operation(5, 2,produit ))
    println(operation(10, 2, { x: Int ,y:Int-> x + y } ))


    println(exemple2("bonjour",{s->s.uppercase()} ))
    println(exemple2("bonjour",{s->s.substring(0,1).uppercase() + s.substring(s.length-1,s.length).uppercase()} ))
    val lower={s:String->s.lowercase()}
    println(exemple2("bonjour",lower))

}