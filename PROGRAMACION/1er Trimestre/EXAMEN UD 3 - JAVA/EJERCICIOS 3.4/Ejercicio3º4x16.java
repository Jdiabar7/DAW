// Programa para pedir un número entero positivo y nos diga si es primo o no

public class Ejercicio3º4x16 {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Vamos a comprobar si el número introducido es primo.");
        System.out.println("Por favor, introduce el número a comprobar.");
        int numX = Integer.parseInt(System.console().readLine());
        boolean esPrimo = true;

        for(int contador=2; contador<numX; contador++){
            if (numX%contador==0){
                esPrimo = false;
                break;

            } else if (contador*contador>numX)
                break;
            /* Al dividir, cuando el cociente es inferior al divisor,
             el programa puede finalizar, ahorrando la mitad de operaciones. */

        }
        if (esPrimo) {
            System.out.println("El número es primo.");

        } else 
            System.out.println("El número es compuesto.");

        
        System.out.println();
    }

}
