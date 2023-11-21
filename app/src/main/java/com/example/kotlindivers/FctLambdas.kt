package com.example.kotlindivers

//fonction lambdas
val sommeDe = { x:Int, y:Int -> x+y }
fun main()
{
    val numbers = arrayOf(1,-2,3,-4,5)

    println(numbers.filter { it > 0 })
    println(sommeDe(4,6))
    println(lambda1(4))
    var S:String="Bonjour"
    println(S.lambda4(4))

    //println(double(4,6))
    //error: too many arguments for
}

//Fonction lambdas Somme

//Fonction lambdas Double
//val double={x->x*2}
//error: cannot infer a type for this parameter. Please specify it explicitly.
//val double={x->x*2}
val double={x:Int->x*2}

fun puissance2 (a : Int) : Int
{
    return  a*a
}
val lambda1: (Int) -> Int ={ a -> a * a}
val lambda2: (String,String) -> String = { a , b -> a + b }
val lambda3: (Int)-> Unit = {print(Int)}
val lambda4: String.(Int) -> String = {this + it}
//cette fct lambdas sera une fonction d'extension pour les
//strings
//Fonction qui reçoit 2 nombre et retourne leur concaténation
//Exp 1 et 2 donnent 12
val concat={a:Int,b:Int->"$a$b"}
//Fonction qui reçoit 2 nombres en chaine et retourne
// leur somme Exp "1" et "2" donnent 3
val som={a:String,b:String->a.toInt() + b.toInt()}

fun cancat2(a:Int, b: Int)= "$a$b"

