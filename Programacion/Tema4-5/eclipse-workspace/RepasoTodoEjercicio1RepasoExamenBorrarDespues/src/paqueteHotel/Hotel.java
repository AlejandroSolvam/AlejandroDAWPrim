package paqueteHotel;

import paqueteEdificio.Edificio;
import paqueteIluminacion.Iluminacion;
public class Hotel extends Edificio implements Iluminacion{
	private int cantidadHabitaciones;
	private static int cantidadHoteles=0;
	
	public Hotel() {
		super();
		this.cantidadHabitaciones=5;
		cantidadHoteles++;
	}
	
	public Hotel(int newCH,int newCAsc) {
		super(newCAsc);
		this.cantidadHabitaciones=newCH;
		cantidadHoteles++;
	}
	
	public double hallarImpuesto() {
		return 1000;
	}

	public void mostrarDatos() {
		System.out.println("Hotel [hallarImpuesto()=" + hallarImpuesto() + ", getCantidadHabitaciones()="
				+ getCantidadHabitaciones() + ", getCantidadAscensores()=" + getCantidadAscensores() + "]"); 
	}
	
	public int cantidadLuces() {
		return 4;
	}

	public int getCantidadHabitaciones() {
		return cantidadHabitaciones;
	}

	public void setCantidadHabitaciones(int cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}

	public static int getCantidadHoteles() {
		return cantidadHoteles;
	}

	
	
	
}
