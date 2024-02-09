package Ejercicio8.EjecutableCubo;
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
import Ejercicio8.Espacio.Cubo;
public class Ejecutable {

	public static void main(String[] args) {
	ArrayList <Cubo> listaCubos=new ArrayList();
	Scanner Introducir=new Scanner(System.in);
	boolean seguir=true;	
	while(seguir!=false) {
		System.out.println("1. Afegir Cub i guardar-lo a un array.");
		System.out.println("2. Visualitzar l'àrea dels mateixos.");
		System.out.println("3. Visualitzar tots els objectes i les seues característiques.");
		System.out.println("4. Salir del programa");
		int opcion=Introducir.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("Introduce la longitud del costado del cubo");
			double longCos=Introducir.nextDouble();
			Cubo newCubo=new Cubo(longCos);
			listaCubos.add(newCubo);
			break;
		case 2:
			if(listaCubos.isEmpty()) {
				System.out.println("Actualmente no existen cubos");
			}else{
				System.out.println("Los cubos tienen un area de: ");
				int i=0;
				for(Cubo cubo:listaCubos) {
					System.out.println("Area del cubo numero "+i+" "+cubo.calcularArea());
					i++;
				}
			}
			break;
		case 3:
			if(listaCubos.isEmpty()) {
				System.out.println("Actualmente no existen cubos");
			}else{
				int i=0;
				for(Cubo cubo:listaCubos) {
					System.out.println("Longitud del costado del cubo:"+cubo.getLongitudCostado()+" Area del cubo numero "+i+" "+cubo.calcularArea());
					i++;
				}
			}
			break;
		case 4:
			seguir=false;
			break;
		}
	}
	
	}

}
