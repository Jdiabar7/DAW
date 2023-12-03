//package Ejercicios_3_6;

//import java.util.Scanner;
/* Ejercicio 1 de 3.6: Crear juego CRAPS
 * 
 *  Autor: Jaime Díaz.
 */

public class Ejercicio3º6x01 {

	public static void main(String[] args) {
		//Scanner s = new Scanner(System.in);
		System.out.println("[][][][][][][][][][][][][][][][]");
		System.out.println("[] [] C [] R [] A [] P [] S [][]");
		System.out.println("[][][][][][][][][][][][][][][][]");
		
		
		System.out.print("Indique cuanto dinero desea apostar ");
		//int apuesta = Integer.parseInt(s.nextLine());
		int apuesta = Integer.parseInt(System.console().readLine());
		boolean finPartida = false;
		
		//Variables
		int dado1 = (int) (Math.random() * 6 )+ 1;
		int dado2 = (int) (Math.random() * 6 )+ 1;
		int suma = dado1 + dado2;
		
		/* Primera parte del juego */
		System.out.println();
		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);
		System.out.println("Suma: " + suma);
		if (suma==7 || suma==11) {
		
			System.out.println("Felicidades, ha ganado " + apuesta + " euros");
			System.out.println("Ahora tiene " + apuesta * 2 + " euros");
			finPartida= true;
		} else {
		
		if (suma==2 || suma==3 || suma==12) {
			System.out.println("Lo siento, ha perdido todo su dinero.");
			apuesta = 0;
			finPartida = true;
		} else {
			finPartida = false;
						
		
		/* Segunda parte del juego. */
		System.out.print("Tiene que seguir tirando, debe conseguir el ");
		System.out.println(suma + " para ganar.");
		System.out.println("Si obtiene un 7, perderá la partida.");
		System.out.println("Pulse INTRO para tirar los dados.");
		//s.nextLine();
		System.console().readLine();
		
		do {
			dado1 = (int) (Math.random() * 6) + 1;
			dado2 = (int) (Math.random() * 6 )+ 1;
			System.out.println("Dado 1: " + dado1);
			System.out.println("Dado 2: " + dado2);
			System.out.println("Suma: " + (dado1 + dado2));
			if ((dado1 + dado2) == suma) {
				System.out.println("Felicidades, ha ganado otros " + apuesta + " euros.");
				System.out.println("Ahora tiene " + apuesta * 2 + " euros.");
				finPartida = true;
			} else if ((dado1 + dado2) == 7) {
				System.out.println("Lo siento, ha perdido todo su dinero");
				finPartida = true;
			} else {
				System.out.println("Continúe jugando.");
				System.out.println("Pulse INTRO para tirar los dados.");
				//s.nextLine();
				System.console().readLine();
			}
		} while (!finPartida);
		}
		}
		}
	}
	

