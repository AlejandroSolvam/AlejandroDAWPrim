package paquetePublicacion;

public abstract class Publicacion {
	private int codigo;
	private String titulo;
	private int añoPublicacion;
	
	public Publicacion() {
		this.codigo=0;
		this.titulo="Titulo predeterminado";
		this.añoPublicacion=0000;
	}
	
	public Publicacion(int newC, String newT, int newAP) {
		this.codigo=newC;
		this.titulo=newT;
		this.añoPublicacion=newAP;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	
	public abstract String toString();
}
