package paquetePrueba;

import java.util.Scanner;

/* 3 Exercici: Elabore un programa que continga un array de 3 enters i demana
ingressar un valor en alguna posició, ocorrerà un error si la posició no existeix,
el programa haurà de manejar l'error,mostrar un missatge i tornar a demanar
un valor i una posició fins que el array estiga ple. */
public class Prueba {
	public static void main(String [] args) {
		boolean seguir=true;
		do {
		
		 try {
			 	int arrayInts[]=arrayInts = new int[3];
			 	
			 	int faltar=3;
			    Scanner introducir=new Scanner(System.in);
			    for(int i=0;i<arrayInts.length;i++) {
			    	if(arrayInts[i]==0) {
			    	System.out.print("Introduce el numero: ");
					int num = introducir.nextInt();
					System.out.print("Introduce la posicion donde quieres introducir el numero: ");
					int pos = introducir.nextInt();
					arrayInts[pos]=num;
					faltar--;
			    	}
			    }
			    
				if(faltar==0) {
					System.out.println("Array lleno");
					seguir=false;
				}
			
				}
	 
	             catch ( ArrayIndexOutOfBoundsException salidaPosicionArray) {
				System.out.println("Posicion no existente en el array, no puedes introducir algo en una posicion que no cabe en tu array");
	              }
		 
		 	
		 System.out.println("No hay errores");
		}while(seguir!=false);
		
	}
}
