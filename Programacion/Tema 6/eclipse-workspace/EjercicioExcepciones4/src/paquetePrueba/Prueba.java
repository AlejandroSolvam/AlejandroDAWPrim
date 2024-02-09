package paquetePrueba;

import java.util.InputMismatchException;
import java.util.Scanner;
/* Exercici 1: Crea un programa per a demanar per teclat el nom a l'usuari, i a continuació sol·licitar 10
puntuacions de suposats exàmens, per a després fer-los una mitjana d'i l'eixida dels quals siga per
pantalla.
En el programa existirà el següent mètode:
1. Crea un mètode que demane les dades per pantalla realitzant un control d'errors que faça que si no
s'han introduït dades vàlides en les notes, mostre un missatge per pantalla. A més aquest mètode
guardarà les dades de les notes en un array. */
public class Prueba {
	public static int arrayInts[]= new int[10];
	
	public static void rellenarArray(){
		
		Scanner intro=new Scanner(System.in);
		System.out.println("\n");
		System.out.print("Introduce el nombre del usuario:");
		String usu = intro.next();
		
		
	 	for(int i=0;i<10;i++) {
	 		System.out.print("Introduce la nota de la posicion "+i+":");
			int nota = intro.nextInt();
			arrayInts[i]=nota;
	 	}
		
	}
		
	public static void main(String [] args) {
		boolean seguir=true;
		
		do {
		
		 try {
			 	
			 rellenarArray();
			 	
			 	System.out.println("ArrayList completado con exito");
				 for(int i=0;i<10;i++) {
				 		System.out.println(arrayInts[i]);
				 	}
			 	
			 	}
	 
	             catch (InputMismatchException valorValidoParaInt) {
				System.out.println("No puedes introducir en un int un valor que no sea este mismo.");
	              }
		 
		 finally {
			 	Scanner intro=new Scanner(System.in);
			 	System.out.println("Quieres continuar?1.Si 2.No");
			 	int esc=intro.nextInt();
			 	if(esc==1) {
			 		seguir=true;
			 	}else if(esc==2) {
			 		seguir=false;
			 	}
			 	
			 }
		
		}while(seguir!=false);
		
	}
}
