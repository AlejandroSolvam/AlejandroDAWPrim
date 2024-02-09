package pruebaPaquete;

import java.awt.Color;

import paqueteCirculo.Circulo;
import paqueteFigura.Figura;
import paqueteRectangulo.Rectangulo;
import paqueteConjuntoDeFiguras.ConjuntoDeFiguras;

public class Prueba {
	public static void main (String [] args){
		 double[] Lados = {3d,4d};
		 ConjuntoDeFiguras c = new ConjuntoDeFiguras();
		 c.añade(new Rectangulo(Lados, Color.green));
		 c.añade(new Circulo(5,Color.red));
		 c.imprimeTodo();
		 System.out.println(c.areaTotal());
		}
}
