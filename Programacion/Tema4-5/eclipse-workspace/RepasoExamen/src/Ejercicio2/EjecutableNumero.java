package Ejercicio2;

import java.util.Scanner;
public class EjecutableNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Introducir=new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int num=Introducir.nextInt();
		Numero nuevoNumero=new Numero(num);
		
		System.out.println("Suma algo a tu numero");
		int suma=Introducir.nextInt();
		nuevoNumero.anyade(suma);
		System.out.println("El numero con la suma hecha es de "+nuevoNumero.getValor());
		
		System.out.println("Resta algo a tu numero");
		int res=Introducir.nextInt();
		nuevoNumero.resta(res);
		System.out.println("El numero con la resta hecha es de "+nuevoNumero.getValor());
		
		System.out.println("Valor normal:");
		System.out.println(nuevoNumero.getValor());
		
		System.out.println("Valor doble:"+nuevoNumero.getDoble());
		System.out.println("Valor triple:"+nuevoNumero.getTriple());

	}

}
