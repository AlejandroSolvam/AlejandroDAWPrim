package paqueteGato;

import paqueteAnimal.Animal;
public class Gato extends Animal{
	
	public Gato(){
		super();
	}
	
	public Gato(String nombreAn){
		super(nombreAn);
	}
	
	public void tipoAnimal() {
		System.out.println("Este animal es un gato");
	}

}
