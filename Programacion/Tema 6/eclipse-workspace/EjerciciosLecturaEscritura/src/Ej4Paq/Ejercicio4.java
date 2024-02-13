package Ej4Paq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*Exercici 4. Realitza un programa que òbriga un fitxer de text i escriga el seu contingut a un
altre fitxer (FileWriter). Controle les excepcions, per exemple, que s'escriga en un fitxer de
només lectura, i torne a demanar un altre nom de fitxer, fins que li donen un correcte.  */

public class Ejercicio4 {
	private static String FILE1="fichero4.txt";
	private static String FILE2="fichero5.txt";
	
	public static void main(String [] args) {
			
			
	try {
		FileReader leer = new FileReader(FILE1);
		FileWriter escribir = new FileWriter(FILE2);
		int c= leer.read();
		
		while(c!=-1) {
		escribir.write(c);
		System.out.print((char)c);
		c=leer.read();
		}
		
		leer.close();
		escribir.close();
		}
	catch (IOException ex){
		System.out.println("Algo ha ocurrido");
		 }
	}
}
