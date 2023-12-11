/** Programa que crea una secuencia aritmetica, con un inicial,
 *  un incremento y un número N de numeros a crear. 
 *  Posteriormente muestra la secuencia.
 * 
 * @author Jaime Díaz.
 */

public class Ejercicio4º4x13 {
    /** Funcion por la que crea la secuencia del programa y 
     *  posteriormente la muestra.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        int i;
        int numInicial;
        int numIncremento;
        int numCrear;

        // Se solicitan los valores
        System.out.println("Introduzca cuantos números desea crear:");
        numCrear=Integer.parseInt(System.console().readLine());
        System.out.println("Ahora indique el valor inicial:");
        numInicial=Integer.parseInt(System.console().readLine());
        System.out.println("Por último indique el incremento que tendrá: ");
        numIncremento=Integer.parseInt(System.console().readLine());
        int numArray[]= new int[numCrear];

        // Se crean los números
        for(i=0; i<numCrear;i++){
            numArray[i]=numInicial+(numIncremento*i);
        }

        for (i=0; i<numCrear;i++){
            System.out.print(" " + numArray[i]);
        }

        System.out.println();

    }
}
