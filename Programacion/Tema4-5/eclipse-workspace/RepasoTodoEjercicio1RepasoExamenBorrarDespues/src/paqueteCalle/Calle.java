package paqueteCalle;

import paqueteEdificio.Edificio;
import paqueteHotel.Hotel;
import paqueteParticular.Particular;
import paqueteRestaurante.Restaurante;
import java.util.Scanner;
import java.util.ArrayList;

public class Calle {
	private Scanner introducir=new Scanner(System.in);
	private ArrayList <Edificio> listaEd;
	private int cantidadEdificios;
	
	public Calle(int newCE){
		listaEd=new ArrayList();
		this.cantidadEdificios=newCE;
	}
	
	
	
	public int getCantidadEdificios() {
		return cantidadEdificios;
	}

	public void añadirEdificio(Edificio nuevoEdificio) {
		if(listaEd.size()==this.getCantidadEdificios()) {
			System.out.println("El arrayList esta lleno, tienes "+this.getCantidadEdificios()+" posiciones llenas, introduce cual quieres sustituir para introducir el nuevo eidificio.\n");
			int pos=introducir.nextInt();
			if(pos<listaEd.size()) {
				listaEd.set(pos, nuevoEdificio);
			}else {
				System.out.println("Esa posicion sobresale del limite");
			}
		}else{
			listaEd.add(nuevoEdificio);
		}
	}
	
	public void modificarEdificio() {
		System.out.println("Introduce la posicion del arraylist del edificio que quieres modificar");
		int pos=introducir.nextInt();
			if(listaEd.get(pos) instanceof Hotel) {
				Edificio modificarEd=listaEd.get(pos);
				System.out.println("Introduce la nueva cantidad de ascensores:");
				int cantAs=introducir.nextInt();
				modificarEd.setCantidadAscensores(cantAs);
				System.out.println("Introduce la cantidad de habitaciones del hotel.");
				int cantHab=introducir.nextInt();
				((Hotel)modificarEd).setCantidadHabitaciones(cantAs);
			}else if(listaEd.get(pos) instanceof Restaurante) {
				Edificio modificarEd=listaEd.get(pos);
				System.out.println("Introduce la nueva cantidad de ascensores:");
				int cantAs=introducir.nextInt();
				modificarEd.setCantidadAscensores(cantAs);
				System.out.println("Introduce la cantidad de mesas del restaurante.");
				int cantMes=introducir.nextInt();
				((Restaurante)modificarEd).setCantidadMesas(cantAs);
			}else if(listaEd.get(pos) instanceof Particular) {
				Edificio modificarEd=listaEd.get(pos);
				System.out.println("Introduce la nueva cantidad de ascensores:");
				int cantAs=introducir.nextInt();
				modificarEd.setCantidadAscensores(cantAs);
				System.out.println("Introduce la cantidad de habitajes del Particular.");
				int cantPart=introducir.nextInt();
				((Particular)modificarEd).setCantidadHabitajes(cantPart);
			    }else {
				System.out.println("No existe ningun edificio en esa posicion");
			}
		}
	
	public void mostrarEdificios() {		
		for(Edificio verEdificio:listaEd) {
			verEdificio.mostrarDatos();
		}
		System.out.println("Hay "+Hotel.getCantidadHoteles()+" hoteles," +Particular.getCantidadRestaurantes()+" particulares y "+Restaurante.getCantidadRestaurantes()+" restaurantes en total creados.");
	}
	
	public void iluminar() {
		for(Edificio verEdificio:listaEd) {
			if(verEdificio instanceof Hotel) {
				System.out.println("Este hotel tiene un total de "+((Hotel)verEdificio).cantidadLuces()+" luces.");
			}else if(verEdificio instanceof Restaurante) {
				System.out.println("Este restaurante tiene un total de "+((Restaurante)verEdificio).cantidadLuces()+" luces.");
			}else if(verEdificio instanceof Particular) {
				System.out.println("Este particular tiene un total de "+((Particular)verEdificio).cantidadLuces()+" luces.");
			}
		}
	}
	
	
}
