// Este programa calculará el área de un rectángulo.

// Autor: Jaime Díaz.


public class Ejercicio3x05 {

    public static void main (String[] args){

        System.out.println();
        System.out.println("Para hallar el área de su rectángulo, por favor");
        System.out.println("introduzca el primero de los lados (en cm).");
        int lado1 = Integer.parseInt(System.console().readLine());

        System.out.println();
        System.out.println("Ahora, por favor introduzca el segundo de sus lados.");
        int lado2 = Integer.parseInt(System.console().readLine());

        int areaR = lado1*lado2;
        System.out.println();

        System.out.println("El área de su rectángulo es de " + areaR + " centímetros cuadrados.");
        System.out.println();



    }
    
}
