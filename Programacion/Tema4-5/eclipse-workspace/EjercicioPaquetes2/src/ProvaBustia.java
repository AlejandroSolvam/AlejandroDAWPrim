import bustia.BustiaBueno;
import bustia.correu.Correu;

public class ProvaBustia {

	public static void main(String[] args) {
		BustiaBueno b=new BustiaBueno();
		b.afegir(new Correu("Missatge 1"));
		Correu c= new Correu("Missatge 2");
		b.afegir(c);
		Correu d= new Correu("Missatge 3");
		b.afegir(d);
		b.elimina(3);
		System.out.println("Per llegir "+b.porLeer());
		b.muestraNoLeido();
		System.out.println("Per llegir "+b.porLeer());
	}

}
