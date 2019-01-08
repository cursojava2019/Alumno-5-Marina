/**
 * 
 */
package es.indra.ejercicio3;

import java.util.Scanner;

/**
 * @author Cursojava
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un dia de la semana: ");
		String day = entrada.nextLine();
		
        String dayType;
        String dayString;
        
        int numero;
      
        if(day == "Lunes") {
        	numero = 1;
        }
        
        if(day == "Martes") {
        	numero = 2;
        }
        
        if(day == "Miercoles") {
        	numero = 3;
        }
        
        if(day == "Jueves") {
        	numero = 4;
        }
        
        if(day == "Viernes") {
        	numero = 5;
        }
        
        if(day == "Sabado") {
        	numero = 6;
        }
        
        if(day == "Domingo") {
        	numero = 7;
        }
         
        switch (numero) 
        {
            case 1:  dayString = "Lunes";
                     break;
            case 2:  dayString = "Martes";
                     break;
            case 3:  dayString = "Miercoles";
                     break;
            case 4:  dayString = "Jueves";
                     break;
            case 5:  dayString = "Viernes";
                     break;
            case 6:  dayString = "Sabado";
                     break;
            case 7:  dayString = "Domingo";
                     break;
            default: dayString = "Dia invalido";
        }
         
        switch (numero) 
        {
          //multiples cases sin declaraciones break
         
            case 1:  
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Dia laborable";
                break;
            case 6:
            case 7:
                dayType = "Fin de semana"; 
                break;
                 
            default: dayType= "Tipo de dia invalido";
        }
         
        System.out.println(dayString+" es un "+ dayType);
    }
}