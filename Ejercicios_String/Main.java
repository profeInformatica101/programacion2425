package com;

public class Main {

	public static void main(String[] args) {
	/*	String cadena = Util.leerCadena();
		Util.imprimir("\t Ejercicio 1: ");
		Util.imprimir(cadena);
		Util.imprimir(ejercicio1(cadena));
		*/
		
		String cadena2="Java es divertido";
		Util.imprimir("\t Ejercicio 2: ");
		Util.imprimir(cadena2);
		Util.imprimir(ejercicio2(cadena2));
		
		String cadena3="Programación";
		Util.imprimir("\t Ejercicio 3: ");
		Util.imprimir(cadena3);
		Util.imprimir(ejercicio3(cadena3));
		
		String cadena5="Ana";
		Util.imprimir("\t Ejercicio 5: ");
		Util.imprimir(cadena5);
		if(ejercicio5(cadena5)) {
			Util.imprimir("True");
		}else {
			Util.imprimir("False");
		}
		
		String cadena6="Java";
		char char_entrada='a';
		Util.imprimir("\t Ejercicio 6: ");
		Util.imprimir(cadena6 + " " + char_entrada);
		Util.imprimir(ejercicio6(cadena6, char_entrada));
		
	}

	/**
	 * Ejercicio 1: Convertir a mayúsculas Solicita una frase al usuario y muestra
	 * la misma frase en mayúsculas. 
	 * Ejemplo: 
	 * ● Entrada: Hola mundo
	 *  ● Salida: HOLA 	 * MUNDO
	 */
	
	public static String ejercicio1(String entrada) {
		String salida = entrada.toUpperCase();
		return salida;
	}

	/*
	 * 
	 * Ejercicio 2: Reemplazar caracteres Pide al usuario una frase y reemplaza
	 * todas las vocales con el carácter *.
	 *  Ejemplo: 
	 *  ● Entrada: Java es divertido 
	 *  ● Salida: J*v* *s d*v*rt*d*
	 */ 
	public static String ejercicio2(String entrada) {
	    String vocales = "aeiouAEIOU";
	    char letra;
	    StringBuilder salida = new StringBuilder(entrada);

	    for (int i = 0; i < entrada.length(); i++) {
	        letra = entrada.charAt(i);
	        if (vocales.indexOf(letra) >= 0) { // Cambiar a >= para incluir vocales en posición 0
	            salida.setCharAt(i, '*'); // Usar setCharAt para modificar caracteres en StringBuilder
	        }
	    }

	    return salida.toString();
	}
	
	
	 /* Ejercicio 3: Contar vocales Escribe un programa que solicite una palabra y
	 * cuente cuántas vocales contiene. 
	 * Ejemplo: 
	 * ● Entrada: Programación 
	 * ● Salida: * La palabra contiene 5 vocales
	 */ 
	public static String ejercicio3(String entrada) {
		String vocales = "aeiouAEIOU";
		char letra;
		Integer contador =  0;
		String salida="La palabra contiene ";
		
		for (int i = 0; i < entrada.length(); i++) {
	        letra = entrada.charAt(i);
	        if (vocales.indexOf(letra) >= 0) { // Cambiar a >= para incluir vocales en posición 0
	        	contador++;
	        }
	    }
		
		if(contador>0) {
			salida+= contador + " vocales.";
		}else {
			salida+= "ninguna vocal.";
		}
		return salida;
	}
	
	
	/* Ejercicio 5: Es Palíndromo Pide al usuario una palabra y verifica si es un
	 * palíndromo (se lee igual al derecho y al revés). 
	 * Ejemplo: 
	 * ● Entrada: ana 
	 * ● Salida: Es un palíndromo
	 */

	public static boolean ejercicio5(String entrada) {
		boolean salida = true;
		
		for(int i=0; i<entrada.length(); i++) {
			if(entrada.toUpperCase().charAt(i)!=entrada.toUpperCase().charAt(entrada.length()-i-1)) {
				return false;
			}
			
		}
		return salida;
	}

	 /* Ejercicio 6: Contar ocurrencias de un carácter Pide una palabra y un
	 * carácter, y cuenta cuántas veces aparece ese carácter en la palabra. 
	 * Ejemplo:
	 *     Entrada: Palabra: Java Carácter: a 
	 *     Salida: El carácter 'a' aparece 2 veces
	 */
	public static String ejercicio6(String entrada_palabra, char entrada_caracter) {
		String salida = "";
		int contador = 0;
		for(int i=0; i<entrada_palabra.length(); i++) {
			if(entrada_palabra.charAt(i) == entrada_caracter) {
				contador++;
			}
		}
		salida += "El carácter '"+entrada_caracter+"' aparece "+contador+" veces";
		return salida;
	}
}
