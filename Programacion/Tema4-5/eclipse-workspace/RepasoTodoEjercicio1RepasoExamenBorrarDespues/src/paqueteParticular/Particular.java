package paqueteParticular;
import paqueteIluminacion.Iluminacion;
import paqueteEdificio.Edificio;
public class Particular extends Edificio implements Iluminacion{
	private int cantidadHabitajes;
	private static int cantidadParticulares=0;
	
	public Particular() {
		super();
		this.cantidadHabitajes=5;
		cantidadParticulares++;
	}
	
	public Particular(int newH,int newCAsc) {
		super(newCAsc);
		this.cantidadHabitajes=newH;
		cantidadParticulares++;
	}
	
	public int getCantidadHabitajes() {
		return cantidadHabitajes;
	}

	public void setCantidadHabitajes(int cantidadHabitajes) {
		this.cantidadHabitajes = cantidadHabitajes;
	}

	public double hallarImpuesto() {
		return 750;
	}

	public void mostrarDatos() {
		System.out.println("Particular [getCantidadHabitajes()=" + getCantidadHabitajes() + ", hallarImpuesto()=" + hallarImpuesto()
		+ ", getCantidadAscensores()=" + getCantidadAscensores() + "]"); 
	}
	
	public int cantidadLuces() {
		return 10;
	}

	public static int getCantidadRestaurantes() {
		return cantidadParticulares;
	}
	
}
