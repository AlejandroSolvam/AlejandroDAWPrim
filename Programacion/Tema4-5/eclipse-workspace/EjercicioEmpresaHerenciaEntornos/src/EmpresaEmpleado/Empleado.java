package EmpresaEmpleado;
/* Exercici 1
Una empresa necessita portar un registre de tots els seus empleats, per això ha creat un diagrama de
classes que ha d'incloure el següent:
Empleat
Atributs:
- nom: tipus cadena (Deu ser nom i cognoms)
- cod_empleat: tipus cadena
- edat : enter (Rang entre 18 i 45 anys)
- casat: boolean
- salari: tipus numèric double
Mètodes:
 - Constructor amb i sense paràmetres d’entrada
 - Mètode que permet mostrar la classificació segons l’edat d’acord al següent algoritme:
Si edat es menor o igual a 21, Principiant
Si edat es >=22 i <=35, Intermedi
Si edat es >35, Sénior.
 - Mètode per imprimir les dades del empleat per pantalla.
 - Mètode que permet augmentar el salari en un percentatge que passat com paràmetre.
Programador (Especialització de Empleat). Classe que hereta de Empleat tots els atributs i mètodes.
- Atributs:
- liniesDeCodiPerHora: tipus enter
- llenguatgeDominant: tipus cadena
- Mètodes:
- Constructor amb i sense paràmetres de entrada.
Utilitza la següent classe per a comprovar que funciona correctament.
public class Prueba {
 public static void main(String[] args){
Programador p1 = new Programador("Flavio","3456",20,false,1000,123,"Visual Basic");
p1.setnom(Pepe);
p1.setsalario(1000);
p1.AumentarSalari(0.25);
p1.ImprimirEmpleat();
 }
} */
public class Empleado {
	private String nombre;
	private String apellidos;
	private String codigoEmpleado;
	private int edad;
	private boolean casado;
	private double salario;
	
	protected Empleado(){
		this.nombre="Nombre predeterminado";
		this.apellidos="Apellido predeterminado";
		this.codigoEmpleado="Codigo predeterminado";
		this.edad=0;
		this.casado=false;
		this.salario=0.0;
	}
	
	protected Empleado(String newN, String newAp, String newC, int newE, boolean esC, double newS){
		this.nombre=newN;
		this.apellidos=newAp;
		this.codigoEmpleado=newC;
		this.edad=newE;
		this.casado=esC;
		this.salario=newS;
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String name) {
		this.nombre=name;
	}
	
	String getApellidos() {
		return this.apellidos;
	}
	
	public void setApellidos(String newAp) {
		this.apellidos=newAp;
	}
	
	String getCodigo() {
		return this.codigoEmpleado;
	}
	
	public void setCodigo(String newCod) {
		this.codigoEmpleado=newCod;
	}
	
	int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int newEd) {
		this.edad=newEd;
	}
	
	boolean getCasado() {
		return this.casado;
	}
	
	public void setCasado(boolean newCas) {
		this.casado=newCas;
	}
	
	double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double newSal) {
		this.salario=newSal;
	}
	
	public void clasificacionEdad(int edadComprobar) {
		if(edadComprobar<=21) {
			System.out.println("Eres un principiante");
		}else{
			if(edadComprobar>=22 && edadComprobar<=35){
				System.out.println("Eres un intermedio");
			}else{
				System.out.println("Eres un senior");
			}
		}
	}
	
	public void imprimirDatosEmpleado(){
		System.out.println("Nombre: "+this.getNombre()+"\n Apellidos: "+this.getApellidos()+"\n Codigo Empleado: "+ this.getCodigo()+"\n Edad: "+this.getEdad()+"\n Esta casado: "+this.getCasado()+"\n Salario: "+this.getSalario());
	}
	
	public void aumentarSalario(double porcentajeSalario){
		this.salario=this.salario+this.salario*porcentajeSalario/100;
		System.out.println("Salario aumentado.");
		}
	
}
