package paqueteHotel;

import paqueteEdificio.Edificio;
import paqueteIluminación.Iluminación;

public class Hotel extends Edificio implements Iluminación{
	private static int cantidadHoteles;
	private int habitaciones;
	
	public Hotel(){
		super();
		habitaciones=5;
		cantidadHoteles++;
	}
	
	public Hotel(int canAsc,int newHab) {
		super(canAsc);
		habitaciones=newHab;
		cantidadHoteles++;
	}
	
	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public static int getCantidadHoteles() {
		return cantidadHoteles;
	}

	@Override
	public String toString() {
		return "Cantidad de habitaciones hotel: " + getHabitaciones() + " Impuesto Hotel: " + hallarImpuesto()
				+ " Cantidad ascensores edificio: " + getCantidadAscensores();
	}

	public double hallarImpuesto() {
		return 1000;
	}
	
	public int cantidadLuces() {
		return 4;
	}
}
