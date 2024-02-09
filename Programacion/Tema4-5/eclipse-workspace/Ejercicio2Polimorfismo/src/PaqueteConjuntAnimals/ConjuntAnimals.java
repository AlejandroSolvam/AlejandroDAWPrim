package PaqueteConjuntAnimals;

import AnimalPaquete.Animal;
import GatoPaquete.Gato;
import PerroPaquete.Perro;

import java.util.ArrayList;
public class ConjuntAnimals {
	private ArrayList<Animal> arrayAnimales;
	
	public ConjuntAnimals() {
		this.arrayAnimales=new ArrayList();
	}
	
	public void añadirAnimales(Animal nuevoAnimal) {
		arrayAnimales.add(nuevoAnimal);
	}
	
	public void mostrarAnimales() {
		for(int i=0;i<arrayAnimales.size();i++) {
			System.out.println(arrayAnimales.get(i).getNombre());
			arrayAnimales.get(i).tipoAnimal();
		}
	}
}
