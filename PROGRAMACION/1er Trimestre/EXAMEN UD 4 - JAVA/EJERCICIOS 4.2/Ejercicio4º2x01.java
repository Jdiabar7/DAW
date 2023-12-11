/**
 * En este programa, se introduce una frase (toda seguida) y el programa
 * se encarga de mostrarla por pantalla separada en diferentes lineas.
 * 
 * @author Jaime Díaz.
 */

public class Ejercicio4º2x01 {
    /**
     * El programa en general
     * 
     * @param args
     */
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Introduzca una frase:");
        String fraseInicial = System.console().readLine(); // Introducción de la frase

        int contador; // Contador para el "for"
        String[] fraseDividida; // Variable que utilizaremos para separar la frase

        /**
         * EXPLICACIÓN DE ".SPLIT"
         * 
         * El uso de split, es que analizará la frase, y la dividirá en diferentes
         * strings, utilizando el parámetro en el parentesis para dividir los
         * diferentes valores. En éste caso, usa el espacio.
         * Si ponemos "Esta es la frase", tomará los espacios y hará lo siguiente:
         * Valor(0)=Esta , Valor(1)=es , Valor(2)=la , Valor(3)=frase.
         * De esta forma, al utilizar el contador del for, si utilizamos println
         * el programa lo mostrará en diferentes líneas.
         */
        fraseDividida = fraseInicial.split(" ");
        System.out.println();

        System.out.println("La frase dividida es: ");
        System.out.println();

        /**
         * EXPLICACION DE ".LENGTH"
         * 
         * Length leerá cuantos valores tiene el string que le uses y lo
         * utilizará como valor int.
         */
        for (contador = 0; contador < fraseDividida.length; contador++) {

            System.out.println(fraseDividida[contador]);

        }
        System.out.println();
    }
}
