package peliculasPaquete;

import personaPaquete.Persona;
import actorPaquete.Actor;

public class Peliculas{
	
	public static void mostrarReparto(Actor lista[], String pelicula) {
			for (int i = 0; i < lista.length; i++)
				if (lista[i].getPelicula().equals(pelicula)) {
					System.out.println(lista[i].toString());
		}
	}
}
