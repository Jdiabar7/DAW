// Programa para que escriba el usuario un num del 0 al 20.
// El programa responde con N lineas de respuesta, en las que cada línea
// introduce el número de la linea tantas veces como el valor de ese número.

// Autor: Jaime Díaz.

public class Ejercicio3º4x20 {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Escribe un número entre 0 y 20.");
        int numX = Integer.parseInt(System.console().readLine());

        int numY;
        int numZ;

        System.out.println();
        if (numX>=0 && numX<=20) {
            for (numY=1; numY<=numX; numY++){
                for(numZ=0; numZ<numY; numZ++){
                    System.out.print(numY);
                }
                System.out.println();
            }
            
        } else System.out.println("El número no está comprendido entre los valores solicitados.");



    }
    
}
