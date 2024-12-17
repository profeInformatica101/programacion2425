package com.endes;

import com.endes.ejercicio2.CatalogoProductos;
import com.endes.ejercicio2.Producto;
import com.endes.ejercicio4.RotarCadena;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		 Ejercicio4();
	}
	
	public static void Ejercicio2() {
	    CatalogoProductos catalogo = new CatalogoProductos();
        catalogo.agregarProducto(new Producto("Manzana", 1.2));
        catalogo.agregarProducto(new Producto("Pan", 0.8));
        catalogo.agregarProducto(new Producto("Leche", 1.5));

        System.out.println(catalogo);

        Producto[] baratos = catalogo.getProductosHastaPrecio(1.0);
        System.out.println("Productos hasta 1.0:");
        for (Producto p : baratos) {
            System.out.println(p);
        }
	}
	
	public static void Ejercicio4() {
		  String cadena = "ABCDE";
	        System.out.println("Cadena original: " + cadena);

	        // Rotar la cadena tantas veces como su longitud
	        for (int i = 0; i < cadena.length(); i++) {
	            cadena = RotarCadena.rotarCadena(cadena);
	            System.out.println("Rotación " + (i + 1) + ": " + cadena);
	        }
	}
}
