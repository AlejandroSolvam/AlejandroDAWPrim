package Ejercicio2;
import java.util.Scanner;
public class EjecutableRebajas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Introducir=new Scanner(System.in);
		System.out.println("Introduce una rebaja:");
		int reb=Introducir.nextInt();
		Rebajas miRebaja=new Rebajas(reb);
		Rebajas rebajaVacia=new Rebajas();
		
		System.out.println("Introduce un precio:");
		int precio=Introducir.nextInt();
		
		System.out.println("El precio aplicando la primera rebaja sera de "+(precio-(precio*miRebaja.getDescuento())/100));
		System.out.println("El precio aplicando la segunda rebaja sera de "+(precio-(precio*rebajaVacia.getDescuento())/100));

	}

}
