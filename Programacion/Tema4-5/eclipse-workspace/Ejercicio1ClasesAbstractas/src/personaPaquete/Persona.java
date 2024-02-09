package personaPaquete;
/* Exercici 1.- Corregeix el codi de les següents classes perquè el mètode mostrarReparto funcione
correctament: */

public abstract class Persona{
	
private String nombre;
public Persona(String nombre) {
	this.nombre = nombre; 
  }
	public String getNombre() {
		return this.nombre;
	}
}
