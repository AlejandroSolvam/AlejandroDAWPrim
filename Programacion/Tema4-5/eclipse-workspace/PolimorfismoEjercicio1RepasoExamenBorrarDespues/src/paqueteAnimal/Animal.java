package paqueteAnimal;

public abstract class Animal {
	private String nombre;
	
	public Animal() {
		this.nombre="Animal predeterminado";
	}
	
	public Animal(String newN) {
		this.nombre=newN;
	}
	
	public abstract void tipoAnimal();
	
	public String getNombre() {
		return this.nombre;
	}
}
