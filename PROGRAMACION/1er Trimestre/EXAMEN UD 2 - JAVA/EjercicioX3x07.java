// Escribir 3 numeros, y el programa dirá cual es el mayor de los tres
// Sin IF, respondera true o false 


public class EjercicioX3x07 {
    public static void main(String[] args){

    System.out.println();
    System.out.println("Va a introducir 3 números para comprobar cual es mayor.");
    System.out.println("Escriba el primer número.");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.println();

    System.out.println("Escriba el segundo número.");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.println();

    System.out.println("Escriba el tercer número.");
    int num3 = Integer.parseInt(System.console().readLine());
    System.out.println();

    boolean mayor1 = (num1>num2) & (num1>num3);
    System.out.println("El primer número es mayor: " + mayor1);

    boolean mayor2 = (num2>num1) & (num2>num3);
    System.out.println("El segundo número es mayor: " + mayor2);

    boolean mayor3 = (num3>num2) & (num3>num1);
    System.out.println("El tercer número es mayor: " + mayor3);
        
    }
    
}
