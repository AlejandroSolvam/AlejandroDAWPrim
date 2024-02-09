package paqueteProducto;

public abstract class Producto {
	private int idProducto;
	private String nombre;
	private double precio;
	
	public Producto(){
		this.idProducto=0;
		this.nombre="Producto predeterminado";
		this.precio=0.0;
	}
	
	public Producto(int newID, String newN, double newP){
		this.idProducto=newID;
		this.nombre=newN;
		this.precio=newP;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double nuevoP) {
		this.precio = nuevoP;
	}
	
	public abstract String toString();
	public abstract double impuestoProducto();
}
