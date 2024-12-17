package com.endes;

import com.endes.ejercicio2.CatalogoProductos;
import com.endes.ejercicio2.Producto;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
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
}
