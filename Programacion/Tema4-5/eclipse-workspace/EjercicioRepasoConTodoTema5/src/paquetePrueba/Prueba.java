package paquetePrueba;
/* 5. Desde el programa principal, llamaremos al método iniciarCalle, el cual creará la calle y nos mostrará los
objetos que tenemos de cada edificio y nos mostrará por pantalla “CALLE EN CONSTRUCCIÓN”. A posteriori,
llamaremos al método crearCalle, en el que se crearán edificios de diferentes tipos, incluyéndolos en la calle y hasta
y todo modificarlos, este método nos postrará por pantalla el siguiente mensaje “CALLE CREAT”.
Después, llamaremos al método MostrarCalle, el cual nos mostrará los objetos que tenemos de cada edificio, en
continuación nos mostrará los edificios incluidos en la calle con sus características y terminará mostrando
por pantalla, CALLE VISIDAD. Por último, se llamará al método IluminarCalle, que mostrará todas las luces de
cada uno de los edificios, mostrando por pantalla al final “CALLE ILUMINADO */
import paqueteCalle.Calle;
import java.util.Scanner;
public class Prueba {
	private static Scanner Introducir=new Scanner(System.in);
	public static Calle nuevaCalle=new Calle();
	
	public static void main(String[] args) {
		iniciarCalle();
		crearCalle();
		mostrarCalle();
		iluminarCalle();
	}
	
	public static void iniciarCalle() {
		System.out.println("Introduce la cantidad de edificios que puede contener tu calle:");
		int cantEd=Introducir.nextInt();
		nuevaCalle.tamañoArrayList(cantEd);
		System.out.println("CALLE EN CONSTRUCCIÓN");
	}
	
	public static void crearCalle() {
		boolean seguir=true;
		while(seguir!=false) {
			System.out.println("Introduce cual de las opciones quieres escoger.");
			System.out.println("1: Crear Hotel");
			System.out.println("2: Crear Restaurante");
			System.out.println("3: Crear Particular");
			System.out.println("4: Modificar edificio");
			System.out.println("5: Salir del menu.");
			int opcion=Introducir.nextInt();
			switch(opcion) {
			case 1:
				int nuevoHotel=1;
				nuevaCalle.crearEdificio(nuevoHotel);
				break;
			case 2:
				int nuevoRestaurante=2;
				nuevaCalle.crearEdificio(nuevoRestaurante);
				break;
			case 3:
				int nuevoParticular=3;
				nuevaCalle.crearEdificio(nuevoParticular);
				break;
			case 4:
				nuevaCalle.modificarEdificio();
				break;
			case 5:
				seguir=false;
				break;
			}
		}
		
		System.out.println("CALLE CREADA");
	}
	
	public static void mostrarCalle() {
		nuevaCalle.verEdificios();
		System.out.println("Calle Visitada.");
	}
	
	public static void iluminarCalle() {
		nuevaCalle.mostrarLuces();
	}

}
