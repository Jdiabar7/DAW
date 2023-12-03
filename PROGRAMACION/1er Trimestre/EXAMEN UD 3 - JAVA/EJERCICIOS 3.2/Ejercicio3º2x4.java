// Programa para seleccionar que operación realizar y luego solicitar 2 números.

// Autor: Jaime Díaz.

public class Ejercicio3º2x4 {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Dadas las siguientes operaciones:");
        System.out.println("1- Suma , 2- resta , 3- multiplicación");
        System.out.println("4- División , 5- Resto , 6- exponente");
        System.out.println("Por favor indique el número de la operación.");
        int operacion = Integer.parseInt(System.console().readLine());
        
        System.out.println("Por favor introduzca el primer número.");
        int num1 = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor introduzca el segundo número.");
        int num2 = Integer.parseInt(System.console().readLine());



        switch (operacion) {
            case 1: 
                System.out.println("El resultado de su operación es: " + (num1+num2));
                break;

            case 2: 
                System.out.println("El resultado de su operación es: " + (num1-num2));
                break;

            case 3: 
                System.out.println("El resultado de su operación es: " + (num1*num2));
                break;

            case 4: /* He tenido que introducir la operación porque me daba error. */
                float division = ((float)num1/(float)num2);
                System.out.printf("El resultado de su operación es: %.2f .", division);
                break;

            case 5: 
                System.out.println("El resultado de su operación es: " + (num1%num2));
                break;
            
            case 6: 
                System.out.println("El resultado de su operación es: " + (Math.pow(num1, num2)));
                break;
        


            default: System.out.println("Me parece que no has introducido el dato correctamente.");
                break;
        }


    }
    
}
