package paquetePrueba;

import paqueteEmpleado.Empleado;
import paqueteProgramador.Programador;
public class Prueba {
	 public static void main(String[] args){
	Programador p1 = new Programador("Flavio","Briatore",3456,20,false,1000,123,"Visual Basic");
	p1.setNombre("Pepe");
	p1.setSalario(1000);
	p1.aumentarSalario(0.25);
	System.out.println(p1.getSalario());
	p1.clasificarEdad();
	System.out.println(p1.toString());
	 }
	}