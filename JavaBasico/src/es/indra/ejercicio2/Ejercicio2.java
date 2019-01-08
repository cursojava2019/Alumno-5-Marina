/**
 * 
 */
package es.indra.ejercicio2;

import java.util.Scanner;

/**
 * @author Cursojava
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca primer numero: ");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca segundo numero: ");
		int num2 = entrada.nextInt();
		
		if(num1 > num2){
			for (int i = num2; i < num1; i++){
				System.out.println(i);
			}
		}else {
			
			for (int i = num1; i < num2; i++){
				System.out.println(i);
			}
		}
	}
}
