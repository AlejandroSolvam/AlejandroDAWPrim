package paqueteLibro;

import paquetePublicacion.Publicacion;
import paquetePrestable.Prestable;

public class Libro extends Publicacion implements Prestable{

	private boolean prestado;
	
	public Libro(int newC,String newT, int newAñ, boolean estaP) {
		super(newC,newT,newAñ);
		this.prestado=estaP;
	}
	
	public Libro(int newC,String newT, int newAñ) {
		super(newC,newT,newAñ);
		this.prestado=false;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	@Override
	public String toString() {
		return "El libro esta prestado?:" + this.isPrestado() + "\n Codigo Libro:" + this.getCodigo() + "\n Titulo Libro:" + this.getTitulo()
				+ "\n Anyo de Publicacion:" + this.getAnyoPub() + "\n";
	}
	
	public void Prestar() {
		if(this.prestado==false){
			this.prestado=true;
		}else if(this.prestado==true){
			System.out.println("Este libro ya esta prestado");
		}
	}
	
	public void Retornar() {
		if(this.prestado==true){
			this.prestado=false;
		}else if(this.prestado==false){
			System.out.println("Este libro ya se ha devuelto");
		}
	}
	
	public void Prestado(){
		System.out.println("Este libro esta prestado?"+this.isPrestado());
	}
	
}
