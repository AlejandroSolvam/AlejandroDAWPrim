package EjercicioMain;
import Espacio.Cubo;
/* Exercici paquets
Crea una classe: Cub.
Aquesta classe haurà de pertànyer al paquet Espai.
El constructor d'aquesta classe haurà de definir-se de manera que deurem passar-li el paràmetre necessari
per a reomplir el seu atribut. El Cub, deurà tenir com a paràmetres la longitud del costat.
Deurà tenir, a més, un mètode que calcule automàticament l'àrea.
Àrea del cub = costat 3
Després, crea una classe test, que no estiga en el mateix paquet.
Aquesta classe treballarà amb un Arraylist de cubs.
En el mètode main es realitzaran les següents operacions mitjançant un menú:
Afegir Cub i guardar-lo a un array.
Visualitzar l'àrea dels mateixos.
Visualitzar tots els objectes i les seues característiques. */
import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio {

	public static void main(String[] args) {
		ArrayList <Cubo> arrayCubos=new ArrayList();
		boolean seguir=false;
		
		while(seguir!=true) {
			System.out.println("Bienvenido al menu de cubos, intruduce la opcion que quieres escoger:");
			System.out.println("1. Añadir cubo y guardarlo en un array:");
			System.out.println("2. Visualizar el area de los mismos:");
			System.out.println("3. Visualizar todos los objetos y sus caracteristicas:");
			System.out.println("4. Acabar programa:");
			int opcion=0;
			Scanner Introducir=new Scanner(System.in);
			opcion=Introducir.nextInt();
			
			switch(opcion) {
			case 1:
				double ladoCubo=0;
				System.out.println("Introduce la longitud que quieres que tenga tu cubo:");
				ladoCubo=Introducir.nextDouble();
				Cubo newCubo=new Cubo(ladoCubo);
				arrayCubos.add(newCubo);
				break;
			case 2:
				for(int i=0;i<arrayCubos.size();i++) {
					Cubo variableCubo=arrayCubos.get(i);
					System.out.println(variableCubo.calcularAreaCubo());
				}
				break;
			case 3:
				for(int i=0;i<arrayCubos.size();i++) {
					Cubo variableCubo=arrayCubos.get(i);
					System.out.println(variableCubo.getLongitudCostado());
				}
				break;
			case 4:
				seguir=true;
				break;
			default:
				System.out.println("Introduce una opcion valida!!");
			}
		}
	}

}
