package Ejercicio2;

import java.util.Scanner;
public class Ejercicio {
	
	public static void main(String [] args) {

	Scanner Introducir=new Scanner(System.in);
	
	System.out.println("Introduce el titulo de el libro:");
	System.out.println("");
	String titLib=Introducir.nextLine();
	
	System.out.println("Introduce el autor del libro:");
	System.out.println("");
	String aut=Introducir.nextLine();
	
	System.out.println("Introduce el numero de ejemplares que hay en la biblioteca:");
	System.out.println("");
	int numEjempl=Introducir.nextInt();
	
	System.out.println("Introduce el numero de ejemplares prestados que hay en la biblioteca:");
	int numEjemplPres=Introducir.nextInt();
	
	Libros primerLibro=new Libros(titLib,aut,numEjempl,numEjemplPres);
	Libros segundoLibro=new Libros();
	
	System.out.println(primerLibro.getTituloLibro() +" "+ primerLibro.getAutor() +" "+ primerLibro.getNumeroEjemplares() +" "+ primerLibro.getNumeroEjemplaresPrestados());
	System.out.println(segundoLibro.getTituloLibro() +" "+ segundoLibro.getAutor() +" "+ segundoLibro.getNumeroEjemplares() +" "+ segundoLibro.getNumeroEjemplaresPrestados());
	}
}
