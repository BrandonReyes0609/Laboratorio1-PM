/*
* Author: Brandon Reyes Morales
* Carne: 22992
* Correo: rey22992@uvg.edu.gt
* Fecha: 16 de Julio del 2023
* Curso: Programación de Plataformas Moviles
* Lenguaje: Kotlin
* */
class ItemData(var originalValue: Any) {
    var respuesta: String? = ""

    val type: String?
        get() {
            respuesta = if (originalValue is String) {
                "cadena"
            } else if (originalValue is Int) {
                "entero"
            } else if (originalValue is Boolean) {
                "booleano"
            } else {
                null
            }
            println(respuesta)
            return respuesta
        }//si es integer

    // si es string
    val info: String?
        get() {
            if (originalValue is String) {
                // si es string
                respuesta = "L" + (originalValue as String).length
                println(respuesta)
            } else if (originalValue is Int) {
                //si es integer
                respuesta = if (10 % originalValue as Int == 0) {
                    "M10"
                } else if (5 % originalValue as Int == 0) {
                    "M5"
                } else if (2 % originalValue as Int == 0) {
                    "M2"
                } else {
                    null
                }
            } else if (originalValue is Boolean) {
                respuesta = if (originalValue as Boolean == true) {
                    "true"
                } else {
                    "falso"
                }
            } else {
                respuesta = null
            }
            return null
        }
}