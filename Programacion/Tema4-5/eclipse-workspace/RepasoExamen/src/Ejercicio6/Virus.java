package Ejercicio6;
/* EXERCICI AMB VARIABLES STATIC
EXERCICI 1
Crea una classe Virus (amb atributs, constructors, gets/sets, ...) utilitzada en la classe més a
baix indicada (Viruslab), en la classe Viruslab es creen virus, es mostra el nombre assignat a
cada virus i mostra la quantitat de virus existents (no utilitzes un mètode que sume els virus,
recorre a una altra tècnica pel fet que no seria òptim si existiren molts virus).
Ajuda't del codi indicat:
class Virus {
…
 }
public class VirusLab{
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
System.out.println("¿Cuantos virus quieres?");
int numViruses = leer.nextInt();
if (numViruses > 0) {
Virus[] virii = new Virus[numViruses];
for (int i = 0; i < numViruses; i++) {
virii[i] = new Virus(i);
}
for (int i = 0; i < numViruses; i++) {
 System.out.println(“Virus num: ” + virii[i].NumeroVirus();
}
System.out.println(“Hay” + Virus.getVirusCount() + “viruses.”);
}
}
} */
public class Virus {
	private int numeroVirus;
	private static int contarVirus=0;
	
	Virus(){
		this.numeroVirus=0;
		contarVirus++;
	}
	
	Virus(int numVirus){
		this.numeroVirus=numVirus;
		contarVirus++;
	}
	
	public int getNumVirus(){
		return this.numeroVirus;
	}
	
	public void setNumVirus(int newV){
		this.numeroVirus=newV;
	} 
	
	public static int getVirusCount() {
		return contarVirus;
	}
}
