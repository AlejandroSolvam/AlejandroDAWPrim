package paqueteEmpleado;

public class Empleado {
	private String nombre;
	private String apellidos;
	private int cod_empleado;
	private int edad;
	private boolean casado;
	private double salario;
	
	public Empleado(){
		this.nombre="nombre Predeterminado";
		this.apellidos="apellidos Predeterminado";
		this.cod_empleado=0;
		this.edad=0;
		this.casado=false;
		this.salario=0;
	}
	
	public Empleado(String newN, String newAp, int newCE, int newE, boolean estaC,double newS){
		this.nombre=newN;
		this.apellidos=newAp;
		this.cod_empleado=newCE;
		this.edad=newE;
		this.casado=estaC;
		this.salario=newS;
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

	public int getCod_empleado() {
		return cod_empleado;
	}

	public void setCod_empleado(int cod_empleado) {
		this.cod_empleado = cod_empleado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void clasificarEdad() {
		if(this.getEdad()<=21) {
			System.out.println("Principiante");
		}else if(this.getEdad()>=22 && this.getEdad()<=35) {
			System.out.println("Intermedia");
		}else if(this.getEdad()>35) {
			System.out.println("Senior");
		}
	}

	@Override
	public String toString() {
		return "Empleado [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getCod_empleado()="
				+ getCod_empleado() + ", getEdad()=" + getEdad() + ", isCasado()=" + isCasado() + ", getSalario()="
				+ getSalario() + "]";
	}
	
	public void aumentarSalario(double porcentaje) {
		this.salario=salario+(salario*porcentaje/100);
	}
}
