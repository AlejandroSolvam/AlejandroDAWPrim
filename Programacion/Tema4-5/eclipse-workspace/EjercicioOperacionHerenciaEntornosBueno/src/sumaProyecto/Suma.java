package sumaProyecto;
import operacionProyecto.Operacion;
public class Suma extends Operacion{
	
	public Suma(){
		super();
	}
	
	public Suma(double num1, double num2){
		super(num1,num2);
	}
	
	public void Operar() {
		this.setResultado(this.getValor1() + this.getValor2());
	}
}
