package paqueteCubo;

import paqueteFigura3D.Figura3D;
import paqueteCuadrado.Cuadrado;
import paqueteColorear.Colorear;
public class Cubo extends Figura3D implements Colorear{
	private Cuadrado nuevoCuadrado;
	
	public Cubo(String newN, int newG, int newC,Cuadrado newCu) {
		super(newN,newG,newC);
		this.nuevoCuadrado=newCu;
	}

	public Cuadrado getNuevoCuadrado() {
		return nuevoCuadrado;
	}

	public void setNuevoCuadrado(Cuadrado nuevoCuadrado) {
		this.nuevoCuadrado = nuevoCuadrado;
	}
	
	public int calcularVolumen() {
		return (nuevoCuadrado.getLado()*nuevoCuadrado.getLado()*nuevoCuadrado.getLado());
	}
	
	public void dibujar() {
		System.out.println("Estas dibujando un cuadrado.");
	}
	
	public void Colorea(boolean ind) {
		if(ind==true) {
			if(this.getColor()==1) {
				System.out.println("Coloreando en el color: Azul");
			}else if(this.getColor()==2) {
				System.out.println("Coloreando en el color: Verde");
			}else if(this.getColor()==3) {
				System.out.println("Coloreando en el color: Rojo");
			}else if(this.getColor()==4) {
				System.out.println("Coloreando en el color: Naranja");
			}else {
				System.out.println("Ese color no forma parte de la paleta de colores");
			}
		}
	}
	
}
