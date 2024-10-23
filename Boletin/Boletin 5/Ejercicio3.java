package com;

import java.util.Scanner;

/**
 * Introducir por teclado un número n; 
 * a continuación solicitar al usuario que teclee n números. 
 * Realizar la media de los números positivos, 
 * la media de los negativos y 
 * contar el número de ceros introducidos.
 */
public class Ejercicio3 {
	
	public static void main(String[] args) {
		Integer[] numeros_tabla = crearArrayVacia();
		numeros_tabla = rellenarTabla(numeros_tabla);
		double media = calcularMedia(numeros_tabla);
		double media_negativos = calcularMediaNegativos(numeros_tabla);
		int contador_cero = cuenta_cero(numeros_tabla);
		
		System.out.println("La media es: "+ media);
		System.out.println("La media negativo es: "+ media_negativos);
		System.out.println("Total de 0 es: "+ contador_cero);
	}

private static int cuenta_cero(Integer[] numeros_tabla) {
		int res=0;
			for(int i=0; i<numeros_tabla.length;i++) {
				if(numeros_tabla[i] == 0) {
					res++;
				}
			}
		return res;
	}

private static double calcularMediaNegativos(Integer[] numeros_tabla) {
	double res;	
	int total_negativos = 0;
		int acumulador_media = 0;
		for(int i=0; i<numeros_tabla.length;i++) {
			if(numeros_tabla[i]<0) {
				total_negativos++;
				acumulador_media = acumulador_media + numeros_tabla[i];
			}
		}
		res= (double) acumulador_media /total_negativos;
		return res;
	}

/**
 * 	Calcula la media de una tabla de números enteros positivos
 * @param numeros_tabla
 * @return la media
 */
private static double calcularMedia(Integer[] numeros_tabla) {
		double res;
		int total_numeros_positivo = 0;
		int acumulador_para_media = 0;
		for(int i=0; i<numeros_tabla.length; i++) {
			if(numeros_tabla[i]>0) {
				total_numeros_positivo++;
				acumulador_para_media = acumulador_para_media + numeros_tabla[i];
			}
		}
		res = (double) acumulador_para_media/total_numeros_positivo;
		
		return res;
	}
/**
 * Método para pedir los números que se van a guardar
 * @param numeros_tabla
 * @return
 */
private static Integer[] rellenarTabla(Integer[] numeros_tabla) {
	Scanner sc = new Scanner(System.in);
	
	for(int i=0;i<numeros_tabla.length;i++) {
		System.out.println("Dime un número: ");
		numeros_tabla[i] = sc.nextInt();
		}
		return numeros_tabla;
	}

/**
 * Crea una Array vacia con n valores
 * @return Array de Integer
 */
public static Integer[] crearArrayVacia() {
	Scanner sc = new Scanner(System.in);
	Integer total_numeros; 
		
	
	System.out.println("Dime cuántos números deseas introducir: ");
	total_numeros = sc.nextInt();
	
	Integer[] res = new Integer[total_numeros];
	return res;
	
}

}