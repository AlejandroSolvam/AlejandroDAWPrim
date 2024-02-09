package AnimalPaquete;

import GatoPaquete.Gato;
import PerroPaquete.Perro;

public abstract class Animal {
	private String nombre;
	
	public Animal() {
		this.nombre="Predeterminado";
	}
	
	public Animal(String newN) {
		this.nombre=newN;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	abstract public void tipoAnimal();
} 
