package paqueteSonido;

import paqueteProducto.Producto;
import paqueteGarantia.Garantia;

public class Sonido extends Producto implements Garantia{
	private String marca;
    private String modelo;
    private String tipo; 
    private String conectividad;
    private boolean incluyeMicrofono;
    private boolean garantiaP;
	private static int cantidadSonido=0;
	
    public Sonido() {
    	super();
    	this.marca="Marca Predeterminada";
    	this.modelo="Modelo Predeterminado";
    	this.tipo="Tipo predeterminado";
    	this.conectividad="Conectividad predeterminada";
    	this.incluyeMicrofono=false;
    	this.garantiaP=false;
    	cantidadSonido++;
    }
    
    public Sonido(int newID, String newN, double newP, String newMarc, String newMod, String newTip, String newCon, boolean incMic,boolean tieneG) {
		super(newID,newN,newP);
    	this.marca=newMarc;
    	this.modelo=newMod;
    	this.tipo=newTip;
    	this.conectividad=newCon;
    	this.incluyeMicrofono=incMic;
    	this.garantiaP=tieneG;
    	cantidadSonido++;
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getConectividad() {
		return conectividad;
	}

	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}

	public boolean isIncluyeMicrofono() {
		return incluyeMicrofono;
	}

	public void setIncluyeMicrofono(boolean incluyeMicrofono) {
		this.incluyeMicrofono = incluyeMicrofono;
	}

	public static int getCantidadSonido() {
		return cantidadSonido;
	}
	
	public void estadoGarantia() {
		System.out.println("Nuestro aparato de sonido tiene garantía?" + this.garantiaP);
	}
	
	public void darGarantia() {
		if(this.garantiaP==false) {
			this.garantiaP=true;
			System.out.println("Tu aparato de sonido ahora tiene garantía");
		}else{
			System.out.println("Este aparato de sonido ya tiene garantía");
		}
	}
	
	public void quitarGarantia() {
		if(this.garantiaP==true) {
			this.garantiaP=false;
			System.out.println("Tu aparato de sonido ya no tiene garantía");
		}else{
			System.out.println("Este aparato de sonido no tenía garantía, no puedes quitarle lo que no tiene");
		}
	}

	public double impuestoProducto() {
		return 2.89;
	}

	@Override
	public String toString() {
		return "Marca sonido:" + getMarca() + "\nModelo sonido:" + getModelo() + "\nTipo equipo sonido:" + getTipo()
				+ "\nTipo conectividad:" + getConectividad() + "\nIncluye microfono?:" + isIncluyeMicrofono()
				+ "\nImpuesto de producto:" + impuestoProducto() + "\nId Producto:" + getIdProducto()
				+ "\nNombre Producto:" + getNombre() + "\nPrecio producto:" + getPrecio();
	}
	
	
    
}
