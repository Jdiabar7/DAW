/**
 * El programa pide un número entre 0.0 y 1.0, y calculará
 * cuantos números hay mayores o iguales a los 100 números
 * aleatorios creados por este mismo programa.
 * 
 * @author Jaime Díaz.
 */

public class Ejercicio4º4x08 {
    /**
     * La función nos pedirá un número entre 0.0 y 1.0 y nos dirá
     * cuantos números han sido mayores o iguales al introducido
     * de los 100 números creados por el programa de forma aleatoria.
     * 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println();

        // Creación de los 100 aleatorios
        double cienAleatorios[] = new double[100];
        for (int i = 0; i < cienAleatorios.length; i++) {
            cienAleatorios[i] = Math.random();
        }

        // Introducción por teclado
        System.out.println("Introduzca un número del 0.0 al 1.0: ");
        double r = Double.parseDouble(System.console().readLine());

        int mayorR = 0; // Contador de mayores o iguales

        // Tipico bucle que veremos para comprobar los diferentes valores
        for (int i = 0; i < cienAleatorios.length; i++) {
            if (cienAleatorios[i] >= r) {
                mayorR++;
            }

        }

        // Respuesta final
        System.out.println();
        System.out.println("En total hay " + mayorR + " números mayores o iguales al número que introdujo.");
        System.out.println();

    }
}
