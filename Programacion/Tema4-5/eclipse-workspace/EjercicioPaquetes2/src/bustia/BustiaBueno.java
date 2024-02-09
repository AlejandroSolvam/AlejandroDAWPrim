package bustia;
import bustia.correu.Correu;
import java.util.ArrayList;

	public class BustiaBueno {
		private ArrayList <Correu> bustiaCorreos;
		private static int cont=0;
		
	   public BustiaBueno() {
		   bustiaCorreos=new ArrayList();
	   }
	   
	   public int numeroDeCorreus() {
		   return bustiaCorreos.size();
	   }
	   
	   public void afegir(Correu c) {
		   bustiaCorreos.add(c);
	   }
	   
	   public boolean porLeer() {
		   for(int i=0; i<bustiaCorreos.size(); i++) {
			   Correu variableCorreo=bustiaCorreos.get(i);
			   if(!variableCorreo.isLeido()) {
				   return true;
			   }
		   }
		   return false;
	   }
	   
	   public String muestraPrimerNoLeido(){
		   for(int i=0; i<bustiaCorreos.size(); i++) {
			   Correu variableCorreo=bustiaCorreos.get(i);
			   if(!variableCorreo.isLeido()) {
				   variableCorreo.setLeido(true);
				   return variableCorreo.getTexto();
			   }
		   }
		   return "Todo leido";
	   }
	   
	   public String muestra(int k) {
		if(bustiaCorreos.isEmpty() || k>bustiaCorreos.size()) {
			   return "No existe el correo "+k;   
		   }else{
			   Correu variableCorreo=bustiaCorreos.get(k-1);
			   variableCorreo.setLeido(true);
			   return variableCorreo.getTexto();
		   }
	   }
	   
	   public void elimina(int k) {
		   if(bustiaCorreos.isEmpty() || k>bustiaCorreos.size()) {
			   System.out.println("No existe el correo "+k+" que quieres eliminar");   
		   }else{
			   bustiaCorreos.remove(k-1);
		   }
	   }
	   
	   public void muestraNoLeido() {
		   while(porLeer()) {
			   System.out.println(this.muestraPrimerNoLeido());
		   }
	   }
	}
