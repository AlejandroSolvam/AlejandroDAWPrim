package paqueteJuguete;

import paqueteProducto.Producto;
import paqueteGarantia.Garantia;

public class Juguete extends Producto implements Garantia {
	private int restriccionEdad;
	private String tipo;
	private String material;
	private String marca;
	private boolean garantiaP;
	private static int cantidadJuguetes=0;
	
	public Juguete() {
		super();
		this.restriccionEdad=5;
		this.tipo="Tipo predeterminado";
		this.material="Material Predeterminado";
		this.marca="Marca Predeterminada";
		this.garantiaP=false;
		cantidadJuguetes++;
	}
	
	public Juguete(int newID, String newN, double newP, int newEdR, String newTip, String newMat, String newMarc, boolean tieneG) {
		super(newID,newN,newP);
		this.restriccionEdad=newEdR;
		this.tipo=newTip;
		this.material=newMat;
		this.marca=newMarc;
		this.garantiaP=tieneG;
		cantidadJuguetes++;
	}

	public int getRestriccionEdad() {
		return restriccionEdad;
	}

	public void setRestriccionEdad(int restriccionEdad) {
		this.restriccionEdad = restriccionEdad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
		
	public static int getCantidadJuguetes() {
		return cantidadJuguetes;
	}

	public void estadoGarantia() {
		System.out.println("Nuestro juguete tiene garantía?" + this.garantiaP);
	}
	
	public void darGarantia() {
		if(this.garantiaP==false) {
			this.garantiaP=true;
			System.out.println("Tu juguete ahora tiene garantía");
		}else{
			System.out.println("Este juguete ya tiene garantía");
		}
	}
	
	public void quitarGarantia() {
		if(this.garantiaP==true) {
			this.garantiaP=false;
			System.out.println("Tu juguete ya no tiene garantía");
		}else{
			System.out.println("Este juguete no tenía garantía, no puedes quitarle lo que no tiene");
		}
	}

	public double impuestoProducto() {
		return 1.55;
	}

	@Override
	public String toString() {
		return "Restriccion de edad Juguete: " + getRestriccionEdad() + "\nTipo Juguete: " + getTipo() + "\nMaterial Juguete:" + getMaterial()
				+ "\nMarca Juguete:" + getMarca() + "\nImpuesto Producto:" + impuestoProducto() + "\nId Producto:"
				+ getIdProducto() + "\nNombre Producto:" + getNombre() + "\nPrecio Producto" + getPrecio();
	}
	
}
