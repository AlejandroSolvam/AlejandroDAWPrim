package Ejercicio2;
/* 2. Crea els mètodes sobrecarregats en la classe Dades, perquè puga executar-se el codi de la classe
Prova.
public class Datos {
…
}
public class Prueba{
public static void main (String... args){
Datos s = new Datos();
int a = 1;
int b = 2;
s.Cambio(a,b);
s.Cambio("Monillo007");
}
} */
public class Datos {

	private int numero1;
	private int numero2;
	private String palabra;
	
	Datos(){
		this.numero1=0;
		this.numero2=0;
		this.palabra="";
	}
	
	Datos(int num1, int num2, String pal){
		this.setNumero1(num1);
		this.setNumero2(num2);
		this.setPalabra(pal);
	}
	
	Datos(String pal,int num1, int num2){
		this.setNumero1(num1);
		this.setNumero2(num2);
		this.setPalabra(pal);
	}
	
	Datos(int num1,String pal,int num2){
		this.setNumero1(num1);
		this.setNumero2(num2);
		this.setPalabra(pal);
	}
	
	Datos(int num1, int num2){
		this.setNumero1(num1);
		this.setNumero2(num2);
	}
	
	Datos(String pal){
		this.setPalabra(pal);
	}
	
	void setNumero1(int num) {
		this.numero1=num;
	}
	
	void setNumero2(int num) {
		this.numero2=num;
	}
	
	int getNumero1() {
		return numero1;
	}
	
	int getNumero2() {
		return numero2;
	}
	
	void setPalabra(String newWor) {
		this.palabra=newWor;
	}
	
	String getPalabra() {
		return palabra;
	}
	
	void cambio(int num1,int num2) {
		int numCambiado=num2;
		num2=num1;
		num1=numCambiado;
		this.numero1=num1;
		this.numero2=num2;
	}
	
	void cambio(String newW) {
		this.palabra=newW;
	}
}
