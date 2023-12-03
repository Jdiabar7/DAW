// Este programa calcula el total de una factura, a partir de la base imponible.

// Autor: Jaime Díaz.

import java.text.Format;

public class Ejercicio3x07 {
    public static void main (String[] args) {

        System.out.println();
        System.out.println("Para conocer el total de la factura, introduzca la base imponible.");

        float basImp = Float.parseFloat(System.console().readLine());

        float totFact = (basImp*(float)1.21);

        System.out.println();
       // System.out.println(basImp);
        System.out.printf("Base imponible %.2f\n",basImp);
        System.out.printf("Impuestos   %.2f \n", (basImp*(float)0.21));
        System.out.printf("------------------- \n");
        System.out.printf("Total factura %.2f \n", totFact);
        System.out.println();


    }
    
}
