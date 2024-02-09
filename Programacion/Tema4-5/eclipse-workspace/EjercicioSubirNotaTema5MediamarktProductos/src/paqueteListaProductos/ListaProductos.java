package paqueteListaProductos;

import java.util.Scanner;
import paqueteProducto.Producto;
import paqueteElectronico.Electronico;
import paqueteJuguete.Juguete;
import paqueteLibro.Libro;
import paqueteSonido.Sonido;
import java.util.ArrayList;

public class ListaProductos {
	private ArrayList <Producto> listaProd;
	private static Scanner Introducir=new Scanner(System.in);
	
	public ListaProductos() {
		listaProd=new ArrayList();
	}
	
	public void añadirProducto(Producto nuevoProducto) {
		listaProd.add(nuevoProducto);
	}
	
	public void modificarProducto() {
		System.out.println("Introduce el codigo del producto que quieres modificar:");
		int codP=Introducir.nextInt();
		for(Producto nuevoProducto:listaProd) {
			if(nuevoProducto.getIdProducto()==codP) {
				if(nuevoProducto instanceof Electronico) {
					System.out.println("Modificando producto electronico...");
					
					System.out.println("\nIntroduce el nuevo nombre del producto:");
					String nam=Introducir.next();
					nuevoProducto.setNombre(nam);
					
					System.out.println("\nIntroduce el nuevo precio del producto:");
					double newP=Introducir.nextDouble();
					nuevoProducto.setPrecio(newP);
					
					System.out.println("\nIntroduce la nueva marca del producto electronico:");
					String marc=Introducir.next();
					((Electronico)nuevoProducto).setMarca(marc);
					
					System.out.println("\nIntroduce el nuevo tipo de producto electronico(ordenador, telefono, etc):");
					String tipoElec=Introducir.next();
					((Electronico)nuevoProducto).setTipo(tipoElec);
					
					System.out.println("\nIntroduce el nuevo modelo para el producto electronico:");
					String modelN=Introducir.next();
					((Electronico)nuevoProducto).setModelo(modelN);
					
					System.out.println("\nIntroduce el nuevo sistema operativo para el producto electronico:");
					String sisOp=Introducir.next();
					((Electronico)nuevoProducto).setSistemaOperativo(sisOp);
					
					System.out.println("\nIntroduce el nuevo almacenamiento para el producto electronico:");
					int almN=Introducir.nextInt();
					((Electronico)nuevoProducto).setAlmacenamientoInternoGB(almN);
					
					System.out.println("Producto electrónico modificado.");
					
				}else if(nuevoProducto instanceof Juguete){
					System.out.println("Modificando producto juguete...");
					System.out.println("\nIntroduce el nuevo nombre del producto:");
					String nam=Introducir.next();
					nuevoProducto.setNombre(nam);
					System.out.println("\nIntroduce el nuevo precio del producto:");
					double newP=Introducir.nextDouble();
					nuevoProducto.setPrecio(newP);
					System.out.println("\nIntroduce la nueva restriccion de edad del producto juguete:");
					int resEd=Introducir.nextInt();
					((Juguete)nuevoProducto).setRestriccionEdad(resEd);
					System.out.println("\nIntroduce el nuevo tipo para el producto juguete(coche, peluche, etc):");
					String tipoJ=Introducir.next();
					((Juguete)nuevoProducto).setTipo(tipoJ);
					System.out.println("\nIntroduce el nuevo material del producto juguete:");
					String nMat=Introducir.next();
					((Juguete)nuevoProducto).setMaterial(nMat);
					System.out.println("\nIntroduce la nueva marca del producto juguete:");
					String nuevaM=Introducir.next();
					((Juguete)nuevoProducto).setMarca(nuevaM);
					
					System.out.println("Producto juguete modificado.");
				}else if(nuevoProducto instanceof Libro){
					System.out.println("Modificando producto libro...");
					
					System.out.println("\nIntroduce el nuevo nombre del producto:");
					String nam=Introducir.next();
					nuevoProducto.setNombre(nam);
					
					System.out.println("\nIntroduce el nuevo precio del producto:");
					double newP=Introducir.nextDouble();
					nuevoProducto.setPrecio(newP);
					
					System.out.println("\nIntroduce el nuevo autor del producto libro:");
					String autorN=Introducir.next();
					((Libro)nuevoProducto).setAutor(autorN);
										
					System.out.println("\nIntroduce el nuevo genero del producto libro:");
					String generoN=Introducir.next();
					((Libro)nuevoProducto).setGenero(generoN);
					
					System.out.println("\nIntroduce el numero de paginas del producto libro:");
					int numPag=Introducir.nextInt();
					((Libro)nuevoProducto).setNumeroPaginas(numPag);
					
					System.out.println("Producto libro modificado.");
				}else if(nuevoProducto instanceof Sonido){
					System.out.println("Modificando producto sonido...");
					
					System.out.println("\nIntroduce el nuevo nombre del producto:");
					String nam=Introducir.next();
					nuevoProducto.setNombre(nam);
					
					System.out.println("\nIntroduce el nuevo precio del producto:");
					double newP=Introducir.nextDouble();
					nuevoProducto.setPrecio(newP);
					
					System.out.println("\nIntroduce la nueva marca del producto Sonido:");
					String marcaNuev=Introducir.next();
					((Sonido)nuevoProducto).setMarca(marcaNuev);
					
					System.out.println("\nIntroduce el nuevo modelo del producto Sonido:");
					String modeloNuev=Introducir.next();
					((Sonido)nuevoProducto).setModelo(modeloNuev);
					
					System.out.println("\nIntroduce el nuevo tipo del producto Sonido(altavoces, cascos, etc):");
					String tipoNuev=Introducir.next();
					((Sonido)nuevoProducto).setTipo(tipoNuev);
					
					System.out.println("\nIntroduce la nueva conectividad del producto Sonido:(bluetooth, cable, etc)");
					String conectNuev=Introducir.next();
					((Sonido)nuevoProducto).setConectividad(conectNuev);
					
					System.out.println("\nIntroduce si incluye o no microfono el nuevo producto Sonido:(con true o false)");
					boolean incluyeM=Introducir.nextBoolean();
					((Sonido)nuevoProducto).setIncluyeMicrofono(incluyeM);
					
					System.out.println("Producto sonido modificado.");
				}
			}
		}
	}
	
	public void ver_ModificarGarantia() {
		System.out.println("Introduce el id del producto al que quieres cambiar la garantía.");
		int idP=Introducir.nextInt();
		for(Producto nuevoProducto:listaProd) {
			if(nuevoProducto.getIdProducto()==idP && nuevoProducto instanceof Electronico){
				
				System.out.println("1. Habilitar garantía.\n2. Deshabilitar garantía. \n3. Ver estado de garantía.");
				int opc=Introducir.nextInt();
				if(opc==1) {
					((Electronico)nuevoProducto).darGarantia();
				}else if(opc==2){
					((Electronico)nuevoProducto).quitarGarantia();
				}else if(opc==3) {
					((Electronico)nuevoProducto).estadoGarantia();
				}else{
					System.out.println("No existe esa opcion.");
				}
			}else if(nuevoProducto.getIdProducto()==idP && nuevoProducto instanceof Juguete){	
				System.out.println("1. Habilitar garantía.\n2. Deshabilitar garantía. \n3. Ver estado de garantía.");
				int opc=Introducir.nextInt();
				if(opc==1) {
					((Juguete)nuevoProducto).darGarantia();
				}else if(opc==2){
					((Juguete)nuevoProducto).quitarGarantia();
				}else if(opc==3) {
					((Juguete)nuevoProducto).estadoGarantia();
				}else{
					System.out.println("No existe esa opcion.");
				}
			}else if(nuevoProducto.getIdProducto()==idP && nuevoProducto instanceof Libro) {
				System.out.println("1. Habilitar garantía.\n2. Deshabilitar garantía. \n3. Ver estado de garantía.");
				int opc=Introducir.nextInt();
				if(opc==1) {
					((Libro)nuevoProducto).darGarantia();
				}else if(opc==2){
					((Libro)nuevoProducto).quitarGarantia();
				}else if(opc==3) {
					((Libro)nuevoProducto).estadoGarantia();
				}else{
					System.out.println("No existe esa opcion.");
				}
			}else if(nuevoProducto.getIdProducto()==idP && nuevoProducto instanceof Sonido){
				System.out.println("1. Habilitar garantía.\n2. Deshabilitar garantía. \n3. Ver estado de garantía.");
				int opc=Introducir.nextInt();
				if(opc==1) {
					((Sonido)nuevoProducto).darGarantia();
				}else if(opc==2){
					((Sonido)nuevoProducto).quitarGarantia();
				}else if(opc==3) {
					((Sonido)nuevoProducto).estadoGarantia();
				}else{
					System.out.println("No existe esa opcion.");
				}
			}
		}
	}
	
	public void mostrarProductos() {
		for(Producto mostrarProducto:listaProd) {
			System.out.println(mostrarProducto.toString());
			System.out.println("\n");
		}
	}
	
	public void mostrarProductoPorId() {
		System.out.println("Introduce el id del producto que quieres ver:");
		int idP=Introducir.nextInt();
		for(Producto mostrarProducto:listaProd) {
			if(mostrarProducto.getIdProducto()==idP) {
				System.out.println(mostrarProducto.toString());
				System.out.println("\n");
			}
		}
	}
	
	public void borrarProducto() {
		System.out.println("Introduce el id del producto que quieres reemplazar");
		int idProd=Introducir.nextInt();
		for(int i=0;i<listaProd.size();i++) {
			if(listaProd.get(i).getIdProducto()==idProd) {
				listaProd.remove(i);
			}
		}
	}
	
}
