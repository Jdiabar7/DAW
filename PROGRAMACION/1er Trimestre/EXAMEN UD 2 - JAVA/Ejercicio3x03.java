
// En este ejercicio se va a pasar de pesetas a euros.

// Autor: Jaime Díaz.

public class Ejercicio3x03 {

    public static void main (String[] args){

       
        float pesetas= 166.386f;
        System.out.println();

        System.out.println("Por favor introduzca su cantidad de pesetas.");
        int nPesetas= Integer.parseInt(System.console().readLine());

        float euros= (nPesetas/pesetas);

        System.out.printf("%d pesetas son %.2f euros.", nPesetas, euros);
        System.out.println();
        System.out.println();


    }
    
}
