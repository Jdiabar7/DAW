/**
 * Programa para crear una tabla con las notas de
 * 4 alumnos y 5 asignaturas cada uno, el usuario
 * introducirá las notas por teclado. Finalmente
 * el programa mostrará la nota mínima, máxima y
 * media de cada alumno.
 * 
 * @author Jaime Díaz.
 */

public class Ejercicio4º6x04 {
    /**
     * Funcion de la matriz en la que se calculan la
     * maxima, minima y media de las notas por cada
     * alumno de la matriz y las muestra por pantalla.
     * 
     * @param args
     */
    public static void main(String[] args) {

        int i, j;
        float nMinima = 13, nMaxima = 0;
        float nMedia = 0;
        float notaAlumno[][] = new float[4][5];
        System.out.println();

        // Bucle matriz alumno x asignatura
        for (i = 0; i < notaAlumno.length; i++) {
            for (j = 0; j < notaAlumno[0].length; j++) {

                System.out.println("Por favor introduzca la nota " + (j + 1) + " del alumno " + (i + 1));
                notaAlumno[i][j] = Integer.parseInt(System.console().readLine());

                if (j == 0) { // Reinicia para cada alumno
                    nMaxima = notaAlumno[i][j];
                    nMinima = notaAlumno[i][j];
                    nMedia = 0;

                }

                // Modificadores de maxima, minima y media
                if (notaAlumno[i][j] > nMaxima) {
                    nMaxima = notaAlumno[i][j];
                }
                if (notaAlumno[i][j] < nMinima) {
                    nMinima = notaAlumno[i][j];
                }
                nMedia = nMedia + notaAlumno[i][j];

            }

            nMedia = nMedia / 5; // Se le podria poner un length

            // Resultados
            System.out.println();
            System.out.println("La nota media del alumno " + (i + 1) + " ha sido: " + nMedia);
            System.out.println("la nota más alta del alumno " + (i + 1) + " ha sido: " + nMaxima);
            System.out.println("La nota más baja del alumno " + (i + 1) + " ha sido: " + nMinima);
            System.out.println();
        }

    }
}
