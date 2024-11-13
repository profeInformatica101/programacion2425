package com;
/**
Definir una función que tome como parámetros dos tablas, la primera con los 6 números
de una apuesta de la primitiva, y la segunda con los 6 números de la combinación
ganadora. La función devolverá el número de aciertos.
*/
public class Ejercicio14 {
	
	public static int[] numeros_ganadores = {1,5,6,8,9,23};
	public static int[] numeros_jugados = {1,4,6,19,23,50};
	
	
	
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
	

}
