/**
 * Programa que registra los sueldos de hombres y mujeres.
 * El programa pide el número de muestras que va a tomar (N)
 * y se pedirá el sueldo y el género de cada persona.
 * El 0 será varón y el 1 será mujer.
 * Posteriormente se mostrará la media de sueldo de cada genero.
 * 
 * @author Jaime Díaz.
 */

public class Ejercicio4º6x05 {
    /**
     * Funcion para la realización del programa con introducción de
     * sueldos y generos de cada array. Finalmente entrega la media de
     * salario de cada género.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int i, j;
        float contVarones = 0, contMujeres = 0, salarioVaron = 0, salarioMujer = 0;
        System.out.println();
        System.out.println("Indica cuantos salarios se introducirán:");
        int N = Integer.parseInt(System.console().readLine());

        int sueldoEmpresa[][] = new int[N][2];

        // Bucle de introduccion de sueldos
        for (i = 0; i < sueldoEmpresa.length; i++) {
            for (j = 0; j < sueldoEmpresa[0].length; j++) {

                if (j == 0) {
                    System.out.println("Introduce el sueldo:");
                    sueldoEmpresa[i][j] = Integer.parseInt(System.console().readLine());
                }
                if (j == 1) {
                    System.out.println("Introduce 0 si es varon o 1 si es mujer:");
                    sueldoEmpresa[i][j] = Integer.parseInt(System.console().readLine());
                }

            }
        }

        // Calculo de la suma de los salarios y contador de genero
        for (i = 0; i < sueldoEmpresa.length; i++) {

            if (sueldoEmpresa[i][1] == 0) {
                contVarones++;
                salarioVaron = salarioVaron + sueldoEmpresa[i][0];
            }
            if (sueldoEmpresa[i][1] == 1) {
                contMujeres++;
                salarioMujer = salarioMujer + sueldoEmpresa[i][0];
            }

        }

        // Resultados
        System.out.println();
        System.out.println("El sueldo medio de los varones es de: " + (salarioVaron / contVarones));
        System.out.println("El sueldo medio de las mujeres es de: " + (salarioMujer / contMujeres));
    }
}
