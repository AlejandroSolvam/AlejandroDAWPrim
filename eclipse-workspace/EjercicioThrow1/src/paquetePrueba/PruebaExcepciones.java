package paquetePrueba;
import java.io.*;
public class PruebaExcepciones {
	public static char leer() throws IOException{
				return (char) System.in.read();
	}
	public static void main(String args[]) {
	try {
	char car=leer();
	System.out.println("Caracter:" +car);
	} catch (IOException e) {
	System.out.println("Error de entrada de datos.");
	}
  }
}
