package paqueteListaAnimales;

import java.util.ArrayList;
import paqueteAnimal.Animal;
public class ListaAnimales {
	private ArrayList<Animal> listaAn;
	
	public ListaAnimales() {
		listaAn=new ArrayList();
	}
	
	public void añadir(Animal nuevoAn) {
		listaAn.add(nuevoAn);
	}
	
	public void mostrarTodo() {
		for(Animal nuevoAn:listaAn) {
			System.out.println(nuevoAn.getNombre());
			nuevoAn.tipoAnimal();
		}
	}
}
