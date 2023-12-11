/**
 * El programa contará las vocales que se introduzcan en una frase
 * introducida por teclado por el usuario.
 * 
 * @author Jaime Díaz
 */

public class Ejercicio4º2x04 {
    /**
     * En esta función se contarán cuantas letras de las vocales
     * hay en la frase que se introduce.
     * 
     * @param args
     */
    public static void main(String[] args) {

        String frase;
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        System.out.println();
        System.out.println("Introduzca una frase: ");
        frase = System.console().readLine();
        frase = frase.toLowerCase(); // convierte la frase a minsuculas
        System.out.println();

        for (int contador = 0; contador < frase.length(); contador++) {
            switch (frase.charAt(contador)) { // charAt coge el caracter en la posicion contador
                case 'a':
                    a++;
                    break;

                case 'e':
                    e++;
                    break;

                case 'i':
                    i++;
                    break;

                case 'o':
                    o++;
                    break;

                case 'u':
                    u++;
                    break;

                default:
                    break;
            }

        }

        System.out.println();
        System.out.println("En la frase hay " + a + " letras a");
        System.out.println("En la frase hay " + e + " letras e");
        System.out.println("En la frase hay " + i + " letras i");
        System.out.println("En la frase hay " + o + " letras o");
        System.out.println("En la frase hay " + u + " letras u");
        System.out.println();

    }
}
