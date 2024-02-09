package Ejercicio1;

public class Ejercicio {
	public static void main (String[] args) {	

	Humano primerHumano = new Humano("Alejandro", (byte) 10);
	Humano segundoHumano = new Humano("Antonio", (byte) 10);
	
	String nombre=primerHumano.getNombre();
	primerHumano.setNombre(nombre);
	
	
	nombre=segundoHumano.getNombre();
	segundoHumano.setNombre(nombre);
	
	System.out.println("El nombre del primer humano es "+primerHumano.getNombre());
	System.out.println("El nombre del segundo humano es "+segundoHumano.getNombre());
	
	boolean sonIguales=primerHumano.equals(primerHumano,segundoHumano);
	
	System.out.println("Los dos objetos son "+sonIguales);
	
	}
}
