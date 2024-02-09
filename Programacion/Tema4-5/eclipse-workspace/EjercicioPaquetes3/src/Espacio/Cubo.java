package Espacio;
/* Exercici paquets
Crea una classe: Cub.
Aquesta classe haurà de pertànyer al paquet Espai.
El constructor d'aquesta classe haurà de definir-se de manera que deurem passar-li el paràmetre necessari
per a reomplir el seu atribut. El Cub, deurà tenir com a paràmetres la longitud del costat.
Deurà tenir, a més, un mètode que calcule automàticament l'àrea.
Àrea del cub = costat 3
Després, crea una classe test, que no estiga en el mateix paquet.
Aquesta classe treballarà amb un Arraylist de cubs.
En el mètode main es realitzaran les següents operacions mitjançant un menú:
Afegir Cub i guardar-lo a un array.
Visualitzar l'àrea dels mateixos.
Visualitzar tots els objectes i les seues característiques. */

public class Cubo {

	private double longitudCostado;
	
	public Cubo(double newLon){
		longitudCostado=newLon;
	}
	
	Cubo(){
		longitudCostado=0;
	}
	
	void setLongitudCostado(double newL){
		this.longitudCostado=newL;
	}
	
	public double getLongitudCostado(){
		return this.longitudCostado;
	}
	
	public double calcularAreaCubo(){
		return Math.pow(longitudCostado,3);
	}
}
