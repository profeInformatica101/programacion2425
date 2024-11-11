package com;
import java.util.Scanner;
/**
 * Escribir un programa que solicite los elementos de una matriz de tamaño 4 × 4. La
aplicación debe decidir si la matriz introducida corresponde a una matriz mágica, que
es aquella donde la suma de lo elementos de cualquier fila o de cualquier columna vale
lo mismo.
 * 
 * Ejemplo de Matriz Mágica​
  {{16, 5, 9, 4},
   {2, 11, 7, 14},
​   {3, 10, 6, 15},
   {13, 8, 12, 1}}

 */
public class Ejercicio11 {
  /**
  #################
  # Matriz Mágica #
  #################
  */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Introduce los elementos de la matriz 4x4:");
        llenarMatriz(scanner, matriz);

        if (esMatrizMagica(matriz)) {
            System.out.println("La matriz introducida es una matriz mágica.");
        } else {
            System.out.println("La matriz introducida NO es una matriz mágica.");
        }
        
        scanner.close();
    }

    public static void llenarMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    /**
     * Comprueba que es una Matriz Mágica
     * @param matriz
     * @return
     */
    public static boolean esMatrizMagica(int[][] matriz) {
    	//cualquier fila o de cualquier columna vale lo mismo.
        int sumaReferencia = calcularSumaFila(matriz, 0);

        //Si es distinto la suma de cualquier columna o fila del valor de referencia entonces no es mágica
        for (int i = 0; i < matriz.length; i++) {
            if (calcularSumaFila(matriz, i) != sumaReferencia || calcularSumaColumna(matriz, i) != sumaReferencia) {
                return false;
            }
        }
        return true;
    }
    /**
     * Calcula la suma total de una fila
     * @param matriz
     * @param fila
     * @return
     */
    public static int calcularSumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz[fila].length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }
   
    /**
     * Calcula la suma total de una columna
     * @param matriz
     * @param columna
     * @return
     */
    public static int calcularSumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int[] fila : matriz) {
            suma += fila[columna];
        }
        return suma;
    }
}
