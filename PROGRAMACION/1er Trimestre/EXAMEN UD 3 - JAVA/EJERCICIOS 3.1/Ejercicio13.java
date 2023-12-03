// Programa que ordena 3 números enteros introducidos por teclado.

// Autor: Jaime Díaz.

public class Ejercicio13 {
    public static void main(String[] args){

        System.out.println();
        System.out.println("Escribe tres números enteros.");

        System.out.println("Escribe el primero.");
        int num1 = Integer.parseInt(System.console().readLine());

        System.out.println("Escribe el segundo.");
        int num2 = Integer.parseInt(System.console().readLine());

        System.out.println("Escribe el tercero.");
        int num3 = Integer.parseInt(System.console().readLine());


        if (num1>num2){
          if (num1>num3){
            if (num1>num3){
                if (num2>num3){
                    System.out.println("El número mayor es "+num1+" el mediano es "+num2+" y el menor es "+num3);
                }else  System.out.println("El número mayor es "+num1+" el mediano es "+num3+" y el menor es "+num2);

            } else System.out.println("El número mayor es "+num1+" el mediano es "+num2+" y el menor es "+num3);

          }

        }

    }
    
}
