import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Realizar ejercicio de excepciones 1, que de la excepcion
 * InputMismatchException cuando de un error.
 * 
 * @author Jaime Díaz.
 */

public class Ejercicio3º10x01 {

    public static void main(String[] args) {
        System.out.println();
        Scanner s = new Scanner(System.in);
        boolean actua = true;
        int num = 0;

        do { /* Le hacemos el bucle para que vuelva a solicitarlo */
            System.out.println("Por favor introduzca un número ENTERO");

            try { /* Comprueba que el número sea un entero */
                num = s.nextInt();
                actua = true;

            } catch (InputMismatchException ime) { /* Le muestra el error y hace que repita el bucle */
                System.out.println();
                System.out.println(" E R R O R !");
                System.out.println("El valor introducido es incorrecto");
                s.nextLine();
                actua = false;

            }
        } while (actua == false);

        System.out.println();
        System.out.println("El valor introducido es: " + num);
        System.out.println();

    }
}