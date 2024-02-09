package paquetePrueba;

import paqueteAnimal.Animal;
import paqueteGato.Gato;
import paquetePerro.Perro;
import paqueteListaAnimales.ListaAnimales;
public class Prueba {
	
	public static void main (String[] arg){
		ListaAnimales nuevaLista=new ListaAnimales();
		
		Animal anim= new Perro("simon") ;
		System.out.println("Constructor Animal, nombre del animal:"+anim.getNombre());
		Perro perro = (Perro) anim;
		System.out.println("Constructor perro, nombre: "+perro.getNombre());
		Animal animalPolimorfico= new Perro("paco");
		System.out.println("Constructor animal, nombre del animal: "+animalPolimorfico.getNombre());
		Perro perro1 = (Perro) animalPolimorfico;
		System.out.println("Constructor perro, nombre:"+perro1.getNombre());
		Animal gat=new Gato("mimi");
		System.out.println("Constructor Animal, nombre del animal:"+gat.getNombre());
		Gato gato = (Gato) gat;
		System.out.println("Constructor gato, nombre: "+gato.getNombre());
		anim.tipoAnimal();
		animalPolimorfico.tipoAnimal();
		gat.tipoAnimal();
		
		nuevaLista.añadir(anim);
		nuevaLista.añadir(perro);
		nuevaLista.añadir(animalPolimorfico);
		nuevaLista.añadir(perro1);
		nuevaLista.añadir(gat);
		nuevaLista.añadir(gato);
		
		nuevaLista.mostrarTodo();
	}
}
