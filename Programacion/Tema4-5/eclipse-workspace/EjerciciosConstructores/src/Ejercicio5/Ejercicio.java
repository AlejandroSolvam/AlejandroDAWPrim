package Ejercicio5;

/* 5. Crea la clase rebajas.
Atributo de la clase: descuento.
Crea dos constructores:
Uno no toma parámetros pero inicializa la variable descuento a 30, mientras que el segundo
constructores tendrá como parámetros el descuento.
Realiza los métodos get y set para el descuento. */
import java.util.Scanner;
public class Ejercicio {

public static void main(String [] args){
		Scanner Introducir=new Scanner(System.in);
		
		System.out.println("Introduce un precio:");
		double precio=Introducir.nextDouble();
		
		System.out.println("Introduce el descuento:");
		double descu=Introducir.nextDouble();
		
		Rebajas primerRebaja=new Rebajas(descu);
		Rebajas segundaRebaja=new Rebajas();
		
		double total=precio-(precio*primerRebaja.getDescuento())/100;
		
		System.out.println("El total del primer precio con el descuento es de:"+total);
		
		total=precio-(precio*segundaRebaja.getDescuento())/100;
		
		System.out.println("El total del segundo precio con el descuento es de:"+total);

	}
	
}
