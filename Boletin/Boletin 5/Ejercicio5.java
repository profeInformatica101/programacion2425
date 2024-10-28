package ejercicios;

import java.util.Random;

public class Ejercicio5 {
public static void main(String[] args) {
	imprimirTabla(creaTablaPin(3));
}


// https://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java
public static int[] creaTablaPin(int tamaño) {
	
	int[] res = new int[tamaño];
	for(int i =0; i < res.length; i++) {
		res[i] = devolverEnteroAleatorio();
	}
	
	return res;
}

public static int devolverEnteroAleatorio() {
	int MIN = 0;
	int MAX = 5;
	return new Random().nextInt(MAX - MIN + 1) + MIN;
}


public static void imprimirTabla(int[] tabla) {
	for(int i = 0; i< tabla.length; i++) {
		System.out.println(tabla[i]);
	}
	
}
}
