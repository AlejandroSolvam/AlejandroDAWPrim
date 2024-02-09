package Ejercicio3Clases;

public class Satelite{
	
private double meridiano;
private double paralelo;
private double distancia_tierra;  /* doublé no existe, es double */

public void setPosicion (double m, double p, double d){ /* doublé no existe, es double */
meridiano = m;
paralelo = p;
distancia_tierra = d; 
}

public void printPosicion () {  /* las comillas son erróneas */
System.out.println("El satellite se encuentra en el paralelo"+paralelo+" Meridiano "+meridiano+" a una distancia de la tierra de "+distancia_tierra+" kilómetros");
/* La variable meridiano estaba mal escrita, las comillas finales no estaban cerradas */
	}

}