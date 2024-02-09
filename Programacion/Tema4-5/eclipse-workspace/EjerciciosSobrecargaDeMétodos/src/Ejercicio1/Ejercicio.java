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
public class Ejercicio {
	
	public static void main(String [] args) {
		
		Calculadora calculadoraAlejandro=new Calculadora(5,10);
		calculadoraAlejandro.setDouble1(7.2);
		calculadoraAlejandro.setDouble2(5.8);
		
		Calculadora calculadora=new Calculadora();
		
		Calculadora calculadoraTobias=new Calculadora(5.2,2.7);
		
		System.out.println(calculadoraAlejandro.getSuma());
		calculadoraAlejandro.setSuma(calculadoraAlejandro.getDouble1(),calculadoraAlejandro.getDouble2());
		System.out.println(calculadoraAlejandro.getSumaDou());
		
		System.out.println("La suma de los numeros "+ calculadoraAlejandro.getInt1() + " y " + calculadoraAlejandro.getInt2() + " que has introducido es de " + calculadoraAlejandro.getSuma());
		System.out.println("La resta de los numeros "+ calculadoraAlejandro.getInt1() + " y " + calculadoraAlejandro.getInt2() + " que has introducido es de " + calculadoraAlejandro.getResta());
		System.out.println("La multiplicacion de los numeros "+ calculadoraAlejandro.getInt1() + " y " + calculadoraAlejandro.getInt2() + " que has introducido es de " + calculadoraAlejandro.getMultiplicacion());
		System.out.println("La division de los numeros "+ calculadoraAlejandro.getInt1() + " y " + calculadoraAlejandro.getInt2() + " que has introducido es de " + calculadoraAlejandro.getDivision());
		
		System.out.println("La suma de los numeros "+ calculadoraTobias.getDouble1() + " y " + calculadoraTobias.getDouble2() + " que has introducido es de " + calculadoraTobias.getSumaDou());
		System.out.println("La resta de los numeros "+ calculadoraTobias.getDouble1() + " y " + calculadoraTobias.getDouble2() + " que has introducido es de " + calculadoraTobias.getRestaDou());
		System.out.println("La multiplicacion de los numeros "+ calculadoraTobias.getDouble1() + " y " + calculadoraTobias.getDouble2() + " que has introducido es de " + calculadoraTobias.getMultiplicacionDou());
		System.out.println("La division de los numeros "+ calculadoraTobias.getDouble1() + " y " + calculadoraTobias.getDouble2() + " que has introducido es de " + calculadoraTobias.getDivisionDou());
	}
}
