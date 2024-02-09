package proyectoHumano;
import proyectoSerVivo.SerVivo;

public class Humano extends SerVivo {
	private String nombre;
	
	public Humano(){
		this.nombre="Nombre Predeterminado";
	}
	
	public Humano(String newN, byte newE){
		super(newE);
		this.nombre=newN;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	protected void setNombre(String newN) {
		this.nombre=newN;
	}
	
	public boolean equals(Humano otroHumano) {
		if(this.getNombre().equals(otroHumano.getNombre()) && this.getEdad()==otroHumano.getEdad()) {
			System.out.println("Este humano es igual? ");
			return true;
		}else{
			System.out.println("Este humano es igual? ");
			return false;
		}
	}
	
	public Humano mayor(Humano otroHumano) {
		if(this.getEdad()>otroHumano.getEdad()) {
			return this;
		}else{
			if(otroHumano.getEdad()>this.getEdad()) {
				return otroHumano;
			}else{
				System.out.println("Los dos humanos tienen la misma edad, se va a devolver el humano pasado por parametros.");
				return otroHumano;
			}
		}
	}
}
