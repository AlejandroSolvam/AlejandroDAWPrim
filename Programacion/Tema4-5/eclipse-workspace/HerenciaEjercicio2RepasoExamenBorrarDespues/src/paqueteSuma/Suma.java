package paqueteSuma;

import paqueteOperacion.Operacion;
public class Suma extends Operacion{
	
	public Suma() {
		super();
	}
	
	public Suma(double newV1,double newV2,double newR) {
		super(newV1,newV2,newR);
	}
	
	public double Operar() {
		double v1=super.getValor1();
		double v2=super.getValor2();
		double res=v1+v2;
		super.setResultado(res);
		return super.getResultado();
	}
}
