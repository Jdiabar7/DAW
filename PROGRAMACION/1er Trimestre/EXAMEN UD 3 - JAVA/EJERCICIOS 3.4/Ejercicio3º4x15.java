// Programa que cuenta los múltiplos de 3 desde el 1 hasta el número dado.

// Autor: Jaime Díaz.


public class Ejercicio3º4x15{
    public static void main(String[] args){

        System.out.println();
        System.out.println("Vamos a calcular cuantos múltiplos de 3 hay en el número dado.");

        System.out.println("Por favor, introduce un número.");
        int numX = Integer.parseInt(System.console().readLine());
        int contador = 0;
        int multiplo = 0;

        System.out.println();

        do {
            contador=contador + 1; /* Hay que ponerlo antes, sino, no hace la comprobación correctamente */
            if (contador%3==0) {
                multiplo=multiplo + 1;
            }

        } while (contador<numX);

        System.out.println();
        System.out.println("La cantidad de múltiplos de 3 en ese número son: " + multiplo);


    }

}