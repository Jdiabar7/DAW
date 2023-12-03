/** Ejercicio de piramide con números. */

import java.util.Scanner;

public class piramideNumeros {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        System.out.println();
        System.out.println("Introduce un número");
        int num= s.nextInt();
        s.close();
        int contador=num;
        int i,j,k;

        if (num<0) {
            System.out.println("El número debe ser entero");
            
        } else {

            for (i=1; i<=num; i++){

                for (j=0; j<contador; j++){
                    System.out.print("-");

                }
                for (k=1; k<=i; k++){
                    System.out.print(i + " ");
                }
                System.out.println();
                contador--;
            }

        }
    }
}
