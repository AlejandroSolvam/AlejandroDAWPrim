package Ej2Paq;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
EXERCICI 2
Programa que llegir per teclat línies de text i les afig al final del fitxers dades.txt. Per a resoldre-ho
modificarem el programa anterior perquè afija text al fitxer dades.txt, és a dir, en tornar a executar el
programa el contingut anterior del fitxer no es perd i el contingut nou s'afig al final */

public class Ejercicio2 {
	private static String FILE1="datos.txt";

	public static void main(String [] args){
		String cadena="fsdfds";
		
		try {
			FileWriter escribir = new FileWriter(FILE1,true);	
				
			while(!cadena.equals("FI")) {
			Scanner Introducir=new Scanner(System.in);
			System.out.println("Introduce el contenido que quieres añadir al fichero");
			cadena=Introducir.nextLine();
			if(!cadena.equals("FI")) {
				escribir.write(cadena + "\n");	
			}else {}
			}
			escribir.close();
			}
		catch (IOException ex){
			System.out.println("Algo ha ocurrido");
			 }
	}
}