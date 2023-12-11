/**
 * El programa recoge los nombres y apellidos, y debe crear
 * un código con las tres primeras letras de cada cadena,
 * concatenandolas de la siguiente forma:
 * (3)nombre + (3)apellido1 + (3)apellido2
 * (Lo escribirá en mayúsculas)
 * 
 * @author Jaime Díaz.
 */

public class Ejercicio4º2x03 {
    /**
     * La función recoge los nombres y apellidos, y los separa en
     * tres cadenas. Luego, crea un código con las tres primeras
     * letras de cada cadena, concatenandolas de forma:
     * (3)nombre + (3)apellido1 + (3)apellido2
     * (Lo escribirá en mayúsculas)
     * 
     * @param args
     */
    public static void main(String[] args) {

        String nombre, apellido, apelliDOS, nomyAp, codUsuario;

        System.out.println();
        System.out.println("Introduce nombre y dos apellidos");
        nomyAp = System.console().readLine();

        String[] nomDividido;
        nomDividido = nomyAp.split(" "); // Divide la primera en 3 cadenas
        nombre = nomDividido[0];
        apellido = nomDividido[1];
        apelliDOS = nomDividido[2];

        // Crea el codigo de usuario
        codUsuario = nombre.substring(0, 3) + apellido.substring(0, 3) + apelliDOS.substring(0, 3);

        System.out.println("Tu código es: " + codUsuario.toUpperCase());

    }
}
