package paqueteCuadrado;

import paqueteFigura2D.Figura2D;
import paqueteColorear.Colorear;
import java.util.Scanner;
public class Cuadrado extends Figura2D implements Colorear{
	private static Scanner Introducir=new Scanner (System.in);
	private int lado;
	
	public Cuadrado() {
		super();
		this.lado=0;
	}
	
	public Cuadrado(String newN, int newG, int newC, int newL) {
		super(newN,newG,newC);
		this.lado=newL;
	}
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int calcularArea() {
		return this.lado*2;
	}
	
	public int calcularPerimetro() {
		return (this.lado+this.lado+this.lado+this.lado);
	}
	
	public void cambiarTamaño() {
		System.out.println("Introduce el nuevo tamaño del lado del cuadrado");
		int tamC=Introducir.nextInt();
		this.setLado(tamC);
	}
	
	public void dibujar() {
		System.out.println("Estas dibujando un cuadrado");
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
