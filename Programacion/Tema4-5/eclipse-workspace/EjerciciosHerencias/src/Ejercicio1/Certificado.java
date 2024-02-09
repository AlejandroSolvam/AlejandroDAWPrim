package Ejercicio1;
/* Crea una clase Certificado que sea subclase de Examen. Crea un método en la subclase Certificado llamado "Calificacion".

Si el valor de la calificación es A se establecerá "Excelencia" en el certificado, B o C será "Logro", 
en caso contrario "No se reconoce certificado".

Finalmente deberá devolver el valor del certificado. */
public class Certificado extends Examen {
	
	private String nota;
	
	Certificado(String newNot) {
		super(newNot);
		this.nota=newNot;
		// TODO Auto-generated constructor stub
	}
	
	String Calificacion(){
		if(nota=="A") {
			nota="Excelente";
			return nota;
		}
		if(nota=="B" || nota=="C") {
			nota="Logro";
			return nota;
		}
		if(nota!="A" && nota!="B" && nota!="C")
		nota="No se reconoce certificado";
		return nota;
	}

}
