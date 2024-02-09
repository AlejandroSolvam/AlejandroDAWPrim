package paqueteCuadrado;

import paqueteFigura2D.Figura2D;
import paqueteColorea.Colorea;
import java.util.Scanner;
public class Cuadrado extends Figura2D implements Colorea{
	private static Scanner Introducir=new Scanner(System.in);
	private int lado;
	
	public Cuadrado() {
		super();
		this.lado=0;
	}
	
	public Cuadrado(String newN, int newG, int newC,int newL) {
		super(newN,newG,newC);
		this.lado=newL;
	}
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public int CambiarTamaño() {
		System.out.println("Introduce el nuevo tamaño que quieras que tenga el lado.");
		int nuevoLado=Introducir.nextInt();
		this.setLado(nuevoLado);
		return nuevoLado;
	}
	
	public int calcularArea() {
		return (this.getLado()*this.getLado());
	}
	
	public int calcularPerimetro() {
		return (this.getLado()+this.getLado()+this.getLado()+this.getLado());
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
		}
	}else{
		System.out.println("No puedes imprimir colores.");
	}
}
	
}
