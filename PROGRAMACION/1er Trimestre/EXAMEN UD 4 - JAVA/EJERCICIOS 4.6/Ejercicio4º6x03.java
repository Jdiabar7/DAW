/**
 * Programa que crea una matriz tamaño NxM
 * (tamaño introducido por teclado) y solicitará
 * los NxM valores, comprobando uno por uno todos
 * para comprobar cuantos hay mayores, igual o
 * menores que cero.
 * 
 * @author Jaime Díaz.
 */

public class Ejercicio4º6x03 {
    /**
     * Funcion que lleva a cabo el programa, solicitando los
     * valores de N y M y posteriormente solicitando los
     * valores de cada uno de los parámetros de la matriz.
     * 
     * @param args
     */
    public static void main(String[] args) {

        int i, j, x = 0, nMayor = 0, nMenor = 0, nIgual = 0;
        System.out.println("Indique cuantos valores desea en horizontal");
        int N = Integer.parseInt(System.console().readLine());
        System.out.println("Ahora indique cuantos valores desea en vertical");
        int M = Integer.parseInt(System.console().readLine());
        int matrizValores[][] = new int[N][M];
        boolean actua = true; // Para el try-catch
        System.out.println();

        for (i = 0; i < matrizValores.length; i++) {
            for (j = 0; j < matrizValores[0].length; j++) {
                x++; // Contador introduccion valor

                /**
                 * Hago bucle try-catch porque el usuario puede provocar
                 * un error al introducir los números, y así solo necesita
                 * repetir el número, en lugar de volver a ejecutar el programa.
                 */
                do {
                    System.out.println("Por favor introduzca el valor " + x);

                    /* Funciona bien */ try {
                        matrizValores[i][j] = Integer.parseInt(System.console().readLine());
                        actua = true;
                    } catch (Exception e) {
                        System.out.println("Esto no es un número válido.");
                        actua = false;
                    }

                } while (actua == false);

                /**
                 * Aquí añado los contadores para mayores, menores
                 * o iguales, para posteriormente mostrar el total.
                 */
                if (matrizValores[i][j] < 0) {
                    nMenor++;
                } else if (matrizValores[i][j] == 0) {
                    nIgual++;
                } else if (matrizValores[i][j] > 0) {
                    nMayor++;
                }
            }
        }

        /** El resultado de los valores introducidos */
        System.out.println();
        System.out.println("De los valores introducidos: ");
        System.out.println(nMenor + " números son inferiores a 0.");
        System.out.println(nIgual + " números son IGUALES a 0.");
        System.out.println(nMayor + " números son superiores a 0.");
        System.out.println();

    }
}
