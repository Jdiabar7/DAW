// Programa para calcular la nota que necesitas en el 2º examen para sacar la nota
// que quieres en el trimestre.
// Ejemplo: Nota 1 -> 7 ; Nota deseada trimestre -> 8,5 ; Nota a sacar -> (resultado)

// Autor: Jaime Díaz

public class Ejercicio3x12 {

    public static void main (String[] args){
    System.out.println();

    System.out.println("Para saber que nota necesitas, indicame la nota del primer examen.");
    Float nota1 = Float.parseFloat(System.console().readLine());

    System.out.println("¿Y que nota deseas sacar en el trimestre?");
    Float notaTrim = Float.parseFloat(System.console().readLine());


    float nota2 = (notaTrim-(nota1*0.4f))/0.6f;
    System.out.printf("La nota que necesitas en el siguiente examen es un %.2f", nota2);




    }

    
}
