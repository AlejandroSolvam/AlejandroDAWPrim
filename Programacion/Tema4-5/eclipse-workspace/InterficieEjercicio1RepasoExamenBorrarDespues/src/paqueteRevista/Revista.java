package paqueteRevista;

import paquetePublicacion.Publicacion;
import paquetePrestable.Prestable;
public class Revista extends Publicacion implements Prestable{
	private boolean prestado;
	private int numeroRevista;
	
	public Revista() {
		super();
		this.prestado=false;
		this.numeroRevista=0;
		
	}
	
	public Revista(int newC, String newT, int newAP,int newNR,boolean estaPrest) {
		super(newC,newT,newAP);
		this.prestado=estaPrest;
		this.numeroRevista=newNR;
	}

	public int getNumeroRevista() {
		return numeroRevista;
	}

	public void setNumeroRevista(int numeroRevista) {
		this.numeroRevista = numeroRevista;
	}

	public boolean isPrestado() {
		return prestado;
	}

	@Override
	public String toString() {
		return "Revista [getNumeroRevista()=" + getNumeroRevista() + ", isPrestado()=" + isPrestado() + ", getCodigo()="
				+ getCodigo() + ", getTitulo()=" + getTitulo() + ", getAñoPublicacion()=" + getAñoPublicacion() + "]";
	}
	
	public void prestar() {
		if(prestado==true) {
			System.out.println("La revista ya esta prestada");
		}else if(prestado==false) {
			this.prestado=true;
			System.out.println("Acabas de prestar la revista");
		}
	}
	
	public void retornar() {
		if(prestado==true) {
			this.prestado=false;
			System.out.println("Acabas de retornar la revista");
		}else if(prestado==false) {
			System.out.println("La revista ya la tienes retornada");
		}
	}
	
	public void prestat() {
		System.out.println("Esta prestada tu revista?:"+this.isPrestado());
	}
	
}
