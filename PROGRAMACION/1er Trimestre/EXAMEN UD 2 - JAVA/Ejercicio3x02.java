// En este ejercicio se realizará un conversor de euros a pesetas.

// Autor: Jaime Díaz.

import java.text.DecimalFormat;

public class Ejercicio3x02 {

    public static void main(String[] args){

        float pesetas = 166.386f;
        int totalPesetas;
        System.out.println();
      
        System.out.println("Por favor, introduzca la cantidad en euros.");
        String euros = System.console().readLine();
        int nEuros= Integer.parseInt(euros);

        totalPesetas= Math.round(pesetas*nEuros);
        System.out.println();
        System.out.println("El importe de los euros indicados son " + totalPesetas + " de las antiguas pesetas.");
        System.out.println();

    }

}
