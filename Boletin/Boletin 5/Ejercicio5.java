package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {
	
	int n = leerDificultad();
	
	//Genero una tabla de n elementos aleatorios que tienen que adivinar
	int[] tablaPin = creaTablaPin(n);
	// Imprimo la tabla de n elementos para PRUEBAS
	System.out.println("Tabla PIN: de " + n + " elementos.");
	imprimirTabla(tablaPin);
	
	int[] tabla_user;
	String[] tabla_comprobacion;
	do {
		// Leo los valores
		tabla_user =leerValores(n);
		// Genero una tabla con las comparativas
		tabla_comprobacion = comprobarValores(tabla_user, tablaPin);
		
	}while(!sonTablasIguales(tabla_comprobacion));
	//HAS TERMINADO
	System.out.println("Lo has acertado!");
	
}



/**
 * Devuelve una tabla de String indicando la comparación.
 * 
 * Ejemplo:
 * + Para tabla_pin --> [ 1  4  0  1 ]
 * + Para tabla_user --> [1 3 1 2]
 * 
 * Devolvería
 * [ =  <  >  > ]

 * @param tabla_user
 * @param tabla_pin
 * @return
 */
public static String[] comprobarValores(int[] tabla_user, int[] tabla_pin) {
	String [] res = new String[tabla_user.length];
	for(int i=0; i<tabla_user.length; i++) {
		if(tabla_user[i]>tabla_pin[i]) {
			res[i] = ">";
		}else if(tabla_user[i]<tabla_pin[i]) {
			res[i] = "<";
		}else {
			res[i] = "=";
		}
	}
	
	imprimirTabla(res);
	return res;
}

public static int[] leerValores(int n) {
	 Scanner sc= new Scanner(System.in);
	 int[] res = new int[n];
	 System.out.println("Dime valores:");
	 for(int i=0; i<n; i++) {
		res[i] = sc.nextInt();
	}
	 
	 return res;

}
public static int leerDificultad() {
	 Scanner sc= new Scanner(System.in);
	 int n = -1;
	 do {
		 System.out.println("Dime el nivel dificultad (3 y 20)");
		 n = sc.nextInt();
	 }while(n > 0 && n > 20);
	 return n;
}
public static boolean sonTablasIguales(String[] tabla_comprobacion) {
	boolean dev = true;
	for(String comp : tabla_comprobacion) {
		if(!comp.equals("=")) {
			return false;
		}
	}
	return dev;
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


public static void imprimirTabla(Object[] tablaPin) {
	String res = "[";
	for(int i = 0; i< tablaPin.length; i++) {
		res = res + " " + tablaPin[i] + " ";
	}
	res = res + "]";
	System.out.println(res);
}

private static void imprimirTabla(int[] tablaPin) {
	String res = "[";
	for(int i = 0; i< tablaPin.length; i++) {
		res = res + " " + tablaPin[i] + " ";
	}
	res = res + "]";
	System.out.println(res);
	
}

}
