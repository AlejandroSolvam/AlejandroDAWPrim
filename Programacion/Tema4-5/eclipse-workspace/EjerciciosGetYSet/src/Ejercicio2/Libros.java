package Ejercicio2;
/* Exercici 2
Crea una classe anomenada Llibre que guarde la informació de cadascun dels llibres d'una biblioteca.
La classe ha de guardar el títol del llibre, autor, nombre d'exemplars del llibre i nombre d'exemplars prestats.
La classe contindrà els següents mètodes:
Constructor per defecte.
Constructor amb paràmetres.
Mètodes Setters/getters
Escriu un programa per a provar el funcionament de la classe Llibre.  */

public class Libros {

	private String tituloLibro;
	private String autor;
	private int numeroDeEjemplares;
	private int numeroDeEjemplaresPrestados;
	
	Libros(){
		this.tituloLibro="Don Quijote De La Mancha";
		this.autor="Miguel De Cervantes";
		this.numeroDeEjemplares=3000;
		this.numeroDeEjemplaresPrestados=48;
	}
	
	Libros(String tit,String aut, int numEj, int numEjPres){
		this.setTituloLibro(tit);
		this.setAutor(aut);
		this.setNumeroEjemplares(numEj);
		this.setNumeroEjemplaresPrestados(numEjPres);
	}
	
	String getTituloLibro() {
		return this.tituloLibro;
	}
	
	void setTituloLibro(String newTitulo) {
		this.tituloLibro=newTitulo;
	}
	
	String getAutor() {
		return this.autor;
	}
	
	void setAutor(String newAutor) {
		this.autor=newAutor;
	}
	
	int getNumeroEjemplares() {
		return this.numeroDeEjemplares;
	}
	
	void setNumeroEjemplares(int newNumEj) {
		this.numeroDeEjemplares=newNumEj;
	}
	
	int getNumeroEjemplaresPrestados() {
		return this.numeroDeEjemplaresPrestados;
	}
	
	void setNumeroEjemplaresPrestados(int newNumEjPres) {
		this.numeroDeEjemplaresPrestados=newNumEjPres;
	}
}
