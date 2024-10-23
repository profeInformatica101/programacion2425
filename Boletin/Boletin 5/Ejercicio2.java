package com;

import java.util.Scanner;

/**
 * Escribir una aplicación que solicite al usuario cuántos números
 *  desea introducir. A continuación, 
 *  se introducirá por teclado esa cantidad de números enteros, 
 *  y por último,
los mostrará en el orden inverso al introducido.
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer total_numeros; 
			
		
		System.out.println("Dime cuántos números deseas introducir: ");
		total_numeros = sc.nextInt();
		
		int[] numeros_tabla = new int[total_numeros];

		for(int i=0; i<numeros_tabla.length;i++) {
				System.out.println("Dime un número:");
				numeros_tabla[i]= sc.nextInt();
		}
		System.out.println("Total: " + numeros_tabla.length);
		
		for(int i=numeros_tabla.length-1;i>=0;i--) {
			System.out.println(numeros_tabla[i]);
		}
		
		
		System.out.println(total_numeros);
	}
}
