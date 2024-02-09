package vehiculoProyecto;

public class Vehiculo {
	private String nombre;
	
	public Vehiculo() {
		this.nombre="Predeterminado";
	}
	
	public Vehiculo(String newN) {
		this.nombre=newN;
	}
	
	public void setNombreVehiculo(String newN) {
		this.nombre=newN;
	}
	
	public String getNombreVehiculo() {
		return this.nombre;
	}
	
	public String setTransportar() {
		return "Transportando vehiculo.";
	}
}
