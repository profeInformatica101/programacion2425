package com;
/**
Definir una función que tome como parámetros dos tablas, la primera con los 6 números
de una apuesta de la primitiva, y la segunda con los 6 números de la combinación
ganadora. La función devolverá el número de aciertos.
*/
import java.util.Arrays;
import java.util.Random;

public class Ejercicio14 {
	
	//public static int[] numeros_ganadores = {1,5,6,8,9,23};
	
	public static int[] numeros_ganadores = generarNumerosAleatoriosUnicos() ;
	public static int[] numeros_jugados = {1,4,6,19,7,8};
	
	
	
	public static void main(String [] args) {
		int total = total_aciertos(numeros_ganadores, numeros_jugados);
	//	int total = total_aciertos(numeros_ganadores, numeros_ganadores);
		
		if(total == numeros_ganadores.length) {
				System.out.println("¡Has ganado!");
		}else if(total > 0) {
				System.out.println("En total has acertado: "+ total);
		}else {
			System.out.println("¡Qué mala suerte pisha!");
		}
		
	System.out.println("Numeros ganadores: " + Arrays.toString(numeros_ganadores));
	System.out.println("Numeros numeros_jugados: " + Arrays.toString(numeros_jugados));
	}
	/**
	 * Función que nos permite contar el total de aciertos del boletos
	 * @param boleto_ganador
	 * @param apuesta
	 * @return
	 */
	public static int total_aciertos(int[] boleto_ganador, int[] apuesta) {
		int contador = 0;
		for(int i=0; i<boleto_ganador.length; i++) {
			for(int j=0; j<apuesta.length; j++) {
				if(boleto_ganador[i] == apuesta[j]) {
					contador++;
				}
			}
		}	
	return contador;	

	}
	
	public static int[] generarNumerosAleatoriosUnicos() {
        int[] numeros = new int[6];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            int numeroAleatorio;
            boolean esUnico;

            do {
                numeroAleatorio = random.nextInt(20) + 1; // Genera números entre 1 y 20
                esUnico = true;

                // Verifica si el número ya está en el array
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == numeroAleatorio) {
                        esUnico = false;
                        break;
                    }
                }
            } while (!esUnico);

            numeros[i] = numeroAleatorio;
        }

        return numeros;
    }
}

