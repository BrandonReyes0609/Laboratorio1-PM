/*
 * ---Laboratorio #1 - Kotlin Básico---
 * Author: Brandon Reyes Morales
 * Carne: 22992
 * Correo: rey22992@uvg.edu.gt
 * Fecha: 16 de Julio del 2023
 * Curso: Programación de Plataformas Moviles
 * Lenguaje: Java
 **/
public class ItemDataJ {
    Object originalValue;
    String respuesta = "";

    public ItemDataJ(Object originalValue) {
        this.originalValue = originalValue;
    }

    public String getType() {

        if (originalValue instanceof String) {
            respuesta = "cadena";
        } else if (originalValue instanceof Integer) {
            respuesta = "entero";
        } else if (originalValue instanceof Boolean) {
            respuesta = "booleano";
        } else {
            respuesta = null;
        }
        System.out.println(respuesta);
        return respuesta;
    }

    public String getInfo() {
        if (originalValue instanceof String) {
            // si es string
            respuesta = "L" + ((String)originalValue).length();
            System.out.println(respuesta);
        } else if (originalValue instanceof Integer) {
            //si es integer
            if (10 % (int)originalValue == 0) {
                respuesta = "M10";
            } else if (5 % (int)originalValue == 0) {
                respuesta = "M5";
            } else if (2 % (int)originalValue == 0) {
                respuesta = "M2";
            } else {
                respuesta = null;
            }
        } else if (originalValue instanceof Boolean) {
            if ((Boolean) originalValue == true) {
                respuesta = "true";
            } else {
                respuesta = "falso";
            }
        } else {
            respuesta = null;
        }
        return null;
    }
}