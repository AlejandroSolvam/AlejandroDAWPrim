package paqueteParticulares;
import paqueteEdificio.Edificio;
import paqueteIluminación.Iluminación;

public class Particulares extends Edificio implements Iluminación{

private static int cantidadParticulares;
private int viviendasCan;

public Particulares() {
	super();
	viviendasCan=5;
	cantidadParticulares++;
}

public Particulares(int canAsc,int newV) {
	super(canAsc);
	viviendasCan=newV;
	cantidadParticulares++;
}

public int getViviendasCan() {
	return viviendasCan;
}

public void setViviendasCan(int viviendasCan) {
	this.viviendasCan = viviendasCan;
}

public static int getCantidadParticulares() {
	return cantidadParticulares;
}

@Override
public String toString() {
	return "Cantidad Particulares: " + getViviendasCan() + ", Impuesto Particulares: " + hallarImpuesto()
			+ ", Cantidad de ascensores edificio: " + getCantidadAscensores();
}

public double hallarImpuesto() {
	return 750;
}

public int cantidadLuces() {
	return 10;
}

}