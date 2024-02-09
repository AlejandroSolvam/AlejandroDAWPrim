package Ejercicio2;
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
	
	Humano(String name, byte ed){
		this.nombre=name;
		this.edad=ed;
	}
	
	Humano(){
		this.nombre="Predeterminado";
		this.edad=0;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String newN){
		this.nombre=newN;
	}
	
	public byte getEdad(){
		return this.edad;
	}
	
	public void setEdad(byte newE){
		this.edad=newE;
	}
	
	public boolean equals(Humano otherHum){
		if(otherHum.getNombre().equals(this.nombre) && otherHum.getEdad()==this.edad){
			return true;
		}
		return false;
	}
}
