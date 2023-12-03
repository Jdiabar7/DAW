// Escribir un programa que pida el dia de la semana
// Responderá con la clase que hay a primera hora ese día.

// Autor: Jaime Díaz.


public class Ejercicio1 {
    public static void main(String [] args){

        System.out.println();
        System.out.println("Escribe un día de la semana laboral.");
        String dia = System.console().readLine();

        switch (dia) {
            case "lunes", "Lunes", "LUNES": 
                System.out.println("El lunes tenemos Sistemas informáticos a primera hora.");
                break;

            case "martes", "Martes", "MARTES": 
                System.out.println("El martes tenemos Sistemas informáticos a primera hora.");
                break;

            case "miercoles", "Miercoles", "MIERCOLES","miércoles", "Miércoles", "MIÉRCOLES": 
                System.out.println("El miércoles tenemos Lenguaje de marcas a primera hora.");
                break;

            case "jueves", "Jueves", "JUEVES": 
                System.out.println("El jueves tenemos Programación a primera hora.");
                break;

            case "viernes", "Viernes", "VIERNES": 
                System.out.println("El viernes tenemos Programación a primera hora.");
                break;
        
            default: System.out.println("Me parece que no has introducido el día correctamente.");
                break;
        }




    }
    
}
