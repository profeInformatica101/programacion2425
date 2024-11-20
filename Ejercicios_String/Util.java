package com;

import java.util.Scanner;

public class Util {

	
	public static String leerCadena() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserta una cadena: \n");
		String dev =sc.nextLine();
		return dev;
	}
	
	public static void imprimir(String cadena) {
		System.out.println(cadena);
		
	}
	
	public static boolean esVocal(char v) {
		return "aeiouAEIOU".contains(""+v);
	}
}
