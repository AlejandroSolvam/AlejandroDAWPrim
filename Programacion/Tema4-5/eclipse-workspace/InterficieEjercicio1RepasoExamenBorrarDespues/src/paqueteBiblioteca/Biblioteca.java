package paqueteBiblioteca;

import java.util.ArrayList;
import paquetePublicacion.Publicacion;
import paqueteLibro.Libro;
import paqueteRevista.Revista;
import java.util.Scanner;
public class Biblioteca {
	private ArrayList<Publicacion> listaPublic;
	private static Scanner Introducir=new Scanner(System.in);
	
	public Biblioteca() {
		listaPublic=new ArrayList();
	}
	
	public void crearYGuardarNuevaPublicacion() {
		System.out.println("Introduce que quieres crear, o una revista(1) o un libro(2)");
		int opcion=Introducir.nextInt();
		if(opcion==1) {
			System.out.println("Introduce el codigo de la revista:");
			int codR=Introducir.nextInt();
			System.out.println("Introduce el titulo de la revista:");
			String tit=Introducir.next();
			System.out.println("Introduce el anyo de publicación de la revista:");
			int anPub=Introducir.nextInt();
			System.out.println("Introduce el numero de revista de la revista:");
			int numRev=Introducir.nextInt();
			System.out.println("Introduce si la revista esta prestada o no (true o false):");
			boolean estaPr=Introducir.nextBoolean();
			Publicacion nuevaPublicacion=new Revista(codR,tit,anPub,numRev,estaPr);
			listaPublic.add(nuevaPublicacion);
		}else if(opcion==2) {
			System.out.println("Introduce el codigo de el libro:");
			int codR=Introducir.nextInt();
			System.out.println("Introduce el titulo de el libro:");
			String tit=Introducir.next();
			System.out.println("Introduce el anyo de publicación de el libro:");
			int anPub=Introducir.nextInt();
			System.out.println("Introduce si el libro esta prestado o no (true o false):");
			boolean estaPr=Introducir.nextBoolean();
			Publicacion nuevaPublicacion=new Libro(codR,tit,anPub,estaPr);
			listaPublic.add(nuevaPublicacion);
		}else {
			System.out.println("Esa opcion no existe.");
		}
	}
	
	public void modificarRevista() {
		System.out.println("Introduce el codigo de la revista que quieres modificar:");
		int codRev=Introducir.nextInt();
		for(Publicacion nuevaPublicacion:listaPublic) {
			if(nuevaPublicacion instanceof Revista) {
				System.out.println("Introduce el nuevo titulo de la revista:");
				String tit=Introducir.next();
				nuevaPublicacion.setTitulo(tit);
				System.out.println("Introduce el nuevo anyo de publicación de la revista:");
				int anPub=Introducir.nextInt();
				nuevaPublicacion.setAñoPublicacion(anPub);
				System.out.println("Introduce el nuevo numero de revista de la revista:");
				int numRev=Introducir.nextInt();
				((Revista) nuevaPublicacion).setNumeroRevista(numRev);
			}
		}
	}
	
	public void modificarLibro() {
		System.out.println("Introduce el codigo de el libro que quieres modificar:");
		int codRev=Introducir.nextInt();
		for(Publicacion nuevaPublicacion:listaPublic) {
			if(nuevaPublicacion instanceof Libro) {
				System.out.println("Introduce el nuevo titulo de el libro:");
				String tit=Introducir.next();
				nuevaPublicacion.setTitulo(tit);
				System.out.println("Introduce el nuevo anyo de publicación de el libro:");
				int anPub=Introducir.nextInt();
				nuevaPublicacion.setAñoPublicacion(anPub);
			}
		}
	}
	
	public void modificarPrestem() {
		System.out.println("Introduce el codigo de la publicacion.");
		int codP=Introducir.nextInt();
		for(Publicacion nuevaP:listaPublic) {
			if(nuevaP.getCodigo()==codP && nuevaP instanceof Revista) {
				System.out.println("Introduce que quieres hacer:\n1.Prestar.\n2.Devolver.\n3.Ver estado de publicacion");
				int opPrest=Introducir.nextInt();
				if(opPrest==1) {
					((Revista)nuevaP).prestar();
				}else if(opPrest==2) {
					((Revista)nuevaP).retornar();
				}else if(opPrest==3) {
					((Revista)nuevaP).prestat();
				}else {
					System.out.println("Esa opcion no existe");
				}
			}else if(nuevaP.getCodigo()==codP && nuevaP instanceof Libro) {
				System.out.println("Introduce que quieres hacer:\n1.Prestar.\n2.Devolver.\n3.Ver estado de publicacion");
				int opPrest=Introducir.nextInt();
				if(opPrest==1) {
					((Libro)nuevaP).prestar();
				}else if(opPrest==2) {
					((Libro)nuevaP).retornar();
				}else if(opPrest==3) {
					((Libro)nuevaP).prestat();
				}else {
					System.out.println("Esa opcion no existe");
				}
		}
	}
}
		
	public void mostrarPublicacionPorId() {
		System.out.println("Introduce el id de la publicacion que quieres ver:");
		int id=Introducir.nextInt();
		for(Publicacion nuevaPub:listaPublic) {
			if(nuevaPub.getCodigo()==id) {
				System.out.println(nuevaPub.toString());
			}
		}
	}
	
	public void mostrarPublicaciones() {
		for(Publicacion nuevaPub:listaPublic) {
				System.out.println(nuevaPub.toString());
				System.out.println("\n");
			}
		}
		
}
