package com;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		int[] tab1 = {4,5,3,2,1};
		int[] tab2 = {20,23,2,1,50,100,3};
		
		//imprime(tab1);
		ordena(tab1);
		ordena(tab2);
		//imprime(tab1);
		
		imprime(fusionar(tab1, tab2));
		

	}

	private static int[] fusionar(int[] tab1, int[] tab2) {
		//Inicializamos las variables
		int tab_fusionada_tam = tab1.length + tab2.length;
		int indice_tab1 = 0, indice_tab2=0, indice_res = 0;
	
		int[] res = new int[tab_fusionada_tam];
		
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

	public static void ordena(int[] tab) {
		Arrays.sort(tab);
		
	}
	
	public static void imprime(int[] tab) {
		System.out.println(Arrays.toString(tab));
	}
	

}
