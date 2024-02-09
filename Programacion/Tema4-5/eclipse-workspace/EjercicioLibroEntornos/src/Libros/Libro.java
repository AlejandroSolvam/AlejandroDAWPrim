package Libros;

public class Libro {
	
	private String title;
	private String[] autores;
	private static int contador=0;
	
	Libro(){
		this.title="TituloPredeterminado";
		this.autores= new String[10];
	}
	
	Libro(String newT, int tamaño){
		this.title=newT;
		this.autores= new String[tamaño];
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String[] getAutor() {
		return this.autores;
	} 
	
	public void addAutor(String name) {
		if(contador<autores.length) {
		this.autores[contador]=name;
		contador++;
		}else{
		System.out.println("El array esta completo");	
		}
	}
}
