package paqueteBiblioteca;

import paquetePublicacion.Publicacion;
import java.util.ArrayList;
import paqueteRevista.Revista;
import paqueteLibro.Libro;
import java.util.Scanner;
public class Biblioteca {
	private ArrayList<Publicacion> listaBiblioteca;
	private static Scanner Introducir=new Scanner(System.in);
	
	public Biblioteca() {
		this.listaBiblioteca=new ArrayList();
	}
	
	public void crearPublicacionYGuardar() {
		System.out.println("Quieres una revista o un libro? 1(Revista) 2(Libro)");
		int escoger=Introducir.nextInt();
		if(escoger==1) {
			System.out.println("Introduce el codigo de la revista: ");
			int codP=Introducir.nextInt();
			System.out.println("Introduce el titulo de la revista: ");
			String newT=Introducir.next();
			System.out.println("Introduce el año de la publicación de la revista: ");
			int newAñ=Introducir.nextInt();
			System.out.println("Introduce el numero de la revista: ");
			int numR=Introducir.nextInt();
			System.out.println("Introduce si la revista esta prestada o no");
			boolean estaPres=Introducir.nextBoolean();
			
			Publicacion newRev=new Revista(codP,newT,newAñ,numR,estaPres);
			listaBiblioteca.add(newRev);
			
		}else if(escoger==2) {
			System.out.println("Introduce el codigo del libro: ");
			int codP=Introducir.nextInt();
			System.out.println("Introduce el titulo del libro: ");
			String newT=Introducir.next();
			System.out.println("Introduce el año de la publicación del libro: ");
			int newAñ=Introducir.nextInt();
			System.out.println("Introduce si el libro esta prestado o no");
			boolean estaPres=Introducir.nextBoolean();
			
			Publicacion newLib=new Libro(codP,newT,newAñ,estaPres);
			listaBiblioteca.add(newLib);
		}
	}
	
	public void modificarRevista() {
		System.out.println("Introduce el codigo de la revista que quieres modificar");
		int codRev=Introducir.nextInt();
		for(int i=0;i<listaBiblioteca.size();i++) {
			if(listaBiblioteca.get(i) instanceof Revista && listaBiblioteca.get(i).getCodigo()==codRev) {
					Revista revistaModificar=(Revista)listaBiblioteca.get(i);
					System.out.println("Introduce el nuevo titulo para la revista");
					String nuevoT=Introducir.next();
					revistaModificar.setTitulo(nuevoT);
					System.out.println("Introduce el nuevo año de publicación para la revista");
					int nuevoAño=Introducir.nextInt();
					revistaModificar.setAnyoPub(nuevoAño);
					System.out.println("Introduce el nuevo numero para la revista");
					int nuevoNumR=Introducir.nextInt();
					revistaModificar.setNumRevist(nuevoNumR);
					}
				}
			}	
	
	public void modificarLibro() {
		System.out.println("Introduce el codigo del libro que quieres modificar");
		int codRev=Introducir.nextInt();
		for(int i=0;i<listaBiblioteca.size();i++) {
			if(listaBiblioteca.get(i) instanceof Libro && listaBiblioteca.get(i).getCodigo()==codRev) {
					Libro libroModificar=(Libro)listaBiblioteca.get(i);
					System.out.println("Introduce el nuevo titulo para el libro");
					String nuevoT=Introducir.next();
					libroModificar.setTitulo(nuevoT);
					System.out.println("Introduce el nuevo año de publicación para el libro");
					int nuevoAño=Introducir.nextInt();
					libroModificar.setAnyoPub(nuevoAño);
					}
				}
			}	
	
	public void modificarPrestem() {
		System.out.println("Introduce el codigo de la publicación a la que quieras cambiar su prestado:");
		int codRev=Introducir.nextInt();
		for(int i=0;i<listaBiblioteca.size();i++) {
					if(listaBiblioteca.get(i).getCodigo()==codRev && listaBiblioteca.get(i) instanceof Libro) {
					Libro libroModificar=(Libro)listaBiblioteca.get(i);
					System.out.println("Introduce una de las siguientes opciones:");
					System.out.println("1. Prestar libro");
					System.out.println("2. Retornar libro");
					System.out.println("3. Ver estado de libro");
					int opcPres=Introducir.nextInt();
					switch(opcPres) {
					case 1:
						libroModificar.Prestar();
						break;
					case 2:
						libroModificar.Retornar();
						break;
					case 3:
						libroModificar.Prestado();
						break;
					default:
						System.out.println("No existe esa opción");
					}
					
					}else if(listaBiblioteca.get(i).getCodigo()==codRev && listaBiblioteca.get(i) instanceof Revista){
						Revista RevistaModificar=(Revista)listaBiblioteca.get(i);
						System.out.println("Introduce una de las siguientes opciones:");
						System.out.println("1. Prestar revista");
						System.out.println("2. Retornar revista");
						System.out.println("3. Ver estado de revista");
						int opcPres=Introducir.nextInt();
						switch(opcPres) {
						case 1:
							RevistaModificar.Prestar();
							break;
						case 2:
							RevistaModificar.Retornar();
							break;
						case 3:
							RevistaModificar.Prestado();
							break;
						default:
							System.out.println("No existe esa opción");
						}
					}
					
					}
				}
	
	public void mostrarPublicacion() {
		System.out.println("Introduce el codigo de la publicacion que quieres visualizar");
		int codRev=Introducir.nextInt();
		for(Publicacion verPublicacion:listaBiblioteca) {	
			if(verPublicacion.getCodigo()==codRev && verPublicacion instanceof Libro) {
				System.out.println(verPublicacion.toString());
			}else if(verPublicacion.getCodigo()==codRev && verPublicacion instanceof Revista) {
				System.out.println(verPublicacion.toString());
			}
		}
	}
	
	public void mostrarTodasLasPublicaciones() {
		for(Publicacion verPublicacion:listaBiblioteca) {	
			if(verPublicacion instanceof Libro) {
				System.out.println(verPublicacion.toString());
			}else if(verPublicacion instanceof Revista) {
				System.out.println(verPublicacion.toString());
			}
	}
 }
	
}
