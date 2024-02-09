package paquetePrueba;

import paqueteAutoAnfibio.AutoAnfibio;
public class Prueba {

	public static void main(String[] args) {
	AutoAnfibio nuevoAnfibio=new AutoAnfibio("Toyota","X3");
	
	System.out.println(nuevoAnfibio.getMarca()+"  "+nuevoAnfibio.getModelo()+"\n");
	nuevoAnfibio.nadar();
	System.out.println("\n");
	nuevoAnfibio.andar();
	}
}
