package paqueteElectronico;

import paqueteProducto.Producto;
import paqueteGarantia.Garantia;

public class Electronico extends Producto implements Garantia{
	private String marca;
	private String tipo;
    private String modelo;
    private String sistemaOperativo;
    private double almacenamientoInternoGB;
    private boolean garantiaP;
    private static int cantidadElectronicos=0;
    
    public Electronico() {
    	super();
    	this.marca="Marca Predeterminada";
    	this.tipo="Tipo predeterminado";
    	this.modelo="Modelo Predeterminado";
    	this.sistemaOperativo="Sistema Operativo Predeterminado";
    	this.almacenamientoInternoGB=0;
    	this.garantiaP=false;
    	cantidadElectronicos++;
    }
    
    public Electronico(int newID, String newN, double newP, String newMarc, String newTip, String newMod, String newSist, double newAlm, boolean tieneG) {
		super(newID,newN,newP);
    	this.marca=newMarc;
    	this.tipo=newTip;
    	this.modelo=newMod;
    	this.sistemaOperativo=newSist;
    	this.almacenamientoInternoGB=newAlm;
    	this.garantiaP=tieneG;
    	cantidadElectronicos++;
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public double getAlmacenamientoInternoGB() {
		return almacenamientoInternoGB;
	}

	public void setAlmacenamientoInternoGB(int almacenamientoInternoGB) {
		this.almacenamientoInternoGB = almacenamientoInternoGB;
	}

	public static int getCantidadElectronicos() {
		return cantidadElectronicos;
	}
	
	public void estadoGarantia() {
		System.out.println("Nuestro aparato Electronico tiene garantía?" + this.garantiaP);
	}
	
	public void darGarantia() {
		if(this.garantiaP==false) {
			this.garantiaP=true;
			System.out.println("Tu aparato Electronico ahora tiene garantía");
		}else{
			System.out.println("Este aparato Electronico ya tiene garantía");
		}
	}
	
	public void quitarGarantia() {
		if(this.garantiaP==true) {
			this.garantiaP=false;
			System.out.println("Tu aparato Electronico ya no tiene garantía");
		}else{
			System.out.println("Este aparato Electronico no tenía garantía, no puedes quitarle lo que no tiene");
		}
	}

	public double impuestoProducto() {
		return 4.38;
	}

	@Override
	public String toString() {
		return "Marca aparato:" + getMarca() + "\nTipo aparato:" + getTipo() + "\nModelo aparato:" + getModelo() + "\nSistema Operativo aparato:"
				+ getSistemaOperativo() + "\nAlmacenamiento Interno:" + getAlmacenamientoInternoGB()
				+ "\nImpuesto de producto:" + impuestoProducto() + "\nId Producto:" + getIdProducto()
				+ "\nNombre Producto:" + getNombre() + "\nPrecio Producto:" + getPrecio();
	}

}
