package operacionProyecto;

public class Operacion {
	protected double valor1;
	protected double valor2;
	protected double resultado;
	
	public Operacion() {
		this.valor1=0;
		this.valor2=0;
		this.resultado=0;
	}
	
	public Operacion(double num1, double num2) {
		this.valor1=num1;
		this.valor2=num2;
		this.resultado=0;
	}
	
	public void cargar1(double primerV) {
		this.valor1=primerV;
	}
	
	public void cargar2(double segundoV) {
		this.valor2=segundoV;
	}
	
	protected double getValor1() {
		return this.valor1;
	}
	
	protected double getValor2() {
		return this.valor2;
	}
	
	protected double getResultado() {
		return this.resultado;
	}
	
	protected void setResultado(double res) {
		this.resultado=res;
	}
	
	public void mostrarResultado() {
		System.out.println("Resultado= "+ this.getResultado());
	}

}
	
