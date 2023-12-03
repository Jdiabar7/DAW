// En este programa se debe encontrar el area de un triángulo.

// Autor: Jaime Díaz.


public class Ejercicio3x06 {
    public static void main (String[] args){

        System.out.println();
        System.out.println("Para hallar el área de su triángulo, indiqueme la base.");
        int base = Integer.parseInt(System.console().readLine());

        System.out.println();
        System.out.println("Ahora por favor, introduzca la altura.");
        int altur = Integer.parseInt(System.console().readLine());

        System.out.println();
        float areaT = ((float)base*(float)altur)/2;

        System.out.println();
        System.out.println("El área de su triángulo es de " + areaT + " cm^2");
        System.out.println();



    }
    
}
