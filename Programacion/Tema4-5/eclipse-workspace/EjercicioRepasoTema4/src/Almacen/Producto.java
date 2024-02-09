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

	private String nombreProducto;
	private String categoriaProducto;
	private int cantidadProductosEnAlmacen;
	
	public Producto(String newN, String newP, int canProd){
		this.nombreProducto=newN;
		this.categoriaProducto=newP;
		this.cantidadProductosEnAlmacen=canProd;
	}
	
	public Producto(int canProd,String newN, String newP){
		this.nombreProducto=newN;
		this.categoriaProducto=newP;
		this.cantidadProductosEnAlmacen=canProd;
	}
	
	public Producto(String newN, int canProd,String newP){
		this.nombreProducto=newN;
		this.categoriaProducto=newP;
		this.cantidadProductosEnAlmacen=canProd;
	}
	
	public Producto(String newN, String newP){
		this.nombreProducto=newN;
		this.categoriaProducto=newP;
		this.cantidadProductosEnAlmacen=5;
	}
	
	public Producto(String newN, int canProd){
		this.nombreProducto=newN;
		this.categoriaProducto="Predeterminado";
		this.cantidadProductosEnAlmacen=canProd;
	}
	
	public Producto(int canProd,String newN){
		this.nombreProducto=newN;
		this.categoriaProducto="Predeterminado";
		this.cantidadProductosEnAlmacen=canProd;
	}
	
	public Producto(int canProd){
		this.nombreProducto="Producto Predeterminado";
		this.categoriaProducto="Predeterminado";
		this.cantidadProductosEnAlmacen=canProd;
	}
	
	public Producto(String newN){
		this.nombreProducto=newN;
		this.categoriaProducto="Predeterminado";
		this.cantidadProductosEnAlmacen=8;
	}
	
	public Producto(){
		this.nombreProducto="";
		this.categoriaProducto="";
		this.cantidadProductosEnAlmacen=0;
	}
	
	public String getNombreProducto() {
		return this.nombreProducto;
	}
	
	public void setNombreProducto(String name) {
		this.nombreProducto=name;
	}
	
	public String getCategoria() {
		return this.categoriaProducto;
	}
	
	public void setCategoria(String cat) {
		this.categoriaProducto=cat;
	}
	
	public int getCantidadProducto() {
		return this.cantidadProductosEnAlmacen;
	}
	
	public void setCantidadProducto(int canT) {
		this.cantidadProductosEnAlmacen=canT;
	}
	
}
