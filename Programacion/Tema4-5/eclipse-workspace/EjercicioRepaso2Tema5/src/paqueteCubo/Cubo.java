package paqueteCubo;

import paqueteCuadrado.Cuadrado;
import paqueteFigura3D.Figura3D;
import paqueteColorea.Colorea;
public class Cubo extends Figura3D implements Colorea{
	private Cuadrado cuad; 
	
	public Cubo(String newN, int newG, int newC,Cuadrado nuevoCuadrado) {
		super(newN,newG,newC);
		this.cuad=nuevoCuadrado;
	}
	
	public Cuadrado getCuad() {
		return cuad;
	}

	public void setCuad(Cuadrado cuad) {
		this.cuad = cuad;
	}

	public int calcularVolumen() {
		return cuad.getLado()*cuad.getLado()*cuad.getLado();
	}
	
	public void Colorear(boolean ind) {
		String color;
		if(ind==true) {
		if(this.getColor()==1) {
			System.out.println("Coloreando en el color: Azul");
		}else if(this.getColor()==2) {
			System.out.println("Coloreando en el color: Rojo");
		}else if(this.getColor()==3) {
			System.out.println("Coloreando en el color: Naranja");
		}else if(this.getColor()==4) {
			System.out.println("Coloreando en el color: Violeta");
		}else{
			System.out.println("No se ha detectado el color.");
		}
	}else{
		System.out.println("No puedes imprimir colores.");
	}
}
	
}
