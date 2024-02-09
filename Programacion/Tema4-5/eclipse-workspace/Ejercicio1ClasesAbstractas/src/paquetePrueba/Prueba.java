package paquetePrueba;

import personaPaquete.Persona;
import actorPaquete.Actor;
import peliculasPaquete.Peliculas;


import java.util.Scanner;
public class Prueba {
	public static void main(String[]args) {
		Scanner introducir=new Scanner(System.in);
		Actor[] arrayActores=new Actor[5];
		
		arrayActores[0]=new Actor("Lorenzo","Perdidos");
		arrayActores[1]=new Actor("Alejandro","Solo en casa");
		arrayActores[2]=new Actor("Tobias","El padrino");
		arrayActores[3]=new Actor("Manuel","La colmena");
		arrayActores[4]=new Actor("Tania","Ice Age");
		
		System.out.println("Introduce el nombre de la peli que quieres comparar");
		String peli=introducir.nextLine();
		Peliculas conjuntoPelis=new Peliculas();
		conjuntoPelis.mostrarReparto(arrayActores, peli);
	
	}
}
