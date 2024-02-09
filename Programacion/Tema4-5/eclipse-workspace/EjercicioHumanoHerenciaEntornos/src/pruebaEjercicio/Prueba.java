package pruebaEjercicio;
import proyectoHumano.Humano;

public class Prueba {
	public static void main(String [] args) {
		Humano primerHumano=new Humano("Alejandro",(byte)20);
		Humano segundoHumano=new Humano("Tobias",(byte)24);
		
		System.out.println(primerHumano.mayor(segundoHumano).getNombre());
		System.out.println(primerHumano.equals(segundoHumano));
	}
}
