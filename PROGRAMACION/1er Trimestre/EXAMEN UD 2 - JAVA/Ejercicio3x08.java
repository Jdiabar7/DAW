// En este programa se calcula un sueldo según las horas trabajadas. 12€ la hora

// Autor: Jaime Díaz.


public class Ejercicio3x08 {
    public static void main (String[] args){

        System.out.println();
        System.out.println("Por favor indique las horas trabajadas.");
        float horas = Float.parseFloat(System.console().readLine());

        float salario = (float)horas*(float)12;

        System.out.printf("El salario que recibirá el trabajador es de %.2f euros.", salario);
        System.out.println();



    }

    
}
