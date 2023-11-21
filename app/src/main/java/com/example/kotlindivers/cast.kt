package com.example.kotlindivers

    private fun getDefaultSize1(anyObject: Any): Int {

        // Vérification du type
        if (anyObject is String) {
            return anyObject.length
            // Vérification du type
        } else if (anyObject is List<*>) {
            return anyObject.size
        }

        return 0
    }

private fun getDefaultSize2(anyObject: Any)=
    // Vérification du type
    when {
        anyObject is String -> anyObject.length
        anyObject is List<*> -> anyObject.size
        anyObject is xx ->anyObject.taille
        else -> 0
    }


    //même fonction mais plus courte
    private fun getDefaultSize3(anyObject: Any) =
        when (anyObject) {
            is String -> anyObject.length
            is List<*> -> anyObject.size
            else -> 0
        }
    //en Kotlin contrairement à java, le cast est
    // implicite avec le mot-clé  is
    //c’est ce que l’on appelle le Smart Cast
    //(transtypage intelligent)
    /* **************
        Pour convertir une variable dont vous ne connaissez
        pas forcément le type, en un autre type.
        Par exemple une variable Any en un String : */
fun main() {
        val anyObject: Any = 4.0
        val message = anyObject as String
        print(message)
    }
    //ce type de conversion est appelé "unsafe cast"
    //"Conversion non sécurisée". le mot-clé  as  est
    // dit "non sécurisé" car il renverra une exception
    // de typeClassCastException  s'il n’arrive pas à
    //réaliser la conversion. C'est à l'utilisateur de
    // de la gérer

class  xx()
{
    val taille =7
    var hh : Int=0
    fun tt() {
        print("gg")
    }
}