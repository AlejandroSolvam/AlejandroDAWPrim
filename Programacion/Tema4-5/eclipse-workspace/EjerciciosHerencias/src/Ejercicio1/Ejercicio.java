package Ejercicio1;
/* Crea una clase Certificado que sea subclase de Examen. Crea un método en la subclase Certificado llamado "Calificacion".

Si el valor de la calificación es A se establecerá "Excelencia" en el certificado, B o C será "Logro", 
en caso contrario "No se reconoce certificado".

Finalmente deberá devolver el valor del certificado. */
public class Ejercicio {
	
	public static void main(String[]args) {
		
		Certificado miCertificado=new Certificado("A");
		System.out.println(miCertificado.Calificacion());
		
	}

}
