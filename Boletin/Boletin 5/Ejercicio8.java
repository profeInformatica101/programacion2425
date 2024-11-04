package com;

import java.util.Arrays;

/**
 * Implementar la función sinRepetidos() con el prototipo,
  
  
  int [] sinRepetidos ( int t [])
  
que construye y devuelve una tabla del tamaño apropiado, 
con los elementos de t, donde se han eliminado los datos repetidos.
*/

class Ejercicio8 {
	static int[] repetidos = {1,2,4,4,1,5,9,10};
	
	public static void main(String[] args) {
		imprimir(sinRepetidos(repetidos));
		System.out.println("fin");
	}

/**
 * Filtra los números repetidos
 * @param t tabla con números repetidos
 * @return tabla con números sin repetir
 */
public static int [] sinRepetidos ( int t []) {
	//Creo un Array de tamaño de repetidos
	int[] res = new int[t.length];
	int index = 0;
	//Recorro la tabla, por cada elemento compruebo si ya añadido a la tabla resultado
	for(int actual : t) {
		if(!contiene(actual, res)) {
			res[index] = actual;
			index++;
		}
	}
	//Devolvemos el array solo con los elementos que contiene
	res = Arrays.copyOf(res, index);
	return res;
}
/**
 * Devuelve True si contiene un numero la tabla
 * @param numero
 * @param tabla
 * @return
 */
public static boolean contiene(int numero, int tabla[]) {
	for(int numero_aux : tabla) {
		if(numero_aux == numero)
			return true;
	}
	return false;
}
//Función auxiliar que me permite imprimir tablas
public static void imprimir(int tabla[]) {
	System.out.println(Arrays.toString(tabla));
	
}

}
