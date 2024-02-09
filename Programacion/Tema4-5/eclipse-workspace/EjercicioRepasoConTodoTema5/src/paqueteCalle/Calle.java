package paqueteCalle;
/* 1. Se dispone de una Calle que puede tener edificios que serán hoteles, restaurantes o particulares. Diseñar las
correspondientes clases sabiendo que todas tienen un método que es hallarImpuesto, que podrá devolver el impuesto
con o sin decimales, para cada edificación, siendo 1000 para los hoteles, 500 para los restaurantes y 750 para los hoteles
particulares. Además, de los edificios deberemos saber cuántos ascensores tienen; de los hoteles las habitaciones; de los
restaurantes las mesas; y de los particulares, las viviendas.
2. Deberemos tener en cuenta que en todo momento se puede querer saber cuántos edificios tenemos de cada tipo.
3. Crear una clase Calle que contenga una lista de edificios, que podrán ser de los distintos tipos anteriores. En el
constructor de Calle se le pasará como parámetro, la cantidad de edificios que contendrá la calle. En la Calle
se le podrán ir colocando edificios, pero no podrán eliminarse edificios, tendrán que ser reemplazados por unos
otros. Además incluirá un método que nos permita ver todos los edificios de la calle con cada una de las
sus características, incluyendo el impuesto correspondiente.
4. Crea una clase Iluminación en la que existirá un método por el que nos mostrará para los hoteles,
restaurantes y particulares, cuántas luces tiene. Siente para los hoteles 4, para los restaurantes 2 y para los particulares 10.
5. Desde el programa principal, llamaremos al método iniciarCalle, el cual creará la calle y nos mostrará los
objetos que tenemos de cada edificio y nos mostrará por pantalla “CALLE EN CONSTRUCCIÓN”. A posteriori,
llamaremos al método crearCalle, en el que se crearán edificios de diferentes tipos, incluyéndolos en la calle y hasta
y todo modificarlos, este método nos postrará por pantalla el siguiente mensaje “CALLE CREAT”.
Después, llamaremos al método MostrarCalle, el cual nos mostrará los objetos que tenemos de cada edificio, en
continuación nos mostrará los edificios incluidos en la calle con sus características y terminará mostrando
por pantalla, CALLE VISIDAD. Por último, se llamará al método IluminarCalle, que mostrará todas las luces de
cada uno de los edificios, mostrando por pantalla al final “CALLE ILUMINADO */
import java.util.ArrayList;
import paqueteEdificio.Edificio;
import java.util.Scanner;
import paqueteHotel.Hotel;
import paqueteParticulares.Particulares;
import paqueteRestaurante.Restaurante;

public class Calle {
	private ArrayList<Edificio> listaEdificios;
	private int cantidadEdificiosTotales;
	private static Scanner Introducir=new Scanner(System.in);
	
	public Calle(int newCant) {
		listaEdificios=new ArrayList();
		this.cantidadEdificiosTotales=newCant;
	}
	
	public Calle() {
		listaEdificios=new ArrayList();
		this.cantidadEdificiosTotales=4;
	}
	
	public void tamañoArrayList(int tamArr) {
		this.cantidadEdificiosTotales=tamArr;
	}
	
	public void añadirEdificio(Edificio nuevoEdificio) {
		if(listaEdificios.size()==this.cantidadEdificiosTotales) {
			System.out.println("ArrayList lleno, introduce la posicion del arrayList por el que quieres sustituir el nuevo edificio.");
			int posicion=Introducir.nextInt();
			if(posicion==listaEdificios.size()) {
			System.out.println("Esa posicion es mayor que el tamaño del arraylist.");
			}else if(posicion<listaEdificios.size()) {
				listaEdificios.set(posicion,nuevoEdificio);
			}
		}else{
			listaEdificios.add(nuevoEdificio);
		}
	}
	
	public void crearEdificio(int opcion) {
		switch(opcion) {
		case 1:
			System.out.println("Introduce la cantidad de ascensores que tiene este edificio.");
			int cantAsc=Introducir.nextInt();
			System.out.println("Introduce la cantidad de habitaciones del hotel.");
			int cantHab=Introducir.nextInt();
			Hotel nuevoHotel=new Hotel(cantAsc,cantHab);
			this.añadirEdificio(nuevoHotel);
			System.out.println("Actualmente existen "+nuevoHotel.getCantidadHoteles() +" hoteles existentes en nuestro arraylist");
			break;
		case 2:
			System.out.println("Introduce la cantidad de ascensores que tiene este edificio.");
			int cantAscR=Introducir.nextInt();
			System.out.println("Introduce la cantidad de mesas del restaurante.");
			int cantMes=Introducir.nextInt();
			Restaurante nuevoRestaurante=new Restaurante(cantAscR,cantMes);
			this.añadirEdificio(nuevoRestaurante);
			System.out.println("Actualmente existen "+nuevoRestaurante.getCantidadRestaurantes() +" restaurantes existentes en nuestro arraylist");
			break;
		case 3:
			System.out.println("Introduce la cantidad de ascensores que tiene este edificio.");
			int cantAscP=Introducir.nextInt();
			System.out.println("Introduce la cantidad de viviendas del particular.");
			int cantViv=Introducir.nextInt();
			Particulares nuevoParticular=new Particulares(cantAscP,cantViv);
			this.añadirEdificio(nuevoParticular);
			System.out.println("Actualmente existen "+nuevoParticular.getCantidadParticulares() +" restaurantes existentes en nuestro arraylist");
			break;
		case 4:
			this.modificarEdificio();
			break;
		case 5:
			break;
		}
		
	}
	
	public void verEdificios() {
		for(int i=0;i<listaEdificios.size();i++) {
			System.out.println(listaEdificios.get(i).toString());
		}
	}
	
	public void modificarEdificio() {
		System.out.println("Introduce la posicion del arraylist del edificio que quieres modificar.");
		int posicionModificar=Introducir.nextInt();
		if(posicionModificar>=listaEdificios.size()) {
			System.out.println("Esa posicion no existe");
		}else{
		Edificio edificioMod=listaEdificios.get(posicionModificar);
		if(edificioMod instanceof Hotel) {
			System.out.println("Introduce la cantidad de ascensores que tiene este edificio.");
			int cantAsc=Introducir.nextInt();
			edificioMod.setCantidadAscensores(cantAsc);
			
			System.out.println("Introduce la cantidad de habitaciones del hotel.");
			int cantHab=Introducir.nextInt();
			((Hotel) edificioMod).setHabitaciones(cantHab);
			System.out.println("Edificio Reemplazado");
		}else if(edificioMod instanceof Restaurante) {
			System.out.println("Introduce la cantidad de ascensores que tiene este edificio.");
			int cantAsc=Introducir.nextInt();
			edificioMod.setCantidadAscensores(cantAsc);
			
			System.out.println("Introduce la cantidad de mesas del restaurante.");
			int cantMes=Introducir.nextInt();
			((Restaurante) edificioMod).setMesasCan(cantMes);
			System.out.println("Edificio Reemplazado");
		}else if(edificioMod instanceof Particulares) {
			System.out.println("Introduce la cantidad de ascensores que tiene este edificio.");
			int cantAsc=Introducir.nextInt();
			edificioMod.setCantidadAscensores(cantAsc);
			
			System.out.println("Introduce la cantidad de viviendas del particular.");
			int cantViv=Introducir.nextInt();
			((Particulares) edificioMod).setViviendasCan(cantViv);
			System.out.println("Edificio Reemplazado");
		}
	}
		
 }
	
	public void mostrarLuces() {
		for(int i=0;i<listaEdificios.size();i++) {
			if(listaEdificios.get(i) instanceof Hotel) {
			Hotel nuevoHotel=(Hotel)listaEdificios.get(i);
			System.out.println("El hotel en la posicion "+ i +" de el arraylist tiene" + nuevoHotel.cantidadLuces() + " luces.\n");
			}else if(listaEdificios.get(i) instanceof Restaurante) {
				Restaurante nuevoRestaurante=(Restaurante)listaEdificios.get(i);
				System.out.println("El restaurante en la posicion "+ i +" de el arraylist tiene" + nuevoRestaurante.cantidadLuces() + " luces.\n");
		}else if(listaEdificios.get(i) instanceof Particulares) {
			Particulares nuevoParticular=(Particulares)listaEdificios.get(i);
			System.out.println("El hotel en la posicion "+ i +" de el arraylist tiene" + nuevoParticular.cantidadLuces() + " luces.\n");		System.out.println("Calle iluminada");
	}
	
}
}
	
}