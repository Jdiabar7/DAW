// Programa para transformar una calificación numérica a alfabética.

// Autor: Jaime Díaz.


public class Ejercicio3º2x3 {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Por favor introduzca la nota.");
        float laNota = Float.parseFloat(System.console().readLine());


        /* He intentado con switch pero no deja usar un float. */
        if (laNota>=0.00 && laNota<3.00){
            System.out.println("La nota es de Muy Deficiente.");
        } else if (laNota>=3.00 && laNota<5.00) {
            System.out.println("La nota es de Insuficiente.");
            
        } else if (laNota>=5 && laNota<6) {
            System.out.println("La nota es de Bien.");
            
        } else if (laNota>=6 && laNota<9) {
            System.out.println("La nota es de Notable.");
            
        } else if (laNota>=9 && laNota<=10) {
            System.out.println("La nota es de Sobresaliente.");
            
        }
        
System.out.println();

    }
    
}
