package paqueteFigura;

public abstract class Figura {
	private String nombre;
	private int grosorBorde;
	private int color;
	
	public Figura() {
		this.nombre="Nombre predeterminado";
		this.grosorBorde=0;
		this.color=0;
	}
	
	public Figura(String newN, int newG, int newC) {
		this.nombre=newN;
		this.grosorBorde=newG;
		this.color=newC;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGrosorBorde() {
		return grosorBorde;
	}

	public void setGrosorBorde(int grosorBorde) {
		this.grosorBorde = grosorBorde;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
	public abstract void dibujar();
}
