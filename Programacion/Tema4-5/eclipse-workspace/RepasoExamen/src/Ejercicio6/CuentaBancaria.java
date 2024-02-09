package Ejercicio6;
/* Exercici de variables estàtiques
A .Tenim la següent classe CuentaBancaria:
class CuentaBancaria {
…
}
Afig a la classe CuentaBancaria les següents variables i els següents mètodes:
Variables per a conéixer el saldo, el titular del compte i el número de compte.
Afig un constructor per a la classe sense necessitat de paràmetres.
Afig un mètode ingressar que afija al saldo la quantitat que se li indica.
Afig un mètode retirar que descompte del saldo la quantitat indicada.
B. Afig a la classe CuentaBancaria el necessari per a poder-la utilitzar en la classe més a baix indicada
(PruebaCuentaBancaria), en la classe prova es creen 3 comptes, es realitzen ingressos i extraccions. A
final ens mostra el saldo de cada compte i el saldo total de Tots els comptes, no utilitzes un mètode que
sume els saldos de tots els comptes, recorre a una altra tècnica pel fet que no seria òptim si existiren
molts comptes.
Ajuda't del codi indicat:
class PruebaCuentaBancaria {
public static void main (String[] args) {
CuentaBancaria cuenta1 = new CuentaBancaria (1,”Juan Perez”, 0);
CuentaBancaria cuenta2 = new CuentaBancaria (2,”Luis Soriano”, 100);
CuentaBancaria cuenta3 = new CuentaBancaria (3,”Fautino Perez”,5000);
cuenta1.ingresar(200);
cuenta2.ingresar(100);
cuenta3.retirar(300);
cuenta1.ingresar (1000);
System.out.println (cuenta1.NombreTitular () + ": " + Cuenta1.ObtenerSaldo() );
System.out.println (cuenta2.NombreTitular () + ": " + Cuenta2.ObtenerSaldo() );
System.out.println (cuenta3.NombreTitular () + ": " + Cuenta3.ObtenerSaldo());
System.out.println (CuentaBancaria.SaldoTotalCuentas ());
}
} */
public class CuentaBancaria {
	private double saldo;
	private String titular;
	private int numeroDeCuenta;
	private static double totalCuentas=0;

	CuentaBancaria(){
		this.saldo=0;
		this.titular="";
		this.numeroDeCuenta=0;
	}
	
	CuentaBancaria(int sal,String tit, int numC){
		this.saldo=sal;
		this.titular=tit;
		this.numeroDeCuenta=numC;
		totalCuentas=totalCuentas+this.saldo;
	}
	
	public void ingresarSaldo(double sum) {
		this.saldo=this.saldo+sum;
		totalCuentas=totalCuentas+sum;
	}
	
	public void retirarSaldo(double res) {
		this.saldo=this.saldo-res;
		totalCuentas=totalCuentas-res;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	private void setSaldo(double sald) {
		this.saldo=sald;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	private void setTitular(String tit) {
		this.titular=tit;
	}
	
	public int getNumeroTitularCuenta() {
		return this.numeroDeCuenta;
	}
	
	private void setNumeroTitularCuenta(int numT) {
		this.numeroDeCuenta=numT;
	}
	
	public static double totalCuentas() {
		return totalCuentas;
	}
	
}	