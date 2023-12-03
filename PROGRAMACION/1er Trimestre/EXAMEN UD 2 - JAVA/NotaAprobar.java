// Crear programa para calcular nota del trimestre

// Autor: Jaime Díaz.

public class NotaAprobar{
    public static void main(String[] args){

    System.out.println();
    System.out.println("Vamos a averiguar qué nota necesitamos para aprobar con un 5 programación.");

    System.out.println();
    System.out.println("Por favor, introduce la primera nota");
    float nota1 = Float.parseFloat(System.console().readLine());

    System.out.println();
    System.out.println("Por favor, introduce la segunda nota");
    float nota2 = Float.parseFloat(System.console().readLine());

    System.out.println();
    System.out.println("Por favor, introduce la tercera nota");
    float nota3 = Float.parseFloat(System.console().readLine());

    float notaAprobar = (5f-(((nota1+nota2+nota3)/3)*0.4f))/0.6f;

    System.out.println();
    System.out.printf("La nota que necesitas para aprobar programacion es un %3.2f sobre 10.", notaAprobar);
    





/*
Hay que tener en cuenta que la nota media de las 3 actividades cuenta el 40% y la del examen un 60%.


Introduce la nota de la primera actividad: 7.50
Introduce la nota de la segunda actividad: 4.25
Introduce la nota de la tercera actividad: 5.00
*/




}


}

/*
System.out.println();
System.console().readLine();
int x = Integer.parseInt(System.console().readLine());


*/
