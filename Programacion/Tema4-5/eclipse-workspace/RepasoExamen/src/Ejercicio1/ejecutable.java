package Ejercicio1;
import java.util.Scanner;
public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Introducir=new Scanner(System.in);
		boolean seguir=true;
		System.out.println("Introduce la velocidad de tu coche:");
		int vel=Introducir.nextInt();
		Coche miCoche=new Coche(vel);
		while(seguir!=false){
			System.out.println("1. Introduce una opcion:");
			System.out.println("2. Mostrar velocidad:");
			System.out.println("3. Sumar velocidad:");
			System.out.println("4. Restar velocidad velocidad:");
			System.out.println("5. Finalizar programa:");
			int opcion=Introducir.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println(miCoche.getVelocidad());
				break;
			case 2:
				System.out.println("Introduce la velocidad que quieres sumar:");
				int sumar=Introducir.nextInt();
				miCoche.acelera(sumar);
				System.out.println("La velocidad del coche ahora es de:"+miCoche.getVelocidad());
				break;
			case 3:
				System.out.println("Introduce la velocidad que quieres restar:");
				int resta=Introducir.nextInt();
				miCoche.frena(resta);
				System.out.println("La velocidad del coche ahora es de:"+miCoche.getVelocidad());
				break;
			case 4:
				seguir=false;
				break;
			default:
				System.out.println("No existe esa opcion:");
			}
		}
	}

}
