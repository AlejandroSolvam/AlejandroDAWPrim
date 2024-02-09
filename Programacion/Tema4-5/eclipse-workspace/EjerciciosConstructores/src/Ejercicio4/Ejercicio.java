package Ejercicio4;
import java.util.Scanner;
/* 4. Crea la clase coche.
Atributo de la clase: velocidad.
Crea dos constructores:
Uno no toma parámetros y el otro sí.
Los dos constructores inicializarán la variable velocidad.
Realiza los métodos get y set para la velocidad */
public class Ejercicio {

	public static void main(String[]args){
		Scanner Introducir=new Scanner(System.in);
		Coche megane=new Coche(37);
		Coche fordFiesta=new Coche();
		int speed;
		
		System.out.println("Velocidad Actual del primer vehículo:");
		System.out.println(megane.getVelocidad());
		
		System.out.println("Introduce una nueva velocidad:");
		speed=Introducir.nextInt();
		megane.setVelocidad(speed);
		System.out.println(megane.getVelocidad());
		
		System.out.println("Introduce una velocidad para el ford fiesta:");
		speed=Introducir.nextInt();
		fordFiesta.setVelocidad(speed);
		System.out.println(fordFiesta.getVelocidad());
		
	}
	
}
