// Programa que dado un numero de 1 a 7 escriba el dia de la semana


public class Ejercicio3 {
    public static void main(String[] args){

        System.out.println();
        System.out.println("Escribe un día de la semana con número.");
        int dia = Integer.parseInt(System.console().readLine());

        switch (dia) {
            case 1: 
                System.out.println("Lo siento, estamos aún a lunes.");
                break;

            case 2: 
                System.out.println("Todavía es martes, poco a poco amigo.");
                break;

            case 3: 
                System.out.println("El miércoles, el que está a medio camino.");
                break;

            case 4: 
                System.out.println("El jueves, viernes is coming.");
                break;

            case 5: 
                System.out.println("YA ES VIERNES!! Y el cuerpo lo sabe.");
                break;
            
            case 6: 
                System.out.println("Qué alegría de sábado por dios...");
                break;
        
            case 7: 
                System.out.println("Pfff... domingo, ¿en serio mañana hay que trabajar?.");
                break;


            default: System.out.println("Me parece que no has introducido el día correctamente.");
                break;
        }


    }

    
}
