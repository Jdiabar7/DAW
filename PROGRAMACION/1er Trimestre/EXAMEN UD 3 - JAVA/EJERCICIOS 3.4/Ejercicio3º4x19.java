public class Ejercicio3º4x19 {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.print(" Escriba un número: ");
        int numX = Integer.parseInt(System.console().readLine());
        int contador = 0;


        if (numX<0) {
            System.out.println(" *");
            
        } else do {
            System.out.print(" *");
            contador = contador +1;
        } while (contador<numX);


        System.out.println();


    }
}
