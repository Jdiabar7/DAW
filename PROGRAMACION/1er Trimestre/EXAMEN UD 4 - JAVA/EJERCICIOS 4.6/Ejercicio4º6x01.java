/**
 * Programa que crea una matriz 5x5 y almacena los
 * números del 1 al 25 y luego muestra la matriz
 * por pantalla
 * 
 * @author Jaime Díaz.
 */

public class Ejercicio4º6x01 {
    /**
     * Función que realiza la matriz de 5x5.
     * 
     * @param args
     */
    public static void main(String[] args) {

        int i, j;
        int matrArray[][] = new int[5][5];
        int numIntroducir = 1; // comienzo de la matriz por 1

        for (i = 0; i < matrArray.length; i++) {// de izq a derecha
            for (j = 0; j < matrArray[0].length; j++) {// de arriba a abajo
                matrArray[i][j] = numIntroducir++;
                // y con esto se imprime por pantalla la matriz
                System.out.printf("%3d", matrArray[i][j]);

            }
            System.out.println();
        }

    }
}
