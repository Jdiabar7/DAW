/**
 * Programa para crear una matriz 10x10 e introduce
 * los valores de las tablas de multiplicar del 1 al 10
 * (cada tabla en su fila). Luego mostrará la matriz.
 */

public class Ejercicio4º6x02 {
    /**
     * Función con la que crea la matriz de la tabla
     * de multiplicar del 1 al 10.
     * 
     * @param args
     */
    public static void main(String[] args) {

        int i, j;
        int x = 1;
        int tablaMulti[][] = new int[10][10];

        // Bucle para insertar valores en la matriz
        for (i = 0; i < tablaMulti.length; i++) {
            for (j = 0; j < tablaMulti[0].length; j++) {
                tablaMulti[i][j] = x * (j + 1);
                System.out.printf("%5d", tablaMulti[i][j]);

            }
            x++; // Este hace que pase a la siguiente tabla de multiplicar
            System.out.println();
        }
    }
}
