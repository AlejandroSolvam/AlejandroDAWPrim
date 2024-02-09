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
public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente (1,"Juan", "Perez Goñi", "Oro");
		Cliente cliente2 = new Cliente (2,"Luis", "Soriano Garcia", "Plata");
		Cliente cliente3 = new Cliente (3,"Fautino", "Perez Perez","");
		System.out.println (cliente1.getNumCliente()+ " "+cliente1.getNombreCliente() + " " +cliente1.getApellidosCliente()+ " " +cliente1.getColor());
		System.out.println (cliente2.getNumCliente()+ " "+cliente2.getNombreCliente() + " " +cliente2.getApellidosCliente()+ " " +cliente2.getColor());
		System.out.println (cliente3.getNumCliente()+ " "+cliente3.getNombreCliente() + " " +cliente3.getApellidosCliente()+ " " +cliente3.getColor());
		System.out.println ("Finalmente hay creados en total "+Cliente.totalClientes()+" clientes.");

	}

}
