package Ejercicio8.Curso;
/* Exercici de paquets
1. Crea un directori Curs i en ell:
• Implementar la classe Assignatura que represente el nom d'una assignatura i la nota
corresponent obtinguda. Les operacions són:
◦ Constructor que accepte com a paràmetres el nom de l'assignatura i la nota
obtinguda.
◦ Mètodes per a modificar la nota (setNota) i per a consultar la nota (getNota).
◦ Mètode que ens retorne “Aprovat” si la nota és major o igual a 60 o “Reprovat” si la
nota és menor que 60.
◦ Mètode per a consultar el nom de l'assignatura.
• Implementar la classe Alumne que incloga una col·lecció d'Assignatures a les quals
l'alumne ha assistit i per a les quals pot tindre nota(Programacion, BaseDatos,
Sistemes i PaginasWeb). A més d'incloure els atributs nom i edat. Les operacions
disponibles sobre l'alumne són:
◦ Constructor que accepte com a paràmetre el nom de l'alumne i edat.
◦ Mètodes per a modificar el nom (setNombre) i per a consultar-lo (getNombre).
◦ Mètodes per a modificar i consultar l'edat.
◦ Mètode per a modificar la nota d'una Assignatura.
◦ Mètode per a visualitzar l'Assignatura i la nota
◦ Mètode que ens retorne la mitjana de l'alumne.
2. Fora del directori creat:
• Implementar la classe Aplicació per a fer ús de les classes Alumne i Assignatura.
1. Crear alumnes amb els seus respectius nom i edat.
2. Per a cada alumne establir en les seues assignatures la nota obtinguda.
3. Imprimir en pantalla:
1. Nom de l'alumne.
2. Edat.
3. Assignatures que va cursar:
4. Nom de l'assignatura.
5. Nota obtinguda.
6. Si és una assignatura aprovada o no.
7. Mitjana de l'alumne */
public class Asignatura {
	private String nombreAsignatura;
	private double nota;
	
	Asignatura(){
		this.nombreAsignatura="Asignatura predeterminada";
		this.nota=0;
	}
	
	Asignatura(String asig,double newN){
		this.nombreAsignatura=asig;
		this.nota=newN;
	}
	
	Asignatura(String asig){
		this.nombreAsignatura=asig;
		this.nota=0;
	}
	
	public String getAsignatura() {
		return this.nombreAsignatura;
	}
	
	private void setAsignatura(String newAs) {
		this.nombreAsignatura=newAs;
	}
	
	public double getNota() {
		return this.nota;
	}
	
	public void setNota(double newNot) {
		this.nota=newNot;
	}
	
	public String notaAsignatura(Asignatura newAsignatura) {
		if(newAsignatura.getNota()>=6) {
			return "Aprobado";
		}else{
			return "Suspendido";
		}
	}
}