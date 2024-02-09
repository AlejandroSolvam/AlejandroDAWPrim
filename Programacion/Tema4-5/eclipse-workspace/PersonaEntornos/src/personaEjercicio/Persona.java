package personaEjercicio;

import java.util.Date;
import java.time.LocalDate;

public class Persona {

	private String name;
	private Date birthDate; 
	private int dia;
	private int mes;
	private int diaCumpleaños;
	private int mesCumpleaños;
	
	
	Persona(){
		this.name="";
		this.birthDate=null;
		this.dia=0;
		this.mes=0;
		this.diaCumpleaños=10;
		this.mesCumpleaños=2;
	}
	
	Persona(String newName, Date newF, int day, int newM,int dayB, int newMB){
		this.name=newName;
		this.birthDate=newF;
		this.dia=day;
		this.mes=newM;
		this.diaCumpleaños=dayB;
		this.mesCumpleaños=newMB;
	}
	
	String getNombre() {
		return this.name;
	}
	
	void setNombre(String na) {
		this.name=na;
	}
	
	boolean isBirthday() {
		if(this.dia==this.diaCumpleaños && this.mes == this.mesCumpleaños) {
			return true;
		}
		return false;
	} 
}
