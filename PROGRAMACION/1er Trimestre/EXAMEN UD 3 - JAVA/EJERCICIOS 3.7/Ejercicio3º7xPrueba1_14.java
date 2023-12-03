/* Archivo para comprobar las funciones
 * 
 * (Si el titulo tiene el * al final, esta activo)
 * 
 * Autor: Jaime Díaz.
 */

//import Ejercicio3º7x01;
public class Ejercicio3º7xPrueba1_14 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Ingresa un número.");
        int numero = Integer.parseInt(System.console().readLine());

        /* Es capicua 1 /////////////////// */
        System.out.println();
        System.out.println("El " + numero + " es capicua: " + Ejercicio3º7x01.esCapicua(numero));

        /* Es primo 2 //////////////////// */
        System.out.println();
        System.out.println("El " + numero + " es primo: " + Ejercicio3º7x01.esPrimo(numero));

        /* Siguiente primo 3 ///////////// */
        System.out.println();
        System.out.println("El siguiente número primo mayor a " + numero + " es: " + Ejercicio3º7x01.siguientePrimo(numero));

        /* Potencia 4 /////////////////// */
        System.out.println();
        System.out.println("Para calcular la potencia,");
        System.out.println("introduce un segundo número, a usar como exponente.");
        int numero2 = Integer.parseInt(System.console().readLine());
        System.out.println("El resultado de la potencia de " + numero + " y de su exponente " + numero2 + " es: " + Ejercicio3º7x01.potencia(numero, numero2));

        /* Dígitos 5 //////////////////// */
        System.out.println();
        System.out.println("El número cuenta con " + Ejercicio3º7x01.digitos(numero) + " dígitos.");

        /* Voltea 6 ////////////////////// */
        System.out.println();
        System.out.println("El número volteado es " + Ejercicio3º7x01.voltea(numero));

        /* DigitoN 7 ///////////////////// */
        System.out.println();
        System.out.println("Indique la posición del número que desea conocer.");
        // System.out.println("(Contando la posición desde el numero 1)"); 
        int posicion = Integer.parseInt(System.console().readLine());
        System.out.println("El número que se encuentra en esa posición es: " + Ejercicio3º7x01.digitoN(numero, posicion));

        /*  PosicionDeDigito 8 /////////// */
        System.out.println();
        System.out.println("De qué dígito desea comprobar su ubicación?");
        int posicNum = Integer.parseInt(System.console().readLine());
        System.out.println("En el número " + numero + " el dígito " + posicNum + " se encuentra en la posición: " + Ejercicio3º7x01.posicionDelDigito(numero, posicNum) );

        /* quitaPorDetras 9 ///////////// */
        System.out.println();
        System.out.println("Indica cuantos números quieres quitar por detras.");
        int x = Integer.parseInt(System.console().readLine());
        System.out.println("El número resultante es: " + Ejercicio3º7x01.quitaPorDetras(numero, x));

        /* quitaPorDelante 10 ////////////  */
        System.out.println();
        System.out.println("Indica cuantos números quieres quitar por delante.");
        int x2 = Integer.parseInt(System.console().readLine());
        System.out.println("El número resultante es: " + Ejercicio3º7x01.quitaPorDelante(numero, x2));

        /* pegaPorDetras 11 //////////////  */
        System.out.println();
        System.out.println("Introduce el número que deseas añadir detras.");
        int addBack=Integer.parseInt(System.console().readLine());
        System.out.println("El número resultante es: " + Ejercicio3º7x01.pegaPorDetras(numero, addBack));

        /* pegaPorDelante 12 ////////////  */
        System.out.println();
        System.out.println("Introduce el número que deseas añadir delante.");
        int addFront=Integer.parseInt(System.console().readLine());
        System.out.println("El número resultante es: " + Ejercicio3º7x01.pegaPorDelante(numero, addFront));

        /* trozoDeNúmero 13 ////////////   */
        System.out.println();
        System.out.println("Indica cuantos números deseas quitar por detras: ");
        int posFinal = Integer.parseInt(System.console().readLine());
        System.out.println("Indica cuantos números deseas quitar por delante: ");
        int posInicial = Integer.parseInt(System.console().readLine());
        System.out.println("El número resultante es: " + Ejercicio3º7x01.trozoDeNumero(numero, posInicial, posFinal));

        /* juntaNumeros 14 /////////////// */
        System.out.println();
        System.out.println("Introduzca los números que desea pegar: ");
        System.out.println("Primer número:");
        int numDelante = Integer.parseInt(System.console().readLine());
        System.out.println("Segundo número:");
        int numDetras = Integer.parseInt(System.console().readLine());
        System.out.println("El número resultante es: " + Ejercicio3º7x01.juntaNumeros(numDelante, numDetras));





    }
}
