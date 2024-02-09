package Ejercicio6;
/* EXERCICI 2
Crea la classe Client amb el necessari (atributs, constructors, gets/sets, ...) per a poder-la
utilitzar en la classe més a baix indicada (PruebaCliente), en la classe prova es creen 3 clients.
A final ens mostra les dades del client i el total de clients existents, no utilitzes un mètode que
sume els clients, recorre a una altra tècnica pel fet que no seria òptim si existiren molts clients.
class Cliente {
…
}
class PruebaCliente {
public static void main (String[] args) {
Cliente cliente1 = new Cliente (1,”Juan”, “Perez Goñi”, “Oro”);
Cliente cliente2 = new Cliente (2,”Luis”, “Soriano Garcia”, “Plata”);
Cliente cliente3 = new Cliente (3,”Fautino”, “Perez Perez”,””);
System.out.println (cliente1.NombreCliente () + ": " + cliente1. MuestraDatos () );
System.out.println (cliente2.NombreCliente() + ": " + cliente2. MuestraDatos () );
System.out.println (cliente3.NombreCliente() + ": " + cliente3.MuestraDatos());
System.out.println (Cliente.TotalClientes ());
}
} */
public class Cliente {
	private int numeroCliente;
	private String nombre;
	private String apellido;
	private String color;
	private static int contarClientes=0;
	
	Cliente(){
		this.numeroCliente=0;
		this.nombre="";
		this.apellido="";
		this.color="";
		contarClientes++;
	}
	
	Cliente(int numClien,String name,String ap,String col){
		this.numeroCliente=numClien;
		this.nombre=name;
		this.apellido=ap;
		this.color=col;
		contarClientes++;
	}
	
	public int getNumeroCliente() {
		return this.numeroCliente;
	}
	
	public void setNumeroCliente(int numC) {
		this.numeroCliente=numC;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String newN) {
		this.nombre=newN;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setApellido(String newA) {
		this.apellido=newA;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String newC) {
		this.color=newC;
	}
	
	public void muestraDatos() {
		System.out.println(this.getNumeroCliente()+" "+this.getNombre()+" "+this.getApellido()+" "+this.getColor());
	}
	
	public static int getContarClientes() {
		return contarClientes;
	}
}
