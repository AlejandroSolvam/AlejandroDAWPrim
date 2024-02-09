package bustia.correu;

public class Correu {

		private String texto;
		private boolean leido;
		
	public Correu(String tex, boolean lei){
		this.texto=tex;
		this.leido=lei;
		}
	
	public Correu(String tex){
		this.texto=tex;
		this.leido=false;
		}
	
	public String getTexto(){
		return this.texto;
		}
	
	public void setTexto(String newText){
		this.texto=newText;
		}
	
	public boolean isLeido(){
		return this.leido;
		}
	
	public void setLeido(boolean leido){
		this.leido=leido;
		}
	
	public String toString() {
		return "Correu [texto=" + this.texto +", leido=" + this.leido + "]";
	}
}
