package Ejercicio2;

public class Contacto{
	
	private String nombre;
	
	Contacto(){
	this.nombre = "";
	}
	
	Contacto(String newN){
		this.nombre = newN;
	}
	
	public String getNombre(){
	return this.nombre;
	}
	
	public void setNombre(String n){
	this.nombre = n;
	}
}
