package paqueteCalculadora;

import paqueteOperaciones.Operaciones;
public class Calculadora implements Operaciones{
	private int num1;
	private int num2;
	private int resultado;
	private double numero1;
	private double numero2;
	private double resultadoDou;
	
	public Calculadora() {
		this.num1=0;
		this.num2=0;
		this.numero1=0;
		this.numero2=0;
		this.resultado=0;
		this.resultadoDou=0;
	}
	
	public Calculadora(int newN1, int newN2) {
		this.num1=newN1;
		this.num2=newN2;
		this.numero1=0;
		this.numero2=0;
		this.resultado=0;
		this.resultadoDou=0;
	}
	
	public Calculadora(double newN1, double newN2) {
		this.num1=0;
		this.num2=0;
		this.numero1=newN1;
		this.numero2=newN2;
		this.resultado=0;
		this.resultadoDou=0;
	}
	
	
	
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public double getResultadoDou() {
		return resultadoDou;
	}

	public void setResultadoDou(double resultadoDou) {
		this.resultadoDou = resultadoDou;
	}

	public int Sumar(int n1, int n2) {
		this.setNum1(n1);
		this.setNum2(n2);
		this.setResultado(this.getNum1()+this.getNum2());
		return this.getResultado();
	}
	
	public int Restar(int n1, int n2) {
		this.setNum1(n1);
		this.setNum2(n2);
		this.setResultado(this.getNum1()-this.getNum2());
		return this.getResultado();
	}
	
	public int Multiplicar(int n1, int n2) {
		this.setNum1(n1);
		this.setNum2(n2);
		this.setResultado(this.getNum1()*this.getNum2());
		return this.getResultado();
	}
	
	public int Dividir(int n1, int n2) {
		this.setNum1(n1);
		this.setNum2(n2);
		this.setResultado(this.getNum1()/this.getNum2());
		return this.getResultado();
	}
	
	public double Sumar(double n1, double n2) {
		this.setNumero1(n1);
		this.setNumero2(n2);
		this.setResultadoDou(this.getNumero1()+this.getNumero2());
		return this.getResultadoDou();
	}
	
	public double Restar(double n1, double n2) {
		this.setNumero1(n1);
		this.setNumero2(n2);
		this.setResultadoDou(this.getNumero1()-this.getNumero2());
		return this.getResultadoDou();
	}
	
	public double Multiplicar(double n1, double n2) {
		this.setNumero1(n1);
		this.setNumero2(n2);
		this.setResultadoDou(this.getNumero1()*this.getNumero2());
		return this.getResultadoDou();
	}
	
	public double Dividir(double n1, double n2) {
		this.setNumero1(n1);
		this.setNumero2(n2);
		this.setResultadoDou(this.getNumero1()/this.getNumero2());
		return this.getResultadoDou();
	}
	
}
