/** Programa que crea un array de enteros e introduce una secuencia
 *  que escribe el numero, tantas veces como su valor.
 * 
 *  @author Jaime Díaz.
 */

public class Ejercicio4º4x14 {
    /** Función que realiza la secuencia del programa, escribiendo
     *  un número tantas veces como su valor.
     * @param args
     */
    public static void main(String[] args) {

        int i,j,valorNum;
        int secuencNum[]=new int[10];
        System.out.println();
        
        //Bucle para realización del programa
        for (i=0;i<10;i++){

            //Asignaciones de valores
            valorNum=i+1;
            secuencNum[i]=valorNum;

            //Bucle para ver cuantas veces escribe el número
            for (j=0; j<valorNum; j++){
                System.out.print(" "+secuencNum[i]);
                if (j<valorNum-1) { //condicional para poner ,
                    System.out.print(",");
                }
            }
            System.out.println();

        }
        System.out.println();
    }
}
