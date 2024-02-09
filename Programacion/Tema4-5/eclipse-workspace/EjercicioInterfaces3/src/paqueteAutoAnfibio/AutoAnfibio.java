package paqueteAutoAnfibio;

import paqueteTransporteMaritimo.TransporteMaritimo;
import paqueteTransporteTerrestre.TransporteTerrestre;

public class AutoAnfibio implements TransporteMaritimo, TransporteTerrestre  {
	private String marca;
	private String modelo;
	
	public AutoAnfibio() {
		this.marca="Predeterminado";
		this.modelo="Modelo Predeterminado";
	}
	
	public AutoAnfibio(String newM, String newMod) {
		this.marca=newM;
		this.modelo=newMod;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void nadar() {
		System.out.println("Estoy nadando.");
	}
	
	public void andar() {
		System.out.println("Estoy andando.");
	}
}
