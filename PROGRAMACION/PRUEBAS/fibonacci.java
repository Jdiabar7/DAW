/** Ejercicio de Fibonacci */

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        System.out.println();
        System.out.println("Escribe un número:");
        int contador = s.nextInt();
        int num;
        int num1=1;
        int num2=0;

        System.out.print("0 1 ");
        /* 0 1 1 2 3 5 8 13 21 34 55 */
        for (int i=3; contador>=i; i++) {
            num=num1+num2;

            System.out.print(num + " ");
            num2=num1;
            num1=num;
        }


    }
}
