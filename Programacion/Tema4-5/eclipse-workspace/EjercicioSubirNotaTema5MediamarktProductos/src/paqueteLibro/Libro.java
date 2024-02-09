package paqueteLibro;

import paqueteProducto.Producto;
import paqueteGarantia.Garantia;

public class Libro extends Producto implements Garantia{
	private String autor;
	private String genero;
	private int numeroPaginas;
	private boolean garantiaP;
	private static int cantidadLibros=0;
	
	public Libro() {
		super();
		this.autor="Autor Predeterminado";
		this.genero="Genero Predeterminado";
		this.numeroPaginas=0;
		this.garantiaP=false;
		cantidadLibros++;
	}
	
	public Libro(int newID, String newN, double newP, String newAut, String newG, int newNumP, boolean tieneG) {
		super(newID,newN,newP);
		this.autor=newAut;
		this.genero=newG;
		this.numeroPaginas=newNumP;
		this.garantiaP=tieneG;
		cantidadLibros++;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public static int getCantidadLibros() {
		return cantidadLibros;
	}

	public void estadoGarantia() {
		System.out.println("Nuestro Libro tiene garantía?" + this.garantiaP);
	}
	
	public void darGarantia() {
		if(this.garantiaP==false) {
			this.garantiaP=true;
			System.out.println("Tu libro ahora tiene garantía");
		}else{
			System.out.println("Este libro ya tiene garantía");
		}
	}
	
	public void quitarGarantia() {
		if(this.garantiaP==true) {
			this.garantiaP=false;
			System.out.println("Tu libro ya no tiene garantía");
		}else{
			System.out.println("Este libro no tenía garantía, no puedes quitarle lo que no tiene");
		}
	}
	
	public double impuestoProducto() {
		return 2.32;
	}

	@Override
	public String toString() {
		return "Autor Libro:" + getAutor() + "\nGenero:" + getGenero() + "\nNumero Paginas:"
				+ getNumeroPaginas() + "\nImpuesto de Producto:" + impuestoProducto() + "\nId Producto:"
				+ getIdProducto() + "\nNombre Producto:" + getNombre() + "\nPrecio:" + getPrecio();
	}
	
	
}
