package miprimerproyecto;

public class Semaforo {
	
String EstadoSemaforo = "Rojo";

public void PonColor (String Color) {
EstadoSemaforo = Color;
}

public String DimeColor() {
return EstadoSemaforo;
}

} // Fin de la clase Semaforo