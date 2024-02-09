package pruebaProyecto;
import operacionProyecto.Operacion;
import restaProyecto.Resta;
import sumaProyecto.Suma;

public class Prueba {
	public static void main (String[] args) {	
		 Suma suma1=new Suma();
		 suma1.cargar1(5);
		 suma1.cargar2(10);
		 suma1.Operar();
		 System.out.print("El resultado de la suma es:");
		 suma1.mostrarResultado();
		 Resta resta1=new Resta();
		 resta1.cargar1(20);
		 resta1.cargar2(7);
		 resta1.Operar();
		 System.out.print("El resultado de la resta es:");
		 resta1.mostrarResultado();
	}
}
