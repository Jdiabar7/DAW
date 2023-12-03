// Programa para pedir 2 números, siendo A menor que B, y el programa mostrara
// los números que van entre ellos, contando cuantos de estos son pares.

// Autor: Jaime Díaz.

public class Ejercicio3º4x21 {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Vamos a introducir 2 números.");
        System.out.print("El primer numero: ");
        int numA = Integer.parseInt(System.console().readLine());
        System.out.println();
        System.out.print("El segundo numero (mayor que el primero): ");
        int numB = Integer.parseInt(System.console().readLine());

        int contador = 0;

        if (numA<numB) {
            for (numA=numA; numA<=numB; numA++){
                if (numA%2==0) {
                    contador++;
                }
                System.out.print(" " + numA);
            }

            System.out.println();
            System.out.println("El total de números pares entre los números indicados");
            System.out.println("ha sido de: " + contador);
            

        } else System.out.println("El segundo, debía ser superior al primero...");

        System.out.println();

    }
}
