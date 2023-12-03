// Este programa realizará un cuestionario de 5 preguntas.
// Al terminar, informará la nota del cuestionario.

// Autor: Jaime Díaz.


public class Ejercicio3º2x1 {
    public static void main(String[] args){


        System.out.println("Introduce sólo la respuesta correcta.");  
        System.out.println("Preguntas con respuesta múltiple (1 respuesta válida de 3 posibles):");
        System.out.println("1. ¿Cuál es una forma de introducir una variable de tipo numérica en java");
        System.out.println("  a) String numX ");      /* Se sobre entiende que no contaría un número puesto en cadena */      
        System.out.println("  b) doble numX ");   /* Preguntas con trampa */
        System.out.println("  c) float numX");
        char resp1 = System.console().readLine().charAt(0);
        Boolean bien1 = (resp1=='c');
        System.out.println("Pregunta 1 es: " + bien1);

        System.out.println(); /* Estos son por dar algo de estética al cuestionario*/
        System.out.println("2. ¿Qué expresión está bien escrita?"); 
        System.out.println("  a)  System.console().Readline().charAt(0);");
        System.out.println("  b)  System.console().readLine().charAt(0);");
        System.out.println("  c)  System.Console().ReadLine().charAt(0);");
        char resp2 = System.console().readLine().charAt(0);
        Boolean bien2 = (resp2=='b');
        System.out.println("Pregunta 2 es: " + bien2);

        System.out.println(); 
        System.out.println("3.  ¿Qué palabra se usa en if para efectuar una acción cuando no cumple la funcion if en java?");
        System.out.println("  a) or");
        System.out.println("  b) if not");
        System.out.println("  c) else");
        char resp3 = System.console().readLine().charAt(0);
        Boolean bien3 = (resp3 =='c');
        System.out.println("Pregunta 3 es: " + bien3);

        System.out.println(); 
        System.out.println("4. ¿Cómo podemos imprimir una variable \"precio\" de tipo float en formato de euros?");
        System.out.println("  a) System.out.printf(\"Precio: %3.2f €\", precio)");
        System.out.println("  b) System.out.printf(\"Precio: %3.2f €\"+ precio)");
        System.out.println("  c) System.out.println(\"Precio: %3.2f €\" + \"precio\")");
        char resp4 = System.console().readLine().charAt(0);
        Boolean bien4 = (resp4 =='a');
        System.out.println("Pregunta 4 es: " + bien4);

        System.out.println();
        System.out.println("5. ¿Cuál de estas opciones se utiliza para que el programa entienda true o false?");
        System.out.println("  a) If");
        System.out.println("  b) Char");
        System.out.println("  c) Boolean");
        char resp5 = System.console().readLine().charAt(0);
        Boolean bien5 = (resp5 =='c');
        System.out.println("Pregunta 5 es: " + bien5);

        System.out.println();


       int nota1 =  booleanToInt(bien1); 
       int nota2 =  booleanToInt(bien2); 
       int nota3 =  booleanToInt(bien3); 
       int nota4 =  booleanToInt(bien4); 
       int nota5 =  booleanToInt(bien5); 


   int resultado = nota1 + nota2 + nota3 + nota4 + nota5;
   System.out.println("La nota de tu cuestionario es de "+ resultado + "sobre 5.");

   System.out.println();

}

public static int booleanToInt(Boolean b) {
   return b ? 1 : 0;
    }
    
}
