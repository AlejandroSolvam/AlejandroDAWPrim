package Ejercicio4;

public class EjecutableCalculadora {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();

		calculadora.setNumeroEntero1(6);
        calculadora.setNumeroEntero2(8);
        
        System.out.println("Suma de enteros: " + calculadora.sumar(calculadora.getNumeroEntero1(), calculadora.getNumeroEntero2()));
        System.out.println("Resta de enteros: " + calculadora.restar(calculadora.getNumeroEntero1(), calculadora.getNumeroEntero2()));
        System.out.println("Multiplicacion de enteros: " + calculadora.multiplicar(calculadora.getNumeroEntero1(), calculadora.getNumeroEntero2()));
        System.out.println("Division de enteros: " + calculadora.dividir(calculadora.getNumeroEntero1(), calculadora.getNumeroEntero2()));

        
        calculadora.setNumeroDouble1(5.5);
        calculadora.setNumeroDouble2(3.2);

        System.out.println("Suma de doubles: " + calculadora.sumar(calculadora.getNumeroDouble1(), calculadora.getNumeroDouble2()));
        System.out.println("Resta de doubles: " + calculadora.restar(calculadora.getNumeroDouble1(), calculadora.getNumeroDouble2()));// TODO Auto-generated method stub
        System.out.println("Multiplicacion de enteros: " + calculadora.multiplicar(calculadora.getNumeroDouble1(), calculadora.getNumeroDouble2()));
        System.out.println("Division de enteros: " + calculadora.dividir(calculadora.getNumeroDouble1(), calculadora.getNumeroDouble2()));

	}

}
