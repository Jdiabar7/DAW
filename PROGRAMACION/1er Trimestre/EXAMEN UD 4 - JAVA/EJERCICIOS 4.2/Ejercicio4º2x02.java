/**
 * Programa que compara dos frases y dice si la primera y
 * la segunda son iguales o no, y diferencia si hay que
 * diferenciar o no entre mayúsculas y minúsculas.
 * 
 * Al final, está comentado el código con mi idea principal,
 * la cual no estaba funcionando bien.
 * 
 * @author Jaime Díaz.
 */

public class Ejercicio4º2x02 {
    /**
     * Función del programa para comparar las frases entre si.
     * 
     * @param args
     */
    public static void main(String[] args) {

        int contador;
        String fraseUno;
        String fraseDos;

        System.out.println("Introduzca la primera frase: ");
        fraseUno = System.console().readLine();

        boolean fraseIgual = false;

        System.out.println("Introduzca la segunda frase: ");
        fraseDos = System.console().readLine();

        if (fraseUno.equals(fraseDos)) { // compara hasta las mayúsculas.
            System.out.println();
            fraseIgual = true;

        } else if (fraseUno.equalsIgnoreCase(fraseDos)) { // compara sin mayúsculas
            System.out.println();
            System.out.println("Si no diferenciasemos mayúsculas y minúsculas:");
            fraseIgual = true;
        } else {
            System.out.println();
            fraseIgual = false;
        }

        if (fraseIgual == true) { // resultado
            System.out.println("Las frases son iguales.");
        } else {
            System.out.println("Las frases son diferentes.");
        }

    }
}

/**
 * Mi idea era hacerlo parecido a esta forma:
 * 
 * int contador;
 * String[] fraseUno;
 * String[] fraseDos;
 * 
 * System.out.println("Introduzca la primera frase: ");
 * String fraseIntroducida = System.console().readLine();
 * 
 * boolean fraseIgual=true;
 * fraseUno = fraseIntroducida.split(" ");
 * 
 * System.out.println("Introduzca la segunda frase: ");
 * fraseIntroducida = System.console().readLine();
 * 
 * fraseDos = fraseIntroducida.split(" ");
 * 
 * if (fraseUno.length != fraseDos.length) {
 * 
 * fraseIgual=false;
 * 
 * } else {
 * for (int i = 0; i < fraseUno.length; i++) {
 * if (fraseUno[i].equalsIgnoreCase( fraseDos[i])) {
 * fraseIgual=false;
 * break;
 * }
 * }
 * 
 * }
 * 
 * System.out.println();
 * if (fraseIgual=false){
 * System.out.println("Las frases son diferentes.");
 * } else {
 * System.out.println("Las frases son iguales.");
 * }
 */