package paqueteRestaurante;

import paqueteEdificio.Edificio;
import paqueteIluminación.Iluminación;

public class Restaurante extends Edificio implements Iluminación{

	private static int cantidadRestaurantes;
	private int mesasCan;

	public Restaurante() {
		super();
		mesasCan=5;
		cantidadRestaurantes++;
	}

	public Restaurante(int canAsc,int newM) {
		super(canAsc);
		mesasCan=newM;
		cantidadRestaurantes++;
	}

	public static int getCantidadRestaurantes() {
		return cantidadRestaurantes;
	}

	public int getMesasCan() {
		return mesasCan;
	}

	public void setMesasCan(int mesasCan) {
		this.mesasCan = mesasCan;
	}
	
	@Override
	public String toString() {
		return "Cantidad de Mesas Restaurante: " + getMesasCan() + "Impuesto Restaurante: " + hallarImpuesto()
				+ " Cantidad de ascensores Edificio:" + getCantidadAscensores();
	}

	public double hallarImpuesto() {
		return 500;
	}
	
	public int cantidadLuces() {
		return 2;
	}
	
}
