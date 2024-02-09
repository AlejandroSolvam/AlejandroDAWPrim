package Ejercicio3;

public class Alumno {
	public Alumno(String nombre, String apellidos) {
	throws Exception{
		if(nombre == null || apellidos == null) {
		throw new Exception("Argumentos no válidos");
		//si el constructor lanza la excepcion el objeto
		//no se crea
		}
	}
		public static void main(String [] args) {
			try {
				Alumno alum= new Alumno(null, "hola");
			}catch (Exception e) {
				System.out.println("Excepcion: "+e.getMessage());
			}
	}
}
