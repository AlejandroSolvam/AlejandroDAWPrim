package paqueteOperacion;

public abstract class Operacion {
	private double valor1;
	private double valor2;
	private double resultado;
	
	public Operacion() {
		this.valor1=0;
		this.valor2=0;
		this.resultado=0;
	}
	
	public Operacion(double newV1,double newV2,double newR) {
		this.valor1=newV1;
		this.valor2=newV2;
		this.resultado=newR;
	}

	public double getValor1() {
		return valor1;
	}

	public void cargar1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void cargar2(double valor2) {
		this.valor2 = valor2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	public abstract double Operar();
	
	public void mostrarResultado() {
		System.out.println(this.getResultado());
	}
}
