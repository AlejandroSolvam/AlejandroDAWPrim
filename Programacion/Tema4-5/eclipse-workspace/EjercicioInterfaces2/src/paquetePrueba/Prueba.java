package paquetePrueba;

import paqueteCalculadora.Calculadora;
import paqueteOperaciones.Operaciones;

public class Prueba {
	public static void main(String [] args) {
		Calculadora miCalculadora=new Calculadora();
		
		miCalculadora.setPrimerNumero(50);
		miCalculadora.setSegundoNumero(20);
		
		System.out.println(miCalculadora.getPrimerNumero() + " + " + miCalculadora.getSegundoNumero() + " = " + miCalculadora.Sumar(50,20) +"\n");
		System.out.println(miCalculadora.getPrimerNumero() + " - " + miCalculadora.getSegundoNumero() + " = " + miCalculadora.Restar() +"\n");
		System.out.println(miCalculadora.getPrimerNumero() + " x " + miCalculadora.getSegundoNumero() + " = " + miCalculadora.Multiplicar() +"\n");
		System.out.println(miCalculadora.getPrimerNumero() + " / " + miCalculadora.getSegundoNumero() + " = " + miCalculadora.Dividir() +"\n");
		
Calculadora miCalculadoraInt=new Calculadora();
		
		miCalculadoraInt.setPrimerNumeroInt(10);
		miCalculadoraInt.setSegundoNumeroInt(5);
		
		System.out.println("\n");
		System.out.println("\n");
		
		System.out.println(miCalculadoraInt.getPrimerNumeroInt() + " + " + miCalculadoraInt.getSegundoNumeroInt() + " = " + miCalculadoraInt.Sumar(10,15) +"\n");
		System.out.println(miCalculadoraInt.getPrimerNumeroInt() + " - " + miCalculadoraInt.getSegundoNumeroInt() + " = " + miCalculadoraInt.RestarInt() +"\n");
		System.out.println(miCalculadoraInt.getPrimerNumeroInt() + " x " + miCalculadoraInt.getSegundoNumeroInt() + " = " + miCalculadoraInt.MultiplicarInt() +"\n");
		System.out.println(miCalculadoraInt.getPrimerNumeroInt() + " / " + miCalculadoraInt.getSegundoNumeroInt() + " = " + miCalculadoraInt.DividirInt() +"\n");
		
	}
}
