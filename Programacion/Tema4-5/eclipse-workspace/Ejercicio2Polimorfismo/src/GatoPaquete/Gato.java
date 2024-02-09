package GatoPaquete;

import AnimalPaquete.Animal;

public class Gato extends Animal{
	
	public Gato(String nombreGat) {
		super(nombreGat);
	}
	
	public void tipoAnimal() {
		System.out.println("Este animal es un gato");
	}
}
