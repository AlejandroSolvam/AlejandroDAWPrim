package proyectoSerVivo;

public class SerVivo {
	private byte edad;
	
	protected SerVivo(){
		this.edad=0;
	}
	
	protected SerVivo(byte newE){
		this.edad=newE;
	}
	
	protected byte getEdad() {
		return this.edad;
	}
	
	void setEdad(byte newE) {
		this.edad=newE;
	}
	
	public boolean equals(SerVivo otroSerVivo) {
		if(this.edad==otroSerVivo.getEdad()) {
			return true;
		}else{
			return false;
		}
	}
	
	public String toString() {
		String edadTransformada=String.valueOf(this.edad);
		return edadTransformada;
	}
	
}
