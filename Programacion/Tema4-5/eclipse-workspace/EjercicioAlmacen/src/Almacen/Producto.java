package Almacen;
/* Exercici de repàs
Exercici 1
Un magatzem vol en tot moment tindre el control de tots els seus productes emmagatzemats.
Els seus productes estaran guardats en un ArrayList de productes. El màxim de productes emmagatzemats
serà de 100.
De cada producte es vol saber el seu nom, la seua quantitat i la seua categoria.
Per a portar aquest control, tindrem el següent menú:
1. Afegir nou producte
2. Buscar producte i modificar la quantitat.
4. Veure una llista de productes per categoria
5. Comprovar la quantitat de productes en magatzem. */
public class Producto {
	private String nombre;
	private int cantidad;
	private String categoria;
	private int codigoProducto;
	
	public Producto(){
		this.nombre="";
		this.cantidad=0;
		this.categoria="";
		this.codigoProducto=0;
	}
	
	public Producto(String name, int can, String cat, int codPro){
		this.nombre=name;
		this.cantidad=can;
		this.categoria=cat;
		this.codigoProducto=codPro;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String newN) {
		this.nombre=newN;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	
	public void setCantidad(int newC) {
		this.cantidad=newC;
	}
	
	public String getCategoria() {
		return this.categoria;
	}
	
	public void setCategoria(String newCat) {
		this.categoria=newCat;
	}
	
	public int getCodigoProducto() {
		return this.codigoProducto;
	}
	
	public void setCodigoProducto(int newCP) {
		this.codigoProducto=newCP;
	}
	
}
