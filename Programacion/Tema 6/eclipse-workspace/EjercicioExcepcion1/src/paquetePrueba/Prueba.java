package paquetePrueba;
import java.util.InputMismatchException;
/* Exercicis de maneig d'errors
1. Exercici: Crea un programa que demane a l'usuari un número, en el cas que
el número siga invàlid (no s’ha introduït un número), el programa imprimeix un
missatge de invàlid. */
import java.util.Scanner;
public class Prueba {
	public static void main(String [] args) {
		 try {
			    Scanner introducir=new Scanner(System.in);
				System.out.print("Introduce el primer numero: ");
				double num1 = introducir.nextDouble();
				System.out.print("Introduce el segundo numero: ");
				double num2 = introducir.nextDouble();
				double division=num1/num2;
				
				}
	 
	             catch (InputMismatchException valorNoValido) {
				System.out.println("Asignacion a int invalida");
	              }
		 
		 	
		 System.out.println("No hay errores");
	}
}
