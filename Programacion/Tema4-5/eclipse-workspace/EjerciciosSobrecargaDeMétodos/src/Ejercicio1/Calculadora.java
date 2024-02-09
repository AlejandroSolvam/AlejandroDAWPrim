package Ejercicio1;
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
 } */
public class Calculadora {
	
	private int suma;
	private double sumaDou;
	private int resta;
	private double restaDou;
	private int multiplicacion;
	private double multiplicacionDou;
	private int division;
	private double divisionDou;
	private int num1;
	private int num2;
	private double n1;
	private double n2;
	
	Calculadora(){
		this.num1=0;
		this.num2=0;
		this.n1=0;
		this.n2=0;
	}
	
	Calculadora(int num1, int num2){
		
		setInt1(num1);
		setInt2(num2);
		this.setSuma(num1,num2);
		this.setResta(num1,num2);
		this.setMultiplicar(num1,num2);
		this.setDivision(num1,num2);
	}
	
	Calculadora(double n1, double n2){
		setDouble1(n1);
		setDouble2(n2);
		this.setSuma(n1,n2);
		this.setResta(n1,n2);
		this.setMultiplicar(n1,n2);
		this.setDivision(n1,n2);
	}
	
	void setInt1(int numero) {
		this.num1=numero;
	}
	
	int getInt1() {
		return this.num1;
	}
	
	void setInt2(int numero) {
		this.num2=numero;
	}
	
	int getInt2() {
		return this.num2;
	}
	
	void setDouble1(double numero) {
		this.n1=numero;
	}
	
	double getDouble1() {
		return this.n1;
	}
	
	void setDouble2(double numero) {
		this.n2=numero;
	}
	
	double getDouble2() {
		return this.n2;
	}
	
	void setSuma(int num1, int num2){
		this.suma=num1+num2;
	}
	
	int getSuma(){
		return this.suma;
	}
	
	void setSuma(double num1, double num2){
		this.sumaDou=n1+n2;
	}
	
    double getSumaDou(){
		return this.sumaDou;
	}
	
	void setResta(int num1, int num2){
		this.resta=num1-num2;
	}
	
	int getResta(){
		return this.resta;
	}
	
	void setResta(double n1, double n2){
		this.restaDou=n1-n2;
	}
	
	double getRestaDou(){
		return this.restaDou;
	}
	
	void setMultiplicar(int nu1, int nu2){
		this.multiplicacion=num1*num2;
	}
	
	public int getMultiplicacion(){
		return this.multiplicacion;
	}
	
	void setMultiplicar(double n1, double n2){
		this.multiplicacionDou=n1*n2;
	}
	
	public double getMultiplicacionDou(){
		return this.multiplicacionDou;
	}
	
	void setDivision(int num1, int num2){
		this.division=num1/num2;
	}
	
	int getDivision(){
		return this.division;
	}
	
	void setDivision(double nu1, double nu2){
		this.divisionDou=n1/n2;
	}
	
	double getDivisionDou(){
		return this.divisionDou;
	}
	
	
}
