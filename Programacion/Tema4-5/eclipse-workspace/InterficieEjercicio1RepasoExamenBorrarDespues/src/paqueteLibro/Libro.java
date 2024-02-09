package paqueteLibro;

import paquetePublicacion.Publicacion;
import paquetePrestable.Prestable;
public class Libro extends Publicacion implements Prestable{
	private boolean prestado;
	
	public Libro() {
		super();
		prestado=false;
	}
	
	public Libro(int newC, String newT, int newAP, boolean estaPrest) {
		super(newC,newT,newAP);
		prestado=estaPrest;
	}

	public boolean isPrestado() {
		return prestado;
	}
	@Override
	public String toString() {
		return "Libro [isPrestado()=" + isPrestado() + ", getCodigo()=" + getCodigo() + ", getTitulo()=" + getTitulo()
				+ ", getAñoPublicacion()=" + getAñoPublicacion() + "]";
	}
	
	public void prestar() {
		if(prestado==true) {
			System.out.println("El libro ya esta prestado");
		}else if(prestado==false) {
			this.prestado=true;
			System.out.println("Acabas de prestar el libro");
		}
	}
	
	public void retornar() {
		if(prestado==true) {
			this.prestado=false;
			System.out.println("Acabas de retornar el libro");
		}else if(prestado==false) {
			System.out.println("El libro ya lo tienes retornado");
		}
	}
	
	public void prestat() {
		System.out.println("Esta prestado tu libro?:"+this.isPrestado());
	}
	
}
