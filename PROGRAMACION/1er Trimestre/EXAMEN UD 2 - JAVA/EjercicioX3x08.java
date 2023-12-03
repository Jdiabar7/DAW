// El ejercicio del César, para qué decir más...

// Autor: Jaime Díaz. 

public class EjercicioX3x08 {
    public static void main(String[] args){

            System.out.println("Introduce 1 carácter en 6 parrafos en mayúscula (A-Z)");
            //palabra = System.console().readLine();
            char letra1=System.console().readLine().charAt(0);
            char letra2=System.console().readLine().charAt(0);
            char letra3=System.console().readLine().charAt(0);
            char letra4=System.console().readLine().charAt(0);
            char letra5=System.console().readLine().charAt(0);
            char letra6=System.console().readLine().charAt(0);


            System.out.println("Introduce el desplazamiento(número entero): ");
            int desplaz= Integer.parseInt(System.console().readLine());

          
            letra1= (char)(((((letra1-65) + desplaz)%26+26)%26)+65);
            System.out.print(letra1);
            letra2= (char)(((((letra2-65) + desplaz)%26+26)%26)+65);
            System.out.print(letra2);
            letra3= (char)(((((letra3-65) + desplaz)%26+26)%26)+65);
            System.out.print(letra3);
            letra4= (char)(((((letra4-65) + desplaz)%26+26)%26)+65);
            System.out.print(letra4);
            letra5= (char)(((((letra5-65) + desplaz)%26+26)%26)+65);
            System.out.print(letra5);
            letra6= (char)(((((letra6-65) + desplaz)%26+26)%26)+65);
            System.out.print(letra6);
            System.out.println();
            System.out.println();



    }
    
}
