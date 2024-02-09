package Ejercicio6;

public class EjecutableCuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria (0,"Juan Perez", 1);
		CuentaBancaria cuenta2 = new CuentaBancaria (100,"Luis Soriano", 2);
		CuentaBancaria cuenta3 = new CuentaBancaria (5000,"Fautino Perez",3);
		cuenta1.ingresarSaldo(200);
		cuenta2.ingresarSaldo(100);
		cuenta3.retirarSaldo(300);
		cuenta1.ingresarSaldo(1000);
		System.out.println (cuenta1.getTitular() + ": " + cuenta1.getSaldo() + " : " + cuenta1.getNumeroTitularCuenta() );
		System.out.println (cuenta2.getTitular () + ": " + cuenta2.getSaldo() + " : " + cuenta2.getNumeroTitularCuenta());
		System.out.println (cuenta3.getTitular () + ": " + cuenta3.getSaldo() + " : " + cuenta3.getNumeroTitularCuenta());
		System.out.println (CuentaBancaria.totalCuentas());

	}

}
