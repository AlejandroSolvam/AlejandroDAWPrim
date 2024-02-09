package paquetePrueba;

import paqueteCubo.Cubo;
import paqueteCuadrado.Cuadrado;
public class Prueba {

	public static void main(String[] args) {
		Cuadrado cuadradoUsadoPorCubo=new Cuadrado("Triangulo",2,1,5);
		Cubo nuevoCubo=new Cubo("Cubo",4,3,cuadradoUsadoPorCubo);
		
		cuadradoUsadoPorCubo.dibujar();
		System.out.println(cuadradoUsadoPorCubo.calcularArea());
		System.out.println(cuadradoUsadoPorCubo.calcularPerimetro());
		cuadradoUsadoPorCubo.CambiarTamaño();
		System.out.println(cuadradoUsadoPorCubo.getLado());
		cuadradoUsadoPorCubo.Colorear(true);
		
		
		nuevoCubo.dibujar();
		System.out.println(nuevoCubo.calcularVolumen());
		nuevoCubo.Colorear(true);

	}

}
