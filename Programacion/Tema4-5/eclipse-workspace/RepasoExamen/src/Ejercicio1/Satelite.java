package Ejercicio1;

/* 3. La següent classe te problemes de compilació: */
public class Satelite{
private double meridiano;
private double paralelo;
private double distancia_tierra; /* doublé esta mal escrito */
public void setPosicion (double m, double p, double d){ /* doublé esta mal escrito */
meridiano = m;
paralelo = p;
distancia_tierra = d;
}
public void printPosicion () {/* las comillas estan mal */
System.out.println ("El satellite se encuentra en el paralelo"+paralelo+" Meridiano "+
meridiano+" a una distancia de la tierra de "+distancia_tierra+" kilómetros");/* meridian estaba mal */
/* Averigua els problemes i corregix-los. */
	}
}

