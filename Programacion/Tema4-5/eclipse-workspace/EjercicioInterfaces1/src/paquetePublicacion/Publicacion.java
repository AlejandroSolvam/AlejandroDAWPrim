package paquetePublicacion;
/* Exercici: Escriu un programa per a una biblioteca que continga llibres i revistes.
Existint una classe publicació que guardarà els atributs comuns dels llibres i les revistes.
1. Les característiques comunes que s'emmagatzemen tant per a les revistes com per als llibres són el codi,
el títol, i l'any de publicació. Aquestes tres característiques es passen per paràmetre en el moment de crear
els objectes.
2. Els llibres tenen a més un atribut prestat. Els llibres, quan es creen, no estan prestats.
3. Les revistes tenen un número. En el moment de crear. En el moment de crear les revistes es passa el
número per paràmetre.
4. Tant les revistes com els llibres han de tindre (a part dels constructors i els seus gets i els seus sets) un
mètode toString() que retorna el valor de tots els atributs en una cadena de caràcters. També tenen un
mètode que retorna l'any de publicació, i un altre el codi.
5. Per a previndre possibles canvis en el programa s'ha d'implementar una interfície Prestable amb els
mètodes prestar(), retornar() i prestat(). La classe Llibre i Revista implementen aquesta interfície
6. Per a guardar totes les publicacions de la biblioteca crearem un array que continga totes elles.
7. Crea una classe Biblioteca amb el següent menú:
1. Introduir noves publicacions
2. Modificar dades de revistes
3. Modificar dades de llibres
4. Modificar els prestem
5. Mostrar les dades d'una publicació en concret
6. Mostrar totes les publicacions de la biblioteca. */
public abstract class Publicacion {
	private int codigo;
	private String titulo;
	private int anyoPub;
	
	public Publicacion(int newC,String newT, int newAñ) {
		this.codigo=newC;
		this.titulo=newT;
		this.anyoPub=newAñ;
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

	public int getAnyoPub() {
		return anyoPub;
	}

	public void setAnyoPub(int anyoPub) {
		this.anyoPub = anyoPub;
	}
	
	public abstract String toString();
	
	
}
