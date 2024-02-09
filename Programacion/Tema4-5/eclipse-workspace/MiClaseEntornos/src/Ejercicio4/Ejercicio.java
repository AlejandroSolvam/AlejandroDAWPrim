package Ejercicio4;
/* • Información: Marca, Velocidad, Ram, HD, Cargado 

• Acciones:

▫ ampliar memoria

▫ cargar

▫ devolver la marca

 */
public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Portatil miPortatil=new Portatil("Toshiba",2.4,16,496.50,false);
		int memoriaAmpliada=10;
		miPortatil.ampliarMemoria(10);
		System.out.println(miPortatil.getRam());
		miPortatil.cargar();
		System.out.println(miPortatil.getCargado());
		System.out.println(miPortatil.devolverMarca());
		
	}

}
