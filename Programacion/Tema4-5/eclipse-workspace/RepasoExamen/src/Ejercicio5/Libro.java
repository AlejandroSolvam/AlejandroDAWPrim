package Ejercicio5;
/* Ejercicios utilización objetos como parametros
Ejercicio 1:
Crea una clase llamada Libro con atributos como título, autor y año de publicación. Luego, crea un
método que tome un objeto Libro como parámetro e imprima la información del libro.
public class Libro {
 private String titulo;
 private String autor;
 private int añoPublicacion;
 // Constructor y métodos de acceso aquí...
}
public class Main {
 public static void mostrarInformacionLibro(Libro libro) {
...
 }
 public static void main(String[] args) {
 Libro libro = new Libro("Java Programming", "John Smith", 2022);
...
 }
} */
public class Libro {
	private String titulo;
	private String autor;
	private int añoPublicacion;
	
	Libro(){
		this.titulo="";
		this.autor="";
		this.añoPublicacion=0;
	}
	
	Libro(String tit,String aut, int añoPub){
		this.titulo=tit;
		this.autor=aut;
		this.añoPublicacion=añoPub;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String tit) {
		this.titulo=tit;
	}
	
	public String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String aut) {
		this.autor=aut;
	}
	
	public int getAñoPublicacion() {
		return this.añoPublicacion;
	}
	
	public void setAñoPublicacion(int añoP) {
		this.añoPublicacion=añoP;
	}
	
	public static void mostrarInformacionLibro(Libro nuevoLibro){
		System.out.println(nuevoLibro.getTitulo()+" "+nuevoLibro.getAutor()+" "+nuevoLibro.getAñoPublicacion());
	}
}
