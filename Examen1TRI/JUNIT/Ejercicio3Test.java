import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio3Test {

    @Test
    public void testZoom() {
        char[][] sprite = {
            {'*', ' ', '*'},
            {' ', '*', ' '},
            {'*', '*', '*'}
        };

        String expectedOutput =
                "**  **  \n" +
                "**  **  \n" +
                "  **    \n" +
                "  **    \n" +
                "****  ****  \n" +
                "****  ****  \n";

        // Captura la salida de la consola
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Ejercicio3.zoom(sprite);

        // Compara la salida con el resultado esperado
        assertEquals(expectedOutput, outContent.toString());
    }
}
