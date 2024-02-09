package pruebaEmpresa;
/* Utilitza la següent classe per a comprovar que funciona correctament.
public class Prueba {
 public static void main(String[] args){
Programador p1 = new Programador("Flavio","3456",20,false,1000,123,"Visual Basic");
p1.setnom(Pepe);
p1.setsalario(1000);
p1.AumentarSalari(0.25);
p1.ImprimirEmpleat();
 }
} */
import EmpresaEmpleado.Empleado;
import EmpresaProgramador.Programador;
public class Prueba {
	public static void main(String[] args){
		Programador p1 = new Programador("Flavio","Briatore","3456",20,false,1000,123,"Visual Basic");
		p1.setNombre("Pepe");
		p1.setSalario(1000);
		p1.aumentarSalario(150);
		p1.imprimirDatosEmpleado();
 }
}
