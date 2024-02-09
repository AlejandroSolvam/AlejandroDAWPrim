package actorPaquete;

import personaPaquete.Persona;

public class Actor extends Persona {
	
	private String pelicula;
	
	public Actor(String nombre, String pelicula) {
		super(nombre);
		this.pelicula = pelicula;
	}
	
	@Override
	public String toString() {
		return "Actor [pelicula=" + pelicula + ", getNombre()=" + super.getNombre() + "]";
	}

	public String getPelicula() {
		return this.pelicula;
	}
}