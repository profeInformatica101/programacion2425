package com;
/**
 * Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro
educativo. Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas
(números enteros) del primer, segundo y tercer trimestre de un grupo. Debemos mostrar
al final la nota media del grupo en cada trimestre, y la media del alumno que se
encuentra en la posición pos (que se lee por teclado).
 */
public class Ejercicio9 {
	
	public static int[][] tabla_alumnos = {{3,3,3}, {10,9,7}, {6,7,8}, {6,7,8}, {8,7,8}};

	
	public static void main(String [] args) {
		
		
		mostrar_Tabla(tabla_alumnos);
		
	}
	
	
	public static void mostrar_Tabla(int[][] tabla) {
		String buffer = "";
		for(int id_alumno = 0; id_alumno < tabla.length; id_alumno++) {
			buffer += "Alumno_"+ id_alumno + "-->";
			
			for(int id_trimestre = 0; id_trimestre < tabla[id_alumno].length; id_trimestre++) {
				buffer += " Nota_" + (id_trimestre+1) + ": " +  tabla[id_alumno][id_trimestre];
			}
			
			double media_alumno = calcularMedia(tabla[id_alumno]); 
			buffer += " Media: " + media_alumno;
			buffer += "\n";
		}
		
		
		System.out.println(buffer);
		
		 for (int trimestre = 0; trimestre < 3; trimestre++) {
	            double mediaTrimestre = media_grupo_trimestre(tabla_alumnos, trimestre);
	            System.out.println("Media del grupo en el trimestre " + (trimestre + 1) + ": " + mediaTrimestre);
	        }
	}


	private static double calcularMedia(int[] notas) {
		int total_notas = notas.length;
		double suma_total = 0;
		
		for(int nota: notas) {
			suma_total+=nota;
		}
		
		return suma_total/total_notas;
	}
	
	private static double media_grupo_trimestre(int[][] tabla, int trimestre) {
		double suma = 0;
        int total_alumnos = tabla.length;

        for (int i = 0; i < total_alumnos; i++) {
            suma += tabla[i][trimestre];
        }

        return suma / total_alumnos;
	}
	
	
}
