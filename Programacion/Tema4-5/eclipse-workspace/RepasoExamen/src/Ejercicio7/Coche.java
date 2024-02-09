package Ejercicio7;
/* Exercici 2
Crea la classe cotxe de la qual es vol saber: la matricula, la marca, el model i els Km. D'ella necessitarem un o més
constructors, i els mètodes get i set de les seues propietats. El programa demanarà per teclat les dades dels cotxes i els
guardarà a un ArrayList.
S'introduiran tants cotxes com l'usuari del programa decidisca. Es mostrarà un menú per pantalla com el següent:
• Afegir un cotxe.
• Esborrar un cotxe.
• Quants cotxes es tenen.
• Veure tots els cotxes introduïts.
• Tots els cotxes d'una marca determinada.  */

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private double kilometros;
	
	Coche(String matr,String marc,String mod,Double kil){
		this.matricula=matr;
		this.marca=marc;
		this.modelo=mod;
		this.kilometros=kil;
	}
	
	Coche(Double kil,String matr,String marc,String mod){
		this.matricula=matr;
		this.marca=marc;
		this.modelo=mod;
		this.kilometros=kil;
	}
	
	Coche(String matr,Double kil,String marc,String mod){
		this.matricula=matr;
		this.marca=marc;
		this.modelo=mod;
		this.kilometros=kil;
	}
	
	Coche(String matr,String marc,Double kil,String mod){
		this.matricula=matr;
		this.marca=marc;
		this.modelo=mod;
		this.kilometros=kil;
	}
	
	Coche(){
		this.matricula="";
		this.marca="";
		this.modelo="";
		this.kilometros=0;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String newM) {
		this.matricula=newM;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String newMar) {
		this.marca=newMar;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String newMod) {
		this.modelo=newMod;
	}
	
	public double getKilometros() {
		return this.kilometros;
	}
	
	public void setKilometros(double newK) {
		this.kilometros=newK;
	}
}
