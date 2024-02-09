package PaqueteSeleccionFutbol;
import PaqueteEntrenador.Entrenador;
import PaqueteFutbolista.Futbolista;
import PaqueteMasajista.Masajista;

public class SeleccionFutbol {
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	public SeleccionFutbol() {
		this.id=0;
		this.nombre="Nombre Predeterminado";
		this.nombre="Apellido Predeterminado";
		this.edad=0;
	}
	
	public SeleccionFutbol(int newId, String newN, String newAp, int newE) {
		this.id=newId;
		this.nombre=newN;
		this.apellidos=newAp;
		this.edad=newE;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellidos;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void viajar() {
		System.out.println("La seleccion espanyola viaja para poder disputar un nuevo encuentro.");
	}
	
	public void Concentrarse() {
		System.out.println("La seleccion espanyola se encuentra actualmente en una concentracion.");
	}
	
	public void entrenamiento() {
		System.out.println("La seleccion espanyola se encuentra actualmente entrenando.");
	}
	
	public void partidoFutbol() {
		System.out.println("La seleccion espanyola se encuentra actualmente disputando un encuentro de futbol.");
	}

}
