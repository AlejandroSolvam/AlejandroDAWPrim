package Ejercicio1;

public class Ejercicio {
	public static void main(String [] args) {
		
		Libro miLibro=new Libro("One Piece","Eichiiro Oda", 1996);
		mostrarInformacion(miLibro);
		
	}
	
	public static void mostrarInformacion(Libro libroPasado) {
		System.out.println(libroPasado.getTituloLibro()+" "+libroPasado.getAutor()+" "+libroPasado.getAñoPublicacion());
	}
}
