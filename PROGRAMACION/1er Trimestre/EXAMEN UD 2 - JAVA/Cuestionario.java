// Programar un cuestionario para que se realice un tipo test.

// Autor: Jaime Díaz.

public class Cuestionario{
    public static void main(String[] args){
    
      System.out.println("Introduce sólo la respuesta correcta.");  
    System.out.println("Parte 1: Preguntas con respuesta múltiple (1 respuesta válida de 3 posibles):");
    System.out.println("1. ¿Cómo se incrementa en 3 un carácter (char caracter='A'  pasa a ser 'D')?");
    System.out.println("  a) caracter+++");             /* En la pregunta hay un " en lugar de un '*/
    System.out.println("  b) caracter = caracter +3");   
    System.out.println("  c) caracter = (char) (caracter + 3)");
    char resp1 = System.console().readLine().charAt(0);
    Boolean bien1 = (resp1=='c');
    System.out.println("Pregunta 1 es: " + bien1);

    System.out.println(); /* Estos son por dar algo de estética al cuestionario*/
    System.out.println("2. ¿Qué significa el código \\n en una cadena?"); /*Hay que introducir un \ porque daria error*/
    System.out.println("  a) Cambio de color");
    System.out.println("  b) Salto de línea");
    System.out.println("  c) Formato de número");
    char resp2 = System.console().readLine().charAt(0);
    Boolean bien2 = (resp2=='b');
    System.out.println("Pregunta 2 es: " + bien2);

    System.out.println(); /* Hay que tener cuidado con los simbolos de las operaciones*/
    System.out.println("3.  ¿Cuál es el resultado de esta expresión, si a=1 y b=2?");
    System.out.println("(a==b) && (a>=b) || (a!=b) && (a<=b)");
    System.out.println("  a) No puede evaluarse");
    System.out.println("  b) false");
    System.out.println("  c) true");
    char resp3 = System.console().readLine().charAt(0);
    Boolean bien3 = (resp3 =='b');
    System.out.println("Pregunta 3 es: " + bien3);

    System.out.println(); /* En este, para las "", he tenido que añadir \ para que no de error*/
    System.out.println("4. ¿Cómo podemos imprimir una variable \"precio\" de tipo double en formato de euros?");
    System.out.println("  a) System.out.printf(\"Precio: %3.2f €\", precio)");
    System.out.println("  b) System.out.printf(\"Precio: %3.2f €\"+ precio)");
    System.out.println("  c) System.out.println(\"Precio: %3.2f €\" + \"precio\")");
    char resp4 = System.console().readLine().charAt(0);
    Boolean bien4 = (resp4 =='a');
    System.out.println("Pregunta 4 es: " + bien4);

    System.out.println();
    System.out.println("5. ¿Cuál de estas variables tiene un nombre más adecuado?");
    System.out.println("  a) l2");
    System.out.println("  b) Linea2");
    System.out.println("  c) lineaDos");
    char resp5 = System.console().readLine().charAt(0);
    Boolean bien5 = (resp5 =='c');
    System.out.println("Pregunta 5 es: " + bien5);

    System.out.println();
    System.out.println("Parte 2: Preguntas con respuesta numérica (deben responderse con un número entero)");
    
    System.out.println();
    System.out.println("6. ¿Cuántos posibles valores tiene una variable de tipo boolean?");
    int resp6 = Integer.parseInt(System.console().readLine());
    Boolean bien6 = (resp6 ==2);
    System.out.println("Pregunta 6 es: " + bien6);
    
    System.out.println();
    System.out.println("7. ¿Cuántos bits tiene 1 byte?");
    int resp7 = Integer.parseInt(System.console().readLine());
    Boolean bien7 = (resp7 ==8);
    System.out.println("Pregunta 7 es: " + bien7);

    System.out.println();
    System.out.println("8. ¿Cuántos bytes ocupa una variable de tipo char?");
    int resp8 = Integer.parseInt(System.console().readLine());
    Boolean bien8 = (resp8 ==1);
    System.out.println("Pregunta 8 es: " + bien8);

    System.out.println();
    System.out.println("9. ¿Cuántos bytes ocupa una variable de tipo int?");
    int resp9 = Integer.parseInt(System.console().readLine());
    Boolean bien9 = (resp9 ==4);
    System.out.println("Pregunta 9 es: " + bien9);

    System.out.println();/*Como / , * y % estan en el mismo nivel matemático, el resultado dará 20 */
    System.out.println("10. ¿Cuál es la respuesta a esta expresión?");
    System.out.println("2+12/2*3+3%2-1");
    int resp10 = Integer.parseInt(System.console().readLine());
    Boolean bien10 = (resp10 ==20);
    System.out.println("Pregunta 10 es: " + bien10);


/* Hay que hacerlos INT */

       int aa1 =  booleanToInt(bien1); 
        int aa2 =  booleanToInt(bien2); 
        int aa3 =  booleanToInt(bien3); 
        int aa4 =  booleanToInt(bien4); 
        int aa5 =  booleanToInt(bien5); 
        int aa6 =  booleanToInt(bien6); 
        int aa7 =  booleanToInt(bien7);
        int aa8 =  booleanToInt(bien8); 
        int aa9 =  booleanToInt(bien9); 
        int aa10 =  booleanToInt(bien10); 


    int resultado = aa1 + aa2 + aa3 + aa4 + aa5 + aa6 + aa7 + aa8 + aa9 + aa10;
    System.out.println("La nota de tu cuestionario es: "+ resultado);


}

public static int booleanToInt(Boolean b) {
    return b ? 1 : 0;


/*

boolean bien = true;
a =  booleanToInt(a);    // aNumero es 1

*/


}
    

   /* System.out.println();
    System.out.println();*/

/*  System.out.println();
    System.out.println("");
    System.out.println("  ");
    System.out.println("  ");
    System.out.println("  ");
    char resp X = System.console().readLine().charAt(0);
    Boolean bien X = (resp X =='b');
    System.out.println("Pregunta X es: " + bien X);
*/







}



