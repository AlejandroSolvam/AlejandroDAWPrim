package paquetePrueba;

import paqueteEdificio.Edificio;
import paqueteHotel.Hotel;
import paqueteParticular.Particular;
import paqueteRestaurante.Restaurante;
import paqueteCalle.Calle;

import java.util.Scanner;
public class Prueba {
	
	public static Calle nuevaCalle;
	
	private static Scanner Introducir=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		iniciarCalle();
		crearCalle();
		mostrarCalle();
		iluminarCalle();

	}
	
	public static void iniciarCalle() {
		System.out.println("Introduce cuantos edificios pueden tener tu arraylist.\n");
		int cantidad=Introducir.nextInt();
		nuevaCalle=new Calle(cantidad);
		System.out.println("CARRER EN CONSTRUCCIÓ");
	}
	
	public static void crearCalle() {
		boolean seguir=true;
		while(seguir!=false) {
			System.out.println("Introduce que quieres hacer:\n1.Crear Hotel.\n2.Crear Restaurante.\n3.Crear Particular.\n4.Modificar Hotel.\n5.Modificar Restaurante.\n6.Modificar Particular.\n7.Finalizar creacion de carrer.");
			int opc=Introducir.nextInt();
			if(opc==1) {
				System.out.println("Introduce la cantidad de ascensores:");
				int cantAs=Introducir.nextInt();
				System.out.println("Introduce la cantidad de habitaciones del hotel.");
				int cantHab=Introducir.nextInt();
				Hotel nuevoHotel=new Hotel(cantAs,cantHab);
				nuevaCalle.añadirEdificio(nuevoHotel);
			}else if(opc==2) {
				System.out.println("Introduce la cantidad de ascensores:");
				int cantAs=Introducir.nextInt();
				System.out.println("Introduce la cantidad de mesas del restaurante.");
				int cantMes=Introducir.nextInt();
				Restaurante nuevoRestaurante=new Restaurante(cantAs,cantMes);
				nuevaCalle.añadirEdificio(nuevoRestaurante);
			}else if(opc==3) {
				System.out.println("Introduce la cantidad de ascensores:");
				int cantAs=Introducir.nextInt();
				System.out.println("Introduce la cantidad de habitajes del particular.");
				int cantHabit=Introducir.nextInt();
				Particular nuevoParticular=new Particular(cantAs,cantHabit);
				nuevaCalle.añadirEdificio(nuevoParticular);
			}else if(opc==4) {
				nuevaCalle.modificarEdificio();
			}else if(opc==5) {
				nuevaCalle.modificarEdificio();
			}else if(opc==6) {
				nuevaCalle.modificarEdificio();
			}else if(opc==7) {
				seguir=false;
				System.out.println("CARRER CREAT");
			}
		} 
	}
	
	public static void mostrarCalle() {
		nuevaCalle.mostrarEdificios();
		System.out.println("CARRER VISITAT");
	}
	
	public static void iluminarCalle() {
		nuevaCalle.iluminar();
		System.out.println("CARRER VISITAT");
	}
	
}
