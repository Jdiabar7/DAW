
/** Programa que crea un array con 10 enteros, y un menú 
 *  en el que da 3 opciones 
 *  a) Mostrar valores
 *  b) Introducir un valor
 *  c) Salir
 * 
 *  @author Jaime Díaz.
 */

public class Ejercicio4º4x12 {
    /** Funcion que crea un array con 10 enteros, y un menú de
     *  3 opciones a elegir, y finaliza con la opcion salir.
     * @param args
     */
    public static void main(String[] args) {
        
        int i;
        int diezEnteros[]= new int[10];
        int posEntero;
        String menu;
        boolean finPrograma=true;

        System.out.println();

        while (finPrograma) { //Programa con el menu
            System.out.println("---MENU PRINCIPAL---");
            System.out.println("a) Mostrar valores");
            System.out.println("b) Introducir valor");
            System.out.println("c) Salir del programa ");
            System.out.println();
            System.out.println("Elija una opcion:");
            menu= System.console().readLine();
            System.out.println();

            switch (menu) { //opciones del menu
                case "a","A": //Mostrar valores
                    for (i=0; i<diezEnteros.length;i++){
                        System.out.println("Posición "+(i+1)+ ": "+ diezEnteros[i]);
                    }
                    break;

                case "b","B": //Introducir valor
                    System.out.println("Introduzca en qué posición (del 1 al 10) introducirá el número:");
                    posEntero=Integer.parseInt(System.console().readLine());

                    System.out.println("Introduzca el valor para esa posición: ");
                    diezEnteros[posEntero-1]=Integer.parseInt(System.console().readLine());
                    break;

                case "c","C": //Salir
                    finPrograma=false;
                    System.out.println("Programa finalizado.");
                    break;
            
                default:
                    System.out.println("Opcion no válida");
                    break;
            }
            System.out.println();
        }

    }
}
