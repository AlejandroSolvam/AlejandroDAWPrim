package Ejercicio1;
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
		private String titularCuenta;
		private double numeroCuenta;
		private static double saldoCuentas=0; 
		
		CuentaBancaria(){
			this.saldo=100;
			this.titularCuenta="Tobias";
			this.numeroCuenta=1;
			saldoCuentas=saldoCuentas+saldo;
		}
		
		CuentaBancaria(double sald, String tit, double numCuen){
			this.saldo=100;
			this.titularCuenta="Tobias";
			this.numeroCuenta=1;
			saldoCuentas=saldoCuentas+saldo;
		}
		
		void ingresar(double ingres) {
			this.saldo=saldo+ingres;
			saldoCuentas=saldoCuentas+ingres;
		}
		
		void retirar(double retir) {
			this.saldo=saldo-retir;
			saldoCuentas=saldoCuentas-retir;
		}
		
		double getSaldo() {
			return this.saldo;
		}
		
		String getTitular() {
			return this.titularCuenta;
		}
		
		double getNumCuenta() {
			return this.numeroCuenta;
		}
		
		static double SaldoTotalCuentas() {
			return saldoCuentas;
		}
	
}
