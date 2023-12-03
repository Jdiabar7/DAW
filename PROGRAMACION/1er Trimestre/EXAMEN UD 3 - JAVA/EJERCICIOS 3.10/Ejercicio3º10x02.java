/** Ejercicio para realizar excepciones con divisiones
 *  Si se introduce un número que no es entero, dará error, y si 
 *  se intenta dividir entre 0, también dará error.
 * 
 * @author Jaime Díaz.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio3º10x02 {
    public static void main(String[] args) {

        /* Introducimos las variables que vamos a utilizar. */
        Scanner s = new Scanner(System.in); 
        System.out.println();
        boolean actua = true;
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        do { /* Se comprueba la primera variable */
            System.out.println("Introduzca el primer número ENTERO:");
            try {
                num1 = s.nextInt();
                actua = true;
            } catch (InputMismatchException ime) {
                System.out.println();
                System.out.println(" E R R O R !");
                System.out.println("El valor introducido es incorrecto");
                s.nextLine();
                actua = false;
            }

        } while (actua == false);

        do { /* Se comprueba la segunda variable y que no se divida entre 0 */
            System.out.println("Introduzca el segundo número ENTERO.");
            try {
                num2 = s.nextInt();
                actua = true;
                result = num1 / num2;

            } catch (InputMismatchException ime) {
                System.out.println();
                System.out.println(" E R R O R !");
                System.out.println("El valor introducido es incorrecto.");
                actua = false;
            } catch (ArithmeticException ae) {
                System.out.println();
                System.out.println(" E R R O R !");
                System.out.println("No es posible dividir un número entre 0");
                actua = false;
            }
            s.nextLine(); /* Con esto se limpia el buffer de la variable de scan */

        } while (actua == false);

        /* El resultado final. */
        System.out.println();
        System.out.println("El resultado de la operación, es: " + result);
        System.out.println();

    }
}
