package paqueteFigura3D;

import paqueteFigura.Figura;
public abstract class Figura3D extends Figura{
	
	public Figura3D() {
		super();
	}
	
	public Figura3D(String newN, int newG, int newC) {
		super(newN,newG,newC);
	}
	
	public abstract int calcularVolumen();
}
