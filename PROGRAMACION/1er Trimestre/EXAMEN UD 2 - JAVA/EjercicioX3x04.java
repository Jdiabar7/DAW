// Programa que pide nombre, apellidos, año nacimiento
// Escribe el nombre completo en 1 linea, y la edad calculada
// por el año, en otra linea.

// Autor: Jaime Díaz.



public class EjercicioX3x04 {
    public static void main(String[] args){

        String nombre,apelli1,apelli2;
        System.out.println();

        System.out.println("Por favor, introduzca su nombre.");
        nombre = System.console().readLine();

        System.out.println("Por favor, su primer apellido.");
        apelli1 = System.console().readLine();

        System.out.println("Y ahora su segundo apellido.");
        apelli2 = System.console().readLine();

        System.out.println("Para terminar, el año de su nacimiento.");
        int año = Integer.parseInt(System.console().readLine());
        int edad = 2023-año; //Estamos en 2023, se podria hacer que actualizase por año

        System.out.println();

        System.out.println("Bienvenido "+nombre+" "+apelli1+" "+apelli2);
        System.out.printf("Veo que tienes "+edad+" años.\n");
        System.out.println("A no ser que los cumplas en lo que queda de año.");
        System.out.println();




    }
    
}
