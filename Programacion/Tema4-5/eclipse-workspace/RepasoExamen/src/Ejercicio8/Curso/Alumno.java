package Ejercicio8.Curso;
import java.util.ArrayList;
public class Alumno {

	private ArrayList <Asignatura> listaAsignaturasAlumno;
	private String nombre;
	private int edad;
	
	public Alumno(){
		this.nombre="";
		this.edad=0;
		listaAsignaturasAlumno=new ArrayList();
		Asignatura Programacion=new Asignatura("Programacion");
		listaAsignaturasAlumno.add(Programacion);
		Asignatura BaseDeDatos=new Asignatura("BaseDeDatos");
		listaAsignaturasAlumno.add(BaseDeDatos);
		Asignatura Sistemas=new Asignatura("Sistemas");
		listaAsignaturasAlumno.add(Sistemas);
		Asignatura PaginasWeb=new Asignatura("PaginasWeb");
		listaAsignaturasAlumno.add(PaginasWeb);
	}
	
	public Alumno(String name,int ed){
		this.nombre=name;
		this.edad=ed;
		listaAsignaturasAlumno=new ArrayList();
		Asignatura Programacion=new Asignatura("Programacion");
		listaAsignaturasAlumno.add(Programacion);
		Asignatura BaseDeDatos=new Asignatura("BaseDeDatos");
		listaAsignaturasAlumno.add(BaseDeDatos);
		Asignatura Sistemas=new Asignatura("Sistemas");
		listaAsignaturasAlumno.add(Sistemas);
		Asignatura PaginasWeb=new Asignatura("PaginasWeb");
		listaAsignaturasAlumno.add(PaginasWeb);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	private void setNombre(String newN) {
		this.nombre=newN;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int newEd) {
		this.edad=newEd;
	}
	
	public void modificarNotaAsignatura(String nombreAsignatura, double nota) {
		for(Asignatura asignatura:listaAsignaturasAlumno) {
			if(asignatura.getAsignatura().equals(nombreAsignatura)) {
				asignatura.setNota(nota);
				System.out.println("Nota de la asignatura "+ asignatura.getAsignatura()+" modificada.");
			}
		}
	}
	
	public void visualizarAsignaturas() {
		for(Asignatura asignatura:listaAsignaturasAlumno) {
				System.out.println(asignatura.getAsignatura()+" "+asignatura.getNota());
			}
		}
	
	public double mediaAlumno() {
		double media=0;
		for(Asignatura asignatura:listaAsignaturasAlumno) {
				media=media+asignatura.getNota();
			}
		return media/listaAsignaturasAlumno.size();
		}
	
	public void mostrarAlumno() {
		for(Asignatura asignatura:listaAsignaturasAlumno) {
			System.out.println(this.getNombre()+" "+this.getEdad()+" "+asignatura.getAsignatura()+" "+asignatura.getNota()+" "+asignatura.notaAsignatura(asignatura)+" "+this.mediaAlumno());
		}
	}
}
