/**
 * Programa para realizar cálculos relacionados con la altura
 * (en metros) de personas. Pedirá un valor N y luego almacenará
 * en un array N alturas introducidas por teclado. luego
 * mostrará la altura media, máxima y mínima así como cuántas
 * personas miden por encima y por debajo de la media.
 * 
 * 
 */

public class Ejercicio4º4x10 {
    /**
     * Funcion a la que se le introduce "N", como número de alturas
     * que va a solicitar, y se le introducen las alturas para que
     * calcule media, maxima y minima de las alturas, y ademas de
     * esto, indique cuantas alturas estan por encima o debajo de
     * la media.
     * 
     * @param args
     */
    public static void main(String[] args) {

        int i;

        System.out.println();
        // Introducir N
        System.out.println("Introduzca cuantas alturas introducirá: ");
        int N = Integer.parseInt(System.console().readLine());

        double altura[] = new double[N];

        // Se piden las alturas
        System.out.println("Introduzca cada estatura (en metros) y presione ENTER ");
        for (i = 0; i < altura.length; i++) {
            altura[i] = Double.parseDouble(System.console().readLine());
        }

        // Hallamos media, máxima y mínima
        double media = 0, maxima = 0, minima = 6;
        for (i = 0; i < altura.length; i++) {

            media = media + altura[i];
            if (altura[i] > maxima) {
                maxima = altura[i];
            }
            if (altura[i] < minima) {
                minima = altura[i];
            }

        }
        media = media / N;

        // calculo de alturas por encima y debajo de media
        int mayores = 0, menores = 0;
        for (i = 0; i < altura.length; i++) {

            if (altura[i] > media) {
                mayores++;
            }
            if (altura[i] < media) {
                menores++;
            }

        }

        // Resultados
        System.out.println();
        System.out.println("Los resultados son los siguientes:");
        System.out.println();

        System.out.println("La altura media es: " + media);
        System.out.println("La altura mínima es: " + minima);
        System.out.println("La altura máxima es: " + maxima);
        System.out.println("Alturas por debajo de la media: " + menores);
        System.out.println("Alturas por encima de la media: " + mayores);
        System.out.println();

    }
}
