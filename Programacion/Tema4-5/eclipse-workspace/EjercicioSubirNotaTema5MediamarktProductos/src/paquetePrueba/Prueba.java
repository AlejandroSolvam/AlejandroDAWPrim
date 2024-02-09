package paquetePrueba;

import java.util.Scanner;
import paqueteProducto.Producto;
import paqueteElectronico.Electronico;
import paqueteJuguete.Juguete;
import paqueteLibro.Libro;
import paqueteSonido.Sonido;
import paqueteListaProductos.ListaProductos;
import java.util.ArrayList;

public class Prueba {
	private static ListaProductos nuevaLista=new ListaProductos();
	
	public static void main(String [] args) {
		boolean seguir=true;
		Scanner Introducir=new Scanner(System.in);
		while(seguir!=false) {
			System.out.println("Bienvenido al menu de Mediamarkt.");
			System.out.println("Introduce una de las siguientes opciones.\n1.Crear objeto Electronico.\n"
					+ "2.Crear objeto Juguete.\n3.Crear objeto Libro. \n4.Crear objeto Sonido.\n"
					+ "5.Modificar Producto.\n6.Ver/Modificar garantia.\n7.Borrar un producto.\n"
					+ "8.Mostrar todos los productos.\n9. Mostrar producto en concreto.\n"
					+ "10. Finalizar programa.");
			int opcion=Introducir.nextInt();
			if(opcion==1) {
				System.out.println("Introduce el id del nuevo producto:\n");
				int idProd=Introducir.nextInt();
				System.out.println("Introduce el nombre del nuevo producto:\n");
				String nombreP=Introducir.next();
				System.out.println("Introduce el precio del nuevo producto:\n");
				double precioP=Introducir.nextDouble();
				System.out.println("Introduce la marca del nuevo producto:\n");
				String newMarc=Introducir.next();
				System.out.println("Introduce el tipo del nuevo producto:\n");
				String tipoEl=Introducir.next();
				System.out.println("Introduce el modelo del nuevo producto:\n");
				String tipoMod=Introducir.next();
				System.out.println("Introduce el sistema operativo del nuevo producto:\n");
				String sisOpEl=Introducir.next();
				System.out.println("Introduce el almacenamiento interno del nuevo producto:\n");
				double AlmEl=Introducir.nextDouble();
				System.out.println("Introduce si tiene garantia el nuevo producto(con true o false):\n");
				boolean garanEl=Introducir.nextBoolean();
				Electronico nuevoElectronico=new Electronico(idProd,nombreP,precioP,newMarc,tipoEl,tipoMod,sisOpEl,AlmEl,garanEl);
				nuevaLista.añadirProducto(nuevoElectronico);
				System.out.println("Producto electronico añadido a nuestra tienda.");
			}else if(opcion==2){
				System.out.println("Introduce el id del nuevo producto:\n");
				int idProd=Introducir.nextInt();
				System.out.println("Introduce el nombre del nuevo producto:\n");
				String nombreP=Introducir.next();
				System.out.println("Introduce el precio del nuevo producto:\n");
				double precioP=Introducir.nextDouble();
				System.out.println("Introduce la restriccion de edad del nuevo producto:\n");
				int restEdad=Introducir.nextInt();
				System.out.println("Introduce el tipo del nuevo producto:\n");
				String tipoEl=Introducir.next();
				System.out.println("Introduce el material del nuevo producto:\n");
				String materialJug=Introducir.next();
				System.out.println("Introduce la marca del nuevo producto:\n");
				String marcaJug=Introducir.next();
				System.out.println("Introduce si tiene garantia el nuevo producto(con true o false):\n");
				boolean garanEl=Introducir.nextBoolean();
				Juguete nuevoJuguete=new Juguete(idProd,nombreP,precioP,restEdad,tipoEl,materialJug,marcaJug,garanEl);
				nuevaLista.añadirProducto(nuevoJuguete);
				System.out.println("Producto juguete añadido a nuestra tienda.");
			}else if(opcion==3) {
				System.out.println("Introduce el id del nuevo producto:\n");
				int idProd=Introducir.nextInt();
				System.out.println("Introduce el nombre del nuevo producto:\n");
				String nombreP=Introducir.next();
				System.out.println("Introduce el precio del nuevo producto:\n");
				double precioP=Introducir.nextDouble();
				System.out.println("Introduce el autor del nuevo producto:\n");
				String autorLib=Introducir.next();
				System.out.println("Introduce el genero del nuevo producto:\n");
				String generoLib=Introducir.next();
				System.out.println("Introduce el numero de paginas del nuevo producto:\n");
				int paginasLibro=Introducir.nextInt();
				System.out.println("Introduce si tiene garantia el nuevo producto(con true o false):\n");
				boolean garanEl=Introducir.nextBoolean();
				Libro nuevoLibro=new Libro(idProd,nombreP,precioP,autorLib,generoLib,paginasLibro,garanEl);
				nuevaLista.añadirProducto(nuevoLibro);
				System.out.println("Producto Libro añadido a nuestra tienda.");
			}else if(opcion==4) {
				System.out.println("Introduce el id del nuevo producto:\n");
				int idProd=Introducir.nextInt();
				System.out.println("Introduce el nombre del nuevo producto:\n");
				String nombreP=Introducir.next();
				System.out.println("Introduce el precio del nuevo producto:\n");
				double precioP=Introducir.nextDouble();
				System.out.println("Introduce la marca del nuevo producto:\n");
				String marcaSon=Introducir.next();
				System.out.println("Introduce el modelo del nuevo producto:\n");
				String modeloSon=Introducir.next();
				System.out.println("Introduce el tipo del nuevo producto:\n");
				String tipoSon=Introducir.next();
				System.out.println("Introduce la conectividad del nuevo producto:\n");
				String conSon=Introducir.next();
				System.out.println("Introduce si tiene microfono el nuevo producto:\n");
				boolean tieneM=Introducir.nextBoolean();
				System.out.println("Introduce si tiene garantia el nuevo producto(con true o false):\n");
				boolean garanEl=Introducir.nextBoolean();
				Sonido nuevoSonido=new Sonido(idProd,nombreP,precioP,marcaSon,modeloSon,tipoSon,conSon,tieneM,garanEl);
				nuevaLista.añadirProducto(nuevoSonido);
				System.out.println("Producto Sonido añadido a nuestra tienda.");
			}else if(opcion==5) {
				nuevaLista.modificarProducto();
			}else if(opcion==6) {
				nuevaLista.ver_ModificarGarantia();
			}else if(opcion==7) {
				nuevaLista.borrarProducto();
			}else if(opcion==8) {
				nuevaLista.mostrarProductos();
			}else if(opcion==9) {
				nuevaLista.mostrarProductoPorId();
			}else if(opcion==10) {
				seguir=false;
			}
			
		}
	}
}
