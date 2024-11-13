package com;

public class Ejercicio14 {
	
	public static int[] numeros_ganadores = {1,5,6,8,9,23};
	public static int[] numeros_jugados = {1,4,6,19,23,50};
	
	
	
	public static void main(String [] args) {
		int contador = 0;
		for(int i=0; i<numeros_ganadores.length; i++) {
			for(int j=0; j<numeros_jugados.length; j++) {
				if(numeros_ganadores[i] == numeros_jugados[j]) {
					contador++;
				}
			}
		}	
		
		System.out.println("El total de acertados es: " + contador);
	}
	

}
