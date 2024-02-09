package paqueteFigura2D;

import paqueteFigura.Figura;

public abstract class Figura2D extends Figura{
	
	public Figura2D() {
		super();
	}
	
	public Figura2D(String newN, int newG, int newC) {
		super(newN,newG,newC);
	}
	
	public abstract void dibujar();
	public abstract int calcularArea();
	public abstract int calcularPerimetro();
}
