package paquetePrueba;

import paqueteCalculadora.Calculadora;
public class Prueba {
	public static void main(String[]args) {
		Calculadora nuevaCalculadora=new Calculadora();
		
		System.out.println(nuevaCalculadora.Sumar(4, 6));
		System.out.println(nuevaCalculadora.Restar(8, 3));
		System.out.println(nuevaCalculadora.Multiplicar(7, 4));
		System.out.println(nuevaCalculadora.Dividir(26, 4));
		
		System.out.println(nuevaCalculadora.Sumar(7.3, 8.2));
		System.out.println(nuevaCalculadora.Restar(13.2, 2.8));
		System.out.println(nuevaCalculadora.Multiplicar(7, 3.4));
		System.out.println(nuevaCalculadora.Dividir(32, 7.3));
		
	}
}
