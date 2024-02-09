package Ejercicio3;
import java.util.Scanner;
public class EjecutableBombero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Introducir=new Scanner(System.in);
		System.out.println("Introduce el nombre del bombero:");
		String nam=Introducir.nextLine();
		System.out.println("Introduce el apellido del bombero:");
		String ap=Introducir.nextLine();
		System.out.println("Introduce la edad del bombero:");
		int ed=Introducir.nextInt();
		System.out.println("Introduce si esta casado el bombero o no(con true o false):");
		boolean cas=Introducir.nextBoolean();
		System.out.println("Introduce si es especialista el bombero o no(con true o false)");
		boolean esp=Introducir.nextBoolean();
		
		Bombero nuevoBombero=new Bombero(nam,ap,ed,cas,esp);
		System.out.println(nuevoBombero.getNombre()+" "+nuevoBombero.getApellidos()+" "+nuevoBombero.getEdad()+" "+nuevoBombero.getCasado()+" "+nuevoBombero.getEspecialista());
	}

}
