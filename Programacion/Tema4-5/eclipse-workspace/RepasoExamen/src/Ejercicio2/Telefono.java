package Ejercicio2;
/* 2. Crea la siguiente clase con su correspondiente constructor:
Clase Telefono
Atributos:
• int prefijo
• long numero
• Contacto nombre
Métodos:
• Telefono()
• public void agregarContacto(Contacto nuevo)
• public int getPrefijo()
• public void setPrefijo()
• public long getNumero()
• public void setNumero(long newNumero)
Para el ejercicio supón que tienes definida y compilada una clase Contacto que puedes utilizar.
Public class Contacto{
//Atributos
String nombre
//Metodos
Contacto(){
this.nombre = “”;
}
public String getNombre(){
return this.nombre;
}
public void setNombre(String n){
this.nombre = n;
}
}
Al constructor se le pasará como parámetros el prefijo, el número y el contacto */
public class Telefono {
	private int prefijo;
	private long numero;
	private Contacto nombre;
	
	Telefono(){
		this.prefijo=00;
		this.numero=000000000;
		this.nombre=new Contacto();
	}
	
	Telefono(int pref,long num,Contacto nam){
		this.prefijo=pref;
		this.numero=num;
		this.nombre=nam;
	}
	
	public int getPrefijo(){
		return this.prefijo;
	}
	
	public void setPrefijo(int newP){
		this.prefijo=newP;
	}
	
	public long getNumero(){
		return this.numero;
	}
	
	public void setNumero(long newN){
		this.numero=newN;
	}
	
	public void agregarContacto(Contacto nuevo){
		this.nombre=nuevo;
	}
	
	public String returnNombre(){
		return this.nombre.getNombre();
	}
	
}
