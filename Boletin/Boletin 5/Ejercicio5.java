package ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {
public static void main(String[] args) {

	//Genero una tabla de 4 elementos aleatorios que tienen que adivinar
	int[] tablaPin = creaTablaPin(4);
	// Imprimo la tabla de 4 elementos para PRUEBAS
	System.out.println("Tabla PIN: ");
	imprimirTabla(tablaPin);
	
	int[] tabla_user;
	String[] tabla_comprobacion;
	do {
		// Leo los valores
		tabla_user =leerValores(4);
		// Genero una tabla con las comparativas
		tabla_comprobacion = comprobarValores(tabla_user, tablaPin);
		
	}while(!sonTablasIguales(tabla_comprobacion));
	//HAS TERMINADO
	System.out.println("Lo has acertado!");
	
}




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
