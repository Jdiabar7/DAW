// El programa tiene que sumar, restar, multiplicar y dividir
// los numeros que se introduzcan por teclado (dos numeros)

// Autor: Jaime Díaz.

public class Ejercicio3x04{

    public static void main (String[] args){

      

        System.out.println("Por favor, introduzca su primer número");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.println();
        System.out.println("Gracias, ahora introduzca el segundo");
        int num2 = Integer.parseInt(System.console().readLine());

        int suma =num1+num2;
        int resta =num1-num2;
        int multi = num1*num2;
        float divis = (float)num1/(float)num2;

        System.out.println("La suma de sus cifras es " + suma);
        System.out.println("La resta de sus cifras es " + resta);
        System.out.println("El producto de sus cifras es " + multi);
        System.out.println("La división de sus cifras es " + divis);



        System.out.println();

        


    }

}