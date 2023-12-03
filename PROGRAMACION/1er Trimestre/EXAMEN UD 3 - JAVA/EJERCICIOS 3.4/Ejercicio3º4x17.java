// Programa para aceptar solo números mayores que el anterior (acaba al introducir 0)ç

// Autor: Jaime Díaz.

public class Ejercicio3º4x17 {
    public static void main(String[] args) {
        int numAnterior = 0;
        int numIntro;
        boolean fin = false;
        int contador=0;
        int errores = 0;

        System.out.println();
        System.out.println("Introduce números siempre mayores que el anterior.");
        System.out.println("El programa finalizará al introducir el 0");

        do {
            System.out.println();
            System.out.print(" Indica un número: ");
            numIntro = Integer.parseInt(System.console().readLine());
            
            if (numAnterior>numIntro && numIntro>0) {
                System.out.println("Fallo, el número introducido es menor.");
                errores++;  /* contador de errores */
            }
           
            if (numIntro==0) { /* Para terminar el bucle */
                fin=true;
                break;
            } 

            contador++;
            numAnterior=numIntro;
        } while (fin=true);

        System.out.println("La cantidad de números introducidos es: " + contador);
        System.out.println("El total de fallos ha sido: " + errores);
        System.out.println();

    }
    
}
