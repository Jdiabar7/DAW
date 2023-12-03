
/** Este proyecto es un juego en el que un jugador, entrará en una mansion abandonada, en ella se podrá encontrar un payaso,
 *  si el jugador no tiene un arma, el payaso lo matará, pero por el contrario, si encontrase un arma, el jugador ganará.
 * También se puede encontrar EL TESORO de la familia de la mansión, el cual sigue alli, pero, ¿dónde?
 * 
 * @author Guillermo y Jaime
 * 
 * El trabajo ha sido realizado por ambas partes al 50%, imagenes y funciones han sido realizadas por ambos integrantes.
 * Los comentarios se han añadido en conjunto y se ha llevado a fin en horas de clase para poder realizarlo en conjunto.
 * 
 */

public class Proyecto {
    static int opcion;
    static boolean FinJuego;
    static boolean TieneArma;

    public static void main(String[] args) {

        FinJuego = false; 
        opcion = 1;

        do {
            
            switch (opcion) {
                case 1: // Pantalla de inicio
                    opcion=inicio(opcion);
                    break;

                case 2: // Puerta delantera
                    Pantalla2();
                    opcion=4;
                    System.out.println();
                    System.out.println("Presione ENTER para continuar.");
                    System.console().readLine();
                    break;

                case 3: // Puerta trasera
                    Pantalla3();
                    opcion=4;
                    System.out.println();
                    System.out.println("Presione ENTER para continuar.");
                    System.console().readLine();
                    break;

                case 4: // Pasillo, elección de puertas
                    Pantalla4();
                    break;

                case 5: // Puerta izquierda, con el tesoro
                    Pantalla5(); 
                    break;

                case 6: // Puerta derecha, no tiene arma y el payaso te lleva a un game over
                    Pantalla6();
                    break;

                case 7: // Puerta derecha, pero esta vez hay un arma para defenderse
                    Pantalla7();
                    break;

                case 8:
                    Pantalla8();
                    break;

                case 9:
                    Pantalla9();
                    break;

                case 10:
                    Pantalla10();

                    break;

                default:
                    break;
            }
            
        } while (!FinJuego);

    }

    /** Esta función muestra la pantalla inicial, y además podrá guardar la variable opción para pasar a la siguiente pantalla.
     * 
     * @param opcion con esta variable, se podrá también actualizar para saltar a la siguiente pantalla         OK
     * @return opcion, para poder saltar a la siguiente pantalla.
     */
    public static int inicio(int opcion) {

        System.out.println("    -----------------------    Le doy la bienvenida a nuestro juego de la muerte, en él tendrá que elegir bien cuál será su destino.    ---------------             ");
        System.out.println("                               No siga los pasos de los anteriores visitantes, los cuales no lograron salir con vida, ni con trampas.                               ");
        System.out.println("                                                 ¡¡¡¡¡¡Entre y diviértase en nuestra mansión!!!!!!                                                                  ");
        System.out.println("                                                                  ┈┈┈┈◢▇▇▇▇▇◣┈┈┈┈┈                                                                             ");
        System.out.println("                                                                  ┈┈┈┈▉◤◤◤◤◤▊▍┈┈┈┈                                                                             ");
        System.out.println("                                                                  ┈┈▕▔▉┏▅╮╭▅┓▍▏┈┈┈                                                                            ");
        System.out.println("                                                                  ┈┈┈╲◥╲▔▕▕▔▕╱┈┈┈┈                                                                              ");
        System.out.println("                                                                  ┈┈┈┈┈▍▔╱▔╲▕┈┈┈┈┈                                                                               ");
        System.out.println("                                                                  ┈┈┈┈▇◣╲▔▔▕◢▍┈┈┈┈                                                                             ");
        System.out.println("                                                                  ┈◢▇▇▊▊▕▇▇▏▉▇▇◣┈┈                                                                        ");
        System.out.println("                                                        Los espíritus de Guillermo y Jaime le hablan                                                                ");

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

         ImagenCasa(); // Aqui se muestra en el código la imagen de la casa

        System.out.println("                      Muchos pensaron que eligieron bien por donde entrar, pero no han encontrado la salida, ¿sabe ya cuál será su elección?");
        System.out.println(" ");
        System.out.println("                             Si desea entrar por la puerta de delante, pulse (2) y si prefiere entrar por la de detrás pulse (3): ");

        do {
            System.out.println("Por favor, introduzca un 2 o un 3");
            try {
                opcion = Integer.parseInt(System.console().readLine());
            } catch (Exception e) {
                System.out.println();
                System.out.println("Eso ni siquiera es un número...");
            }
        } while (opcion != 2 && opcion != 3);

        return opcion;

    }

    /**
     * En esta función se entra a la pantalla de la puerta delantera, en la que aparecerá un piano de cola          OK
     */
    public static void Pantalla2() { // Puerta delantera
        System.out.println("                    Puerta de delante");

        System.out.println("   Usted ha elegido entrar por la puerta de delante. Mire lo que se ha encontrado enfrente suya. ");

        ImagenPiano(); // Aqui se muestra en el código la imagen del piano

        System.out.println("");
        System.out.println("                                          PIANO DE COLA                                     ");
        System.out.println("   Se ve muy bonito este piano, pero probablemente de poco sirva como arma algo tan grande...        ");
    }

    /**
     * Con esta función entramos a la parte de detras, encontramos un arma "Bate de Baseball", y contaremos con un arma por si nos encontramos algún peligro.           OK
     */
    public static void Pantalla3() { // Puerta de atras
        System.out.println("                    Puerta de detras");

        System.out.println("Usted ha decidido entrar por la puerta de detrás y tengo algo que decirle: Mire bien lo que hay justo frente a usted");
        System.out.println("");
        ImagenBate(); // Se muestra en el código la imagen del Bate de Baseball
        System.out.println();
        System.out.println("                                NUEVO ARMA DESBLOQUEADA: BATE DE BASEBALL                                     ");
        TieneArma=true;

    }

    /**
     * En esta función "nos toca elegir" una puerta, pero se lanza una moneda para decidir si vamos por una u otra puerta
     */
    public static void Pantalla4() { // Pasillo, elección de puertas
        System.out.println("                    Pasillo ");

        System.out.println("                  Tras estas puertas puede haber un peligro, qué mejor idea que elegir cuál atravesar tirando una moneda.");
        System.out.println("        En el caso de que salga la moneda CARA se le abrirá automáticamente la puerta de la IZQUIERDA y deberá entrar por ella");
        System.out.println("                                        En el caso de que salga CRUZ lo hará la puerta de la DERECHA");

        ImagenPuertas();

        opcion=TiraMoneda();

    }

    /**
     * En esta función aparecerá la imagen del tesoro de la mansión
     */
    public static void Pantalla5() { // Puerta izquierda, EL TESORO - OK

        
        System.out.println();
        System.out.println("                                        ¿¡ES ORO ESO QUE RELUCE!?");
        System.out.println("                        ¡QUE SUERTE! HA ENCONTRADO EL TESORO PERDIDO DE LA FAMILIA");
        System.out.println();
        opcion=ImagenTesoro();

    }

    /**
     * Función para la pantalla en la que encontramos un payaso, pero no tenemos arma para defendernos
     */
    public static void Pantalla6() { // Puerta derecha, SIN BATE = GAME OVER - OK

        ImagenPayasoGO();
        System.out.println();
        System.out.println("                 Pues al parecer, no era muy amigable... Espero que el siguiente visitante corra mejor suerte.");
        System.out.println("                   Si lo desea, le haremos un sitio en la eternidad de nuestra mansión como fantasma de ella.");
        opcion=10;

    }

    /**
     * Función para la pantalla en la que encontramos un payaso, y esta vez, sí tenemos arma para defendernos
     */
    public static void Pantalla7() { // Puerta derecha, CON BATE = EXITO - OK

        System.out.println();
        System.out.println("                                ¡ESO A POR ÉL!, LUCHE COMO SI NO HUBIESE UN MAÑANA.");
        System.out.println();
        System.out.println("                             Presione ENTER para realizar un ataque rápido y con fuerza");
        System.console().readLine();
        opcion=ImagenPayasoWIN();

    }

    /**
     * En esta función aparecerá la pantalla en la que se escapa con el tesoro.
     */
    public static void Pantalla8() { // Escapas con el tesoro - OK

        System.out.println();
        System.out.println("                        VAMOS, ANTES QUE UN PELIGRO NOS PUEDA ENCONTRAR, PRESIONE ENTER PARA RECOGER EL BOTIN.");
        System.out.println();
        System.console().readLine();
        ImagenExito();
        opcion=10;
    }

    /**
     * Esta función simplemente hace que se muestre la imagen en la que escapaste tras matar al payaso
     */
    public static void Pantalla9() { // Escapas con EXITO (mataste al payaso) - OK

        System.out.println();
        System.out.println("                       Su rapidez le ha hecho lograr que para usted, sí pueda haber un mañana.");
        System.out.println("                               Muchos otros no han corrido la misma suerte que usted.");
        System.out.println("                                             Se ve que es muy afortunado.");
        System.out.println();
        System.out.println("                                Presione ENTER para escapar alejarse de este lugar.");
        System.console().readLine();
        ImagenGanado();
        opcion=10;
    }

    /**
     * Pantalla de los agradecimientos por jugar.
     */
    public static void Pantalla10() { // FIN DE JUEGO ( IMAGEN AGRADECIENDO POR HABER JUGADO ) - OK         

        System.out.println();
        System.out.println("Presione ENTER para los agradecimientos:");
        System.console().readLine();
        System.out.println();
        TextoFin();
        FinJuego=FinalJuego(FinJuego);
    }

    /**
     * Muestra la imagen de la casa
     */
    public static void ImagenCasa() {
        System.out.println("                                               : .                                                                                                               ");
        System.out.println("                 % @ @ #                     * * * *                                                                                                             ");
        System.out.println("                 + @ @ @                 # * + + @ = + #                                                                                                         ");
        System.out.println("                 + @ @ @ .           * + + + @ @ @ @ @ - + *                                                                                                     ");
        System.out.println("                 = @ @ @ :       : * * = @ @ @ @ @ @ @ @ @ - + *                                                                                                 ");
        System.out.println("                 = @ @ @ +     * * + % @ @ @ % # # % # % % @ % - + =                                                                                             ");
        System.out.println("                 - @ @ @ @ * + # + @ @ @ % # # @ @ @ @ % # # % @ * - + * # * * + + = + = = = = = + = = = - - - - = - - - - = = = = = + + = + + + * + + + = + ++ =");
        System.out.println("                 - @ @ # + # + @ @ @ @ % % # # @ @ @ @ % # # # % % @ = - + = = = = = = + + + + + = = = + = = = = = + + + = + - - = = = = - - = = = = = = = = ++ =");
        System.out.println("                 : % + # + @ @ @ @ @ % % % # # @ @ @ @ % # # # # % % @ @ : : + = = - = + = = = = = = = = :       : = = = + = = = = = = - - = = - - - = = = = == =");
        System.out.println("               - * * = @ @ @ @ @ @ @ @ % % % % % % % % % % % % % % % @ @ @ @ . : + + = + .     * *   : + + + - - . - - : - + + + + = = + + = = = = = = = = = == +");
        System.out.println("             * * = @ @ @ @ @ @ @ @ @ @ % @ % % % % % % % % % % % % % % @ @ @ @ @ : . + *                                                   . : = = = + = = = == +");
        System.out.println("         * * + @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ % % % % % @ % % % % % @ % @ @ @ @ @ @   : + *                                       = * * + + + + + + + + + + ++ +");
        System.out.println("     - * + @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ % % @ @ @ @ @ @ @ @ @ . : = * + - .                         + + + + + + + * * + + * * * * ** +");
        System.out.println("   * + @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ % @ @ @ @ @ @ @ @ @ : : + :                             . + + + * * * * * * * * * * ** *");
        System.out.println(" @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ % @ @ @ @ @ * @ @ @ @ @ @ @ @ @ @ @ @ @ @ = * : . .             .       # # * * * * * * * # # * # * #* #");
        System.out.println(" * * * * + + + + + + + + + + = = = = = = = - = = - = - = = = = = = = = = = = + + = + = + + = + + + * # * : = - - - : - : - : : : : - - : : : : : : : : : : : :: :");
        System.out.println(" + + @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ % @ @ @ @ @ @ @ @ @ @ # @ @ @ # @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @@ @");
        System.out.println("   - % @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ + - @ @ @ @ @ @ : - @ @ @ @ % % % % # # = @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @@ @");
        System.out.println("     - % % % % % % % % % % % % @ @ @ @ % @ @ @ @ @ @ @     @ @ @ @ @ @ . : * + + + + + = = = + : @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @@ @");
        System.out.println("     : # * # #|░ ░ ░░ ░| |░  ░░ ░ ░| % @ % @ @ @ @ @ @     @ @ @ @ @@ + |░░░ ░░░░| |░░░░░░░░| . @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ # # * # @ @ @ @ @ @ @ @ @ @  % ");
        System.out.println("     . * + + +|░░░░░ ░░| |░░░░░░░░░| # % @ @ @ @ @ @ @     @ @ @ @ @@ - |░░ ░░░ ░| |░░░ ░░_░| . @ @ @ @ @ @ @ @ @ @ @ @ @ % # # # + + = * @ @ @ @ @ @ @ @ @ @  + ");
        System.out.println("     . + + + =|░░ ░░░░░| |░ ░░ ░░ ░| # % % @ @ @ @ @ @     @ @ @ @ @@ - |░░░░ ░░░| |░_░ _░░░| . @ @ @ @ @ @ @ @ @ @ @ @ @ * = + = - = - + @ @ @ @ @ @ @ @ @ @  = ");
        System.out.println("     . + = = =|░░░░░░░░| |░░░░░░░░░| % % # @ @ @ @ @ @     # @ @ @ @@ : | ░░░░░░░| |░░__░░░░| . @ @ % @ @ @ @ @ @ @ @ # # + - - - : - - = @ @ @ @ @ @ @ @ @ @  - ");
        System.out.println("     . + = = =|░░░░ ░░░| |░░ ░░░░ ░| # % # @ @ @ @ @ @ - = * @ @ @ @@ - | ░░░░ ░░| |░░░░░░░░| . @ % % @ @ @ @ @ @ @ @ @ * = - : : : : : = @ @ @ @ @ @ @ @ @ @  - ");
        System.out.println("     . = + = =|░_░░░░░░| |░░░░ ░ ░░| % # # @ @ @ @ @ @ * * @ @ @ @ @@ : |░░ ░░░░░| |░░░░░ ░░| . @ % % @ @ @ @ @ @ @ @ @ + = : : : : : - = @ @ @ @ @ @ @ @ @ @  - ");
        System.out.println("     . = = - -|░░░░░░ ░| | ░░░░░░░░| % # % @ @ @ @ @ @ # = @ @ @ @ #@ # |░░░░░░ ░| |░ ░░  ░░| . @ % % @ @ @ @ @ @ @ * = * + = - - : : - = @ @ @ @ @ @ @ @ @ @  = ");
        System.out.println("     . = = = -|░░ ░░░░░| |░░░ ░░ ░░| % @ * @ @ @ @ @ @ @ % @ # + * *= = |░░░ ░░░░| |░░░░ ░░░| : @ % % @ @ % . . % @ @ @ @ @ # @ @ % # * @ @ @ # * # # * # # @  % ");
        System.out.println("       = = = -|░░░░░░░░| |░ ░░ ░░ ░| : - + @ = + = = = - - - = = - -- = |░░░░░░ ░| |__░░░░░░| : @ @ @ @ @ @ % % @ # % % % @ # @ % # # # # # * # # * # # # * #  * ");
        System.out.println("       = = = - = = = + + # : . . . . . . : . . : . . . . . . : . . : : - + : : . . - = - - + @ @ @ % % # % # # % % @ + # # # # # * * % # # % @ @ * % @ @ @ @ %% @");
        System.out.println("       + * + = = = + % % % # * * * * * * * # # % # # # % # # # # % % % % # % % % % @ @ @ % % # # % # * * * # * # * + % @ * # # # % % @ * % @ @ @ @ @ @ @ @ @ @@ @");
        System.out.println(" =     + @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ % @ # * * * # # # # * % # % % # % # % # :   . = # # % @ # % % # * + - : .             ");
        System.out.println(" + @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ % % @ # #       . = @ % @ % * # @ @ % # # :       : : - * % % @ @ # - : = + = - - - : = == =");
        System.out.println(" @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ % # # % % # * + = = - - - : : : : : : : : : : : : : : : : : : : . : : : : : : : - - - - - -: :");
        System.out.println(" % # % # # # # # # # # * * * * + + + + + + + + + + + + + + + * * * # # # + + * # * * + # # # @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ % @ # = @ @@ @");
        System.out.println(" % % # * # # * # * * * * + + + + + + + = = = = = = = = + - = + + * + + * # % @ # # @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ * - @ @@ @");
        System.out.println(" @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ * = @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ + = @ @@ @");
        System.out.println(" = *   = @ @ % @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ + = @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = = @ @@ @");
        System.out.println(" * +   : @ @ % @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ + + @ @ @ @ @ @_@_@_@_@_@_@_@_@_@ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = = @ @@ @");
        System.out.println(" @ *   . % @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ + = @ @ @ @ @ @|░░░░ ░ ░░ ░░  ░░| @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = = @ @@ @");
        System.out.println(" @ *   = @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ + = @ @ @ @ @ @|░░ ░░░ ░░░░░ ░░░| @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = = @ @@ @");
        System.out.println(" @ # - # @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = = @ @ @ @ @ @| ░░░ ░░░░ ░░  ░░| @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = = @ @@ @");
        System.out.println(" @ % = @ % @ @ @ @ @ @ @ @ @ @ @ @ @ @ % @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = = @ @ @ @ @ @|░░ ░░░  ░░░    ░| @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = - @ @@ @");
        System.out.println(" @ @ = @ % % @ @ @ @ % % @ @ @ @ @ @ @ % @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = = @ @ @ @ @ @|░░░░ ░ ░░ ░░  ░░| @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ - - @ @@ @");
        System.out.println(" @ @ = @ % % % % % % % % @ @ @ @ @ @ @ % @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = - @ @ @ @ @ @|░░   ░░ ░░   ░ ░| @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ - - @ @@ @");
        System.out.println(" @ @ = @ % % % % % % % % @ @ @ @ @ @ @ # @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = - @ @ @ @ @ @|░O░░░░ ░░░  ░ ░░| @ @ @ @ @ @ @ @ @ % @@_º_º_º_º_ @ @ @ - - @ @@ @");
        System.out.println(" @ @ + @ # % % % % % % % @ @ @ @ @ @ @ # @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = - @ @ @ @ @ @|░░░  ░ ░░░░   ░░|@ @ @ @ @ @ @ @ % % # (@@@@@@@@@)) # @ = = @ @@ @");
        System.out.println(" @ @ + @ % % % % # # # # @ @ @ @ @ @ @ # @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ = - @ @ @ @ @ @|░  ░░░░  ░░░░ ░░|@ % @ @ @ @ @ @ %#%% (%@@@@@@@@@@@) %  = =  @  @ ");
        System.out.println(" @ @ # % # % % % % % # # % % % # # # # # # # # # # # # # # * * # * # * * * * # = - @ @ @ @ @ @| ░░░ ░░░   ░░░░ |@ % @ @ @ @ @ @ # # (@@==@@@@@@==@@) % = = @ @@ @");
        System.out.println(" @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ @ % @ % # # % % # % # @ @ @ % @ % @ % @ % @ # % + - @ @ @ @ @ @|   ░░░ ░ ░░░░   |@ % @ @ @ @ @ @ #  (@@@__@@@@@@__@@@)  = =  @  @ ");
        System.out.println(" @ @ @ @ @ @ @ % @ @ @ @ @ @ @ @ % @ # % % % # % % # # % % # % # @ # @ # % * * + - @ % % @ @ @|     ░░░░░░  ░░░|@ % @ @ @ @ @ @ ##%(@@@@@@/  \\@@@@@)  = =  @  @ ");
        System.out.println(" @ @ @ @ @ @ @ @ @ @ % % @ % % % % % % % % @ % % @ # % % % # % # % # % # % * # = = @ @ % @ @ @|______░_░░__░_░░| @ @ @ @ @ @ % @ %% (@@@@@@@@@@@@@@) % = = % %% %");
        System.out.println(" @ @ @ @ @ @ @ @ % @ @ % % % % @ % % % % % @ % % % # % % # # % # % # # # # # # + = % % @ @ # % @ @ @ % @ % @ % % % # # # # # # * #   (@@@|=====/@@@) % = = % %# #");
        System.out.println(" @ @ @ @ @ = @ @ @ @ @ @ @ @ % @ @ @ % % % % % % % % % # % % % # % % % % % # % + * @ @ # # @ #@__@__@__@__@__@__@_@_@ % % % % # % # # %(@@@@@@@@@)% %  = =  %  # ");
        System.out.println(" @ @ @ = # # * % @ = # # @ @ @ @ @ @ @ @ @ % % @ % % % @ % % % % % % % % @ % % * % # # @ @ @ @*__@__%__@__@__@__@_@ @ @ @ % @ % % % % % (@@@@@@@)% % % % % @ @@ %");
        System.out.println(" @ @ * # # @ % # # % @ @ @ @ @ @ @ @ @ @ @ @ # @ @ @ @ @ @ @ @ @ @ % # % % # # # @ @ % @ @ @ @%__#__@__@__@__@__@ @ @ @ @ @ @ @  % % %:*@@@@%@@@@@@@@ @ @ @ @  @ ");
        System.out.println(" % # % % # % # % # # % % @ @ @ @ @ @ % % % % # % % # % % % % # # # # # # # # @ * # # + * # # %%__#__@__@__@__@__@ @ @ @ @ @ @ @ @ #  [-%++*+==@+.]#@@@@ @ @ @  @ ");
        System.out.println(" # # # % # % # # # = # # % # # # * # * * # * # # # # * * * * # * * * * * + * + # % % * # # # # # % % # # # @ @ % % + = * % % % % @- /..-++==****==-../ %@ @ @  @ ");
        System.out.println(" * % # * + % # * # # % @ * + + = + = = = = = = = = = = = + + + = + + + = = * + + + + + + + * * * * * * + * * * * * * # # # # # # # :/-==+++++++==++-:=./% % %  % ");
        System.out.println(" * # * * = % # + = + = + - - - - - : - : : : : : : : : : : : : : - : : : : : : : - : - : - - : - - - - - - - - - - - - - - - - -  /.===+++-==+=-+***++=+/ * *  * ");
        System.out.println(" - - = + * @ + = - - = = - : : : : : : : . : : : : : : . . . . . . . : . . . . . . . . . . . . : . . . . . . . . . . . . . . .    /-=+++*==+++==****@*/-- - -  = ");
        System.out.println(" = = = = + @ * - = - - - : - - : : : : : : : : : : : : : . : . : . . . . . . . . . . . . . . . . . . . . .               .       /%@%#+*+:=++++*#####/%@*=/- -- -");
        System.out.println(" * + = = = @ @ = = - - = - - - - - : : : : : : : : : : : : : : : : . . . . . . . . . . . . . . . . . . . . .       .   .           /@@/**+-+++++*###[@@#*/- .  . ");
        System.out.println(" = + + = + % % # * + = - + * = : : : : : : : : : : : : : . : . : . . . : . : . : . . . . . . . . . . . . . . . . . .              /%@#/**-=++++**###[@@@/  . .. .");
        System.out.println(" = = = = + + * + + = + = * # + + - - : - : : - : : : : : : : : : : . : : : : : . . : . . . . . . . . . . . . . . .                /@@/-++.+++++*###*[@@@+/  .  . ");
        System.out.println(" + + * * + + * * @ % + + + + * + = - - - - - - - : - - - : : : : : : : : : : : : : . : . . . . : . . . . . . . .                 /*@@/-+.-*++*++####[%@@#/       ");
        System.out.println(" + * * * * * # * * + + + + * * + + = - - - - - - - - - - - - : : - : - : : : : : : . : : : : . : . . : . . . . .                 /*@@/--:+*+**+**###[*@@%/       ");
        System.out.println(" * + + * + + + + + + + + + + + + + = = = = = - - = = - - = - = = = - - : - - : : - - : : : : : : : : . : : . .                   /*@%/- =+++****##%#=[@@%/       ");

    }

    /**
     * Muestra la imagen del piano
     */
    public static void ImagenPiano() {
        System.out.println("");
        System.out.println("......................................................................................    ..........    ...");
        System.out.println("......................................................................... ...:---=-...    ..........    ...");
        System.out.println("                .....    ...................    ......    .............-=+====+*%-....                     ");
        System.out.println("                .....    ...................    ......    .........:=========%+.......                     ");
        System.out.println("                .....    ...................    ......    ......:=========*@...... ...                     ");
        System.out.println(".............................................................:=+=======+@=.................................");
        System.out.println("..........................................................:+=+=======#%:...................................");
        System.out.println(".......    ............................................:+++====+==#%-.=*...................................");
        System.out.println(".......    .........................................-++++=+++==+@+.....%-..................................");
        System.out.println(".......    ....................................:=++++++++++=+%*........:@:.................................");
        System.out.println("...........................................-++++++++++++++#%-...........+%.......     .....    ............");
        System.out.println("......................................:=+++++++++++++++*@=...............%*......     .....    ............");
        System.out.println("...................................=*++++++++++++++++@*..................:@-.....     .....................");
        System.out.println("...............................:++++++++++++++++++#%:..............     ..=@.....         ..........      .");
        System.out.println("............................-*+++++++++++++++++*@=.................     ...%*....         ..........      .");
        System.out.println(".........................-+++++++++++++++++++%*............................:@=...                       ...");
        System.out.println("................. ....-+++++++++++++++++++##-...............................+@...                       ...");
        System.out.println("...................-+++++++++++++++++++*%=...................................%@..                       ...");
        System.out.println("  .....    ......=++++++++++++++++++*%+............... ................... ..:@*.                         .");
        System.out.println("  .....     ..:+++++++++++++++++++%#:.............:=*#%%%%%%%%%%%#*+-.........#@+                         .");
        System.out.println("......... ..=*+++++++++++++++++*@-.........+%@%%%%%%%%%%%%%%%%#######%%%%:.....@@-.........................");
        System.out.println("..........-*++++++++++++++++*@+......:*@%%%%%%%%%%%%%%%%%%%%%%#####%%%##%#.....*@@:........................");
        System.out.println("........:*+++++++++++++++*%#........#%%%%%%%%%%%%%%%%%%%%%%%%%%#####%%##%%::::..%@%........................");
        System.out.println(".......+*++++++++++++++#%-==+*#%@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%%%%#%#@%%%%@@#=++==+=-................");
        System.out.println("......***+++++++++++#@@@@@@@@@@@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#%%%#%%===*@@%===++**#%@#-.............");
        System.out.println(".....+*+++++*++++#@@@@%%%####******++#%%%%%%%%%%%%%%%%%%%%%%%########%%%%%%%%#%%#%%%%%%%%%%%+ .     .......");
        System.out.println(".....=*++*++++#@%#**+++++++++++##**++*@%%%%%%%%###*###%%#%%%%%%%%%###########%###%%%%#%###%#@..     .......");
        System.out.println(".... ..=**+*@#+++++++++++=+++++===+===#%%%%%%%%%%%%%%%%%%%%%%%%##################%@@@@%%%#%@**:     .......");
        System.out.println(".......*++%++%@%++===+++++===+=+*#%@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%###%%@@@@%%#####%###%%@@@@@**=.......   ");
        System.out.println(".......**+**+*+=+#%@@@@@@@@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@%##%%#######%@@@%%##%%%%##@@@@@@**+.....  ");
        System.out.println("      .++**+++*%@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%@@@@@@@%%%%%%%%%%%%%%%@@@%##*########*#*%%%%%@@@@@@@@@*#-..  ");
        System.out.println("      .+*+**+*+#%@@%%%%%%%%%%%%%%@@@@@@@@@%%%%%%%%%%%%%%@@@@%##*#####%###*######%%%@@@@@@@@%#*%@@@@@@%%.   ");
        System.out.println("      .+*+++*+**%%%%@@@@@@@@@@%%%%%%%%%%%+@@@@@%%%#*****##*=+=-=*#####%%@@@@%@@%@%@@@%=+-.....:::#@@@%%.   ");
        System.out.println(".......=++*++++*%%@%%%%%%%%%%%%%@@@@%%%@#*************#***#%@%@@@@@%#%@%%#%%%+:-::..:::::--=+*##%%##%%*....");
        System.out.println(".......=*++++++**@@@@%@@@@%%##%#####*#%###**#****##%@@@@@@@**@@%%+%**=.::...:::::-=**##%%#%%%%#%#%#%%%:....");
        System.out.println("........:*+++++**+%@@@%#%%%%%%%%#########%@@@@@@@@+*@@@#=@**::....:::::--=**##%%%#%%%%%%%###%%%@%*-:.......");
        System.out.println("..........**+***+*+##%#####%###%@@@@@@%%-#@@@#-%%*--.:...::::-:-=+#####%##%%%%###%#%%######%...............");
        System.out.println("..........:**********%#%#@@@%-#@#@%.#@*@=*.......:--:---=*%#%#%%%%%%%%%%%%%%%%%@@#=...%%%#%%...............");
        System.out.println("            =*********#%#**+.*#.:-......::-----=+#%%%%%%%%%%%%%%%%%%%%%%%#=:.....     %%%%%%...            ");
        System.out.println("           ...+********@%@%%@%-::-----=+*#%%%%%%%%%%%%%%%%%%%%%%%#=:.. ........ .     @%%#%#. .            ");
        System.out.println("  .............*+*+****@@@%%@@#*#%%%%%%%%%%%%%%%%%%%%%%%%@+-............. .......     @%%#%*........      .");
        System.out.println("  ............ .*+*+***@@@%%%%%%%%%%%%%%%%%%%%@@%#%%#.-@%@. ............    .....     @%%%%=........      .");
        System.out.println("  ..............-******@@@%%%%%%%%%%%%@@@#+=:....*%%#.+@%@.. ...........    .....     @%%%@:........      .");
        System.out.println(".................**++**@@@@%@#%%@%+-:... ...:....%%%#.+@%%............................@%%%@................");
        System.out.println(".................++%%#%*@@***@@%............:....@%%+.+@%#............................@%%%%................");
        System.out.println(".................=*#%%%%#..=#@@%............:....@%%+.#%%*............................@%%%#................");
        System.out.println("..    ...........-*#%%%%%..=*@@%............-....@%@=.#%@+.....                       @@%%*....         .. ");
        System.out.println("..    ...........:*#%%%%%..-*@@%............:....@@@-.#%@+.....                       @@%%+....         .. ");
        System.out.println("                ..*#%%%%#...+%#:...         .-. .@%@-.#@@-.....                       @@%%=                ");
        System.out.println("                ..*#%%%%#....=-....         .=...@@@++%@@##-...                       .*#=.                ");
        System.out.println("                ..*#%%%%#. ........         .=*##@@@##@@@%%%%-.                       .:#=.                ");
        System.out.println("..................**%%%%*...................:@%%%@@%%%%%@@@@@-.............................................");
        System.out.println("..................+*%%%%*...................:@%%%%@%@%@@@#+=::.......................... ..................");
        System.out.println("..................+*@%%@*.....................=@@@@@+:=-=--:.....................     ..............    ...");
        System.out.println("..................+*%%%@*.......................-:::::...........................     ..............    ...");
        System.out.println("................ .=*%%%@+................... ............... ....................     ..............    ...");
        System.out.println("                ..-*%@%@+.                                                                                 ");
        System.out.println("                ..:*%@%@+.                                                                                 ");
        System.out.println("...................*%@%@=..........    .....         .....              .........                         .");
        System.out.println("................ ..*%%@@+..........    .....         .....              .........                         .");
        System.out.println("...................+%@@@=..........    .....         .....              .........                         .");
        System.out.println("...................:++-............................................     ..............    .................");
        System.out.println(".....................:.............................................     ..............    .................");
    }

    /**
     * Muesta la imagen del Bate de Baseball
     */
    public static void ImagenBate() {

        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░▒▒▒▒▒▒▒▓▓▒░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▒");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓███▓");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓██▓░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓█▓░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒░▒▒▒▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░░░░▒▒▒▒▓▓▓▓▓▓█▓▓▓░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░░▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░░░▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░░░▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒▒▓▓▓███▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒▒▓▓▓█▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒▒▓▓▓█▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░▒▒▒▓▓▓█▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░▒▒▒▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░▒▒▓▓▓█▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓▓▓██▓▓▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓▓██▓▓▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▓▓▒▓▓█▓▓▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓▓▓█▓▓█▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░▒▒▓▓▓▓▓▓▓▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░███▓▓▓▓███▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░██▓▓█▓▓▓▓▓▓▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░▓▓▓██████▓▓▓▓▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░███▓▓▓▓▓██████▓███░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░███████████████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░█▓▓▓▓██▓▓▓▓█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░█▓▓▓▓▓████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░██████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
    }

    /**
     * La función se encarga de dibujar la imagen de las dos puertas, en las que hay
     * que ir a izquierda o derecha.
     */
    public static void ImagenPuertas() {

        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓████████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▒████████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓████████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓████████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓████████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓████████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓████████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓████████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓████████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓████████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓█████████████████████▒▒█████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓████████████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓███████████████████▒▒▒▒████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓██████████████████▒▒███▒▒██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓██████████████████▒▒█▒█▒███▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓██████████████████▒▒▓█▓▒▒██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓██████████████████▒▒▒▒████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓████████████████████▒█████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓██████████████████▒▒█████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓████████████████▒▒▒▒▒▒▒██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓█████████████████████████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓█████████████████▒▒▒▒▒███▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓▓████████████████████████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓▓█████████████████▒▒▒████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓▓████████████████████▒███▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓▓██████▒█████████████████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓█▓▓▓▓▓▓███████████████████████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓█▓▓▓▓▓▓███████████████████████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓█▓▓▓▓▓▓▓██████████████████████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓█▓▓▓▓▓▓▓██████████████████████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓█▓▓▓▓▓▓▓██████████████████████▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▓█▓▓▓▓▓▓▓██████████████████████▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▓█▓▓▓▓▓▓▓▓████████▓████████████▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▒▓█▓▓▓▓▓▓▓▓████████▓████████████▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓█▓▓▓▓▓▓▓▓▓████████████████████▓▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓█▓▓▓▓▓▓▓▓▓████████████████████▓▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓█▓▓▓▓▓▓▓▓▓▓███████████████████▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓█▓▓▓▓▓▓▓▓▓▓███████████████████▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓███████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓███████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓██████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓██████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓██████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓█████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓█████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓███████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓███████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("██████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓█▓▓▓███████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████████████████████████");
        System.out.println("██████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████");
        System.out.println("█████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████");
        System.out.println("██████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████████████████████████████");
        System.out.println("██████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████████████████████████████████████████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████████████████");
        System.out.println("███████████████████████████████████████████████▓▓▓████████████████████████████████████████████████████████████████████████████████████▓▓▓▓▓▓██████████████████████████████████████");
        System.out.println("██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");

    }

    
    /** La función muestra la imagen del tesoro que se esconde tras la puerta.
     * @return opcion, que nos lleva a la imagen en la que escapamos con el tesoro
     */
    public static int ImagenTesoro() {

        System.out.println("              ░                                                                █████░    ░                                         ");
        System.out.println("               ░                                                              █▒▒██▓▓█░ ░░                                         ");
        System.out.println("          ░░░░░                              ░░░░░░░                         ░█▒▓▒░░█▒▒█░░                            ░░░░░░░      ");
        System.out.println("         ░░░ ░░                            ░░░░░░  ░░                          █▒█░░░█▒▓█                            ░░ ░░░  ░░    ");
        System.out.println("       ░░░░░░░                            ░░      ░░░░▓██████████████▓▓░░░░░░░░▒█▓█░░░█▒▒█░░ ░                      ░░░░      ░    ");
        System.out.println("      ░░░░░                               ░░ ░░░░░ ░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓███████████░░░░░░ ░     ");
        System.out.println("    ░░░░░                                  ░░░ ░░░ ▒█▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓████████████████████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒██░ ░       ");
        System.out.println("    ░░ ░                                     ░░░  ▒█▒▒█▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▒▒▒▒▓▒█░        ");
        System.out.println("     ░                                           ▒█▒▒█▒▒▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒█▒▒▒▒█        ");
        System.out.println("                                                ▓█▒▒█▒▒▒▒▓▒██████████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▒▒█▓▒▒▒▒█░       ");
        System.out.println("                                               ▓█▒▒█▒▒▒▒▒▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓█▒▒▒▓▒▒▒▒▒██       ");
        System.out.println("                                              ░█▒▒█▒▒▒▒▒▒█▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▒▒█▒▒▒▒▒▒█▓▓      ");
        System.out.println("                                             ░█▒▒█▒▒▒▒▒▒█▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒█▒▒▒▒▒▒█▓▒█░     ");
        System.out.println("                                            ░█▒▒█▒▒▒▒▒▒█▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒█▓▒▒▒▒▒▓██▒▒█░    ");
        System.out.println("                                           ░█▒▒█▒▒▒▒▒▒██▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓█▒▒█▓▒▒▒▒▒▓█▓██▒█░    ");
        System.out.println("                                           ████▓▓▓▓██▓█▓▓▓▓▓▓▓█▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▒▒▒▒▒▒▒▒▒██▓▓▓▒▓▓▓▓▒▒▒█▒▒▒▒▒▒█▓▓██▒▒█    ");
        System.out.println("                                         ░█▓▓▓▓▓█▓▓▓▓▓█▓▓▓█▓▓▓█▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▓▒▒▒▒▒█▒▒▒▒██▓▓▓▓▓█▒▒█▓▒▒▒▒▒█▓▓▓██▒▒█    ");
        System.out.println("                                        ░█▓▓▓▓▓▓▓▓▓█▓█▓▓▓█▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▓██▒▒█▒▒▒▒▒▒▒▒▒██▓▓▓█▒▒█▒▒▒▒▒▒██▓▓█▓█▓▒█    ");
        System.out.println("                                       ░█▓▓▓▓▓▓▓▓▓█▓▓█▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒▒▒▒▒▒▒▒▒▒▒▒█▓▓█▒▒█▒▒▒▒▒▒▓█▓▓█▓▓█▓▒█    ");
        System.out.println("                                        ██▓▓▓█▓▓▓▓▓▓█▓▓█▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██▒▒▒▒▒█▒▓█▒▒█▓██▒█▒▒▒▒▒▒▒█▓▓▓▓▓██▒▒█    ");
        System.out.println("                                       █▒▒▓██▓▓▓▓▓▓██░░░░███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓███░░░░█▒░░░█▒▒▓█▒▒▒▒▒███▓▓█▒██▒▒▒▒▒▒█▓▓▓▓▓▓█▒▒▓▓    ");
        System.out.println("                                    ░ █▒░░░░░░░░█▒░░░░░█░▓█▒▒▒▒▒▒▓██████████░░░░▒░░░░░░██▒▒▒▒▒▒████▓▓▓▓▓█▒▓█▒▒▒▒▒▒██▓▓█▓▓█▒▒▓█░    ");
        System.out.println("        ░░░░░░░                ░░████░█░░░░░░░██░░░░░░█░▒▓▒▒▒▒████░░░░░██▓███░░░░░░█░░░░░░░█▒▒██▒▒█▓▓▓▓█▒▒█▒▒▒▒▒▒██▓▓█▓█▓▒▒█▓░░    ");
        System.out.println("      ░░░ ░  ░░░           ▒███░░▒█░░░░░░░█░█████▓░░░░░██▒▒▒▒██░░░░░░░░░▒░░░░░░░░░░░░░▒█▓░░█▓▓▓█▒▒██▒▒▒▒▒█▒▒▒▒▒▒▓█████▒▒▒██░░░░    ");
        System.out.println("     ░░ ░   ░░░░░    ░███░░░██████▒░░░░░░▓█░░░░░░░█▒░░░░░█▒▒▒▒▓░░░▓█▒░░░░░░░░░░░░░░▓░░░░▒███▓▒▒▒██▒▒███▒▓▓▒▒▒▒▒▒█▒▒▒▓▓██░░░░░      ");
        System.out.println("      ░  ░ ░░ ░░███░░░░██░░▒█░░░░░░░░█▒▒██░██░░░░░░█░░░█▒█▒▒▒▒▒▒███▒▒█▓▓███▒░░░▒▒░█░░░░░░░░░░▒█▒▒▒▒██▒▒▒█▒▒▓▒▒▓████░░░░░░░░        ");
        System.out.println("      ░░  ░░█▒░░░░██████░░█░░░░░░░░██▒▒▒▒▒▒▒▒░████████▒█▒▒▒▒▒▒▒▓▒▒▒▒█▒▒░░░░░██░░░░░░░░░░░░░░███▓▓▓▒▒█▓▒▒▓█   ░░    ░░ ░░░░         ");
        System.out.println("        ░░░░█▒▒▒▒███▒░░░░░░░░░░████████▓▒▒▒▒░░░░░░░░░░█▓░░░░░░░░░░██▒█▒▒░░░░░░██░░░░░░████████▓█▓▒▒▒▒▒▓▒▒█         ░ ░░            ");
        System.out.println("           ░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████▓░░░░░░░░░▓████████▒░░░░░░░░█░░█▒▒█▒▒█░░░░░░█████░░░░▓██▒▒▒▒▒▒▒▒▒▒█▓▓█         ░░              ");
        System.out.println("            █▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▓▓█▒▒██████▒░░░░░░░░▒████████▓▒▒▒▒▒████░░░░░███▒▒▒▒▒▓▒▒▒▒▒▒▒▒▓▒▒▓█                         ");
        System.out.println("            █▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▒░░░░░░░░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒█▒▒▒██░                         ");
        System.out.println("            ░█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░█▒▒▒▓██░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒███▓▓▓                          ");
        System.out.println("             ██▒▒▒██████▒▒▒▒▒▒▒▒▒▒█░█▒▒▓▓█░░░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████▒▒▒▓▓                          ");
        System.out.println("             ░█▒▒▒▒██▓▓▓▓█████████░░░█▓▒▒▒██░░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████▓▓██▓▒▒▒▓                          ");
        System.out.println("              █▒▒▒▒██▓▓▓▓▓▓▓▓▓▓█░░░░████████░░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒████▓▓▓▓▓▓██▓▒▒▒▒                          ");
        System.out.println("              █▒▒▒▒██▓▓▓▓▓▓▓▓▒█▒░░▒█▓▓▓▓▓▓██░███████▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▓█████▓▓▓▓▓▓▓▓▓██▓▒▒█░                          ");
        System.out.println("              █▒▒▒▒██▓▓▓▓▓█▒▒▒█░███▓▓▓▓▓▓▓█░███▓▓▓▓▓█████████▓▒▒▒▒▒▒▓▒▒▒▒▒█▒▒▒▒▒▓████▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▒▒█░                          ");
        System.out.println("              █▒▒▒▒██▓██▓█▒▒▒▒█▓▓▒▒▓▓█▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓██████████▒▒▒▒███▒█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓██▓▒▒█             █░            ");
        System.out.println("              ░█▒▒▒██▓▓▓█▒▒▒▒▒▒▒▒▓▓▒▒▒▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒▒▒▒▒▒▒▒█▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓██▒▒▒█░  █░       ██▒            ");
        System.out.println("              ░█▒▒▒██▓▓█▓▒▒▒▒▒▒▒▒▒▒▒▓▓███▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒▒▒▒▓▒▒▒█▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓██▓▒▒█   ██░    ░█▒▒█░     ██    ");
        System.out.println("               █▒▒▒███▓█▒▒▒▒▒▓███▒▒▒▒▒▓▓▓▓▒██▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒▒▒▒▓▒▒▒█▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓██▓▒▓█░  ▓▒█░   █▒▒▒▒█   ░██     ");
        System.out.println("              ░█▒▒▒▒██▓█▒▒▒▒▒▒███▒▒▒▒▒▒▒▒▒▒█▓▓▓▓▓▓▓▓▒▓▓███▓▓▓▓▓▓▓▓▓▓▓▓█▒▒▒▒▒▓▒▒▒█▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▒▓█   ░▒▒█░ ░▓▒▒▒▒█░ ░█▒█░    ");
        System.out.println("           ░░ ░█▒▒▒▒██▓██▒▒▓███▒▒▒▒▒▒▒▓▓▒▒█▓▓▓▒▒▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓▓▓█▒▒▒▒▒▓▒▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓██▓██▒▒▓█   ░▒▒▒█░█▒▓▒▒▒▒▓░█░▒█░    ");
        System.out.println("          ░▒██████▓▒██▓▓█▓▒▓██▒▒▒▒▒▒▒▓▓▒▓█▓▓▒▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒▒▒▒█▒▒▒█▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓██▓▒▓███░░▒▒▒▒█▒▒▒▒▒░▒█▒▒▒█▒░    ");
        System.out.println("        ░█░░░░░░░░░░░██▓▓█▓▒▒▒▒▒▒▒▒▓█▓▒██▓▓▓▓▓▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒▒▒▒█▒▒▒█▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓██▒▒▓█▒▒▒█▓▒▒▒▒▒▒▒▒▒▒▒░░░▒█░░    ");
        System.out.println("      ░░░▓░░██▒░░░░█░░█▓▓▓▓███▒▒▒██▓██▓▓▓▓▓▓▓▓▓█▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒▒▒▒█▒▒▒██▓▓▓▓▓█▓▓▓▓▓█████████▒█▒█▒▒▒█▒▒▒▒▒▒▒▒▒▒░░░▒▓░░    ");
        System.out.println("     ░░ ░░░███▒░░░░░██░██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▒▒▓▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒▒▒▒█▒▒▓█▓▓▓█▓▓▓▓██▒▒▒▒▒▒▒▒▒▒▒███▒█▒▒▒█▒▒▒▒▒▒░▒███░░░██░   ");
        System.out.println("   ░░ ░░░██▒░░░░░░░░░░█░█▒▒▒▒▒██████▓▓▓▓▓▓▓▓▓▒▓▒▓▓███▒▒▒▒▒▒█████▓▓▓▓▓▓█▓▒▒▒▒█▒▒▒██▓▓▓▓▓▓█▒▒▒▒▒▒▒▒▒█▒▒█▒▒██▒▒█▒▒███▓▒▒█░░░░░░▓█░█░  ");
        System.out.println("    ░░█░░░░░███░░░░░░░▒█▓▒██▒▒▒▒▒▒▒▒▒██████▓▓▓▓▓██▒▒▒▒▒█▒▒▒▒▒▒█▓▓▓▓▓▓▓██▒▒▒▒█▒▓▓█▓▓▓▓▓▓██▒▒▒▒▒▒▒▒▒██▒▒█▒████▒▒▒█▒▒▒▒▒████▓▒▒███▒▒▒ ");
        System.out.println("      █░▓██░░░░░░░░░█▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒████▒▒▒█▒▒▒▒▒▒▒█▒██▓▓▓▓▓▓▓▓█▒▒▒▒█▒▒▒█▓▓▓████▒██████▒▒▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░ ");
        System.out.println("      ▒█████▓▒▒████▒▒████▒▒▒███████░░░░░░░▓█▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒█▓▓▓▓▓▓▓▓▓█▒▒▒▒█▒▒▒█████▒▒▓██████▓█████▒▒█▒▒▒▒▒▒█▒▒█▒▒▒██████▒▒▒▒▒░   ");
        System.out.println("     ░▒▒▒▒▒▒▒█████████████████▒░░░░░░░░░░░░░███▒▒▒▒█▓▒▒▒▒▒▒▒█████████▓▓█░▒▒▒█▒▒▒██▒▒▒▒▒█▒▒████▓▒▒▒▒▒█████▒▒▒▒▒██▒▒▒▒█░█░░░░░░██▒░  ");
        System.out.println("    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████▒▒▒▒▒█░░░░▓██░░░░░░░█▒▒▒██▒▒▒█▒▒▒▒▒▒█▒▒▒▒▒▒▒▒███▒▒▒▒▒▒▒▒█▒▒▒▒▓████▓▒▓█████▓▒▒▒▒▒▒▒███▒▒██▒▒▒▒██░░░█▒░░░░█░ ");
        System.out.println("  ░██░░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓██████▒▒▒▒▒▒▒▒▓██▒▒▒▒▒▒██▓▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▓▓██▓▒▒▒▒▒▒▓▒▒█▒▓██████▒▒▒█▒▒▒█▒█▓▒▒▒▒▒▒▒██▒░░░░█░ ");
        System.out.println(" ░█░░░░░░░░░░░░░░█▒▒▒▒▒▒▒▒▒▒▒░▒▒▒███████▒▒▒▒▓██████▒▒██▓▒▒█▒▒▒▓██████▒▒▒█▒▒▒▒▒▒▒▓█▒▒▒██▓▒▒▒▓███████▓▓█████▒▒▒▒▒█▓▒▒▒▒▒▒▒▒▒▒█████▒  ");
        System.out.println("  ██░░░░░░░░░░░░██▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒████████████████▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▓██▒▒█▒▓███▓▒▒▓█████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓███████▒▒▒▒    ");
        System.out.println("   ░▓████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████▒▒▒▓▒▒▒▒████░░░░░▓██▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░     ");
        System.out.println("      ░▒▒▒▒▒▒▒░        ▒▒▒▒░       ░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██░░░░░░░░░░░░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░         ");
        System.out.println("                                      ░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░▓█████▒░░░░░█░░▓███▓▒▒▒▒▒                 ");

        opcion=8;
        return opcion;

    }

    /**
     * La función muestra la imagen saliendo de la mansión con éxito con el tesoro.
     */
    public static void ImagenExito(){

        System.out.println("█████▓▓▓█▓▓▓▓░░▒▒█▓▓▓▓█▓▓▓▓▓▒▓▓█▓██▓▓▓▓███████████████▓▓███████████▓████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("█████▓▓▓█▓▓▓▒▒▓░▒▒▓█▓▓▓▓█▓▓▓▓▓▒▓▓███▓▓█▓▓███████████████▓████████████▓██████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("█████▓▓▓█▓▓▓▓░░░▓░░▒▓█▓▓▓▓█▓▓▓█▒▒▓▓███▓▓▓▓███████████████▓████████████▓█████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("█████▓▓▓█▓▓▓▒░░░░░▓░▒▒▓█▓▓▓▓█▓▓▓█▒▓▓███▓▓█▓▓██████████████▓████████████▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("█████▓▓▓█▓▓▓▒ ░░░░░░▓░░▒▒█▓▓▓█▓▓▓██▒▓████▓▓▓▓██████████████▓████████████▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("█████▓▓▓█▓▓▓▒   ░░░░░░▓░▒▒▓█▓▓▓█▓▓▓▓█▒████▓▓▓▓██████████████▓▓███████████▓███████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("█████▓▓▓█▓▓▓▒      ░░░░░▓░░░▓█████▒▒░████████▓▓██████████████▓▓███████████▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("█████▓▓▓█▓▓▓▒        ░░░▒▓░░▓█▓▓▒▒▓█░█████████████████████████▓▓█████████▓█▓█████▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("█████▓▓▓█▓▓▓▒          ░░▓▒ ▓▓▓▒░▒▓▓▓██▓▓███████████████████████▓█████████▓█▓█████▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("█████▓▓▓█▓▓▓▒          ░░▓▒ ▓▓▓▒░▒▓▒▒█▓██▓█████████████████████████▓███▓▓▓▓▒█▓████▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓");
        System.out.println("█████▓▓▓█▓▓▓▒ ░░▒      ░░▓▒ ▓▓▓░░░▒▓▒▒▒▒▓███████████████████████░▓▓█▓██████▓▓▒▓███▓▓▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒");
        System.out.println("█████▓▓▓█▓▓▒▒ ░░       ░░▓▒ ▒▓▓░░░ ░░░▒░▒░░░░░░░██▓█▒░▒████████░▒▒▒▓▒█▓▓███▓▓█▒▒███▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒");
        System.out.println("█████▓▓▓█▓▓▒▒░░░░░░░░░░ ░▓▒ ▒░  ░░░▒▒▓▒░▓░░░░░░▓░▒░░▒▓█▒▒█████░▒░░█▒▒▒██████▓█▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("█████▓▓▓█▓▓▒▒▒▓▒▒░░░▓▓░░░▒░░░░▒▒▒▓▒▓░▒▓░▒▒▒░▓░░░░▒░░▓▓██▒░▓████░▓▓████████████▓▒▓▓██▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("█████▓▓▓█▓▓▒▓▒▒▒▓▓▓▓▓▒░░░▒▒▓▒▒▒▓▓▓▓▓▓▓▓▒▒▓▓▒▓░░▓░░░▒▓▓▓███▓░█▓█▒░▓██░ ▒█▒▒▒▒▒▓▒█▓▒██▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("█████▓▓▓█▓▓▒▒░▒▒░▒░▓▒▒▓▒▒▒▓▓▓▓▓▓▓▒▓██████▓▒▓▓▓▒░░░▒▒▓▓▓█▓▒▓▓▒███░░█  ░▓▒█▓▓▒▒▓███▓▒██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("█████▓▓▓█▓▓▒▒░░░▒▒▒▒▒░▒░░▓▒░▓▓▓▓▓█████████████░░░▒▒▓▓░░░░▒▒█▒▒▒░▓░   ░▒▓▒░▒█▓█████▓▒█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("█████▓▓▓█▓▓▓▒ ░░░░░ ░░▒░░▓▒ ▓█▓▓▓██▒▒██▓████ ░░░░▒▓▓▓▓▓▓▓▓█ ░   ░  ░░▒▓▒▒░▒████████▓▒█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("██████▓▓█▓▓▓▒  ░░      ░░▓▒ ▓▓▓▒▒▒█▒▒▓▓▓▓▓█▒░░░░▒▓░░░░░▒██  ▒  ░▒░░░▒▒▒▒▓▒░█████████▓▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("███████▓█▓▓▓▒ ░░▒       ░▓▒ ▒▓▓▒░▒▓▒▒▓▓▓▒▓▒░░░░▒▓░░░▒▓▓██░░ ░▒░░ ░░░░░▒▓▓████████████▓▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("███████▓█▓▓▓▒           ░▓▒ ▒▓▓░░░▒░░▓▓▓▓ ░░░░▓▓░░░▓▓███░ ▓██▒░░▒▓▓▒▒░▒████████████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒░");
        System.out.println("███████▓█▓▓▓▒           ░▓▒ ▒▓▓░░░▒░░▓█ ░░░░▒▒▓▓░▒▓▓██▓▓ ░▒▓▒░░▒▒▓█▓▒▒██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒░");
        System.out.println("███████▓█▓▓▓▓           ░▓▒ ▒▓▓░░░▒░ ░▒ ░░░▒▓▓▓░▓▓███▓▒▒░░▒▓▓▒▒▓███▓▓░▓███████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░░░░");
        System.out.println("███████▓██▓▓▓           ░▓▒ ▒▓▓░░░░░░░▓░░▒░▓▓▓▒▓████▓▓░▒░░▒▒░▒██▓▓█▓█▓▒███████████▓██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░");
        System.out.println("██████▓▓█▓▓▓▒▒░         ░▓▒ ▒▒▓░░░░░█▓░░░▓▒▓▓▓▒████▓▓█▒ ░▓▒ ░█▓▓██████▓▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░░░░░░░▒▓▒░░░");
        System.out.println("██████▓▓█▓▓▓▒▓▒▓▓▒▒░░   ░▓▒ ▒ ░░░░▒░░░░▒▓▓▓▓▓▓████▓▓▓▒░░▒▓▓██▒▓███████▓███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░▒▒▒▓ ░░");
        System.out.println("██████▓▓█▓▓▓▓▒▒▒░▒▓▒▒▓▒▒▒▓▒░░░░░▒▒▒▒▓▓▓▓▓▓▓▓▓███████████████▒▓█▓██████▓██████████▓▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░▒▒▒▓▓█  ");
        System.out.println("███████▓█▓▓▓▓      ░▓▒░▓░░░░░░░░░▒▓▓▓▓▓▓▓▓▓████▓█▓██▓▓▓███░▓▓████████████████████▓▒░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░ ▒▒▓▓▓▓  ");
        System.out.println("███████▓█▓▓▓▓        ░░░░░░▒▒░▒▒▒▒▒▒▓▓▓▓████████████████▓▒██████████▓▓███████████▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░    ▒▓▓▓▓▓▒ ");
        System.out.println("███████▓█▓▓▓▓      ▓████████▓▓▓▓██████████▓▓██████████▓██████████▓▓██▓███████████▓▒░░░░░░░░░░░░░░░░░░░░░░░  ░   ▒▓▓▒▓▓█▓▒");
        System.out.println("███████▓█▓▓▓▓    ░███████▓░░▒▓██████████████████████████▓██████▓▓▓▓██▓█████████▓█▒▒░░░░░░░           ░░░░░░░▒▓█ ▒▓▓▒▓█▓▒░");
        System.out.println("███████▓██▓▓▓   ▒██▓███░░░░░░▒▒▓▓███████████████████▓█▓████████▓▓▓█▓▓▒█████▓█████▒▒ ░ ░░             ░░░░░░░▒▓█ ▒▓▓▒▓█▓▓ ");
        System.out.println("███████▓██▓▓▓  ░▓▓▓▓▓█ ░░░░▒▒▒▓▓▓██████████████████▓█▓█████████▓▓▒█▓▓▓████████▓▓█▒▒   ░░░        ░░░░░░░░░▒▒▓▓█ ▒▓▓▒▓▓▓▓ ");
        System.out.println("███████▓██▓▓▓  ▒▒▒▓▓▓ ░░░░▒▒▓▓▓████████████▓▓▓▓▓██▓██▓█████████▒▓▒▓█▓▒███████████▓▒    ░░         ░░░░░░▒▒▓▒██▓▒▒▒▒▒▓▓▒▓▓");
        System.out.println("███████▓██▓▓▓  ▒▒▒▒▓ ░░░▒▒▓▓▓███████████▓▓▓▒▒▓▓▓▓███▓██████████▒▓▒▓█▓▒█████████▓▓▒▒               ░░░░▒▒▒▒▓▓▓████▓▓▓▓▓▒▓▒");
        System.out.println("███████▓██▓▓▓░ ▓▒▒▒░░░░▒▒▓▓▓███████████▓▒▓░░▒▒▓▓▓▒█████████████▒▓▒░▓█▒███████████▓▒    ▒▒▒▒▒▒     ░░░░▓▒▒▓▓▒▒███████▓▓▓▒▒");
        System.out.println("███████▓██▓▓▓░ ▒▓▒░░░░▒▒▓▓▓████████████▒▒▒░░░▒▓▓▓▒█████████████▓▓░░▓█▒███████████▓▒   ░▓▓▓▓▓▓▒▒    ░░▓▒▓▓▓▒▓▒█████████▓▓▓");
        System.out.println("███████▓██▓▓▓░  ░░░░▒▒▓▓▓████████▓▓▓███▒▒▒░░▒▒▓▓▓▒█████████████▓▓▒▒▒▓▒███████████▓▓▒░  ░▒▒▓▓▓▓   ░ ░▓▓▒▓▓▓▒▒▓▒█████████▓▓");
        System.out.println("███████▓██▓▓▓░░░░░░▒▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓░░░░░▒▒▓▓▓▓█████████████▓▓  ░▒▓███████████▓▓▒▒▒ ░▒▒▓▓▓▓▒▓▓▓▒▓▓▒▒▒▓▓▒▒▒▓███████████");
        System.out.println("███████▓██▓▓▓▓▒▒▒▒▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓░░░░▒▓▓▓▒███████████████▓▓▒▒░▒████████▓▓█▒▓▓▒▒ ░▒▓▓▓▓▓▒▒▒▒▓▒▓█▒▓▓▒▓▒▒▓▒████████▓▓");
        System.out.println("███████▓██▓▓▓▒▒▒▓▓▓▓██▓█████▓▓▓▓▓▓▓▓▓▓▒░░░░░▓▓▓▒███████████████▓░▒▒▓▒▓████████▓▓▓▒▓▓▓▒▒▒▒▓▒▒▒▒▒▒▒▒▒██▒▓▓▓▒▒▒▒▓▓▒▓▓███████");
        System.out.println("███████▓██▓▓▓▒▒▓▓██████████▓▓▓▓▓▓▓▓▓░░▒░▒▓▓▓▓█▓██████████████▓▓░░▒▒▓▓▒████████▓▓█▒▓▓▓▓▒▒▓▓▒▒▒▓▒▒▒▓▓▓▒▒▒▒▒▒▓▓▓▓█████████▓▓");
        System.out.println("███████▓██▓▓▓▓▓▓███▓███████▒▓▒▓▓▓▓▒▒░░▓▒▓▓███████████████████▓▓▒▒▒▓░██████████▓▓█▓▓▓▓▒▒█▓▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓██████▓");
        System.out.println("███████▓█▓▓▓▓▓▓███░░░▒█▓▓█▓░▒██▓▓▒░░░▓░▓███████▓█████████████▓█▓▓▒▒█▓█████████▓▓▓▒▓▓▒░█▓▒▒▓▓▓▒▒▒▒█▓▓▒▓▓▓█▓▓▒▓▓▓▓▒▒██████▓");
        System.out.println("███████▓█▓▓▓▓▓███░   ░ ▒▓▓▓ ▒▓▓░▒░░▒▓▒█████▓▓▓█████████▓ ▓▒▒░▒░░▒▓▓█▒▓███████▓▓▓▓▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒█▓▓▓▒▓▒▓▒▒▓▒▒▒░▓▓▒██████▓");
        System.out.println("███████▓█▓▓▓▒▓██▓ ░  ░░░░▓▓ ▒▓▒▒░▓▓██████▓▓▓▒█████████ ▒▒░░░░░▒░░▒▒░░▒▒░▒██▓▒█▓▓▓▒▓▓▓▓▓▒▒▒▒▓▒▒▒█▓▓▓▒▒▓░▓░░░░░▓ ▒▓▒████▓▓▓");
        System.out.println("█████████▓▓▓▒▓█▒   ░░ ░░░▓▒ ▒▓░░▓▓▓▓███▓▓▓▓███████████ ░▒▒░░░░░▒▓▒░▒▒░░██████▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓██▓█▓▒▓▒▓░ ░  ▓░▓▓▒██▓▓▓▓▓");
        System.out.println("██████████▓▓▓▓░     ░░░░░▓▒▒░▒▒▓▓█████▓▒▒████████████░█▒▒▓▒▒▒░░▒▒▒▒▒▓▒░▓██████▓█▓▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓░▓░░▒░░█░▒▓▒█▓▓▓▓▓▓");
        System.out.println("██████████▓▓▓▓    ░░░░░░░▓▒▒▓▒▓████▓▒▓█▓▓▒███████████░▒░░▒▓▓▒▓▒▓▓▓▓▓▓▒▓███████▓██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▓▓▓▓▓▒▓▒▓▒▓▒█▓▓▓▒▓▒");
        System.out.println("██████████▓▓▓▓ ░  ░  ░▒▓░▓▓▒█████▓▒░░▒▓▓▓▓████████████░▓█▓░▒▒▒▓▒▓█▓▓█▒█████░▓███▓▓▓▒▒▒▒▒▒▒▓▒▒░▒▒▓▒▒▓██▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▒▒▒▒");
        System.out.println("██████████▓▓▓▓ ░▓▓▓▓▓▓▓▒░▒██████░░▒░▒▒▓▓▓▒████████████▒▓▓░▒▓▓▒██▒▒▓▒░▒▓▓▓█▓██▓▒██▒▓▒▒▒▒▒▒▒▓██▓█▓▒▒▒▒▒▒▓██▓██▓██▒▒▒▓▓▓▓▒▒▒");
        System.out.println("██████████▓▓▓▓▓▓▓▓▓░░░▓█▒▓████▒░░▓█▓▒▒█▓▓▓█████████████░███████▓▓▓▒▓██▒██▓▓▒█████▒▓▒▒▒▒▒▒▒▓██▓█▓▒▒▒▒▒▓▓██▒██▓██▒▒▒▓▓▒▒▒▒▒");
        System.out.println("██████████▓▓▓▓░░░░░░░░▒▓▓████▓▓▓▒▒▒▒█▓▓▓▓▓▓█████████████▒▓█▓█▓▓▓▓████▓▓█▓████████▒▓▒▒▒▒▒▒▒▓▓▓▒▒▓▒▒▒▒▒▓▓██▒██▓██▒▒▒▓▓▓▒▒▒▒");
        System.out.println("██████████▓▓▓▓░░░░░░░▒▓▓▒████▓▒▒▒▓▒▒▒▒▒▒▒▒▒██████████████▓░▒▓▓▓▓▓█████▓▓▓██████▓█▒▓▒▒▒▒▒▒▒▓██▓▓▓▒▒▒▒▒▓▓██▒▓▓▒▓▓▒▒▒▓▓▓█▓██");
        System.out.println("██████████▓▓▓▓▒▒▓▒░░▒▓██▓▓██▓▓▒▒▒▒▒▒▒▒▒▒█▓████████████████████▓▓▒▓█████▓█████▓███▒▓▒▒▒▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▓▓██▓█▓▓▓▓▒▒▒▓▓█████");
        System.out.println("██████████▓▓▓▓░▒▓▓▓▓▓▓██▓▒▓█▓█▒▒▒▒▒▒▓██████████████████████████████▒▒▒█▓██▓████▓█▒▓█░░▒▒░▒▒▒▒▓▓▓▓▒▒▒▒▓▓█▓▓▓▓▓▓▓▒▒▒███████");
        System.out.println("██████████▓▓▓▓▓▓▓▓▓▓▓▒▓███▓█▓█▒▒▒██▓███████████████████████████████████▓▓████▓▓▓█▒▓██░▒▒▒░▒▒▓▒▓▓▓▒▒▒▒▓▓▓▓▓▓▓▒▒▓▒▒▒███████");
        System.out.println("██████████▓▓▓▓▓█▓░░░░▒▒▓███████████████████████████████████████████████████▓█▓▓▓█▓████▒░░▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▓▒▒▒▒▓███████");
        System.out.println("██████████▓▓▓▓▒░░▒▒▒▒▒▒▒▒▓█████████████████████████████████████████████████▓█▓▓▓█▒░▒▒▓░░░░░░░░▒▒▒▒▒▒▒▒▒▓▓▒▓▓▒▓▒▒▒▓▓██████");
        System.out.println("██████████▓▓▓▓▒▒▒▒▒▒▒▒▒████████████████████████████████████████████████████▓▓▓▓▓█▓▓▓██░░░░░░▒▒▒▒▒▒▒▒▓▒▓▓▓▓▓▓▒▒▒▒▒▓███████");
        System.out.println("██████████▓█▓▒▒▒▒▒▒▒███████████████████████████████████████████████████████▓▓▓▓▓█▓▓██░░░░░▓▒▒░▓▓▒▒▒▒▒▓▒▓██▓█████▓██████▓█");
        System.out.println("███▓▓▓▓▓▓▓▒▒▒▓▒▓▒████████████████████████████████████████████████████████▓█▓▓▓▓▓█▒▓█▓░▒▒░░▓▒▒░▒▒░▓▒▒▒▓▒███▓██████████████");
        System.out.println("██▓▓▓▒▒▓▒▒▓▓▒▓█████████████████████████████████████████████████████████▓█▓█▓█▓▓▓█▒▓█▓░▒▒▒▒▓▒▒░▒▒▓█▓█▓▓▒▓█████████████████");
        System.out.println("▒████▓▓▓▓▒██████████████████████████████████████████████████████████████▓▓█▓█▓▓▓█▒▓█▓▒▒▒▒▒▓▒▒░░░█▓███████████▓███████████");
        System.out.println("▓█▓▒███████████████████████████████████████████████████████████████████▓▓▓█▓█▓▓▓█▒▓█▓▒▒▒▒▒▓▒▒░▒▒▒████████████████████████");
        System.out.println("████████████████████████████████████████████████████████████████████████▓▓▓▓█▓▓▓█▒▓█▓▒▓▒▒▓███▓▒▒█████████████████████████");

    }

    /**
     * Función que muestra el Game Over con el payaso
     */
    public static void ImagenPayasoGO(){

        System.out.println("▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓");
        System.out.println("▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▓▓");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░▒▒▒░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░▒██████▓▓░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░████▒░░▒█░░░░░░▒▓▓▒░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░███░░░▒░░░░░░░████▓░░░░▒▒░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░▒███░░▒████░░░██████░░░▓██▓░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░████▒░▒██░░▒██▒░███░░▒███▓░░░▒██▓░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░████████░▒████▒███░░█████░░████░░▒█████▓▒░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░▒▒▒█░██████████░▓█████▒████▓░░███▒▓██▓░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░███░██▒░███████░░▒██▓▒░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░▒▒░░░░░░░░░░░░░░░▒▒▓██░░██▓░███░░███████░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓▒▒░░░▒▒▒▒▒▒▒▒▒░▒▒▒▓▓▒▓▒░▒▒▒▒▒▒▒░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒░░░░░░░█████████░░░░░░░░░░░░░░░░░░░░░▒██░░███▓░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓▒▒░░░▒▒▒▒▒▒▒▒▒░▒▓▓▓███████▓▒▒▒░░▒▒▒▒▒▒▒▒▒░░░░░░░▒▒▒▒▒▒░░░░░░░████▒░▒████░░▒██░░░░░░░░░░░░░░░░▒▒░░███████▓░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░█▒▒░░░▒▒░▒░▒▒▒▒▒░████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░▒░░░░░░███▓░░░░░███▓░▒██░░░░▒██░░░░░░░░░░░░░░░▒▓███░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓▒▒░░░▒▒░▒▒▒▒▒▒▒▒▒██▓▒▒░▒▓██▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░▒░░░░░░███▒░░░░░███▒░▒██░░░▓██░░▒████▒░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓▒▒░▒▒▒░░▒░░░▒▒░░░▓█▒░░░░░▒███▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░▒▒░░░░░████▓░░░████░░▒██▒░███░░░████████░░▒▒░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓▒▒▒▒▒▒░░▒░░░▒▒░▒▒▒░░▒░░░░██████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░▒░░░░░░██████████░░░▒██▓███░░░▓██▓░░░░░░▒█████▓░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒░▒░▓▒▒▒▒▒░░░░░░░░▒▒░▒▓▒▒▒░▒░▒████▓▒▒▒▒▓▓▓▓▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░▒░░░░░░░█████▓░░░░░▒█████░░░░███████▒░░███▓████░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒░▓▒▒▒▒▒░░░░░▒▒░░░░░░░░░░░░▒██▓█▓▓▓▒░░░▒████▓▓▒▒░░░▒▒▒▒▓▒▒░░░░░░░▒░░░░░░░░░░░░░░░░░▒████░░░░▓███░░▒▒░░▓██▓░▒███░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒░░░░░▒▒░▓▒▒▒▒░░░░░░░░░░░░░░░░░░░░▒▓██▓▓▓▓▓█▓▓▒▓▓██▓░░░░░░░░░░░█▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░▓██░░░░░██████▒░░░████████▒░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒░░░░░▒░░▒▒░░░░░░░░░░░░░░░░░░░░░▒█▓██████████████░░░░▒▒▒░░░░░░█▓▓░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░░▒████████░▓██▓███▒░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒░▒░░░░░░░░░░░░░░░░░░░░▒▒▒░░░░░░░░▒▓███▓███████████░▒░▒▒░▒▒░░░░░▓██░░░░░░░░░░░░░▒▒▒▒░░░░░░░░░░░░░░░░░░░░▒▓█▒▒███▒▓██▓░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒░░░░░▒░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒░░░░░░▒▒▓▓█████████████░░▒▓▒▒░▓▒░░▒▒██▓░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░░░░░░░░░░░░░░░░░░▒▒▒▒███░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒░▒░░▒░░░░░░░░▓░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▓▓███████████▒░░░▒▓▓▒▒░██░░░█▒░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░░░░░░░░░░░░░░░░▒▒▒▒▒▒░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒░░░░▒▒▓▒▒▒░░░▒░░░░░░░░░░░░░░▒░░░░░░░░░░░▒▒▓▓██████████▓░░░░░░░░▒███▓▒▒▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒░░░░░░░▒▒░░▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒░░░░░░▒▒█▓█▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▓▓████████▓▓▒▓█▒▒░░░░████████▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒");
        System.out.println("▒░░░░░░░░░▓▒░▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░▒▓██████▓▒▓▓▒█████▒▓████████░░░░░░░░░░░░░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒");
        System.out.println("▒░░░░░░░░▓▒▒▓█▒░░░░░░░▒░░░░░░░░░░░░░░░░▒▒░░░▓░░░░░▓█████▓▓▒▓▓██▓░░▒▓████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒");
        System.out.println("░░░░░░░██▒▒▒░▒▒▓▒▓░░░░▒▒▒░░░░░░░░░░░░░░░░▒░▒▓░░░░░▒░░▒▓██▓▓▓▒█▓███████▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒");
        System.out.println("░░░░░░░░██▓░░░░▒▓▓▒░▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░▒▒▓▒██░░░░░░░░▓█▓▒▓▒█▒█▓░░░▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒");
        System.out.println("░░░░░░░░░░░░░░░▒██▓████▒▒▒▒▒▒░░░░░░░░░░░░░░▒▓▒▒█░░░░░░░░░░▒███▓█▒█▓░░▒░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▒░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░▓█████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▓▒▒▒▓██░░░░░░▒░▒▓█████▓▒▓░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒░░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░▒█████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▓▓▒▓▓█░░░░░░░░░░▒░▒▒░▒░░░░░░░▒░▒▒▒▒▒▒▒▒▒▒▓██▓▓▓█▓▓▓▒▒▒▒▒░░░░░░░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░▒▒▓██████▒▒▓▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▓█▒▒░███░░░░░░░░░░░░░░░░░░░░▒▒▓▒▒▒███▓▓▓▓█████▓█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░▒▓████████▓▓█▓▓▒▒▒▒▒▒▒▒▒▒▒▓██▒▓▓█░░░░░░░░░░░░░░░░░░░░▓▓██████████▓█▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░▒▓█████████▓██▓▓▓█▓▓▓▓▓▒▒▓██▓▒▓▓██▒░▓██░░░░░▒░░░▒█▒▓███████▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░▒▓█████▓████████████▓▒▒▒▓████▒▓█▒████▒▓██░▒▓▓█▓▓▓██▓▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░▓░░░░░░░░░░░░░░▒▒▒▒▓▓▓▓▓▓███████▓▒▒▓█▓▓▓█████▒▒▒█▓▒███▒▓▓█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░▒▒▒▓▓▓█▓▓▓▒▒▓█▒▒▒▓▓▒▒▓▓▓▓██░░▓▓▓█▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░▒▒▒▒░░▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▓▓▓▓▒▒▒█▒░░▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░▒░░░░▒▒▒▒░░▒░░░░░░░░░░░░░░░░░░░░▒▒▒██▓▓▓▓█░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░░░░░░░▒▒▒░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░▒░▒▓██▒▒░░░░░░░░░░░░░░░░░░▒▒▓█▓▓▓▓█▒░░░▒▒▒▒▒▒░▒▒▒░▒▒▒▒░░░░░▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▒▒▒░▒▒▒▓▓▓█░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░▒░░▒▒▒▒▒░░░░░░░░░░░░░░░░░░▒▒█▓▒▒▒▒█░▓░▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░▓███▓▓▓▓▓▓████▒▓░░░░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░▒▒▒▒▒▒░░░░░░░░░░▒▒▒░▓▓▒▒▒░░░░░░░░░░░▒▒▓▓▒▒▒▒▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░▒▒▓▓██████████▒▓▒░░░░░░░░░░░▒▒▒▒░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒░░░░░░░░▒▓▓▓▒▒▒▒▒██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░▒▒▒▒▓▓█████████░█░░░░░░░░░░░▒▓▓▓▓▒▒▒░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░▒▒▒▒▓▒░░░░░░▒▒▒▒▒░░░░░░░░▒▒▒░░░▒▒▒▒░░░░░▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▓▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓░░░░░░▒▒▒▓▒▓██████████▒█░░░░░░░░░░░▒▓▓▓██▓▓▒▒░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░▒▒▒░░░░░░░░░░▒▒▒▒░░░░░░░░░░░░░░▒▒▒▒░░▒▓█▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓██▓▓████▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓░░░▒▒▒▒░▒▒▓█████████▒█░░░░░░░░░░▒▒▓▓▓▓████▓▓▒░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░▒▓▓▓▒░░░░░░░░░░▒▒▓▓▓█▓██▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▓▓▓▓▓▓▓████▓█████▓█▓▓▓▒▒▒▒▒▓▒▒▒█░░▒▒▒░░░▓█▓███████▒▓▒░░░░░░░░░░▒▒▓▓▓▓▓░░▒▓▓▓▓▒░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░▓███▒▒▒▒▒▒▒░▒▓█▓▓▓▓███▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▓▓▓███▓▓▓███████████████▓▓▓▓▓▓▓▓▓▓█░░▒█▒▒▒▓▓███████▓▒▓░░░░░░░░░░▒▒▓▒▒▒▓▓▒░░░░▒▓█▓▒░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░█▓▒▒▒▒▒█████▓▓▓████▓▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓█▓▓█▓▓███████████▓██████████████▓▓▓▓██▒░▒▓█▒▒▒▓██████▓▒█░░░░░░░░░░▒▒▒▒▒▒▒▒▓▒░░░░░░▒▓▓▓▒░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒░░░▒▓▓█████▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓█████▓███████████▓█▒▒░░░░░▒▓▓█████████████▒▒██▒▒▒▓█████▓▒▓░░░░░░░░░░░▒▒▒▒▒▒▒▒▓▓▒░░░░░░░▒▓▒▒▒░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░▒▒▒███████▒▒▒▓██▓▓▓▓██████████████████▓▓░░░░░░░░░░░░░▒▓▓█████████▒▓███▒▒▓█████▒▓░░░░░░░░░░░░░▒▒▒▒▒▒▓▓▓░░░░░░░░░░░░░▒▓▒░░░░░░░░");
        System.out.println("░░░░░░░░░░░░▒▒▒▒▒░░░░░░░░░░░▒▒░░░░░░▒▒▓▓████████▒▒▒▓▓██████████████████▓▓▓▒░░░░░░░░░░░░░░░░░░▒▓████▓▓██████▓▓████▒█░░░░░░░░░░░░░░▒▒▒▒▒▓▓▓▒▒░░░░░░░░░░▒░▒▒█▓░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░▒░░░░░░░░░░░▒█▓▓▒▒▒▒▓▓██████████▒▒▒▒▓▓█████████████▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓████████████▒█▓█░░░░░░░░░░░░░░░░▒▒▓▓▓▒░░░░░░░░░░░▒▓▒░▒█▒▒░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▓▒▒▒▓▒▓███████████▓▒▒▒▒▓▓████████▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▓███████░█▓▓▒░░░░░░░░░░░░░▒░░▒▒▒▒▒▒░░░░░░░░░░░░▒▓█▓▓▒▓░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▓▓▒▒▓███████████████▓▓▓▓▓▓▓███▓███░░░░░░░░░░░░░░░░░░▒░░░░░░░░░░░░░░░░░░▒████▓▓██▓░░░░░░░░░░░░░░░░░░▒▒▒▒▒░░░░░░░░░░░░░░▒█▓▓▒░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓███▓█████████████████░░░░░░░░░░░░░░░░░░░░▒▒░░░░░░░░░░░░░░░░░▒▒▒█████░░░░░░░░░░░░░░░▒░▒▓▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▓▓▓▓▓██▓█▓█████▓▓█▓▓▓▓█▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██▒░░░░░░░░░░░░▒▒▒▒▒▒▒▒▓░░░░░▒▓▒▒▒▓██▓▒░▒░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▒▒▒▓▓▓▓█▓▓▒▒▒▒█▓▓█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░▒▓▓██▒▒░░▒▓▓▒▓▓██▓░░░░▒░░░█▒░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▓▒▓▓▓▒▓▓▓▓▒▒▒▓▓▒▓▓█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▓▒░░▒▒░░░░░░░░█▒▒▒▒░██░▒▒░░▓▒▒░░░▓▒▒░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▓▓▒▓▓▓▓▓▒▒▓▓▓▓▓▓▒░░░░░░░░░░░░░░░▒▒▒░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒█░░░░░░▒░░░░░░▒▓▓████▓▓██▒████▓▒░▒▒▒▓▓▓░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░▒░░▒░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▓▓▓▓▒▒▒▒▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░▒▓▒░░░░░░░░░░░░░░░░░░░░░░░░▒▒▓░░░░░░░░░░░░░░░▒░▓████▓▓▒▓███████▒▓▒▓██▓░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░▓▒░▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▓▓▓▓█▓▓▒▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░░░░░░░░░░▒░░░▒▒░▓█████████▓▓▓▓▓██▓█▓███▓░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░▓▒░▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▓▒▓▒▒▓▓▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░░▒▓░░░░░░░░░░░░░░░░░░▒▒▓██████████▓▓▓▓█▓█████▒░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░▒▒▒▒░░▒██▓░▒█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▓▓█▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓▒▒░░░░░░░░░░░░░░░░░░░░░░░▒▓▓████▓███████████▒░░░░░░░░░░░░");
        System.out.println("░░░░░░░▒▒░██▓▓▒▒▒▒▒▓██▓▒▓██▓▒▒▓▒▓▓▓▓▓█▓▓▓█▓█▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░▒░░░▒░░▒▒░▒░░░░░░░░░░░░░░░░░░░░░░░░▓▓████▓░░▒░░▒▒░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░▒▒▓░█████▓▓▓▓███▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░░░░░░░░░░░░░░░░░▒▒▒▒░░░░░░░░░░░░░░░░░▒░░░░▒░▒░░▒░▒░▒░▒▒▒▒▓░░░░░░░░░░░░░░░░░░░░▒▒░▒▓██████▓░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░▒▓▓▓██████████████▓▓████▓▓▓▓▒▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒░▒▒▒▓▒▓▒░▒░▒▒░▒▒▒▒▓▒▓▒▒▒▒▒▓▓▓▓▓█▒░░▒▒▓▒▒░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░▒███▒███████▓▓▓████████▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▒▓▓▒▒▓▒▓▒▒▒▒▓▒▒▒▒▒▒▓██▓▒▒▒▒▒▒▓▒▓▓▓█████▓█▓██▒░░░░░▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░▓██▒███████▓█▓█▒░████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▓▒▓▓▓███████████████████████▓██▓███▓▓▒▓▒▒▒▓▓▒▓██▓▒▒▓▓▓▓▓██▓█████████▓▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░▒▓▓█████▓▓▓▓░░░▒░░░░░░▒░░░░░░░░░░░░░░░░░░░░░░░░░░▓▒▓▓▓▓▓█████████████████████████████████▓▓▓▓▒▓▓▓▒███▓██▓██▓▓████▓▓▓▒▒▒█▓█▒▒▒▒▒▒▒▓▒░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░▒▒█████▓█▓▓░░░░░░░░░░░░░░░░░░░░▒▒░░░░░░░░░░░░░░▓▒▓▒▒▒▓▓███████▓░░░░░░░▒▒▒▒▓▓██████▒▒░░░░░░░▒▒▒▒▒▒███████▓██████▓▓▒░░░░░░█▓▓▒▒▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░█▓█████▓▓▓▒░░░░░░░░░░░░░░░░░░░░░▒░░░░░░▒░░░░░▓▒▓▓▓▓▓▓███████░░░░░░░░░░░░░░░░░░░░▓▒▒░░░░░░░░░░░░▒▒▒▓▓▓█████████▓▒░░░░░░░░▓▓▒▓▒▒▒▒▓▓▒░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░█▓████▓█░▒▒▒▓▓▒░░░░░░░░░░▒▒▒░░░░░░░░░░░░░░▒▒▒▒▓▒▒▒▓▓▓█████▒░░░░░░░░░░░░░░░░░░░▒▓▒▒▒▒░░░░░▒▒▒▒▒▒▒▒▒▒▓█████▓▓█▓▒░░░░░░░░░░░▓█▓▒░░▒▒▓▒░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░█▒█████▓███▒░░░▒▓░░░░░░█▓▓▒▒░▒░░░░░░░░░░▒▒▒▓▒▒▓▓███████▒░░░░░░░░░░░░░░░░░░░░▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▓▓▓▒▒▓▓▓▓████████▓▒▒░░░░░░░░░░░▓▓▒▒▒▒▓▓▒░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░█▓▒██████▓▓▒░░░░▓█▒░░░░████▓▒▒▒▒▒▒▒▓▒▒░▒▒▒▓▒▓▓▓█████▓░░░░░░░░░░░░░░░░░░░░▒▒▒▓▓▓▓███████████████████████████▓▒▒░░░░░░░░░░░░▒▓▓▒▒▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░▓█▒▓███████▓▓▓▓▓▓██░░░░░█████▓▒▒▒▒▒▒▒▓▒▒▓▒████████▒░▒▒▒▒▒░░░░░░░░░░░▒▒▒▒▒▒▒▓█████████████████████████████▓▒░░░░░░░░░░░░░▒▒▒▓▓▓▓▓▓▓▓▒░░░░░░░▒░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░▒█▓▓██████████████░░░░░░▓█████▓▓▓█████████████▒▒▓▒░░▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▓▓▓▓██████████████████████████████▓▒░░░░▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░▒██▓████████████░░░░░░░░░█████████████████▓▒░▒▓▒░▒▒▓▓▓▒▒▒▒▒▒▓▒▒▒▒▓█▓▓████████████████▒▓█████████████▓▓▓▒▒░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▓▓███▓▒░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("▒▒▒▒▒▓▓▓▓▓▓▓▓███▓▓███████▓░░░░░▒░░░░░░▒█████████████▒▒▒▒▓███████████████████████████████████▓▓▓▓▓▓▓▓▓▓█████████▒░░░░░░░▒▒▒▓▓▓▓▓▓▓█████████▓▒▒░░▒▒▒▒░▒░▒▒▒░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░▒▒▓▓█████████▓▒▒▒▒░▒▒▓▒▓▓██████████████▓▒▒▒▒▒▒▒███████████████████████████▓▓▒▒▒▒▒▒▓▓▓▓▓▓████████▓█░▒▒░▒▒░▒▒░▒▓█████████████████████████▓▓▓▒▒▒▒▒▒░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒░░░░░░░░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓███████████████████████████▓▓▓▓▓▒░▓░▓░░▒▒░▒███████▓▓▓▓▓▒▒▒▓▒▓▓▒▒▓▒▒▒▒▒░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░░░░░░░▒▒░░░░░░▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▒░▓█░▒█▓▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░░░░░░░░░▒▒▒▒▒▓▓█▓▓▓▓▓▓▓▓▓▓▓█▓█░░░░░░░░░░░░░░░░▒▒▒▒░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒████▓▒▒▒▒░░░░░░▒▓░░░░▒▓█████████▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░");
        System.out.println("▒░░░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒█▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒░░");
        System.out.println("▓░░░░░░▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░▒░▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░░░░░░░░░░░░▒░░░░░░░░▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▒▒▒░");

    }

    /** Función en la que acabamos con el payaso con nuestro bate de baseball.
     * @return opción, este, nos envía a la pantalla 9, para preparar el fin del juego con una imagen.
     */
    public static int ImagenPayasoWIN(){

        System.out.println("▓▓▓▓▓▓▓▓█▓▒▒▒▒▒▒▒▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓██▓▓▓▒▒▒▒▒▒▒▒▒██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓████▓▓▓▒▒▒▒▒▒▒▒▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓▓▓▒▒▒▒▒▒▒▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▒▓▓▒▒▓▒▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓▓▓▒▒▒▒▒▒▓▓▓▒▓▒▒▓▓▒▒▓▒▒▒▒▒▒▒▓▓▓▒▓▒▒▓▒▒▒▓▒▒▒▓▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▓▒▒▒▓▓▓▒▒▒▒▒▓▒▒▓▓▒▒▒▒▒▓▒▒▒▒▓▓▒▒▒▒▓▓▒▒▓▓▒▒▒▒▒▒▒▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓▓▒▒▒▒▒▒█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▓▓▓▒▓▒▒▒▒▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▓▒▒████▓▓▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▓▒▒████▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▓██████▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▒▒▒▒▒▒▒░▒▒▒▒▓███▓▓▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▓▓█████▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▓███▓▒▒▓▓▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▓▓███▒▒▒▒▒▒▒▒▓▒▓▒▒▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▒▓▓▓▒▓▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▓███▓█▒▒▒▒▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓███▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▓▓████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▓█▓▓▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▓▓████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒");
        System.out.println("▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒█▓█▓▒▓▒▒▒▒▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓██▓▒▓▒▒▒▒▒▒▒▓▓█████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▓██▒▒▒▓████▓▒██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓█████▓▒▒▓▓▒▒▓█▓▓▓████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒█▓▒▒▒▒▒▒▓▓▓▓████▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████████▓▓▓▓▓██████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▓█▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▒██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓▓▓███████▓▓▓████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▓███▓███▒░░░░░░░░▒██████████████▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▓▓▓█▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒█▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒██▓▓███▒▒▒░░░░░▒▒░░░▒▓████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▓▒▒▒▓▓██▒▒▒▒▓████▓▓█████▒▓░▓█▓▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒██▓▓▓▓█░░░░░░▒░░░▒▓▒▒▒▓█▓▓▓▓▓▓████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▓▒▒▒▒▓▒▒▒▒▒█████████▓▓▓▓███▓█▓▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒█▒▒▒▒▒▒▒▒▒░░░░▓██▓▓█▓▒▒▒░░░▒░░░░▒▒▒▒█▓▓▓▓▓▓▓████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▓▓▒▒▒▒█▒▒▓█████▓▓▓█████████▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓██▓▒█▓██▒▒▒▒▒▒▒▒▒▒▒░░█████▒▒▒▒░░▒░▒▓▒▒▒▒▒███▓▓▓▓█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▓▓▒▒▒▒▓▒▒▓█████████▓█▓▒▒▒██▒█▓▓▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████▒▓██▓▒▒▒▒▒▒▒▒▒▒▒▒░████▓▓█▒░░▒▒███▒▓▒▒████▒▓██████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒░░▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▓▓▒▒▒▒▓█▒████████████▒▒▒▒▒▓░█▓▓▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▓█████▒███▓▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▓███▒█▒▒██▓▒▓▓▒░▒▒▒▒█▓▓▓█▓████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒█▓▓▓▓▓▓▓█▒█████▓▓████▒▒▒▓▓█▓░▓▓▓▓▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████▓▓▓▓▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒███▓██████▓░░░▒▓█▓▒█▓█▓▒▓███████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒");
        System.out.println("▒▒▒░▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████▓▓▓▓█▓▓████▓█▓█▓▒▒▓▒░██▒▒▒█▓▓▓▓▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒████▒█▓▓▓▓██▓██▒▓▒█▒▒▒▒▒▒▒▒▒▒░████████▓░░▓███▒▓▓▒▒▒███████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓▓▓██░████▓▓▓▓▒▒▒▒▓▓▒▓▓▓▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███████▓▓██▓▓▓▓▓█▓▒▒▒▒▒▒▒▒▒▒▒█████▓▓██████▓▒▓▓████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▓██████▓▓▓▓██▒███▓▓▓▒▒▒▒▓▓▒▓▒▒▒▒▒▒▒▓▓▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██▓▓▓█▓▓▓▓███▒▒▒▒▒▒▒▒▒▒▒▒▒▒███▓▒▓██████▒▓▓█▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒██████▓▓▓█████▓▓▒▓▓▒▒▒▓▒▒▒▓█▓▒▒▒▒▓▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███▓████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██████▒███▒▓▓████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▓██████▓▓█████▓▒▒▒▓▓▓▒▓▓▒▒███▓▓▓▓█▓▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███████████▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓▓▓▓███▓▓▓██████████▓█▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████▓███▓▒▒▓▓███▓▓██████▓█▓░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████████▓▓▒▒█▒▒▒▒▒▒▒▒▒▒▒▒██▓▓██████▓▓▓██▓▓▓▓▓▓████▓▓▓▒▓▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▓████████▓█▓█▓▓▒▒▓▓███████████▓░▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓▒▒▒▒▓██▒▒▒▒▒▒░░░▒▒▒▓██▓▓▓█▓▓▓▒░▒▓▒▒▒▓▓▓▓██▓██▓▓▓▓█▓▒▓▓▓███▓▓▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒████████▓▓▓▓▓█▓▓▓▓████████████▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███▓▓▓▒▓▒▒▒▒▒▒▓▓██░░░░▒▓░▓░▒▒░▒▒░▒▒▒░░░▒▓▒▒▓█████▓▓▒▓█▓▓▓▒▒▒▒▒▓▓▓▓▓▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░███████▓▓▓▓▓▓▓▓██▓▓███████████▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▓██▓██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒████▓▓▓▓▓▓▓▓▒▒▓▒░░▒▒▒░▒░░▒░░░▒░░░▒▒░░░░░▓███▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░████████▓▓▓▓▓▓▓▓▓███████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██████▓▓██▓▓█▓▒▒░░▒▒░░▒░░░▒░░░░▒▒░░███▓█▒▒▒▒▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████▓▓▓▓▓▓▓▓▓█████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒░▒▓█████████▓▒░░▓░░░▒░░░▒▒░░░░▒▓█████▒▒▒▒▒▒▒▒▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓███▓▓█▓▓▓▓▓▓▓▓▓▓▓████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█░░░░▒▒▒▒▒▒▒▒▒░░░▒██████▒▒░░▒░░░░▒▓▒████▓▓███▓▓▒▒▒▒▒▒▒▒▒▒▓▓█████████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████▓▓█▓▓▓▓▓▓▓▓▓█████████▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▓▒▒▒▒▒░░░░░▒▒▒▒▒▒▒▒▒▒▒▒░▓▓██░▓███▒▒▓▓██████▓▓█████████▓▓▒▓▓▒▓████████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒██▓██▓▓▓█▓▓▓▓▓███████████▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▓██▒░▒▒▒▒▒▒▒▒▒▒▒▒░░░░░▒▒▒▒▒▒▒░████▓████▓▒▓██▓▒▒▒▓██████████████▓▓▒▓███████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒░████▓█▓▓▓▓█▓▓▓▓███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▒▒████▓▓▓█▓▓▒▒▒▒▒▒▒▓▓▓████████████▓▒▒▓███████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░████▓▓▓█▓▓▓▓█████████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███▓▒▒▒▒▓▒▒▒▒▒▓▒▒▓▓▓▓███████████▓▒▒▒███████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████▓▓▓█████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███▓▒▒▒▓▒▒▒▒▓▓▓▓▒▓▓████████████▓▒▒▓███████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒░▒▒░████▓█▓▓▓████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓▒▓██▒▒▒▒▓▓▓▓▓▓████████████▓▒▒▓███████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█████▓██▓███████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒░▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███▒▓███▒▒▒▓▓▓▓██████████████▓▒▓▓███████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓███████████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒░░░░░▒▒▒▒▒▒▒▒▒░▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒█████████▓▒▒▓▓▓▓█████████████▓▓▓████████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███████▓▓█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▒░░░░▒▒▒▒▒▒▒██▓▓▓▓░▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒█▓███████▓▓▒▒▒▒▓██████████▓▓▓▓▓▓█████████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████████▓████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▒▒▒▒░▒▓▒▒▓█▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▓▓▓▓█▒▒▒▒▓▓▓▓█████████████▓▓█████████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓▓█████████████░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓████▓▓▒▓▓▓▓▓▒▒▓▓▓████████▓▓▓▓██████████████▓");
        System.out.println("░▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████▓▓▓▓▓▓▓▓▓▓▓▓▓███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓█▓█▓▓███▒▒▒▒▒▒▒▒▓▓███▓██▓▓▓████████▓▓▓▓▓▓▓█▓");
        System.out.println("██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓▓▓▒▓▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒▒▒▓█▓█████████▒▒▒▒▒▒▒▓▓▓█████▓▓████████▓▓▓▓▓▓▓▓█▓▓");
        System.out.println("██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒░▒█▒▒██▓▓█████▒▒▒▒▒▒▓▒▓▓█▓▓██████████████▓▓▓▓▓▓▓▓▓");
        System.out.println("███▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████████▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒░░░░▒▒▓█▓█▓█▓▒▒▒▒█▒▒▒▒▒▒▓▒▒▓▓▒▓▓█████████▓▓████▓▓▓▓▓▓█▓");
        System.out.println("█▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓███████████▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▓█▓▒░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░▒▒▒▒▒▒██████▓▒▒▒█▒▒▒▒▓▓▒▒▒▓▓▒▓██████▒▓▓▓█▓▓▓▓▓▓▓░▒▓▓▓█");
        System.out.println("█████▒▒▒▒▒▒▒▒▒▒▒▓█████████████████▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▓▒▓▓█▓▓▓█▓▒▓▓▓▓█▓▓▓▓█▓▒▓▒▒▓▓▓█▓▓▒▒██▓▓█████▓▓▓▓███▓██");
        System.out.println("▓▓▓▓██▒▒▒▒▒▒▒▒▒█████████████████████████▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓█▓▓▓▓▒▒▒▒▒▓▓▒▓▓█▓▒▒▒▒▒▒▓█▓▒▓▓▓█▓▓▓▓▒▓▓▓█▓▒▒███▒▒▒▒▒▓▓███████████");
        System.out.println("█▓▓▓▓▓█▒▒▒▒▒▒▒████████████████████████████████▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▓▒▒▒▒▓▒▓▓▒▒▒▒▒▒▒▒▒▒░░▒▒▓▓▒▓▒▓██▓▓▓▓▓▓▓▓▓▓▓▒▓▓▒▒▒▒▒▓█▓▒▒▒▒▒▒▒▒▒▒▒▓█▓▒▒▒▒▒▒▒▓▓▓▓▓▓█▓▒▒▒▒▓▓▒▒████████");
        System.out.println("███▓▓▓▓▓▓▒▒▒▒█████████████████▒▒▒▒▒▒████████████▓▓▓▓▓▓▓▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒░▒▓███████▓▒▒▒▒█▓▓█████▒█▒▒▒▒▒▒▒██████▒▒▒▒▒▓▒▓▓▓▒▓▓▓██▓▓▓▓▓▓▓▓█████████▓▒▒");
        System.out.println("████▓▓▓▓▓█▒▒████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▓█████████▓▓▓▓▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒░▒█▓▓████████▓▓▓██▓▓▓▒▓▒▓▓▓▒▒▒▓▓▓▓▓████▓▒▒▒▒▒▒▓██▓▓▓█▓▓▓█████████████████▓▒▒");
        System.out.println("█████▓▓▓▓▓█████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓▓▓▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▓█▓▓█▓█▓████▓▓▓████▒▓▓██▓█▓▓▓▓▓▒█████▓▓▓▒▒▒▒▓▓██████████████████████████▓▒▒");
        System.out.println("▒██████▓▓████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████▓▓▓▓▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▓▓▓█████▓▓█▓▓▓███▓▓▓▒██████▓▓▓▓████████▓█▓█▓███████████████████████████▓▒▒");
        System.out.println("▒▒█████████████████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████▓▓▓▓▓█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▒▒▒▒▒▒▒▒▒▓█▓▓█▓▓▓▓▓▓▓▓▓▓███▓▓▓▓████▓▓▓▓▓▓██████████▓▓▓███████████████████████████▓▒▒");
        System.out.println("▒▒▒▓██████████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████▓▓▓▓▓▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒▓▓▓▓█▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓███████████████████████████▓▒▒");
        System.out.println("▒▒▒▒▓███████████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒████▓▓▓▓▓▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░▓▓█▓█▓▓▓▓█▓█▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓█▓▓▓▓▓▓███████████████████████████▓▒▒");
        System.out.println("▒▒▒▒▒▒████████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████▓▓▓▓▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▓▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▓▓█▓▓▓▓▓▓█▓▓▓▒███████▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓███████████████████████████▓▒▒");
        System.out.println("▒▒▒▒▒▒▒█████████▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█████▓▓▓▓█▓▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓█▓██▓█▓▓▓▓▓██▓█▓▓▓▓▒██▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓▓▓███████████████████████████▓▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓▓▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██▓▓▒▒▒▓▓▓▓▒▓██████▓▓██▓▓▓▓▓▓▓███▓▓▓▓▓▒▒▓▓█▓████████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓███████▓▓█▓▒▒▒▒▒▒▓▒▒▒▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒█▓▓▓▒▒▒▒▒██████████████████▓▓▓▓▓▓▓▓▓█▓████████████████████████████▒▒");
        System.out.println("▓▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██████▓▓██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▓▓▓▓▒▓▒▒▒▒▒▒▓█▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓▓▓█▓████████████████████████████▒▒");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓▓▓▓███▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▒▒▒▒▒▒▒▒▒▒▒▓██▒▓▒▒▒▒▓▒▒▒▒▒▓██████▓▓▓▓▓▓▓▓▓█▓████████████████████████████▓▓");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▓▓▒▒▓██▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒██▓▓████████▓▓██▓▓▓▓█▓████████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓███████████▓▒▓▒▒▒▒█░░▒░▓██▒▒▒▒▒▒▒▒▒▒▒▓▒▓▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▓▒▒▒▒▒▓▓▓▒▓██▒▓▓▓█████▓▓▓▓▓▓▓█▓████████████████████████████▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█████▓███▒▓▓▓███████░▓███▒▒▒▒▒▒▒▒▓▒▒▓▒▒▒▒▒█▓▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▓▓▓█████▓▓▒▒▒▒▒▓▓▓▓▓█████▓▓▓▓▓█▓████████████████████████████▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██████▓█▓██▓█████▒▓███▓▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▓█▒▒▒▒▓▓██▒▒▒▒▒▒▒▓███▒▒▒▒▒▒▓██▓██▓▓▓█▓▓▓▓█████▓▓▓▓▓█▓██████████████████████████████");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███████████████▒▓███▓▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▓██▓▓▓▓▓▓▓▓██▒▒▒▒▒▒██▓▒▒▒▒▒██▒▒▒▒▓█████▓▓▓█▓██████████████████████████████");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓████████████▒▓███▓▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒▒▒█▓▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▓▒▒▒▒▒▒█████▓▒▒███████▒▒▒▒▒▒███▓████▓██████████████████████████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒█████████▒▓███▓▒▒▒▒▒▓██▓▓▓▒▒▒▒▒▒▒▒▓▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒███▓▓▓██▓▓▒▒▒▒▓▓██▓▓█████████▓██████████████████████████████");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▒▒███▒▒▒▒▒▒▒████████▒▒▒▒▒▒▒█▒▒▒▒███▒▒▒▒▒▒▓▒▒▒▒▒▒▒▓██▓▒▒▒▒▓▓▒▒▒▒▒▓█▓▒▒▒▓▒▒▓▓▒▒██████████████████████████████████▓█▓");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓▓▓███████████████████▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒███▓▓▒▒▒▒▒▒▒▒▒▒▒█▒▒▓███▓▒▓▓▓▒██▓██▓▓█████████████████████████████▓▓▓▓▓▓▓");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓██████████████████████▒▓▒▒▒▒▒▒▓█▒▒▒▒▓▓▒▒▒▒▓▓█▓▓██▒▒▒▒▒▒▓███▓▒▒▓█▓▓▓▓▓▓▓▒▒▒▓▓██▓▓▒▒▓▓▓▒▒▒▓▓███████████████▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓███▓▓▓█████▓▓▓▓█████████▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▓▒▒▓█▓▓▓██▓▓▓▓▒▒▒▒▒▒▒▒████▓▒▒▒▒▓▓███████▓▒▒▒▒▒▒█▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▓▓▓▓██▒▒▒▒▒▒▒▒▓███▒▒▒▒▒▒▒▓▒▒▒▓█▓▓▓▓██▓▓█▓▒▓▓▓██▓▓▒▒▒▒▓█▒▒▓███▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒█▓▒▒▒▓█▓▓▒▒▓▒▒▒▒▒▓████▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓█████▓▓▒▒▒▒▒▒▒▒▓███▓▓▒▒▒▓█████████▓▒▒▒▓█▓▒▒▒▒▓▒▒▒▒▒▒▒▓█▓▒▒▒▒▒▒▓█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓█▓██▓▒▒▒▓▓▒▒▒▒▓▓▓██▓▓██▓▒▒▒▓▓▓████▓▓▓▓███▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

        opcion=9;
        return opcion;

    }

    /** 
     * Función en la que reproducimos una imagen abandonando la mansión al acabar con el payaso
     */
    public static void ImagenGanado(){

        System.out.println("                                                                         ░▓▓▒                                               ");
        System.out.println("                                                                        █████▓                                              ");
        System.out.println("                                                                        ▒█████                                              ");
        System.out.println("                                                                         █████▓                                             ");
        System.out.println("                                                                          █████                                             ");
        System.out.println("                                                                          ▒█████         ▓▓▓▓                               ");
        System.out.println("                                                                           █████      ▒▓▓▓▓▓▓▓▓                             ");
        System.out.println("                                                                            █████     ▓▓▓▓▓▓▓▓▓                             ");
        System.out.println("                                                                            ▒████    ▓█▓▓▓▓▓▓▓▓▓                            ");
        System.out.println("                                                                             █████    ▓▓▒▒▒▒▒▓▓▒                            ");
        System.out.println("                                                                              ████     ▓▓▓▓▓▓▓▓                             ");
        System.out.println("           ▒   ▒  ▒▒▒▒▒  ▒▒▒▒▒▒                                                ████     ▒▓▓▓▓▓                              ");
        System.out.println("           ▒   ▒  ▒   ▒  ▒                                                     ░███░▒▓▒▒▒▒▓▓▓▓▒▒▒                           ");
        System.out.println("           ▒▒▒▒▒  ▒▒▒▒▒  ▒▒▒▒▒▒                                                 ▓██▓▒▒▒▓▒▒▒▒▒▒▒▒▒▒                          ");
        System.out.println("           ▒   ▒  ▒   ▒       ▒                                                  ███▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒                       ");
        System.out.println("           ▒   ▒  ▒   ▒  ▒▒▒▒▒▒                                                ▒▒▒██▓▒▒▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒░                     ");
        System.out.println("                                                                              ▒▒▒▒▓██▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒                     ");
        System.out.println("                                                                             ▓▒▒▒▒▒██▓▓▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▓                    ");
        System.out.println("                                                                             ▒▒▒▒▒▒▒██▓▒▒▒▓▒▒▒▒▒▒▓▒▓▒▒▓▓░                   ");
        System.out.println("           ▒▒▒▒▒ ▒▒▒▒▒ ▒   ▒ ▒▒▒▒▒ ▒▒▒▒   ▒▒▒▒▒     ▒                       ▓▒▒▒▒▒▒▒▓█▓▒▒▒▒▓▒▒▒▒▓▓▒▓▒▒▒▒▓                   ");
        System.out.println("           ▒     ▒   ▒ ▒▒  ▒ ▒   ▒ ▒  ▒▒  ▒   ▒     ▒                       ▒▓▒▒▒▒▒▒▒██▒▓▓▓▓▓▒▒▓▒▓▒▓▒▒▒▓▒                   ");
        System.out.println("           ▒ ▒▒▒ ▒▒▒▒▒ ▒ ▒ ▒ ▒▒▒▒▒ ▒   ▒▒ ▒   ▒     ▒                      ▒▒▓▓▓▒▓▓▓▓▒██▓▓▓▓▓▓▓▓▓▓▒▓▒▒▓▒▒▒                  ");
        System.out.println("           ▒   ▒ ▒   ▒ ▒  ▒▒ ▒   ▒ ▒  ▒▒  ▒   ▒                            ▒▒▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▒▓▓▓▒▓▒▓▓▓▒▒                  ");
        System.out.println("           ▒▒▒▒▒ ▒   ▒ ▒   ▒ ▒   ▒ ▒▒▒▒   ▒▒▒▒▒     ▒                     ▒▒▒▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                  ");
        System.out.println("                                                                          ▒▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                  ");
        System.out.println("                                                                          ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒                 ");
        System.out.println("                                                                          ▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                 ");
        System.out.println("                                                                           ▓▓▓▓▓▓▓▓▓▓▓▓▓▓███▓█▓▓▓▓█▓▓▓▓▓▓▓▓                 "); 
        System.out.println("                                                                           ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓▓▓▓▓▓                 ");  
        System.out.println("                                                                           ▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓░                ");
        System.out.println("                                                                            ▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▒                ");
        System.out.println("                                                                            ░▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▒                ");
        System.out.println("                                                                             █▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓▓▓▓                 ");
        System.out.println("                                                                              ▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓░░▓▓▓█                 ");
        System.out.println("                                                                              ▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓  ▓█▓                  ");
        System.out.println("                                                                               ▓▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓ ▓██▓▒                 ");
        System.out.println("                                                                                ███████████████████▓▒ █▓▓█                  ");
        System.out.println("                                                                                ████████████████████▒                       ");
        System.out.println("                                                                                ████████████████████▓                       ");
        System.out.println("                                                                                ████████▓▓██████████▓                       ");
        System.out.println("                                                                                ██████▓▓█ ░█████████▓                       ");
        System.out.println("                                                                               ░█████▓█▓   █████████▓                       ");
        System.out.println("                                                                               ▓████████   ░███████▓▓                       ");
        System.out.println("                                                                               █████▓▓█     ████████▒                       ");
        System.out.println("                                                                               ▓███████     ████████▒                       ");
        System.out.println("                                                                               ███████      ████████                        ");
        System.out.println("                                                                              ░██████       ███▓████                        ");
        System.out.println("                                                                              ███████       ▒▓██████                        ");
        System.out.println("                                                                              ██████▓       ▒███████                        ");
        System.out.println("░                                                                             ██████        ▓███████                        ");
        System.out.println("▒░░░░                                                                        ▒██▓███        ███▓▓███                      ░░");
        System.out.println("▒▒▒▒▒▒░░                                                                     █▓▓▓███        ████████                  ░░ ░░░");
        System.out.println("▒▒▒▒▒▒▒▒▒░░░                                                                 █▓████▒         ▓▓█████              ░░░░░░░░░░");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░                                                             ▓▓▓███          █▓████▓          ░░░░░░░░░░░░░░");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░                                                         ▓▓▓▓▓█          ▒▓████▓    ░░░░ ░ ░░░░░░░░░░░░░");
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░ ░░░   ░   ░                  ░        ▒            ▓▓▓▓▓▓         ░ █████▒░░░░░░░▒░░░░░▓░░░░░░░░▒░");
        System.out.println("▓▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒░░ ░░░░░░   ░    ░░     ▒░░    ░   ░░           ▓▓▓▓▓▓     ░░░ ░░█▓████░░░▒░░▒░▒░▒░▒░▒▓░▒▒▒▒▒▓░");
        System.out.println("▒▒▓▒▓▓▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▓▓░░░░░░░░░░░░░░░░░░░▒░░░▒░▒▒░▒▒░░░ ░░░░░░▒▓▓▓▓▓░░░░░░░▒░▓░█████▓▒▒▒░▒░▒▒░▒▓▒▒▒▒░▒▒▓▓▒▒▓▓");
        System.out.println("▓▓▓▓▓▓▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▓▒▒▒▒▒▓▒▒▒▒▒░▒░░▒░░▒▒▒▒░▒░░▒░▒▒▒▒▒▒▓▒▒▒░░▒░░░▒▒░▓███▓▓▒▒░▒▒░▒▒▒▒▒▓██▓▓▓▓▓▓▒▓▒▒▒▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▒▓▓▒▓▓▓▒▓▓▓▓▓▓▒▓▒▓▒▓▓▓▓▓▓▒▒▒▒▒▒▒▓▒▓▓▒▓▓▓▓▓▓▓▒▓▒▒▒▒▓▒▒▓▓▒▒▓▓▓▓▓▓▓▓▒▒▓▒▓▓▓▓▓▒▓████▓▓▓▒▒▓▒▒▒▒▓▒███████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓▓█████████████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        System.out.println("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████████▓▓▓▓▓▓▓▓██████████████▓▓▓▓▓▓███████████");
        System.out.println("▓▓▓▓▓▓▓▓▓█▓▓▓▓▓▓▓█████████▓▓▓▓▓▓▓▓▓▓▓██▓▓██████▓████▓▓▓█████████████████████████████████████████████████████████████████████");
        System.out.println(" █▓▓▓▓██████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        System.out.println("▒▒░ ████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");
        System.out.println("▓███████████████████████████████████████████████████████████████████████████████████████████████████████████████████████████");

    }

    /**
     * Función que imprime en pantalla el texto de agradecimiento por jugar a nuestra mansión.
     */
    public static void TextoFin(){

    System.out.println("    .d8888b.    8888888b.         d8888  .d8888b.  8888888        d8888  .d8888b.           8888888b.   .d88888b.  8888888b.           888     888 8888888888 888b    888 8888888 8888888b.  ");
    System.out.println("    d88P  Y88b  888   Y88b       d88888 d88P  Y88b   888         d88888 d88P  Y88b          888   Y88b d88P   Y88b 888   Y88b          888     888 888        8888b   888   888   888   Y88b ");
    System.out.println("    888    888  888    888      d88P888 888    888   888        d88P888 Y88b.               888    888 888     888 888    888          888     888 888        88888b  888   888   888    888 ");
    System.out.println("    888         888   d88P     d88P 888 888          888       d88P 888  Y888b.             888   d88P 888     888 888   d88P          Y88b   d88P 8888888    888Y88b 888   888   888   d88P ");
    System.out.println("    888  88888  8888888P      d88P  888 888          888      d88P  888     Y88b.           8888888P   888     888 8888888P             Y88b d88P  888        888 Y88b888   888   8888888P  ");
    System.out.println("    888    888  888 T88b     d88P   888 888    888   888     d88P   888       888           888        888     888 888 T88b              Y88o88P   888        888  Y88888   888   888 T88b   ");
    System.out.println("    Y88b  d88P  888  T88b   d8888888888 Y88b  d88P   888    d8888888888 Y88b  d88P          888        Y88b. .d88P 888  T88b              Y888P    888        888   Y8888   888   888  T88b  ");
    System.out.println("     Y8888P88   888   T88b d88P     888   Y8888P   8888888 d88P     888   Y8888P            888          Y88888P   888   T88b              Y8P     8888888888 888    Y888 8888888 888   T88b ");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("                                                       d8888               888888   888     888    .d8888b.           d8888   8888888b.      ");
    System.out.println("                                                      d88888                 88b    888     888   d88P  Y88b         d88888   888   Y88b     ");
    System.out.println("                                                     d88P888                  888   888     888   888    888        d88P888   888    888     ");
    System.out.println("                                                    d88P 888                  888   888     888   888              d88P 888   888   d88P     ");
    System.out.println("                                                   d88P  888                  888   888     888   888  88888      d88P  888   8888888P      ");
    System.out.println("                                                  d88P   888                  888   888     888   888    888     d88P   888   888 T88b       ");
    System.out.println("                                                 d8888888888                  88P   Y88b. .d88P   Y88b  d88P    d8888888888   888  T88b      ");
    System.out.println("                                                d88P     888           888    888     Y88888P      Y8888P88    d88P     888   888   T88b     ");
    System.out.println("                                                                         88d88P                                                    ");
    System.out.println("");
    System.out.println("");
    System.out.println("           d8888          888b    888 888     888 8888888888  .d8888b.  88888888888 8888888b.         d8888          888b     d888        d8888 888b    888  .d8888b.  8888888  .d88888b.  888b    888 ");
    System.out.println("          d88888          8888b   888 888     888 888        d88P  Y88b     888     888   Y88b       d88888          8888b   d8888       d88888 8888b   888 d88P  Y88b   888   d88P   Y88b 8888b   888 ");
    System.out.println("         d88P888          88888b  888 888     888 888        Y88b.          888     888    888      d88P888          88888b.d88888      d88P888 88888b  888 Y88b.        888   888     888 88888b  888 ");
    System.out.println("        d88P 888          888Y88b 888 888     888 8888888      Y888b.       888     888   d88P     d88P 888          888Y88888P888     d88P 888 888Y88b 888   Y888b.     888   888     888 888Y88b 888 ");
    System.out.println("       d88P  888          888 Y88b888 888     888 888             Y88b.     888     8888888P      d88P  888          888 Y888P 888    d88P  888 888 Y88b888      Y88b.   888   888     888 888 Y88b888 ");
    System.out.println("      d88P   888          888  Y88888 888     888 888               888     888     888 T88b     d88P   888          888  Y8P  888   d88P   888 888  Y88888        888   888   888     888 888  Y88888 ");
    System.out.println("     d8888888888          888   Y8888 Y88b. .d88P 888        Y88b  d88P     888     888  T88b   d8888888888          888   '   888  d8888888888 888   Y8888 Y88b  d88P   888   Y88b. .d88P 888   Y8888 ");
    System.out.println("    d88P     888          888    Y888   Y88888P   8888888888   Y8888P       888     888   T88b d88P     888          888       888 d88P     888 888    Y888   Y8888P   8888888   Y88888P   888    Y888 ");
    System.out.println("                                                                                                                                                                                             ");

    }

    /**
     * Esta función está hecha con random para tirar una moneda y elegir qué puerta
     * debe abrir
     * 
     * @return opcion (Da la opción de la puerta que elegir, y si tiene o no arma,
     *         ocurrirá una acción diferente)
     */
    public static int TiraMoneda() {

        System.out.println("                                        Presione enter para tirar la moneda:");
        System.console().readLine();

        int num = (int) (Math.random() * 2) + 1;
        switch (num) {
            case 1:
                System.out.println();
                System.out.println( "                           Ha salido cara, se ha desbloqueado la puerta izquierda");
                opcion = 5;
                break;
            case 2:
                System.out.println();
                System.out.println("                            Ha salido cruz, se ha desbloqueado la puerta derecha");
                System.out.println();
                System.out.println("                                 OH NO! TRAS LA PUERTA HABÍA UN PAYASO MALVADO!");
                System.out.println();
                if (TieneArma != true) {
                    System.out.println("                        No es posible... ni siquiera tiene un arma para defenderse...");
                    System.out.println("                                Presione ENTER si desea saber si es amigable...");
                    System.console().readLine();
                    opcion = 6;
                } else {
                    System.out.println("                            RAPIDO! USTED TIENE UN ARMA! PULSE ENTER PARA UTILIZARLA!");
                    System.console().readLine();
                    opcion = 7;
                }

            default:
                break;
        }
        System.out.println();
        return opcion;
    }

    /**
     * Esta función solo realiza el final del juego, para no tener problema de
     * escritura, se realiza esta función.
     * 
     * @param FinJuego Utiliza el boolean para modificarlo
     * @return FinJuego Con esto conseguimos que el juego termine
     */
    public static boolean FinalJuego(boolean FinJuego) {
        return FinJuego = true;
    }

}
