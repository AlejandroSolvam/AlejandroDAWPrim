package Ejercicio3;
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
	private String nombreCliente;
	private String apellidosCliente;
	private String color;
	private static int contarClientes=0;
	
	Cliente(int numClien,String nomClien, String apellClien,String col){
		this.setNumCliente(numClien);
		this.setNombreCliente(nomClien);
		this.setApellidosCliente(apellClien);
		this.setColor(col);
		contarClientes++;
	}
	
	void setNumCliente(int numCli) {
		this.numeroCliente=numCli;
	}
	
	int getNumCliente() {
		return numeroCliente;
	}
	
	void setNombreCliente(String newName) {
		this.nombreCliente=newName;
	}
	
	String getNombreCliente() {
		return nombreCliente;
	}
	
	void setApellidosCliente(String newAp) {
		this.apellidosCliente=newAp;
	}
	
	String getApellidosCliente() {
		return apellidosCliente;
	}
	
	void setColor(String newC) {
		this.color=newC;
	}
	
	String getColor() {
		return this.color;
	}
	
	static int totalClientes(){
		return contarClientes;
	}

}
