package com.endes.ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
1. Realizar la función inicialesMayusculas(String texto) que devuelva una nueva cadena
idéntica a texto pero con las iniciales de todas las palabras en mayúaculas.
*/
public class Ejercicio1Test {
    @Test
    public void testInicialesMayusculas() {
    	  assertEquals("Hola Mundo", Ejercicio1.inicialesMayusculas("hola mundo"));
    }
    	
    @Test
    public void testInicialesMayusculas2() {
    	   assertEquals("Java Es Genial", Ejercicio1.inicialesMayusculas("java es genial"));
    }
    	  
    @Test
    public void testInicialesMayusculas3() {
    	   assertEquals("Prueba", Ejercicio1.inicialesMayusculas("prueba"));
    }
    @Test
    public void testVacio() {
    	 assertEquals("", Ejercicio1.inicialesMayusculas(""));
    }	  
    @Test
    public void testCadenaVacio() {
    	assertEquals("", Ejercicio1.inicialesMayusculas("  "));
    }	  
       
       
       
        
    
}