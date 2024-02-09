package Ejercicio2;
import java.util.Scanner;
public class EjecutableCoche {
	
	public static void main(String [] args) {
		Scanner Introducir=new Scanner(System.in);
		System.out.println("Introduce la velocidad del coche:");
		int vel=Introducir.nextInt();
		
		Coche primerCoche=new Coche(vel);
		Coche segundoCoche=new Coche();
		
		System.out.println("Primer coche:"+primerCoche.getVelocidad());
		System.out.println("Segundo coche:"+segundoCoche.getVelocidad());
		
		segundoCoche.setVelocidad(7);
		System.out.println("Nueva velocidad Segundo coche:"+segundoCoche.getVelocidad());
	}
}
