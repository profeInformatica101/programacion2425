package com.endes.ejercicio3;

public class SpriteZoom {
	/**
     * Diseñar la función zoom(char[][] sprite) que toma un “sprite” o patrón de puntos en forma
       de array bidimensional de caracteres y muestre dicho sprite ampliado al doble de ancho y
       doble de alto..
     * @param sprite Matriz original.
     * @return Matriz ampliada.
     */
	public static char[][] zoom(char[][] sprite) {
	    if (sprite == null || sprite.length == 0 || sprite[0].length == 0) {
	        // Retornar un array vacío si la entrada no es válida
	        return new char[0][0];
	    }

	    int filas = sprite.length;
	    int columnas = sprite[0].length;
	    char[][] ampliado = new char[filas * 2][columnas * 2];

	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            char actual = sprite[i][j];
	            // Duplicar el carácter en 4 posiciones (ampliación)
	            ampliado[i * 2][j * 2] = actual;
	            ampliado[i * 2][j * 2 + 1] = actual;
	            ampliado[i * 2 + 1][j * 2] = actual;
	            ampliado[i * 2 + 1][j * 2 + 1] = actual;
	        }
	    }
	    return ampliado;
	}
}
