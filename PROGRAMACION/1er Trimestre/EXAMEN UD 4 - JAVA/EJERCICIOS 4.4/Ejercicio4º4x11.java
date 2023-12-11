
/** Programa que crea 2 arrays de enteros, uno del 1 al 100
 *  y el otro copia el primero, con los valores inversos, del 
 *  100 al 1. Una vez hecho esto, los muestra por pantalla.
 * 
 *  @author Jaime Díaz.
 */

public class Ejercicio4º4x11 {
    /** Funcion que crea 2 arrays, uno del 1 al 100 y otro 
     *  del 100 al 1.
     * @param args
     */
    public static void main(String[] args) {
        
        int maximo = 100;
        int primerArray[] = new int[maximo];
        int segundoArray[] = new int[maximo];
        int i;

        //Damos valores al primer array
        for(i=0;i<primerArray.length;i++){

            primerArray[i]=i +1;//+1 porque no empieza en 1
        }

        //Damos valores al segundo array
        for(i=0;i<segundoArray.length;i++){

            segundoArray[i]=primerArray[maximo-i-1]; //i-1 porque lo pone como fuera de límites
        }

        //Mostramos los arrays
        for (i=0; i<primerArray.length; i++){

            System.out.println("primero: " + primerArray[i] + " , segundo: " + segundoArray[i]);
        }
        System.out.println();

        
        
    }
}
