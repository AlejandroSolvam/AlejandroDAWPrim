package Ejercicio2;
import java.util.Scanner;

public class EjecutableTelefonoContacto {
	
	public static void main(String []args){
		
		Scanner Introducir=new Scanner(System.in);
		System.out.println("Introduce el nombre para tu contacto:");
		String nombre=Introducir.nextLine();
		Contacto nuevoContacto=new Contacto(nombre);
		System.out.println("Introduce el prefijo del contacto:");
		int pref=Introducir.nextInt();
		System.out.println("Introduce el numero del contacto:");
		long num=Introducir.nextLong();
		Telefono miTelefono=new Telefono(pref,num,nuevoContacto);
		
		System.out.println("El nombre del contacto introducido es "+miTelefono.returnNombre()+" con prefijo"+ miTelefono.getPrefijo()+" y numero "+miTelefono.getNumero());
	}
}
