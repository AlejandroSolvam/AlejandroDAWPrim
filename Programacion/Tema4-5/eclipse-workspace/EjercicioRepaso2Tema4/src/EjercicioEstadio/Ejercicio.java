package EjercicioEstadio;
/* Exercici de repàs
Un Estadi de Futbol vol en tot moment tenir el control de tots els assistents al estadi cada partit.
Dels assistents es vol saber: El nom, la edat i si son socis.
Els assistents a cada partit estaran guardats a un ArrayList de assistents.
El màxim de assistents a cada partit serà de 15000 assistents.
La quantitat de socis es vol controlar mitjançant una variable de classe.
Per a portar aquest control, tindrem el següent menú:
1. Entra assistent
2. Ix assistent
3. Veure la quantitat de assistents amb tots els seus atributs.
5. Veure la quantitat de socis assistents i el seu nom. */ 
import java.util.Scanner;
import EstadiFutbol.Asistentes;
import EstadiFutbol.cuentaAsistentes;
public class Ejercicio {

	public static void main(String[] args) {
	cuentaAsistentes totalAsistentes=new cuentaAsistentes();
	boolean seguir=true;
	Scanner Introducir=new Scanner(System.in);
	
	while(seguir!=false){
		System.out.println("Introduce la opcion que quieres introducir");
		System.out.println("1. Entra assistent");
		System.out.println("2. Ix assistent");
		System.out.println("3. Veure la quantitat de assistents amb tots els seus atributs.");
		System.out.println("4. Veure la quantitat de socis assistents i el seu nom.");
		int opcion=Introducir.nextInt();
		
		switch(opcion){
		
		case 1:
		System.out.println("Introduce el nombre del asistente:");
		String nombreAs=Introducir.next();
		System.out.println("Introduce la edad del asistente:");
		int edad=Introducir.nextInt();
		System.out.println("Introduce si es socio o no el asistente(Responde con true o false):");
		boolean esSoci=Introducir.nextBoolean();
		System.out.println("Introduce el codigo del asistente:");
		int codAs=Introducir.nextInt();
		Asistentes nuevoAsistente=new Asistentes(nombreAs,edad,esSoci,codAs);
		totalAsistentes.entraAsistente(nuevoAsistente);
		break;
		
		case 2:
		System.out.println("Introduce el codigo del asistente que deseas eliminar:");
		int codAsDel=Introducir.nextInt();
		totalAsistentes.saleAsistente(codAsDel);
		break;
		
		case 3:
			totalAsistentes.verAsistentes();
			break;
			
		case 4:
			totalAsistentes.verSociosAsistentes();
			break;
			}

		}
	}
}
