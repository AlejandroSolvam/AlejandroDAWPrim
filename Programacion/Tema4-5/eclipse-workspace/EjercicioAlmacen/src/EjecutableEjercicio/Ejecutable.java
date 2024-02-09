package EjecutableEjercicio;
import java.util.Scanner;
import java.util.ArrayList;
import Almacen.Producto;
import AlmacenRegistro.AlmacenArray;

public class Ejecutable {

	public static void main(String[] args) {
		AlmacenArray listaAlmacen=new AlmacenArray(); 
		
		Scanner Introducir=new Scanner(System.in);
		boolean seguir=true;
		while(seguir!=false) {
		System.out.println("1. Afegir nou producte.");
		System.out.println("2. Buscar producte i modificar la quantitat.");
		System.out.println("3. Veure una llista de productes per categoria.");
		System.out.println("4. Comprovar la quantitat de productes en magatzem.");
		System.out.println("5. Salir del programa");
		int opcion=Introducir.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Introduce el nombre del producto");
			String producto=Introducir.next();
			System.out.println("Introduce la cantidad de unidades del producto");
			int cantid=Introducir.nextInt();
			System.out.println("Introduce la categoria del producto");
			String categ=Introducir.next();
			System.out.println("Introduce el codigo del producto");
			int codProducto=Introducir.nextInt();
			Producto newProducto=new Producto(producto,cantid,categ,codProducto);
			listaAlmacen.añadirProducto(newProducto);
			break;
		case 2:
			System.out.println("Introduce el codigo del producto");
			int buscarCod=Introducir.nextInt();
			System.out.println("Introduce la nueva cantidad de unidades del producto");
			int newCan=Introducir.nextInt();
			listaAlmacen.modificarCantidadProducto(buscarCod, newCan);;
			break;
		case 3:
			System.out.println("Introduce la categoria de los productos que quieres ver:");
			String buscarCat=Introducir.next();
			listaAlmacen.verProductosCategoria(buscarCat);
			break;
		case 4:
			listaAlmacen.cantidadProductos();
			break;
		case 5:
			seguir=false;
			break;
		default:
			System.out.println("La opcion no existe.");
		}
		}
	}

}
