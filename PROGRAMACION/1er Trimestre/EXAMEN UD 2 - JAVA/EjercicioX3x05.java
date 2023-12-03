// Comprobar que un numero sea positivo o negativo (0 es positivo)
// Sin usar IF, solo boolean

// Autor: Jaime Díaz.


public class EjercicioX3x05 {
    public static void main(String[] args){

System.out.println();
    System.out.println("Introduce el número para saber si es positivo.");
    int numero = Integer.parseInt(System.console().readLine());

    boolean esPositivo = (numero>=0);

    System.out.println("El número es "+esPositivo+" que sea positivo.");
    System.out.println();



    }
    
}
