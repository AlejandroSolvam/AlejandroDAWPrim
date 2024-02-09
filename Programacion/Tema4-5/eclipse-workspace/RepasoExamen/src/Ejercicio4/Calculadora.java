package Ejercicio4;
/* Exercici sobrecarrega de mètodes
1. Crea una classe i crida-la Calculadora amb mètodes sobrecarregats per a realitzar operacions
matemàtiques bàsiques (suma, resta, multiplicació i divisió) amb dos números de tipus sencer i de tipus
double. A més dels mètodes sobrecarregats, crea un constructor amb paràmetres i els mètodes get i set,
per a cada atribut necessari.
Es prosa a continuació una classe que la utilitzaria:
public class Main {
 public static void main(String[] args) {

 Calculadora calculadora = new Calculadora();
 System.out.println("Suma de enteros: " + calculadora.sumar(5, 3));
 System.out.println("Suma de doubles: " + calculadora.sumar(5.5, 3.2));
}
 }
 */
public class Calculadora {
	
	private int numero1;
	private int numero2;
	private double num1;
	private double num2;
	
	Calculadora(int newN1,int newN2){
		this.numero1=newN1;
		this.numero2=newN2;
		this.num1=0;
		this.num2=0;
	}
	
	Calculadora(double newN1,double newN2){
		this.numero1=0;
		this.numero2=0;
		this.num1=newN1;
		this.num2=newN1;
	}
	
	Calculadora(){
		this.numero1=0;
		this.numero2=0;
		this.num1=0;
		this.num2=0;
	}
	
	public int getNumeroEntero1(){
		return this.numero1;
	}
	
	public void setNumeroEntero1(int newN1){
		this.numero1=newN1;
	}
	
	public int getNumeroEntero2(){
		return this.numero2;
	}
	
	public void setNumeroEntero2(int newN2){
		this.numero2=newN2;
	}
	
	public double getNumeroDouble1(){
		return this.num1;
	}
	
	public void setNumeroDouble1(double newN1){
		this.num1=newN1;
	}
	
	public double getNumeroDouble2(){
		return this.num2;
	}
	
	public void setNumeroDouble2(double newN2){
		this.num2=newN2;
	}
	
	public int sumar(int num1, int num2) {
		return num1+num2;
	}
	
	public double sumar(double num1, double num2) {
		return num1+num2;
	}
	
	public int restar(int num1, int num2) {
		return num1-num2;
	}
	
	public double restar(double num1, double num2) {
		return num1-num2;
	}
	
	public int multiplicar(int num1, int num2) {
		return num1*num2;
	}
	
	public double multiplicar(double num1, double num2) {
		return num1*num2;
	}
	
	public int dividir(int num1, int num2) {
		return num1/num2;
	}
	
	public double dividir(double num1, double num2) {
		return num1/num2;
	}

}
