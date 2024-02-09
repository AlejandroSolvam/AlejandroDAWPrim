package paqueteSeleccionFutbol;

public abstract class SeleccionFutbol {
	private int id;
	private String nombre;
	private String apellidos;
	private int edad;
	
	public SeleccionFutbol() {
		this.id=0;
		this.nombre="Nombre predeterminado";
		this.apellidos="Apellidos predeterminado";
		this.edad=0;
	}
	
	public SeleccionFutbol(int newId, String newN, String newAp, int newEd) {
		this.id=newId;
		this.nombre=newN;
		this.apellidos=newAp;
		this.edad=newEd;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void viajar() {
		System.out.println("La seleccion de futbol esta viajando");
	}
	
	public void concentrarse() {
		System.out.println("La seleccion de futbol esta en una concentracion");
	}
	
	public abstract void entrenamiento();
	
	public void partidoFutbol() {
		System.out.println("La seleccion de futbol esta jugando un partido de futbol");
	}
}
