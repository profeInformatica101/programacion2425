package com;

import java.util.Arrays;

public class Invertir {
	
	public static void main(String [] args) {
		
		int[] listado = {4, 34, 1, 5, 10, 20, 21, 3};
		
		imprimir(listado);
		invertir(listado);
		imprimir(listado);
	}
	
	/**
	 * Función que permite invertir un Array
	 * @param tab
	 */
	public static void invertir(int [] tab) {
		//int[] dev = new int[tab.length];
		int aux;
		for(int i=(tab.length-1)/2; i>=0; i--) {
			//Dos indices: i y indice
			int indice = tab.length - i - 1;
			//Intercambio de datos 
			aux = tab[i];
			tab[i] = tab[indice];
			tab[indice] = aux;
			
		}
	}
	
	public static void imprimir(int[] tab) {
		System.out.println(Arrays.toString(tab));
	}

}
