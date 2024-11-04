package com;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//int[] tab1 = {4,5,3,2,1};
		//int[] tab2 = {20,23,2,1,50,100,3};
		
		int[] tab1 = leerTabla(6);
		int[] tab2 = leerTabla(6);
			
		imprime(fusionar(tab1, tab2));
		

	}
/**
Fusiona llevando dos índices dependiendo del tamaño
*/
	private static int[] fusionar(int[] tab1, int[] tab2) {
		//Inicializamos las variables
		int tab_fusionada_tam = tab1.length + tab2.length;
		int indice_tab1 = 0, indice_tab2=0, indice_res = 0;
		
		int[] res = new int[tab_fusionada_tam];
		
		ordena(tab1);
		ordena(tab2);
		
		//Realizar mientras los indices sean menores
		do {
			if(tab1.length ==  indice_tab1 ) {
				res[indice_res] = tab2[indice_tab2];
				indice_tab2++;
			}else if(tab2.length ==  indice_tab2 ) {
				res[indice_res] = tab1[indice_tab1];
				indice_tab1++;
			}else if(tab1[indice_tab1]<=tab2[indice_tab2]) {
				res[indice_res] = tab1[indice_tab1];
				if(indice_tab1 < tab1.length) {
					indice_tab1++ ;
				}
				
			}else {
				res[indice_res] = tab2[indice_tab2];
				if(indice_tab2 < tab2.length) {
					indice_tab2++;
				}
				
			}
			
			indice_res++;
		}while(! (res.length<indice_res+1));
		
		return res;
		
	}
	// Función que nos permite ordenar la tabla
	public static void ordena(int[] tab) {
		Arrays.sort(tab);
		
	}
	
	// Función que nos imprime una tabla
	public static void imprime(int[] tab) {
		System.out.println(Arrays.toString(tab));
	}
	
	
	public static int[] leerTabla(int n) {
		Scanner sc = new Scanner(System.in);
		int[] dev = new int[n];
		
		System.out.println("Dime los " + n + " números");
		for(int i=0; i<n; i++) {
			dev[i] = sc.nextInt();
		}
		
		return dev;
		
	}
	/**
	Realiza fusión realizando la estrategia de copiado de la tabla 1 y a continuación completo con la tabla 2
	*/
	private static int[] fusionar(int[] tab1, int[] tab2) {
		//Inicializamos las variables
		int tab_fusionada_tam = tab1.length + tab2.length;
		//int[] tab_fusinada = new int[tab_fusionada_tam];
		int[] tab_fusionada = Arrays.copyOf(tab1, tab_fusionada_tam);
		
		int j = 0;
		for(int i=tab1.length; i<tab_fusionada.length; i++) {
			tab_fusionada[i] = tab2[j];
			j++;
		}
		ordena(tab_fusionada);
		return tab_fusionada;
	}
}
