package paquetePrueba;

import paquetePublicacion.Publicacion;
import paqueteLibro.Libro;
import paqueteRevista.Revista;
import paqueteBiblioteca.Biblioteca;
import java.util.Scanner;
public class Prueba {
	public static void main(String []args) {
		Biblioteca nuevaBiblioteca=new Biblioteca();
		boolean seguir=true;
		Scanner Introducir=new Scanner(System.in);
		while(seguir!=false) {
			System.out.println("Introduce una de las siguientes opciones.\n1.Crear publicacion Revista o Libro.\n2.Modificar Revista.\n3.Modificar Libro.\n4.Modificar el prestado.\n5.Mostrar publicacion en concreto.\n6.Mostrar todas las publicaciones.\n7.Finalizar Programa.\n");
			int opcion=Introducir.nextInt();
			if(opcion==1){
				nuevaBiblioteca.crearYGuardarNuevaPublicacion();
			}else if(opcion==2){
				nuevaBiblioteca.modificarRevista();
			}else if(opcion==3){
				nuevaBiblioteca.modificarLibro();
			}else if(opcion==4){
				nuevaBiblioteca.modificarPrestem();
			}else if(opcion==5){
				nuevaBiblioteca.mostrarPublicacionPorId();
			}else if(opcion==6){
				nuevaBiblioteca.mostrarPublicaciones();
			}else if(opcion==7){
				seguir=false;
			}else {
				System.out.println("Esa opcion no existe.");
			}
		}
	}
}
