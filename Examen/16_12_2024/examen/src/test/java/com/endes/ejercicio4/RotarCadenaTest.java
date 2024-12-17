package com.endes.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RotarCadenaTest {

	 @Test
	    @DisplayName("Rotar una cadena normal")
	    void testRotarCadenaNormal() {
	        String resultado = RotarCadena.rotarCadena("ABCDE");
	        assertEquals("BCDEA", resultado, "La rotación de 'ABCDE' debe ser 'BCDEA'");
	    }

	    @Test
	    @DisplayName("Rotar una cadena de un solo carácter")
	    void testRotarCadenaUnCaracter() {
	        String resultado = RotarCadena.rotarCadena("A");
	        assertEquals("A", resultado, "La cadena de un solo carácter debe mantenerse igual");
	    }

	    @Test
	    @DisplayName("Rotar una cadena vacía")
	    void testRotarCadenaVacia() {
	        String resultado = RotarCadena.rotarCadena("");
	        assertEquals("", resultado, "Una cadena vacía debe mantenerse vacía");
	    }

	    @Test
	    @DisplayName("Rotar una cadena nula")
	    void testRotarCadenaNula() {
	        String resultado = RotarCadena.rotarCadena(null);
	        assertNull(resultado, "Una cadena nula debe mantenerse nula");
	    }

	    @Test
	    @DisplayName("Rotar cadena varias veces devuelve el original")
	    void testRotarCadenaCompleta() {
	        String cadena = "ABCDE";
	        String resultado = cadena;

	        // Rotar tantas veces como la longitud de la cadena
	        for (int i = 0; i < cadena.length(); i++) {
	            resultado = RotarCadena.rotarCadena(resultado);
	        }

	        assertEquals(cadena, resultado, "La cadena debe volver al original después de n rotaciones");
	    }
}
