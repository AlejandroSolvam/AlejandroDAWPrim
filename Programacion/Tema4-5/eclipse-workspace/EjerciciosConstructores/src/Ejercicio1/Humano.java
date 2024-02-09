package Ejercicio1;

/* 1. Crea la siguiente clase con su correspondiente/es constructor/es:
Clase Humano:
Atributos:
• String nombre
• byte edad
Métodos:
• Humano(String nombre, byte edad)
• public String getNombre()
• public void setNombre(String nombre)
• public boolean equals(Humano otro)
Para implementar el método equals debe saber que:
Dos humanos se consideran iguales si tienen la misma edad y el mismo nombre. */

public class Humano {

	private String nombre;
	private byte edad;
	
	Humano(String name,byte ed) {
		this.nombre=name;
		this.edad=ed;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nomb) {
		this.nombre=nombre;
	}
	
	public boolean equals(Humano primero, Humano segundo) {
		boolean sonIguales;
		if(primero.nombre.equals(segundo.nombre) && primero.edad==segundo.edad) {
			sonIguales=true;
			return sonIguales;
		}else
		sonIguales=false;
		return sonIguales;
	}
	
}
