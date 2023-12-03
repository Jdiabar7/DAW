/** Funciones */

import java.util.Scanner;

public class funciones {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println();
       System.out.println("Ingresa un número.");
       int numero = s.nextInt();
       System.out.println();
       System.out.println("El número es capicua: " + esCapicua(numero));

   }

   /* Ej. 1: Comprobar si un número es capicua. */
   public static boolean esCapicua(int numero) {
       boolean capicua;
       int numVolt = voltea(numero);
       if (numero == numVolt) {
           capicua = true;

       } else
           capicua = false;
       return capicua;
   }

   /* Ej. 2: Comprobar si el número es primo o no */
   public static boolean esPrimo(int numero) {
       boolean primo = true;

       if (numero > 2) {
           for (int contador = (numero / 2) + 1; contador >= 2; contador--) {
               if (numero % contador == 0) {
                   primo = false;
                   break;
               }
           }
       }

       return primo;

   }

   /* Ej. 3: Devuelve el siguiente número primo (superior al número dado) */
   public static int siguientePrimo(int numero) {
       numero++;
       while (!esPrimo(numero)) {
           numero++;
       }
       return numero;

   }

   /* Ej. 4: Dada una base y un exponente, devuelve su potencia. */
   public static double potencia(int numero, int numero2) {
       double respuestaPow = 1;
       respuestaPow = Math.pow(numero, numero2);
       return respuestaPow;
   }

   /* Ej. 5: Cuenta el número de dígitos de un número entero. */
   public static int digitos(int numero) {
       if (numero < 0) {
           numero = -numero;
       }

       if (numero == 0) {
           return 1;
       } else {
           int n = 0;
           while (numero > 0) {
               numero = numero / 10;
               n++;
           }
           return n;
       }
   }

   /* Ej. 6: Le da la vuelta a un número. */
   public static int voltea(int numero) {
       if (numero < 0) {
           return -voltea(-numero);
       }
       int volteado = 0;

       while (numero > 0) {
           volteado = (volteado * 10) + (numero % 10);
           numero = numero / 10;
       }
       return volteado;
   }

   /* Ej. 7: Devuelve el dígito que esta en la posición N de un número. */
   public static int digitoN(int numero, int posicion) {

       numero= voltea(numero);
       //posicion--;          //Al activar el --, se quedaría en una posición lógica 
       //                    // que inicia en 1, en lugar de 0 
       while (posicion-->0) { 
           numero=numero/10;
       }

       return numero%10;

   }

   /* Ej. 8: Encuentra la posición de un dígito introducido. */
   public static int posicionDelDigito(int numero, int posicNum) {

       int i;
       for (i = 0; (i < digitos(numero)) && (digitoN(numero, i) != posicNum); i++) {
       }

       if (i == digitos(numero)) {
           return -1;

       } else {
           return i;
       }

   }

   /* Ej. 9:  Quita al numero x números por detras*/
   public static int quitaPorDetras (int numero, int x){
       return numero/(int)potencia(10, x);
       
   }

   /* Ej 10: Quita numeros por delante. */
   public static int quitaPorDelante (int numero, int x){
       return voltea((quitaPorDetras(voltea(numero),x)));

   }

   /* Ej. 11:  Introducir un número por detras.*/
   public static int pegaPorDetras (int numero, int addBack){
       int n= (int)Math.pow(10,digitos(addBack));
       return (numero*n) + addBack;


   }

   /* Ej. 12: Introducir un número por delante */
   public static int pegaPorDelante (int numero, int addFront){
       int n= (int)Math.pow(10, digitos(numero));
       return (addFront*n)+numero;
   }

   /* Ej. 13: Saca un trozo del número según los parámetros correspondientes. */
   public static int trozoDeNumero (int numero, int posInicial, int posFinal){
       numero = quitaPorDetras(numero, posFinal);
       numero = quitaPorDelante(numero, posInicial);
       return numero;

   }

   /* Ej. 14: Pega 2 números para formar uno. */
public static int juntaNumeros (int numero, int numero2){
   return pegaPorDetras(numero, numero2);
    }
}
