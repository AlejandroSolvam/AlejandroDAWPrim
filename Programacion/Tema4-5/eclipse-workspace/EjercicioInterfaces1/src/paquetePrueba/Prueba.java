package paquetePrueba;
import paqueteBiblioteca.Biblioteca;
import paqueteLibro.Libro;
import paqueteRevista.Revista;
import java.util.Scanner;
public class Prueba {

	public static void main(String[] args) {
		Biblioteca listaBiblioteca=new Biblioteca();
		boolean continuar=true;
		Scanner Introducir=new Scanner(System.in);
		
		while(continuar!=false) {
			System.out.println("Introduce una de las siguientes opciones:\n1. Introduir noves publicacions\n"
					+ "2. Modificar dades de revistes\n"
					+ "3. Modificar dades de llibres\n"
					+ "4. Modificar els prestem\n"
					+ "5. Mostrar les dades d'una publicació en concret\n"
					+ "6. Mostrar totes les publicacions de la biblioteca.");
			int opcion=Introducir.nextInt();
			
			switch(opcion) {
			case 1:
				listaBiblioteca.crearPublicacionYGuardar();
				break;
			case 2:
				listaBiblioteca.modificarRevista();
				break;
			case 3:
				listaBiblioteca.modificarLibro();
				break;
			case 4:
				listaBiblioteca.modificarPrestem();
				break;
			case 5:
				listaBiblioteca.mostrarPublicacion();
				break;
			case 6:
				listaBiblioteca.mostrarTodasLasPublicaciones();
				break;
			case 7:
				continuar=false;
				break;
			default:
				System.out.println("Esa opcion no existe en el programa");
			}
			
		}
	}

}
