/** Es primo? */

import java.util.Scanner;

public class pruebax004 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       System.out.println();
       System.out.println("Introduce número:");
       int num = s.nextInt();
       boolean esPrimo = true;


       if (num<0) {
        num= -num;
        
       }

       for (int i=(num/2)+1; i>=2; i--){
            if (num==1 || num==2 || num==3) {
                esPrimo=true;
                break;
            }
            if (num%i==0) {
                esPrimo=true;
            } else 
            { esPrimo=false;
            break;
            }

       }
        
       System.out.println();
       System.out.println("el número es primo: " + esPrimo);

    }
}
