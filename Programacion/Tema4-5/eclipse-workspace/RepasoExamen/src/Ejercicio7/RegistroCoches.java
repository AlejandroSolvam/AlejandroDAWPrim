package Ejercicio7;
import java.util.ArrayList;
public class RegistroCoches {
	private ArrayList <Coche> listaCoches;
	
	RegistroCoches(){
		listaCoches=new ArrayList();
	}
	
	public void añadirCoche(Coche newCoche) {
		listaCoches.add(newCoche);
	}
	
	public void borrarCoche(String matriculaBorrar) {
		if(listaCoches.isEmpty()) {
			System.out.println("No existen aun coches registrados");
		}else{
		int i=0;
		for(Coche cocheEliminar:listaCoches) {
			if(cocheEliminar.getMatricula().equals(matriculaBorrar)) {
				listaCoches.remove(i);
				System.out.println("Coche eliminado.");
				break;
				}
				i++;
			}
		}
	}
	
	public void cantidadCoches() {
		if(listaCoches.isEmpty()) {
			System.out.println("No existen coches registrados.");
		}else{
			System.out.println("Hay registrados "+listaCoches.size()+" coches en total");
		}
	}
	
	public void verCoches() {
		if(listaCoches.isEmpty()) {
			System.out.println("No existen coches registrados.");
		}else{
			for(Coche cocheMostrar:listaCoches) {
				System.out.println(cocheMostrar.getMarca()+" "+cocheMostrar.getModelo()+" "+cocheMostrar.getMatricula()+" "+cocheMostrar.getKilometros());
			}
		}
	}
	
	public void verCochesDeMarca(String marcaMostrar) {
		if(listaCoches.isEmpty()) {
			System.out.println("No existen coches registrados.");
		}else{
			for(Coche cocheMostrar:listaCoches) {
				if(cocheMostrar.getMarca().equals(marcaMostrar)) {
					System.out.println(cocheMostrar.getMarca()+" "+cocheMostrar.getModelo()+" "+cocheMostrar.getMatricula()+" "+cocheMostrar.getKilometros());				
				}
			}
		}
	}
}
