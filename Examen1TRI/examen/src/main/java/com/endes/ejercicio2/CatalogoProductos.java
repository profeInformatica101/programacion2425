package com.endes.ejercicio2;

import java.util.ArrayList;

public class CatalogoProductos {
    private ArrayList<Producto> productos;

    public CatalogoProductos() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public Producto[] getProductosHastaPrecio(double precio) {
        return productos.stream()
                .filter(p -> p.getPrecio() <= precio)
                .toArray(Producto[]::new);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Catálogo de Productos:\n");
        for (Producto p : productos) {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }

      
}
