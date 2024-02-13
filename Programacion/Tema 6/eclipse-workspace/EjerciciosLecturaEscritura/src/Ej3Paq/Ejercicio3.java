package Ej3Paq;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio3 {
	private static String FILE_NAME="fichero3.txt";
	
	public static void main(String [] args) {
			int contador=0;
			int palabras=0;
			int lineas=0;
			
	try {
		FileReader input = new FileReader(FILE_NAME);
		int c= input.read();
		while(c!=-1) {
			contador=contador+1;
			c=input.read();
			if(c==' ') {
				palabras++;
			}else if(c=='\n') {
				palabras++;
				lineas++;
			}
		}
		 
		input.close();
		System.out.println("Hay "+contador+" letras, "+palabras+" palabras y "+lineas+" lineas en el fichero.");
		}
	catch (IOException ex){
		System.out.println("Algo ha ocurrido");
		 }
	}
}
