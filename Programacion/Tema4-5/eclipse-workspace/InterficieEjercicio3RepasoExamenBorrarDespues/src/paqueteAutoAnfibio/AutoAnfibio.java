package paqueteAutoAnfibio;

import paqueteTransporteMarino.TransporteMarino;
import paqueteTransporteTerrestre.TransporteTerrestre;

public class AutoAnfibio implements TransporteMarino,TransporteTerrestre {
	private String marca;
	private String modelo;
	
	public AutoAnfibio() {
		this.marca="Marca predeterminada";
		this.modelo="Modelo predeterminada";
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
	
	public void andar() {
		System.out.println("El autoAnfibio esta andando");
	}
	
	public void nadar() {
		System.out.println("El autoAnfibio esta nadando");
	}
}
