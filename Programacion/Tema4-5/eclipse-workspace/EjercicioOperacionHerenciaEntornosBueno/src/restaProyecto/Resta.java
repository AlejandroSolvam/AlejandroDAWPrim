package restaProyecto;
import operacionProyecto.Operacion;

public class Resta extends Operacion{
	
	public Resta(){
		super();
	}
	
	public Resta(double num1, double num2){
		super(num1,num2);
	}
	
	public void Operar() {
		this.setResultado(this.getValor1() - this.getValor2());
	}
}
