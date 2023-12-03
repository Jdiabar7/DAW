// Programa que calcule la suma de los cuadrados de los 5 primeros números naturales.

// Autor: Jaime Díaz. 

public class Ejercicio3º4x18 {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Vamos a mostrar la suma de los cuadrados de los 5 primeros naturales");

        System.out.println("Cuando lo desee, indiquelo y el programa se pondra en marcha.");
        String noSirveDeNadaSoloParaContinuar = System.console().readLine();
        
        int contador=0;
        int suma=0;
        
        System.out.println();
        do {
            contador = contador+1;
            suma = suma + (contador*contador);
            
        } 
        while (contador<5);

        System.out.println();
        System.out.println("La suma total es: " + suma);
        System.out.println();
    }

}

    
    

