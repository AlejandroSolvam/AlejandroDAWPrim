package paqueteCalculadora;
/* 1. Ejercicio:
Crear una interfaz para las operaciones matemáticas de una calculadora básica,
Sumar, restar, multiplicar y dividir (Con y Sin decimales), implementándola en una clase
llamada calculadora que contiene los atributos primerNumero, SegundoNumero y resultado.
2. Ejercicio:
Crear una interfaz de transporteMaritimo con el metodo nadar y otra que es trasporteTerrestre
andar sobre la clase AutoAnfibio donde sus atributos sean marca y modelo.  */
import paqueteOperaciones.Operaciones;
public class Calculadora implements Operaciones {
	private double primerNumero;
	private double segundoNumero;
	private double resultado;
	
	private int primerNumeroInt;
	private int segundoNumeroInt;
	private int resultadoInt;
	
	public Calculadora(double num1, double num2) {
		this.primerNumero=num1;
		this.segundoNumero=num2;
		this.primerNumeroInt=0;
		this.segundoNumeroInt=0;
		this.resultado=0;
		this.resultadoInt=0;
	}
	
	public Calculadora(int num1, int num2) {
		this.primerNumero=0;
		this.segundoNumero=0;
		this.primerNumeroInt=num1;
		this.segundoNumeroInt=num2;
		this.resultado=0;
		this.resultadoInt=0;
	}
	
	public Calculadora() {
		this.primerNumero=0;
		this.segundoNumero=0;
		this.primerNumeroInt=0;
		this.segundoNumeroInt=0;
		this.resultado=0;
		this.resultadoInt=0;
	}

	public double getPrimerNumero() {
		return primerNumero;
	}

	public void setPrimerNumero(double primerNumero) {
		this.primerNumero = primerNumero;
	}

	public double getSegundoNumero() {
		return segundoNumero;
	}

	public void setSegundoNumero(double segundoNumero) {
		this.segundoNumero = segundoNumero;
	}

	public int getPrimerNumeroInt() {
		return primerNumeroInt;
	}

	public void setPrimerNumeroInt(int primerNumeroInt) {
		this.primerNumeroInt = primerNumeroInt;
	}

	public int getSegundoNumeroInt() {
		return segundoNumeroInt;
	}

	public void setSegundoNumeroInt(int segundoNumeroInt) {
		this.segundoNumeroInt = segundoNumeroInt;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public double getResultadoInt() {
		return resultadoInt;
	}

	public void setResultadoInt(int resultado) {
		this.resultadoInt = resultado;
	}
	
	public double Sumar(double sum1,double sum2) {
		System.out.println("Esto es la suma de double");
		this.primerNumero=sum1;
		this.segundoNumero=sum2;
		return this.primerNumero+this.segundoNumero;
	}
	
	public double Restar() {
		System.out.println("Esto es la resta de double");
		return this.primerNumero-this.segundoNumero;
	}
	
	public double Multiplicar() {
		System.out.println("Esto es la multiplicacion de double");
		return this.primerNumero*this.segundoNumero;
	}
	
	public double Dividir() {
		System.out.println("Esto es la division de double");
		return this.primerNumero/this.segundoNumero;
	}
	
	public int Sumar(int sum1,int sum2) {
		System.out.println("Esto es la suma de int");
		this.primerNumeroInt=sum1;
		this.segundoNumeroInt=sum2;
		return this.primerNumeroInt+this.segundoNumeroInt;
	}
	
	public int RestarInt() {
		System.out.println("Esto es la resta de int");
		return this.primerNumeroInt-this.segundoNumeroInt;
	}
	
	public int MultiplicarInt() {
		System.out.println("Esto es la multiplicacion de int");
		return this.primerNumeroInt*this.segundoNumeroInt;
	}
	
	public int DividirInt() {
		System.out.println("Esto es la division de int");
		return this.primerNumeroInt/this.segundoNumeroInt;
	}
	
	

}
