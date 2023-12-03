// Programa que construye una pirámide según el número introducido.

// Autor: Jaime Díaz.

public class Ejercicio3º4x22 {
    public static void main(String[] args) {
        
        System.out.print("Ingrese un número para construir la pirámide: ");
        int numero = Integer.parseInt(System.console().readLine());

        if (numero >= 1) {
            for (int i = 1; i <= numero; i++) {
                /* Espacios para centrar la piramide */
                for (int j = 1; j <= numero - i; j++) {
                    System.out.print(" ");
                }

                /* Parte izq de la piramide */ 
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                /* Parte derecha de la piramide */ 
                for (int j = i - 1; j >= 1; j--) {
                    System.out.print("*");
                }

                /* Cambio de línea para la siguiente fila de la pirámide */
                System.out.println();
            }
        } else {
            System.out.println("El número debe ser igual o mayor que 1.");
        }



    }
}
