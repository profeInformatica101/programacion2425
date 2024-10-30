package com;

import java.util.Arrays;

import java.util.Comparator;

public class Ejercicio6 {
		    public static void main(String[] args) {
		        Object[][] arrayMixto = {
		            {10, "Pablo"},
		            {2, "Juan"},
		            {32, "María"},
		            {4, "Pedro"},
		            {5, "Lucía"}
		        };

		        // Ordenar el array en función del primer elemento de cada subarray
		        Arrays.sort(arrayMixto, new Comparator<Object[]>() {
		            @Override
		            public int compare(Object[] o1, Object[] o2) {
		                return Integer.compare((int) o1[0], (int) o2[0]);
		            }
		        });

		        // Acceso a los elementos
		        for (Object[] subArray : arrayMixto) {
		            int numero = (int) subArray[0];
		            String texto = (String) subArray[1];
		            System.out.println("Número: " + numero + ", Texto: " + texto);
		        }
		    }
		

}
