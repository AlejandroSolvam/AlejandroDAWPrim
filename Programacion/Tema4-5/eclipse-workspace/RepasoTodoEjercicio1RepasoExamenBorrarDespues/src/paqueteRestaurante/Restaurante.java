package paqueteRestaurante;

import paqueteEdificio.Edificio;
import paqueteIluminacion.Iluminacion;

public class Restaurante extends Edificio implements Iluminacion{
	private int cantidadMesas;
	private static int cantidadRestaurantes=0;
	
	public Restaurante() {
		super();
		this.cantidadMesas=5;
		cantidadRestaurantes++;
	}
	
	public Restaurante(int newM,int newCAsc) {
		super(newCAsc);
		this.cantidadMesas=newM;
		cantidadRestaurantes++;
	}
	
	public double hallarImpuesto() {
		return 500;
	}

	public void mostrarDatos() {
		System.out.println("Restaurante [hallarImpuesto()=" + hallarImpuesto() + ", getCantidadMesas()=" + getCantidadMesas()
		+ ", getCantidadAscensores()=" + getCantidadAscensores() + "]");
	}
	
	public int cantidadLuces() {
		return 2;
	}

	public static int getCantidadRestaurantes() {
		return cantidadRestaurantes;
	}

	public int getCantidadMesas() {
		return cantidadMesas;
	}

	public void setCantidadMesas(int cantidadMesas) {
		this.cantidadMesas = cantidadMesas;
	}
}

