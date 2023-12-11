/** Programa que crea 100 enteros aleatorios entre 1 y 10, 
*   pide en este mismo rango al usuario un número entero, y 
*   le dice en qué posiciones de i se encuentra ese número. 
* 
* @author Jaime Díaz.
*/

public class Ejercicio4º4x09 {
    /** Funcion que crea 100 enteros aleatorios entre 1 y 10, 
     * pide en este mismo rango al usuario un número entero, y 
     * le dice en qué posiciones de i se encuentra ese número.
     * 
     * @param args
     */
    public static void main(String[] args) {
        
        int i; 

        // Creamos los 100 enteros aleatorios
        int cienAleatorios[] = new int[100];
        for (i=0; i< cienAleatorios.length; i++){
            cienAleatorios[i]= (int) (1+ Math.random() *10);
        }

        // Pedimos el número al usuario
        System.out.println();
        System.out.println("Introduzca un número del 1 al 10: ");
        int N = Integer.parseInt(System.console().readLine());

        // Mostramos las posiciones del número introducido
        System.out.println("Las posiciones donde aparece N son: ");
        System.out.print("Posicion: ");
        for(i=0; i< cienAleatorios.length; i++){
            if (cienAleatorios[i]== N) {
                System.out.print(" " + i);                
            }
        }

        System.out.println();

    }
}
