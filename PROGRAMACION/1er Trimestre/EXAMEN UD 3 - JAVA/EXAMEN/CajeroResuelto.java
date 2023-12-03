public class CajeroResuelto {

    static String operacion1 = "";
    static String operacion2 = "";
    static String operacion3 = "";
    static String operacion4 = "";
    static String operacion5 = "";

    /**
     * @param args
     * Esto es el Main.
     */
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
                    operacion = "Ingreso"; // Recoge la operación para ultimas operaciones
                    nuevoSaldo = Depositar(saldo, idioma);
                    break;
                case 2:
                    operacion = "Retirada"; // Recoge la operación para ultimas operaciones
                    nuevoSaldo = retirar(saldo, idioma);
                    break;
                case 3:
                    operacion = "Envio bizum"; // Recoge la operación para ultimas operaciones
                    nuevoSaldo = enviarBizum(saldo, idioma);
                    break;
                case 4:
                    imprimirSaldo(saldo, idioma);
                    break;
                case 5:
                    ultimasOperaciones(idioma, saldo);
                    break;
                case 6:
                    idioma = (idioma == "es" ? "en" : "es"); //No está implementado en todos los menús.
            }
            if (nuevoSaldo != saldo) {
                grabarOperacion(operacion, nuevoSaldo - saldo);
            }
            saldo = nuevoSaldo;
        } while (opcion != 7);
    }

    /**
     * @param idioma Aquí vamos a encontrar el idioma que mostrará
     * Esta funcion imprime el menú.
     */
    public static void imprimirMenu(String idioma) {
        if (idioma == "es") {
            System.out.println();
            System.out.println("    M E N Ú ");
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
        int opcion = 0;

        try {
            System.out.println("Elija una opción:");
            opcion = Integer.parseInt(System.console().readLine());
        } catch (Exception e) {
            System.out.println("Debe introducir un número.");
        }
        return opcion;
    }

    public static int retirar(int saldo, String idioma) {
        boolean datoValido = false;
        int retirar = 0;
        do {
            try {
                System.out.println("Introduzca la cantidad que quiera retirar:");
                retirar = Integer.parseInt(System.console().readLine());
                
                
                if (retirar < saldo && retirar < 600) {
                saldo = saldo - retirar;
                datoValido = true;
                } else if (retirar > saldo || retirar > 600){
                    System.out.println("No puede retirar un importe tan elevado");
                }

            } catch (Exception e) {
                System.out.println("El valor introducido es erróneo.");
            }
        } while (!datoValido);
        
        
        imprimirSaldo(saldo, idioma);
        return saldo;
    }

    public static int Depositar(int saldo, String idioma) {
        int cantidadADepositar = 0;
        do {
            try {
                System.out.print("Introduzca la cantidad que va a depositar: ");
                cantidadADepositar = Integer.parseInt(System.console().readLine());
                if (cantidadADepositar % 10 == 0) {
                    if (cantidadADepositar <= 3000) {
                        saldo = saldo + cantidadADepositar;
                    } else {
                        System.out.println("No es posible depositar una cantidad mayor a 3000€");
                    }
                } else {
                    System.out.println("No es posible depositar billetes que no sean múltiplos de 10");
                }
            } catch (Exception e) {
                System.out.println("Los valores introducidos no son válidos.");
            }
        } while (cantidadADepositar % 10 != 0);
        imprimirSaldo(saldo, idioma);
        return saldo;
    }

    public static void imprimirSaldo(int saldo, String idioma) {

        System.out.println("--------------------");
        System.out.println("Saldo actual: " + saldo + " €");
        System.out.println("--------------------");
        pressEnter(idioma);
        System.out.println("");
    }

    public static void pressEnter(String idioma) {
        if (idioma == "es") {
            System.out.println("Pulse ENTER para volver");
        } else if (idioma == "en") {
            System.out.println("Press ENTER to continue");
        }
        System.console().readLine();
    }

    public static int enviarBizum(int saldo, String idioma) {
        System.out.println("Introduce el número que quieres enviar el dinero");
        try {
            int numTelefono = Integer.parseInt(System.console().readLine());
            /** Aquí empieza el if para comprobar el teléfono */
            if ((numTelefono >= 600000000 && numTelefono < 800000000)
                    || (numTelefono >= 900000000 && numTelefono < 1000000000)) {
                System.out.println("Introduce la cantidad a enviar");
                int cantidadAEnviar = Integer.parseInt(System.console().readLine());
                if (cantidadAEnviar > saldo) {
                    System.out.println("ERROR: No tienes ese saldo en la cuenta");
                } else {
                    if (cantidadAEnviar > 200) {
                        System.out.println("ERROR: No puedes enviar más de 200€");
                    } else {
                        System.out.println("---- Operación realizada con éxito ----");
                        imprimirSaldo(saldo - cantidadAEnviar, idioma);
                        return saldo - cantidadAEnviar;
                    }
                }
            } else {
                System.out.println("No has introducido un teléfono válido");
            }
        } catch (Exception e) {
            System.out.println("ERROR: Valor introducido no válido, inténtalo de nuevo");
        }
        return saldo;
    }

    public static void grabarOperacion(String operacion, int cantidad) {
        operacion5 = operacion4;
        operacion4 = operacion3;
        operacion3 = operacion2;
        operacion2 = operacion1;
        operacion1 = String.format("%-20s%20.2f", operacion, (double) cantidad);

    }

    public static void ultimasOperaciones(String idioma, int saldo) {
        
        System.out.println("1. " + operacion1);
        System.out.println("2. " + operacion2);
        System.out.println("3. " + operacion3);
        System.out.println("4. " + operacion4);
        System.out.println("5. " + operacion5);
        System.out.println("--------------------");
        imprimirSaldo(saldo, idioma);

    }
}






