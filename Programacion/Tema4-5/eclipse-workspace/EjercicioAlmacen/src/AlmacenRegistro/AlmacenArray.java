package AlmacenRegistro;
import java.util.ArrayList;
import Almacen.Producto;

public class AlmacenArray {
	private ArrayList <Producto> listaAlmacen;
	
	public AlmacenArray(){
		this.listaAlmacen=new ArrayList();
	}
	
	public void añadirProducto(Producto newProducto) {
		if(listaAlmacen.size()>=100) {
			System.out.println("El almacen esta lleno");
		}else{
			this.listaAlmacen.add(newProducto);	
		}
	}
	
	public void modificarCantidadProducto(int codProd,int newCant) {
		if(listaAlmacen.isEmpty()) {
			System.out.println("No existe todavia ningun producto");
		}else{
			for(Producto producto:listaAlmacen) {
				if(producto.getCodigoProducto()==codProd) {
					producto.setCantidad(newCant);
				}
			}
		}
	}
	
	public void verProductosCategoria(String verCat) {
		if(listaAlmacen.isEmpty()) {
			System.out.println("No existe todavia ningun producto");
		}else{
			for(Producto producto:listaAlmacen) {
				if(producto.getCategoria().equals(verCat)){
					System.out.println(producto.getNombre()+" "+producto.getCantidad()+" "+producto.getCategoria()+" "+producto.getCodigoProducto());
				}
			}
		}
	}
	
	public void cantidadProductos() {
		if(listaAlmacen.isEmpty()) {
			System.out.println("No existe todavia ningun producto");
		}else{
			int totalProductos=0;
			for(Producto producto:listaAlmacen) {
				totalProductos=totalProductos+producto.getCantidad();
				}
			System.out.println("Hay un total de "+listaAlmacen.size()+" y entre todos hay una cantidad de "+totalProductos+" unidades.");
			}
		}
	
	}
