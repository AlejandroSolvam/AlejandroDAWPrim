package Ejercicio6;

public class EjecutableCliente {
	
	public static void main(String[] args) {
		
			Cliente cliente1 = new Cliente (1,"Juan", "Perez Goñi", "Oro");
			Cliente cliente2 = new Cliente (2,"Luis", "Soriano Garcia", "Plata");
			Cliente cliente3 = new Cliente (3,"Fautino", "Perez Perez","");
			
			System.out.println(cliente1.getNombre());
			cliente1.muestraDatos();
			System.out.println(cliente2.getNombre());
			cliente2.muestraDatos();
			System.out.println(cliente3.getNombre());
			cliente3.muestraDatos();
			System.out.println(Cliente.getContarClientes());
			}
		}

	
