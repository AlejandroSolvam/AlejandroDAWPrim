package EjecutableAsistente;
import java.util.Scanner;
import java.util.ArrayList;
import EstadioDeFutbol.Asistentes;
import RegistroAsistentes.AsistentesArr;

public class Ejecutable {

	public static void main(String[] args) {
		Scanner Introducir=new Scanner(System.in);
		AsistentesArr todosLosAsistentes=new AsistentesArr();
		boolean seguir=true;
		while(seguir!=false) {
			System.out.println("Introduce la opcion que quieras de asistentes");
			System.out.println("1. Entra assistent.");
			System.out.println("2. Ix assistent.");
			System.out.println("3. Veure la quantitat de assistents amb tots els seus atributs.");
			System.out.println("4. Veure la quantitat de socis assistents i el seu nom.");
			System.out.println("5. Salir del programa");
			int opcion=Introducir.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Introduce el nombre del asistente.");
				String nombre=Introducir.next();
				System.out.println("Introduce la edad del asistente.");
				int ed=Introducir.nextInt();
				System.out.println("Introduce si es socio o no el asistente.");
				boolean esS=Introducir.nextBoolean();
				System.out.println("Introduce el codigo del asistente.");
				int codAs=Introducir.nextInt();
				Asistentes newAsistente=new Asistentes(nombre,ed,esS,codAs);
				todosLosAsistentes.entraAsistente(newAsistente);
				break;
			case 2:
				System.out.println("Introduce el codigo del asistente que quieres que salga.");
				int codAsis=Introducir.nextInt();
				todosLosAsistentes.saleAsistente(codAsis);
				break;
			case 3:
				todosLosAsistentes.verAsistentes();
				break;
			case 4:
				todosLosAsistentes.verAsistentesSocis();
				break;
			case 5:
				seguir=false;
				break;
			default:
			}
		}

	}

}
