package paquetePrueba;
import paqueteCuadrado.Cuadrado;
import paqueteCubo.Cubo;
import paqueteFigura.Figura;
public class Prueba {
	public static void main(String [] args) {
		Figura nuevoCuadrado=new Cuadrado("Rectangulo",3,1,7);
		Figura nuevoCubo=new Cubo("Vegetta",2,3,(Cuadrado)nuevoCuadrado);
		
		
		System.out.println(((Cuadrado)nuevoCuadrado).calcularArea());
		
		System.out.println(((Cuadrado)nuevoCuadrado).calcularPerimetro());
		((Cuadrado)nuevoCuadrado).dibujar();
		((Cuadrado)nuevoCuadrado).Colorea(true);
		((Cuadrado)nuevoCuadrado).cambiarTamaño();
		System.out.println(((Cuadrado)nuevoCuadrado).getLado());
		
		System.out.println(((Cubo)nuevoCubo).calcularVolumen());
		((Cubo)nuevoCubo).dibujar();
		((Cubo)nuevoCubo).Colorea(true);
		
	}
}
