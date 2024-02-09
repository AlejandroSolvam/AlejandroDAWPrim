package paquetePerro;

import paqueteAnimal.Animal;
public class Perro extends Animal{
	public Perro(){
		super();
	}
	
	public Perro(String nombreAn){
		super(nombreAn);
	}
	
	public void tipoAnimal() {
		System.out.println("Este animal es un perro");
	}
}
