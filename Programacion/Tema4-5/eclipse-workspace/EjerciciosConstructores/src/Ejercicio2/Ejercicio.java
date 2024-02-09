package Ejercicio2;

import java.util.Scanner;
public class Ejercicio {
	
	public static void main(String [] args){
	
	Scanner Introducir=new Scanner(System.in);
	Contacto primerContacto = new Contacto();
	Contacto segundoContacto = new Contacto();
	String nombreContacto="";
	long telef;
	int pref;
	
	System.out.println("Introduce el nombre del contacto:");
	nombreContacto=Introducir.nextLine();
	
	primerContacto.setNombre(nombreContacto);
	
	System.out.println("Introduce el nombre del segundo contacto:");
	nombreContacto=Introducir.nextLine();
	
	segundoContacto.setNombre(nombreContacto);
	
	System.out.println("Introduce el prefijo del primer contacto:");
	pref=Introducir.nextInt();
	System.out.println("Introduce el numero del primer contacto:");
	telef=Introducir.nextLong();
	
	Telefono primerTelefono = new Telefono(pref,telef,primerContacto);
	
	System.out.println("Introduce el prefijo del segundo contacto:");
	pref=Introducir.nextInt();
	System.out.println("Introduce el numero del segundo contacto:");
	telef=Introducir.nextLong();
	
	Telefono segundoTelefono = new Telefono(pref,telef,segundoContacto);
	
	System.out.println("El prefijo del primer contacto es "+primerTelefono.getPrefijo()+", el numero es "+primerTelefono.getNumero()+", y el nombre del contacto es "+primerTelefono.getContacto());
	System.out.println("El prefijo del segundo contacto es "+segundoTelefono.getPrefijo()+", el numero es "+segundoTelefono.getNumero()+", y el nombre del contacto es "+segundoTelefono.getContacto());
	}
	
}
