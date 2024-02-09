package Ejercicio2;
/* 2. Crea els mètodes sobrecarregats en la classe Dades, perquè puga executar-se el codi de la classe
Prova.
public class Datos {
…
}
public class Prueba{
public static void main (String... args){
Datos s = new Datos();
int a = 1;
int b = 2;
s.Cambio(a,b);
s.Cambio("Monillo007");
}
} */
public class Ejercicio {
	public static void main(String [] args) {
		
		Datos datosAlejandro=new Datos("Alejandro",4,2);
		Datos datosGento=new Datos(5,7,"Tobias");
		Datos datosGaya=new Datos(1,"Thierry",9);
		Datos onlyName=new Datos("Parejo");
		onlyName.setNumero1(8);
		onlyName.setNumero2(9);
		Datos onlyNumber=new Datos(11,15);
		onlyNumber.setPalabra("Villa");
		
		System.out.println(datosAlejandro.getPalabra()+" "+datosAlejandro.getNumero1()+" "+datosAlejandro.getNumero2());
		System.out.println(datosGento.getPalabra()+" "+datosGento.getNumero1()+" "+datosGento.getNumero2());
		System.out.println(datosGaya.getPalabra()+" "+datosGaya.getNumero1()+" "+datosGaya.getNumero2());
		System.out.println(onlyName.getPalabra()+" "+onlyName.getNumero1()+" "+onlyName.getNumero2());
		System.out.println(onlyNumber.getPalabra()+" "+onlyNumber.getNumero1()+" "+onlyNumber.getNumero2());
		
		Datos vacio=new Datos();
		
		int a=1;
		int b=3;
		String nombre="manolo";
		
		vacio.cambio(nombre);
		vacio.cambio(a,b);
		System.out.println(vacio.getPalabra()+" "+vacio.getNumero1()+" "+vacio.getNumero2());
		
		datosAlejandro.cambio(nombre);
		datosAlejandro.cambio(a, b);
		System.out.println(datosAlejandro.getPalabra()+" "+datosAlejandro.getNumero1()+" "+datosAlejandro.getNumero2());
	}
}
