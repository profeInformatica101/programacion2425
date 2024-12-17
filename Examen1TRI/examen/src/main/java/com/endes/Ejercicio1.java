package com.endes;

public class Ejercicio1 {

	 public static String inicialesMayusculas(String texto) {
	        String[] palabras = texto.split(" ");
	        StringBuilder resultado = new StringBuilder();

	        for (String palabra : palabras) {
	            if (!palabra.isEmpty()) {
	                resultado.append(palabra.substring(0, 1).toUpperCase())
	                         .append(palabra.substring(1).toLowerCase())
	                         .append(" ");
	            }
	        }

	        return resultado.toString().trim();
	    }


}
