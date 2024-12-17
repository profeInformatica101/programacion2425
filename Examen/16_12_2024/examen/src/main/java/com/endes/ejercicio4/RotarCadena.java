package com.endes.ejercicio4;
/*
 * Realizar la función rotarCadena() que toma como parámetro una cadena y devuelve la
cadena rotada una posición hacia la izquierda. En la cadena resultante, cada carácter pasará a
ocupar la posición justo a su izquierda, menos el primero, que pasará a la última posición.
Realizar un programa de prueba que vayamostrando una cadena rotándola tantas veces como
el número de caracteres que la forman.
 * */

public class RotarCadena {

    /**
     * Rota una cadena una posición a la izquierda.
     *
     * @param cadena La cadena a rotar.
     * @return La cadena rotada.
     */
    public static String rotarCadena(String cadena) {
        if (cadena == null || cadena.length() <= 1) {
            return cadena; // Caso de cadena nula o de un solo carácter
        }

        // Desplazar cada carácter de la cadena una posición a la izquierda. 
        //--> El primer carácter de la cadena se moverá al final
        return cadena.substring(1) + cadena.charAt(0);
    }
}
