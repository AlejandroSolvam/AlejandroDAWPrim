package Ejercicio1;

public class Libro {
	
	private String titulo;
	private String autor;
	private int añoPublicación;
	
	Libro(){
		this.titulo="Don Quijote de la Mancha";
		this.autor="Cervantes";
		this.añoPublicación=1932;
	}
	
	Libro(String tit,String aut, int añoPub){
		this.setTituloLibro(tit);
		this.setAutor(aut);
		this.setAñoPublicacion(añoPub);
	}
	
	String getTituloLibro() {
		return this.titulo;
	}
	
	void setTituloLibro(String newTitulo) {
		this.titulo=newTitulo;
	}
	
	String getAutor() {
		return this.autor;
	}
	
	void setAutor(String newAutor) {
		this.autor=newAutor;
	}
	
	int getAñoPublicacion() {
		return this.añoPublicación;
	}
	
	void setAñoPublicacion(int newAñoPubli) {
		this.añoPublicación=newAñoPubli;
	}

}
