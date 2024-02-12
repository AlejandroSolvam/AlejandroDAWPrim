package Ej2Paq;

/* Ejercicio2.
Escriu un programa que demane dades per pantalla (nom i edat) i els introduïsca en un fitxer. */

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

	public class Ejercicio2 {
	private static String FILE_NAME ="fichero2.txt";
	public static void main(String[] args) {
		
	boolean seguir=true;
	try {
	Scanner introducir=new Scanner(System.in);
	int sino=0;
	FileWriter output = new FileWriter(FILE_NAME);
	while(seguir!=false) {
	System.out.println("Introduce el nombre de la persona.");
	String nam=introducir.next();
	System.out.println("Introduce la edad de la persona");
	int ed=introducir.nextInt();
	output.write("Nombre persona:"+ nam + " Edad Persona:" + ed + "\n");
	System.out.println("Quieres seguir introduciendo nombre y edad? 1.Si 2.No");
	sino=introducir.nextInt();
	if(sino==1) {
		seguir=true;
	}else if(sino==2) {
		seguir=false;
	}
	}
	output.close();
	}
	catch(IOException ex) {
	System.out.println("Algo malo ha ocurrido");
	}
	}
	} 
