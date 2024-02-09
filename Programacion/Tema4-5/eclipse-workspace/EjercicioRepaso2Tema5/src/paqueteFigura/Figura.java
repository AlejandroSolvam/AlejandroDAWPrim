package paqueteFigura;

import paqueteCuadrado.Cuadrado;
import paqueteCubo.Cubo;

public class Figura {
	private String nombre;
	private int GrosorBorde;
	private int color;
	
	public Figura() {
		this.nombre="Nombre Predeterminado";
		this.GrosorBorde=0;
		this.color=0;
	}
	
	public Figura(String newN, int newG, int newC) {
		this.nombre=newN;
		this.GrosorBorde=newG;
		this.color=newC;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGrosorBorde() {
		return GrosorBorde;
	}

	public void setGrosorBorde(int grosorBorde) {
		GrosorBorde = grosorBorde;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public void dibujar() {
		if(this instanceof Cuadrado) {
			System.out.println("Estas dibujando un cuadrado.");
		}else if(this instanceof Cubo) {
			System.out.println("Estas dibujando un cubo.");
		}
	}
}
