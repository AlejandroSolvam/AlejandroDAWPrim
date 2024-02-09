package EstadiFutbol;
import java.util.ArrayList;
import EstadiFutbol.Asistentes;
/* Exercici de repàs
Un Estadi de Futbol vol en tot moment tenir el control de tots els assistents al estadi cada partit.
Dels assistents es vol saber: El nom, la edat i si son socis.
Els assistents a cada partit estaran guardats a un ArrayList de assistents.
El màxim de assistents a cada partit serà de 15000 assistents.
La quantitat de socis es vol controlar mitjançant una variable de classe.
Per a portar aquest control, tindrem el següent menú:
1. Entra assistent
2. Ix assistent
3. Veure la quantitat de assistents amb tots els seus atributs.
5. Veure la quantitat de socis assistents i el seu nom. */ 
import java.util.Scanner;
public class cuentaAsistentes {
	
	Scanner Introducir=new Scanner(System.in);
	private ArrayList <Asistentes> listaAsistentes;
	
	public cuentaAsistentes(){
		this.listaAsistentes=new ArrayList();
	}
	
	public void entraAsistente(Asistentes newAsistente){
		if(listaAsistentes.size()>15000) {
			System.out.println("Ya esta lleno el estadio por completo");
		}else{
			listaAsistentes.add(newAsistente);
		}
	}
	
	public void saleAsistente(int codAs){
		if(listaAsistentes.isEmpty()){
			System.out.println("No existe ningun asistente todavía");
		}else{
		for(int i=0;i<listaAsistentes.size();i++){
			Asistentes variableAsistente=listaAsistentes.get(i);
			if(variableAsistente.getCodigoAsistente()==codAs){
				listaAsistentes.remove(i);
				variableAsistente.borrarSocio();
				}
			}
		}
	}
	
	public void verAsistentes(){
		if(listaAsistentes.isEmpty()){
			System.out.println("No existe ningun asistente todavía");
		}else{
		for(int i=0;i<listaAsistentes.size();i++){
			Asistentes variableAsistente=listaAsistentes.get(i);
			System.out.println(variableAsistente.getNombre()+" "+variableAsistente.getEdad()+" "+variableAsistente.getEsSocio()+" "+variableAsistente.getCodigoAsistente());
		}
		System.out.println("Hay un total de "+listaAsistentes.size()+" asistentes.");
	}
}
	
	public void verSociosAsistentes(){
		if(listaAsistentes.isEmpty()){
			System.out.println("No existe ningun asistente todavía");
		}else{
		for(int i=0;i<listaAsistentes.size();i++){
			Asistentes variableAsistente=listaAsistentes.get(i);
			if(variableAsistente.getEsSocio()==true){
			System.out.println(variableAsistente.getNombre()+" "+variableAsistente.getEdad()+" "+variableAsistente.getEsSocio()+" "+variableAsistente.getCodigoAsistente());
				}
			}
		System.out.println("Hay un total de "+Asistentes.getnumAsistentes()+" asistentes socios.");
		}
	}
}
