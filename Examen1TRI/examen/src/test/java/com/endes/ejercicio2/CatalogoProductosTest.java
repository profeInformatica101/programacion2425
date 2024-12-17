package com.endes.ejercicio2;
import org.junit.jupiter.api.*;

import com.endes.ejercicio2.Producto;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CatalogoProductosTest {

    CatalogoProductos catalogo;

    @BeforeAll
    static void setup() {
        System.out.println("Se ejecuta antes de todas las pruebas");
    }

    @BeforeEach
    void setupThis() {
        System.out.println("Se ejecuta antes de cada prueba");
        catalogo = new CatalogoProductos();
        catalogo.agregarProducto(new Producto("Manzana", 1.5));
        catalogo.agregarProducto(new Producto("Pan", 0.8));
        catalogo.agregarProducto(new Producto("Leche", 2.0));
    }

    @AfterEach
    void tearThis() {
        System.out.println("Se ejecuta después de cada prueba");
        catalogo = null;
    }

    @AfterAll
    static void tear() {
        System.out.println("Se ejecuta después de todas las pruebas");
    }

    @Test
    public void testProductoNombre() {
        Producto producto = new Producto("Manzana", 1.5);
        assertEquals("Manzana", producto.getNombre(), "El nombre del producto debe ser Manzana");
    }

    @Test
    public void testProductoPrecio() {
        Producto producto = new Producto("Manzana", 1.5);
        assertEquals(1.5, producto.getPrecio(), "El precio del producto debe ser 1.5");
    }

    @Test
    public void testAgregarProducto() {
        catalogo.agregarProducto(new Producto("Queso", 3.0));
        assertTrue(catalogo.toString().contains("Queso"), "El catálogo debe contener Queso");
    }

    @Test
    public void testGetProductosHastaPrecioCantidad() {
        Producto[] resultado = catalogo.getProductosHastaPrecio(1.5);
        assertEquals(2, resultado.length, "Debe haber 2 productos hasta el precio 1.5");
    }

    @Test
    public void testGetProductosHastaPrecioContenido() {
        Producto[] resultado = catalogo.getProductosHastaPrecio(1.5);
        assertArrayEquals(new String[]{"Manzana", "Pan"},
            Arrays.stream(resultado).map(Producto::getNombre).toArray(),
            "Los productos deben ser Manzana y Pan");
    }

    @Test
    public void testAssumptionConexion() {
        boolean isConnected = checkConnection();
        assumingThat(isConnected, () -> {
            assertTrue(isConnected, "Debe haber conexión activa");
            System.out.println("Prueba con conexión activa");
        });
    }

    @Test
    public void testAssertionsVariadas() {
        Producto producto = new Producto("Leche", 2.0);

        assertNotNull(producto, "El producto no debe ser null");
        assertEquals("Leche", producto.getNombre(), "El nombre debe ser Leche");
        assertNotEquals(1.0, producto.getPrecio(), "El precio no debe ser 1.0");
    }

    // Simula una verificación de conexión (puedes modificar según tu contexto)
    private boolean checkConnection() {
        return true; // Simulamos que la conexión está activa
    }
}
