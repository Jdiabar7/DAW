// Se leen 2 números, y se va a preguntar si a es > que b y si son iguales.
// Sin usar IF, responder a las preguntas con true o false

// Autor: Jaime Díaz.

public class EjercicioX3x06 {
    public static void main(String[] args){

System.out.println();

    System.out.println("Vamos a comprobar si A>B y A=B.");
    System.out.println("Por favor, introduce A");
    int numA = Integer.parseInt(System.console().readLine());

    System.out.println("Ahora introduce B.");
    int numB = Integer.parseInt(System.console().readLine());

    boolean esPositivo = numA>numB;
    boolean esIgual = numA==numB;
    System.out.println();

    System.out.println("¿Es A mayor que B?   " + esPositivo);
    System.out.println("¿Es A igual que B?   " + esIgual);
    System.out.println();



    }
    
}
