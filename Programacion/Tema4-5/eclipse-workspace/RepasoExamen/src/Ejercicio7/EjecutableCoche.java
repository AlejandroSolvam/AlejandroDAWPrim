package Ejercicio7;
import java.util.Scanner;
import java.util.ArrayList;
public class EjecutableCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistroCoches nuevaListaCoches=new RegistroCoches();
		boolean seguir=true;
		Scanner Introducir=new Scanner(System.in);
		while(seguir!=false) {
			System.out.println("Introduce una de las opciones para los coches:");
			System.out.println("1. Afegir un cotxe.");
			System.out.println("2. Esborrar un cotxe.");
			System.out.println("3. Quants cotxes es tenen.");
			System.out.println("4. Veure tots els cotxes introduïts.");
			System.out.println("5. Tots els cotxes d'una marca determinada. ");
			System.out.println("6. Finalizar programa. ");
			int opcion=Introducir.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("1. Introduce la matricula del coche:.");
				String matric=Introducir.next();
				System.out.println("1. Introduce la marca del coche:.");
				String marc=Introducir.next();
				System.out.println("1. Introduce el modelo del coche:.");
				String model=Introducir.next();
				System.out.println("1. Introduce los kilometros que tiene el coche:.");
				double kil=Introducir.nextDouble();
				Coche nuevoCoche=new Coche(matric,marc,model,kil);
				nuevaListaCoches.añadirCoche(nuevoCoche);
				break;
			case 2:
				System.out.println("Introduce la matricula del coche que quieres eliminar:");
				String matrBorrar=Introducir.next();
				nuevaListaCoches.borrarCoche(matrBorrar);
				break;
			case 3:
				nuevaListaCoches.cantidadCoches();
				break;
			case 4:
				nuevaListaCoches.verCoches();
				break;
			case 5:
				System.out.println("Introduce la marca de los coches que quieres ver:");
				String cocheV=Introducir.next();
				nuevaListaCoches.verCochesDeMarca(cocheV);
				break;
			case 6:
				seguir=false;
				break;
			default:
				System.out.println("No has introducido una opcion correcta.");
			}
		}
		
	}

}
