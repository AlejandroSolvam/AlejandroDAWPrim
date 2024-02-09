package EjercicioPajaro;

import java.awt.Color;
import java.util.Arrays;

public class Ejercicio {

public static void main (String[] args) {
		
		Pajaro MiPajaro = new Pajaro();
		Pajaro MiPajaro2 = new Pajaro();
		
		MiPajaro.setedad(5);
		MiPajaro.setcolor('v');
		
		MiPajaro2.setedad(3);
		MiPajaro.setcolor('a');
		
		MiPajaro.printedad();
		MiPajaro.printcolor();
		
		MiPajaro2.printedad();
		MiPajaro2.printcolor();
		
		
		
		Figuras MiFigura = new Figuras();
		Figuras MiFigura2 = new Figuras();
		
		Color verde = new Color (8-15);
		Color rojo = new Color (16-23);
		
		MiFigura.EstableceColor(Color.blue);
		MiFigura2.EstableceColor(Color.red);
		
		System.out.println(MiFigura.DimeColor());
		System.out.println(MiFigura2.DimeColor());
		
		int [] posicion= {2,4};
		int [] posicion2= {4,7};
		
		MiFigura.EstableceCentro(posicion);
		MiFigura2.EstableceCentro(posicion2);
		
		int [] centro=new int[2];
		centro=MiFigura.DimeCentro();
		System.out.println(Arrays.toString(centro));
		
		centro=MiFigura2.DimeCentro();
		System.out.println(Arrays.toString(centro));
		
		}
	
}
