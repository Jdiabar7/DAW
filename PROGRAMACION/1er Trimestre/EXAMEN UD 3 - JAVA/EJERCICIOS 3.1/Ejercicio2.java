// En este programa se introduce una hora por teclado y deberá dar un saludo.

// Autor: Jaime Díaz.


public class Ejercicio2 {
    public static void main(String[] args){

        System.out.println();
        System.out.println("Por favor introduzca la hora (sin minutos).");
        int hora = Integer.parseInt(System.console().readLine());


        if (hora >=6 && hora<=12) { /* Por la mañana */
          System.out.println("Buenos días, gracias por decirme la hora.");
            
        } else if (hora >=13 && hora<=20) { /* Por la tarde */
          System.out.println("Buenas tardes, gracias por decirme la hora.");
            
        } else if ((hora >=21 && hora<=23) || (hora >=0 && hora<=5)) { /* Aqui tengo que incluirle dos tramos */
          System.out.println("Buenas noches, gracias por decirme la hora.");

        }
                        
        System.out.println();
        
        }
        

    }
    

