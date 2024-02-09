package Ejercicio1;

/* Exercici 1
Defineix una classe Bomber considerant els següents atributs de classe: nom (String), cognoms (String),
edat (int), casat (boolean), especialista (boolean). Defineix un constructor que reba els paràmetres
necessaris per a la inicialització i els mètodes per a poder establir i obtindre els valors dels atributs.
Compila el codi per a comprovar que no presenta errors, crea un objecte i comprova que s'inicialitza
correctament consultant el valor dels seus atributs després d'haver creat l'objecte.  */
import java.util.Scanner;
public class Ejercicio {

	public static void main(String[]args) {
		Scanner Introducir=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		System.out.println("");
		String nombre=Introducir.nextLine();
		
		System.out.println("Introduce el apellido:");
		System.out.println("");
		String apellido=Introducir.nextLine();
		
		System.out.println("Introduce la edad:");
		System.out.println("");
		int edad=Introducir.nextInt();
		
		System.out.println("Introduce si esta casado/a o no(Responde con true o false):");
		System.out.println("");
		boolean casado=Introducir.nextBoolean();
		
		System.out.println("Introduce si es un especialista o no(Responde con true o false):");
		System.out.println("");
		boolean especialista=Introducir.nextBoolean();
		
		Bombero primerBombero=new Bombero(nombre,apellido,edad,casado,especialista);
		Bombero segundoBombero=new Bombero();
		
		System.out.println(primerBombero.getNombre() +" "+ primerBombero.getApellido() +" "+ primerBombero.getEdad() +" "+ primerBombero.getCasado() +" "+ primerBombero.getEspecialista());
		System.out.println(segundoBombero.getNombre() +" "+ segundoBombero.getApellido() +" "+ segundoBombero.getEdad() +" "+ segundoBombero.getCasado() +" "+ segundoBombero.getEspecialista());

	}
	
}
