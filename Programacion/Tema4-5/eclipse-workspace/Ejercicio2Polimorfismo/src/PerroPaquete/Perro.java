package PerroPaquete;

import AnimalPaquete.Animal;

public class Perro extends Animal{
	
	public Perro(String nombrePerr) {
		super(nombrePerr);
	}
	
	public void tipoAnimal() {
		System.out.println("Este animal es un perro");
	}
	
}
