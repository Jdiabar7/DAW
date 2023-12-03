// Leer 5 notas de exámenes ( con 1 decimal ) y nos devuelve
// la nota del curso (promedio de las 5)

// Autor: Jaime Díaz.


public class EjercicioX3x02 {
    public static void main (String[] args){

        System.out.println();
        System.out.println("Vamos a leer las 5 notas de los examenes, con 1 decimal.");

        System.out.println("Primera nota.");
        float nota1 = Float.parseFloat(System.console().readLine());

        System.out.println("Segunda nota.");
        float nota2 = Float.parseFloat(System.console().readLine());

        System.out.println("Tercera nota.");
        float nota3 = Float.parseFloat(System.console().readLine());

        System.out.println("Cuarta nota.");
        float nota4 = Float.parseFloat(System.console().readLine());

        System.out.println("Quinta nota.");
        float nota5 = Float.parseFloat(System.console().readLine());

        float nPromedio = (nota1 + nota2 + nota3 + nota4 + nota5)/5.0f;
        System.out.printf("La nota del curso es de %.1f sobre 10.\n", nPromedio );

        System.out.println();


    }
    
}
