package PaquetePrueba;

import PaqueteSeleccionFutbol.SeleccionFutbol;
import PaqueteFutbolista.Futbolista;
import PaqueteEntrenador.Entrenador;
import PaqueteMasajista.Masajista;

public class Prueba {
	
	public static SeleccionFutbol[] integrantes = new SeleccionFutbol[3];
	
	public static void main(String[] args) {
	
	SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
	SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
	SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);
	integrantes[0]= delBosque;
	integrantes[1]= iniesta;
	integrantes[2]= raulMartinez;
	// CONCENTRACIO
	System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");
	for (int i=0; i<integrantes.length; i++) {
	System.out.print(integrantes[i].getNombre() + " " + integrantes[i].getApellido() + " -> ");
	integrantes[i].Concentrarse();
	}
	// VIATJE
	System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo metodo)");
	for (int i=0; i<integrantes.length; i++) {
	System.out.print(integrantes[i].getNombre() + " " + integrantes[i].getApellido() + " -> ");
	integrantes[i].viajar();
	}
	// ENTRENAMENT
	System.out.println("\nEntrenamiento: Todos los integrantes tienen su funcion en un entrenamiento (Especializacion)");
	for (int i=0; i<integrantes.length; i++){
	System.out.print(integrantes[i].getNombre() + " " + integrantes[i].getApellido() + " -> ");
	integrantes[i].entrenamiento();
	}
	// PARTIT DE FUTBOL
	System.out.println("\nPartido de Fútbol: Todos los integrantes tienen su funcion en un partido (Especializacion)");
	for (int i=0; i<integrantes.length; i++){
	System.out.print(integrantes[i].getNombre() + " " + integrantes[i].getApellido() + " -> ");
	integrantes[i].partidoFutbol();
	}
	// PLANIFICAR ENTRENAMENT
	System.out.println("\nPlanificar Entrenamiento: Solo el entrenador tiene el metodo para planificar un entrenamiento:");
	System.out.print(delBosque.getNombre() + " " + delBosque.getApellido() + " -> ");
	((Entrenador) delBosque).planificarEntrenamiento();
	// ENTREVISTA
	System.out.println("\nEntrevista: Solo el futbolista tiene el metodo para dar una entrevista:");
	System.out.print(iniesta.getNombre() + " " + iniesta.getApellido() + " -> ");
	((Futbolista) iniesta).Entrevista();
	// MASSATGE
	System.out.println("\nMasaje: Solo el masajista tiene el metodo para dar un masaje:");
	System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellido() + " -> ");
	((Masajista) raulMartinez).darMasaje();
	
	System.out.println("\n");
	System.out.println(reconocerProfesional(delBosque));
	System.out.println(reconocerProfesional(iniesta));
	System.out.println(reconocerProfesional(raulMartinez));
	
	}
	
	public static String reconocerProfesional(SeleccionFutbol nuevo) {
			if(nuevo instanceof Entrenador) {
				return "Esta clase es un entrenador.";
			}else if(nuevo instanceof Futbolista){
					return "Esta clase es un futbolista.";
			}else if(nuevo instanceof Masajista){	
					return "Esta clase es un masajista.";
			}
		return "no existe";
}
	
}