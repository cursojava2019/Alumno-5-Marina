/**
 * 
 */
package es.indra.ejercicio1;

import java.util.Scanner;

/**
 * @author Cursojava
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un numero para saber si es divisible:");
		int leido = entrada.nextInt();
		if(leido % 2==0) {
			System.out.println("El numero leido " +leido+ "es divisible por 2");
		}else {
			System.out.println("El numero leido " +leido+ "no es divisible por 2");
		}	
		
	}

}
