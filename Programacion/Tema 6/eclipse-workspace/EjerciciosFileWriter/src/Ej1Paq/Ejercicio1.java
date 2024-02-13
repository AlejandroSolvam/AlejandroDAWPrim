package Ej1Paq;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* EXERCICI 1
Programa Java que llig text per teclat i ho escriu en un fitxer de text anomenat dades.txt.
El procés consisteix a llegir una línia de text per teclat i escriure-la en el fitxer.
Aquest procés es repeteix fins que s'introdueix per teclat la cadena FI.
 La cadena FI que indica el final de lectura no s'ha d'escriure en el fitxer. */

public class Ejercicio1 {
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
				escribir.append(cadena);
				escribir.append("\n");	
			}else {}
			}
			
			escribir.close();
			}
		catch (IOException ex){
			System.out.println("Algo ha ocurrido");
			 }
	}
}
