import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
2. Desarrollar la clase Producto que contendrá el nombre y el precio de un producto. 
Para crear un nuevo producto será obligatorio aportar ambos datos. Añadirle los correspondientes
métodos getter y toString(). Crear la clase CatalogoProductos, que podrá contener un
conjunto de productos. Al crear un catálogo, este estará vacío. Se podrán agregar nuevos
productos mediante el método agregarProducto(Producto p). CatalogoProducto también
contendrá un método para consultar todos los productos que no excedan un determinado
precio y que devolverá dichos productos en un array, getProductosHastaPrecio(double
precio). También tendrá el método toString(), que devolverá una cadena con todos los
productos y sus precios.
*/
public class CatalogoProductosTest {

    @Test
    public void testProducto() {
        Producto producto = new Producto("Manzana", 1.5);
        assertEquals("Manzana", producto.getNombre());
        assertEquals(1.5, producto.getPrecio());
    }

    @Test
    public void testAgregarProducto() {
        CatalogoProductos catalogo = new CatalogoProductos();
        catalogo.agregarProducto(new Producto("Manzana", 1.5));
        catalogo.agregarProducto(new Producto("Pan", 0.8));

        assertTrue(catalogo.toString().contains("Manzana"));
        assertTrue(catalogo.toString().contains("Pan"));
    }

    @Test
    public void testGetProductosHastaPrecio() {
        CatalogoProductos catalogo = new CatalogoProductos();
        catalogo.agregarProducto(new Producto("Manzana", 1.5));
        catalogo.agregarProducto(new Producto("Pan", 0.8));
        catalogo.agregarProducto(new Producto("Leche", 2.0));

        Producto[] resultado = catalogo.getProductosHastaPrecio(1.5);
        assertEquals(2, resultado.length);
        assertEquals("Manzana", resultado[0].getNombre());
        assertEquals("Pan", resultado[1].getNombre());
    }
}
