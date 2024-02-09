package Ejercicio1Clases;

public class ejercicio1 {

	public static void main (String[] args) {
		
		Coche MiCoche = new Coche();
		Coche MiCoche2 = new Coche();
		
		MiCoche.Coche(20);
		
		int velocid=0;
		
		velocid=MiCoche.getVelocidad();
		
		int sumar=3;
		
		MiCoche.acelera(sumar);
		
		int frenar=5;
		
		MiCoche.frena(frenar);
		
		MiCoche2.Coche(35);
		velocid=MiCoche2.getVelocidad();
		MiCoche2.acelera(sumar);
		MiCoche2.frena(frenar);
		}
}
