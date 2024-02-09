package paquetePrueba;

/* Exercici 1: Aquest codi. Genera el objecte Alumno? Raona la resposta. */

public class Alumno{
	
	public Alumno(String nombre, String apellidos) throws Exception{
	if (nombre == null || apellidos == null) /* 2. Una de estas condiciones se cumple, por lo que se ejecuta el codigo dentro del if */
	throw new Exception("Argumentos no válidos"); /* 3. Se crea una nueva excepcion,
	y se lanza al metodo que lo ha llamado (al main) */
	}
		public static void main (String args[]){
		try{
		Alumno alum = new Alumno(null, "hola"); /* 1. Se ejecuta un objeto de la clase Alumno */
		}
	catch (Exception e){
	System.out.println("Excepcion: "+e.getMessage()); /* 4. Este codigo se ejecuta 
	ya el main ha pasado el error que ha generado el objeto Alumno creado. */
	}
  }
}
