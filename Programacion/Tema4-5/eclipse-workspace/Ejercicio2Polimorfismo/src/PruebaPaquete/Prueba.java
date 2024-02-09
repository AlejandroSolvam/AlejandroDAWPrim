package PruebaPaquete;

import AnimalPaquete.Animal;
import GatoPaquete.Gato;
import PerroPaquete.Perro;
import PaqueteConjuntAnimals.ConjuntAnimals;

public class Prueba {
	public static void main (String[] arg){
		ConjuntAnimals arrayAnimales=new ConjuntAnimals();
		
		Animal anim= new Perro("simon") ;
		System.out.println("Constructor Animal, nombre del animal : "+anim.getNombre());
		
		Perro perro = (Perro) anim;
		System.out.println("Constructor perro, nombre : "+perro.getNombre());
		
		Animal animalPolimorfico= new Perro("paco");
		System.out.println("Constructor Animal, nombre del animal : "+animalPolimorfico.getNombre());
		
		Perro perro1 = (Perro) animalPolimorfico;
		System.out.println("Constructor perro, nombre : "+perro1.getNombre());
		
		Animal gat=new Gato("mimi");
		System.out.println("Constructor Animal, nombre del animal : "+gat.getNombre());
		
		Gato gato = (Gato) gat;
		System.out.println("Constructor Gato, nombre : "+gato.getNombre());

		anim.tipoAnimal();
		animalPolimorfico.tipoAnimal();
		gat.tipoAnimal();
		
		arrayAnimales.añadirAnimales(perro);
		arrayAnimales.añadirAnimales(perro1);
		arrayAnimales.añadirAnimales(gato);
		
		arrayAnimales.mostrarAnimales();
	}
}
