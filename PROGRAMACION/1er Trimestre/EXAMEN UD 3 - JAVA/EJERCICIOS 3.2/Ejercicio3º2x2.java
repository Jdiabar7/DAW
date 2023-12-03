// Programa que te informa cuantos minutos quedan para el fin de semana.

// Autor: Jaime Díaz.


public class Ejercicio3º2x2 {
    public static void main(String[] args){

    
        System.out.println();
        System.out.println("Vamos a comprobar cuanto queda para el fin de semana.");
        System.out.println("Por favor introduzca el día.");
        String elDia = System.console().readLine();
        
        System.out.println("Por favor introduzca la hora en formato 24h(sin minutos).");
        int laHora = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor introduzca los minutos.");
        int losMinutos = Integer.parseInt(System.console().readLine());
        int restante=0;
        
        laHora=laHora*60; /* No hay que complicarse pasandolo a minutos y sumando despues */

        switch (elDia) {
            case ("lunes"),("Lunes"),("LUNES"):
                restante=1440*4+900-(laHora+losMinutos);
                break;
            case ("martes"),("Martes"),("MARTES"):
                restante=1440*3+900-(laHora+losMinutos);
                break;
            case ("miércoles"),("Miércoles"),("MIÉRCOLES"),("miercoles"),("Miercoles"),("MIERCOLES"):
                restante=1440*2+900-(laHora+losMinutos);
                break;
            case ("jueves"),("Jueves"),("JUEVES"):
                restante=1440+900-(laHora+losMinutos);
                break;
            case ("viernes"),("Viernes"),("VIERNES"):
                if (laHora>=900) {
                    System.out.println("Ya es fin de semana.");                    
                } else restante=900-(laHora+losMinutos);
                break;
        
            default: 
                System.out.println("Ya es fin de semana.");
                break;
        }
        
        System.out.println("Quedan " + restante + " minutos hasta el fin de semana.");
                        
        System.out.println();
        
        }
    
}/*1440 minutos cada día.
    900 minutos hasta las 15:00*/
