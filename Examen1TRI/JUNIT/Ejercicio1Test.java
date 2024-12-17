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
        assertEquals("Java Es Genial", Ejercicio1.inicialesMayusculas("java es genial"));
        assertEquals("Prueba", Ejercicio1.inicialesMayusculas("prueba"));
        assertEquals("", Ejercicio1.inicialesMayusculas(""));
        assertEquals("  ", Ejercicio1.inicialesMayusculas("  "));
    }
}
