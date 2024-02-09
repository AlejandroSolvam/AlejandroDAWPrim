package EjercicioAlmacen;

import java.util.ArrayList;
import java.util.Scanner;

import Almacen.Producto;
/* Exercici 1
Un magatzem vol en tot moment tindre el control de tots els seus productes emmagatzemats.
Els seus productes estaran guardats en un ArrayList de productes. El màxim de productes emmagatzemats
serà de 100.
De cada producte es vol saber el seu nom, la seua quantitat i la seua categoria.
Per a portar aquest control, tindrem el següent menú:
1. Afegir nou producte
2. Buscar producte i modificar la quantitat.
4. Veure una llista de productes per categoria
5. Comprovar la quantitat de productes en magatzem */
public class Ejercicio {

	public static void main(String[] args) {
		ArrayList <Producto> arrayProductosAlmacen=new ArrayList();
		boolean seguir=true;
		
		while(seguir!=false) {
			System.out.println("");
			System.out.println("Bienvenido al menu de productos, intruduce la opcion que quieres escoger:");
			System.out.println("1. Afegir nou producte:");
			System.out.println("2. Buscar producte i modificar la quantitat:");
			System.out.println("3. Veure una llista de productes per categoria:");
			System.out.println("4. Comprovar todos los productos y sus características");
			System.out.println("5. Comprovar la quantitat de productes en magatzem");
			System.out.println("6. Acabar programa:");
			int opcion=0;
			Scanner Introducir=new Scanner(System.in);
			opcion=Introducir.nextInt();
			
			switch(opcion) {
			case 1:
				if(arrayProductosAlmacen.size()>=100) {
					System.out.println("Lo siento, pero no se pueden almacenar más de 100 productos en nuestro arraylist");
				}else{
					Introducir.nextLine();
					System.out.println("Introduce el nombre del producto");
					String prod=Introducir.nextLine();
					System.out.println("Introduce la categoria del producto");
					String cat=Introducir.nextLine();
					System.out.println("Introduce la cantidad de "+prod+" que hay en el almacén");
					int canPro =Introducir.nextInt();
					Producto nuevoProducto=new Producto(prod,cat,canPro);
					arrayProductosAlmacen.add(nuevoProducto);
				}
				break;
			case 2:
				if(arrayProductosAlmacen.isEmpty()){
					System.out.println("No existe ningun producto aun");
				}else{
				Introducir.nextLine();
				System.out.println("Introduce el nombre del producto que quieres buscar");
				String nomProd=Introducir.nextLine();
				for(int i=0;i<arrayProductosAlmacen.size();i++) {
					Producto variableProducto=arrayProductosAlmacen.get(i);
					if(variableProducto.getNombreProducto().equals(nomProd)){
						System.out.println("Introduce la nueva cantidad que hay de "+variableProducto.getNombreProducto()+" en el almacen:");
						int nuevaCan=Introducir.nextInt();
						variableProducto.setCantidadProducto(nuevaCan);
					}
				}
			}
				break;
			case 3:
				if(arrayProductosAlmacen.isEmpty()){
					System.out.println("No existe ningun producto aun");
				}else{
			    Introducir.nextLine();
				System.out.println("Introduce la categoria de los productos que quieres ver:");
				String busCat=Introducir.nextLine();
				for(int i=0;i<arrayProductosAlmacen.size();i++) {
					Producto variableProducto=arrayProductosAlmacen.get(i);
					if(variableProducto.getCategoria().equals(busCat)){
						System.out.println("Producto: "+variableProducto.getNombreProducto()+" Categoria: "+variableProducto.getCategoria()+" Cantidad: "+variableProducto.getCantidadProducto());
					}
				}
			}
				break;
			case 4:
				if(arrayProductosAlmacen.isEmpty()){
					System.out.println("No existe ningun producto aun");
				}else{
				for(int i=0;i<arrayProductosAlmacen.size();i++) {
					Producto variableProducto=arrayProductosAlmacen.get(i);
					System.out.println("Producto: "+variableProducto.getNombreProducto()+" Categoria: "+variableProducto.getCategoria()+" Cantidad: "+variableProducto.getCantidadProducto());
				}
			}
				break;
			case 5:
				System.out.println("Tengo en total "+arrayProductosAlmacen.size()+" productos registrados");
				break;
			case 6:
				seguir=false;
				break;
			default:
				System.out.println("No existe esta opcion, introduce una valida.");
			}

		}
	}
}
