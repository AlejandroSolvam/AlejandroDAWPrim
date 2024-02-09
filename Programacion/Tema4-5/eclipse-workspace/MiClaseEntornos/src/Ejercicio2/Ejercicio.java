package Ejercicio2;
/* Información: Unidad, Alumno, Asignatura, Calificación 

• Acciones:

▫ devolver el nombre del alumno

▫ sumar un punto a la calificación

▫ devolver si el alumno tiene más de un 5 en calificación */
public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Examen examenAlejandro=new Examen(3,"Alejandro","Programación",4.75);
			
			System.out.println(examenAlejandro.getNombreAlumno());
			examenAlejandro.sumarPunto();
			
			
			if(examenAlejandro.getCalificacion()==true) {
				System.out.println("El alumno ha sacado un "+examenAlejandro.getCalificacionTotal());
			}else{
				System.out.println("El alumno tiene igual o menos de un 5, por lo que no hay retorno");
			}
			
	}

}
