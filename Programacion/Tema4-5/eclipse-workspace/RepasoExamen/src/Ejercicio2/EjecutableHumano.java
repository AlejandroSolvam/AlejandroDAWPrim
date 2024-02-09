package Ejercicio2;
import java.util.Scanner;
public class EjecutableHumano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Introducir=new Scanner(System.in);
		System.out.println("Introduce el nombre del humano");
		String nam=Introducir.next();
		System.out.println("Introduce la edad del humano");
		byte ed=Introducir.nextByte();
		Humano miHumano=new Humano(nam,ed);
		
		System.out.println("Introduce el nombre del segundo humano");
		nam=Introducir.next();
		System.out.println("Introduce la edad del segundo humano");
		ed=Introducir.nextByte();
		Humano segundoHumano=new Humano(nam,ed);
		
		System.out.println("Primer humano:"+miHumano.getNombre()+" "+miHumano.getEdad());
		System.out.println("Segundo humano:"+segundoHumano.getNombre()+" "+segundoHumano.getEdad());
		System.out.println("Son iguales?"+miHumano.equals(segundoHumano));
	}

}
