/**
 * Programa para comprobar una frase introducida por teclado
 * en la que nos informará si es o no un palíndromo. No tiene
 * en cuenta las mayúsculas, las convierte en minúsculas todas.
 * 
 * @author Jaime Díaz.
 */

public class Ejercicio4º2x05 {
    /**
     * Función para comprobar si una frase se lee igual del
     * derecho y del reves.
     * 
     * @param args
     */
    public static void main(String[] args) {

        boolean derechoReves = true; // Para escribir una u otra respuesta

        System.out.println();
        System.out.println("Introduzca una frase: ");
        String frase = System.console().readLine();

        /**
         * Con replace, vamos a quitarle los espacios, para
         * comparar los caracteres. Y le añadimos length para
         * poder saber la cantidad de caracteres a comparar.
         */
        frase = frase.replace(" ", "");
        int caracteresFrase = frase.length();

        /**
         * Aquí ponemos todos los caracteres en minúscula para
         * comparar los caracteres posteriormente
         */

        frase = frase.toLowerCase();

        for (int i = 0; i < caracteresFrase && derechoReves; i++) {
            if (frase.charAt(i) != frase.charAt((caracteresFrase - 1) - i)) {
                derechoReves = false; // Este tambien cierra el for
            }
        }

        System.out.println();

        /** Aquí se encuentra la respuesta del programa. */
        if (derechoReves) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }

    }
}
