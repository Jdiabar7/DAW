
/** Hacer una pirámide con N altura */


public class Pruebax001 {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("Escribe un número");
        int num = Integer.parseInt(System.console().readLine());
        int k=0;
        int contador=0;
        

        System.out.println();
        if (num<=0) {
            System.out.println("El número debe ser mayor o igual a 1");
        }
        for (int i = 0; i <num; i++) {
          
            for (int j=0; j<(num-i); j++) {
                
                    System.out.print("--");
                    

            }

            while (k<=contador) {
                System.out.print("* ");
                k++;
                
            }

            System.out.println();
            contador=contador+2;
            k=0;
        }
            






    }
    
}
