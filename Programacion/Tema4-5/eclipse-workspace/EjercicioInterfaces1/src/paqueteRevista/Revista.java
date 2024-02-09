package paqueteRevista;

import paquetePublicacion.Publicacion;
import paquetePrestable.Prestable;

public class Revista extends Publicacion implements Prestable{
	
	private int numRevist;
	private boolean prestado;
	
	public Revista(int newC,String newT, int newAñ, int newNR,boolean estaPres) {
		super(newC,newT,newAñ);
		this.numRevist=newNR;
		this.prestado=estaPres;
	}

	public int getNumRevist() {
		return numRevist;
	}

	public void setNumRevist(int numRevist) {
		this.numRevist = numRevist;
	}

	@Override
	public String toString() {
		return "Numero Revista:" + numRevist + "\n La revista esta prestada?:" + prestado + "\n Codigo Revista:" + getCodigo()
				+ "\n Titulo Revista:" + getTitulo() + "\n Anyo de Publicacion:" + getAnyoPub() + "\n";
	}
	
	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public void Prestar() {
		if(this.prestado==false){
			this.prestado=true;
		}else if(this.prestado==true){
			System.out.println("Esta revista ya esta prestada");
		}
	}
	
	public void Retornar() {
		if(this.prestado==true){
			this.prestado=false;
		}else if(this.prestado==false){
			System.out.println("Esta revista ya se ha devuelto");
		}
	}
	
	public void Prestado(){
		System.out.println("Esta revista esta prestada?"+this.isPrestado());
	}
}
