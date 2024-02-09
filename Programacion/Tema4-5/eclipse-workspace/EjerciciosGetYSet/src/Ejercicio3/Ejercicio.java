package Ejercicio3;
/* Exercici 3
Crear una Classe Data a Java. La classe tindrà tres atributs privats dia, mes i any de tipus int. La classe
contindrà els següents mètodes:
Constructor per defecte.
Constructor amb tres paràmetres per a crear objectes amb valors inicials.
Mètodes Setters/getters
Escriu un programa per a provar la classe Data.  */

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[]args) {
		
		Scanner Introducir=new Scanner(System.in);
		
		System.out.println("Introduce el dia:");
		System.out.println("");
		int dia=Introducir.nextInt();
		
		System.out.println("Introduce el mes:");
		System.out.println("");
		int mes=Introducir.nextInt();
		
		System.out.println("Introduce el anyo:");
		System.out.println("");
		int año=Introducir.nextInt();
		
		Fecha primeraFecha=new Fecha(dia,mes,año);
		Fecha segundaFecha=new Fecha();
		
		System.out.println(primeraFecha.getDia() +" "+ primeraFecha.getMes() +" "+ primeraFecha.getAño());
		System.out.println(segundaFecha.getDia() +" "+ segundaFecha.getMes() +" "+ segundaFecha.getAño());
	}

}
