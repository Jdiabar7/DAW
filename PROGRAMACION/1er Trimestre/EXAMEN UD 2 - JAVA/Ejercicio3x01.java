public class Ejercicio3x01 {
    
    // Vamos a introducir 2 números y nos va a calcular el resultado de su
    // producto.

    // Autor: Jaime Díaz.
    public static void main (String[] args){
        
        System.out.println("");
        int num1;
        int num2;

        System.out.println("A continuación se le va a solicitar 2 números.");
        System.out.println("Estos números se van a multiplicar entre si.");
        System.out.println("Por favor, introduzca el primer número: ");

        String scanum1;
        String scanum2;
        scanum1 = System.console().readLine();
        num1 = Integer.parseInt(scanum1);
        
        System.out.println("Gracias, ahora introduzca el segundo: ");
        scanum2 = System.console().readLine();
        num2 = Integer.parseInt(scanum2);

        int resultado= num1*num2;

        System.out.print("El producto de " + num1 );
        System.out.print(" y de " + num2 );
        System.out.println(" es " + resultado);


    }
    
}