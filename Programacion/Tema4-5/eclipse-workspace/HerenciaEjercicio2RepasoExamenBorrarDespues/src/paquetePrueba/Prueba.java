package paquetePrueba;

import paqueteSuma.Suma;
import paqueteResta.Resta;
public class Prueba {
	 public static void main(String[] ar) {
	 Suma suma1=new Suma();
	 suma1.cargar1(6.34);
	 suma1.cargar2(4.98);
	 suma1.Operar();
	 System.out.print("El resultado de la suma es:");
	 suma1.mostrarResultado();
	 Resta resta1=new Resta();
	 resta1.cargar1(9.35);
	 resta1.cargar2(3.53);
	 resta1.Operar();
	 System.out.print("El resultado de la resta es:");
	 resta1.mostrarResultado();
	 }
	}
