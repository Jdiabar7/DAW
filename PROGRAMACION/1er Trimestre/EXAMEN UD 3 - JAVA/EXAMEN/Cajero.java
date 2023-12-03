/**
 * Examen de tema 3
 * 
 * @author Jaime Díaz
 * 
 */

public class Cajero {
    static String operacion1 = "";
    static String operacion2 = "";
    static String operacion3 = "";
    static String operacion4 = "";
    static String operacion5 = "";

    public static void main(String[] args) {
        int saldo = 1000;
        int nuevoSaldo = 1000;
        String idioma = "es";
        String operacion = "";
        int opcion;

        do {
            imprimirMenu(idioma);
            opcion = leerOpcion(idioma);
            switch (opcion) {
                case 1:
                    operacion = "Depósito";
                    nuevoSaldo = depositar(saldo, idioma);
                    break;
                case 2:
                    operacion = "Retiro";
                    nuevoSaldo = retirar(saldo, idioma);
                    break;
                case 3:
                    operacion = "Bizum";
                    nuevoSaldo = enviarBizum(saldo, idioma);
                    break;
                case 4:
                    imprimirSaldo(saldo, idioma);
                    break;

                case 5:
                    ultimasOperaciones(idioma, saldo);
                    break;

                case 6:
                    idioma = (idioma == "es" ? "en" : "es");
            }
            saldo = nuevoSaldo;
        } while (opcion != 7);
    }

    public static void grabarOperacion(String operacion, int cantidad) {
        operacion5 = operacion4;
        operacion4 = operacion3;
        operacion3 = operacion2;
        operacion2 = operacion1;
        operacion1 = String.format("%-20s%20.2f", operacion, (double) cantidad);
    }

    /**
     * @param saldo
     * @param idioma
     * @return saldo
     */
    public static int depositar(int saldo, String idioma) {

        int deposito;
        do {
            do {
                if (idioma == "es") {
                    System.out.println("Indique el importe a depositar:");
                } else if (idioma == "en") {
                    System.out.println("Introduce a value to deposit.");
                }

                deposito = Integer.parseInt(System.console().readLine());
            } while (deposito < 10 && deposito >= 3000);

        } while (deposito % 10 != 0);

        if (idioma == "es") {
            System.out.println("Usted va a ingresar el siguiente importe: " + deposito);
        } else if (idioma == "en") {
            System.out.println("You will deposit the next amount: " + deposito);
        }

        saldo = saldo + deposito;
        imprimirSaldo(saldo, idioma);
        pressEnter(idioma);
        System.console().readLine();
        grabarOperacion("Deposito", deposito);
        return saldo;

    }

    /**
     * @param saldo
     * @param idioma
     * @return saldo
     */
    public static int retirar(int saldo, String idioma) {
        int retirado;
        do {
            do {
                if (idioma == "es") {
                    System.out.println("Indique el importe a retirar:");
                } else if (idioma == "en") {
                    System.out.println("Introduce a value to withdraw.");
                }

                retirado = Integer.parseInt(System.console().readLine());
            } while ((retirado < 10 || retirado >= 600) && (retirado > saldo));

        } while (retirado % 10 != 0);

        System.out.println("Usted va a retirar el siguiente importe: " + retirado);
        saldo = saldo - retirado;
        imprimirSaldo(saldo, idioma);
        pressEnter(idioma);
        System.console().readLine();
        grabarOperacion("Retirada", retirado);
        return saldo;

    }

    /**
     * @param saldo
     * @param idioma
     * @return saldo
     */
    public static int enviarBizum(int saldo, String idioma) {

        int telefono = 0;

        while ((telefono < 600000000 || telefono >= 800000000) && (telefono < 900000000 || telefono >= 1000000000)) {
            if (idioma == "es") {
                System.out.println("Introduzca un número valido.");
            } else if (idioma == "en") {
                System.out.println("Introduce a valid number.");
            }

            telefono = Integer.parseInt(System.console().readLine());
        }

        int retirado;
        do {
            do {
                if (idioma == "es") {
                    System.out.println("Indique el importe a enviar:");
                } else if (idioma == "en") {
                    System.out.println("Introduce a value to send");
                }
                retirado = Integer.parseInt(System.console().readLine());
            } while ((retirado < 1 || retirado >= 200) && (retirado > saldo));

        } while (retirado > 200 && retirado > saldo);

        if (idioma == "es") {
            System.out.println("Usted va a enviar el siguiente importe: " + retirado);
        } else if (idioma == "en") {
            System.out.println("You will send the next amount: " + retirado);
        }

        saldo = saldo - retirado;
        imprimirSaldo(saldo, idioma);
        pressEnter(idioma);

        System.console().readLine();
        grabarOperacion("Envío Bizum", retirado);
        return saldo;
    }

    /**
     * @param saldo
     * @param idioma
     */
    public static void imprimirSaldo(int saldo, String idioma) {

        System.out.println("El saldo actual es: " + saldo);

    }

    /**
     * @param idioma
     */
    public static void imprimirMenu(String idioma) {

        if (idioma == "es") {
            System.out.println();
            System.out.println("    M E N U ");
            System.out.println("-----------------");
            System.out.println("1 -> Depositar");
            System.out.println("2 -> Retirar");
            System.out.println("3 -> Enviar Bizum");
            System.out.println("4 -> Consultar saldo");
            System.out.println("5 -> Ultimas operaciones");
            System.out.println("6 -> Change to English");
            System.out.println("7 -> Salir");
        } else if (idioma == "en") {
            System.out.println();
            System.out.println("1 -> Deposit");
            System.out.println("2 -> Withdraw");
            System.out.println("3 -> Send Bizum");
            System.out.println("4 -> Check Balance");
            System.out.println("5 -> Latests operations");
            System.out.println("6 -> Cambiar a español");
            System.out.println("7 -> Exit");

        }

    }

    public static int leerOpcion(String idioma) {

        if (idioma == "es") {
            System.out.println("Indique una opción:");
        } else if (idioma == "en") {
            System.out.println("Choose an option:");
        }

        int eleccion = Integer.parseInt(System.console().readLine());

        return eleccion;
    }

    /**
     * @param idioma
     */
    public static void pressEnter(String idioma) {
        if (idioma == "es") {
            System.out.println("Pulse ENTER para volver");
        } else if (idioma == "en") {
            System.out.println("Press ENTER to continue");
        }

        System.console().readLine();
    }

    /**
     * @param idioma
     * @param saldo
     */
    public static void ultimasOperaciones(String idioma, int saldo) {

        System.out.println(operacion1);
        System.out.println(operacion2);
        System.out.println(operacion3);
        System.out.println(operacion4);
        System.out.println(operacion5);
        System.out.println("--------------------");
        imprimirSaldo(saldo, idioma);
        pressEnter(idioma);

    }

}