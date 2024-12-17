import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio1Test {
    @Test
    public void testInicialesMayusculas() {
        assertEquals("Hola Mundo", Ejercicio1.inicialesMayusculas("hola mundo"));
        assertEquals("Java Es Genial", Ejercicio1.inicialesMayusculas("java es genial"));
        assertEquals("Prueba", Ejercicio1.inicialesMayusculas("prueba"));
        assertEquals("", Ejercicio1.inicialesMayusculas(""));
        assertEquals("  ", Ejercicio1.inicialesMayusculas("  "));
    }
}
