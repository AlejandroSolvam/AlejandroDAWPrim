package pruebaEjercicio;

import java.util.InputMismatchException;
/* Exercicis de maneig d'errors
1. Exercici: Crea un programa que demane a l'usuari un número, en el cas que
el número siga invàlid (no s’ha introduït un número), el programa imprimeix un
missatge de invàlid. */
import java.util.Scanner;
public class Prueba {
	public static void main(String [] args) {
		do {
			
		
		
		 try {
			    Scanner introducir=new Scanner(System.in);
				System.out.print("Introduce el primer numero: ");
				int num1 = introducir.nextInt();
				System.out.print("Introduce el segundo numero: ");
				int num2 = introducir.nextInt();
				int division=num1/num2;
				
				}
	 
	             catch (ArithmeticException errorSegundoValor0) {
				System.out.println("Asignacion a uno de los valores de la division a 0");
	              }
		 
		 	
		 System.out.println("No hay errores");
		}while(true);
		
	}
}
