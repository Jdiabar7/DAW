// Este programa calculará el volumen de un cono (V= 1/3 PI r^2 altura)

// Autor: Jaime Díaz.

public class Ejercicio3x09 {
    public static void main (String[] args){


        System.out.println();
        System.out.println("Por favor introduzca la altura del cono.");
        float altC = Float.parseFloat(System.console().readLine());

        System.out.println();
        System.out.println("Por favor ahora introduzca el radio dado.");
        float radC = Float.parseFloat(System.console().readLine());

        float volum= (float)3.1416*altC*radC*radC/(float)3;

        System.out.println();
        System.out.printf("El volúmen del cono es de %.2f cm cúbicos.\n", volum);
        System.out.println();



    }
    
}
