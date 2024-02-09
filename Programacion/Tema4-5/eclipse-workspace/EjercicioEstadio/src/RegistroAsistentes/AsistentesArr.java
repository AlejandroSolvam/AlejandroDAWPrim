package RegistroAsistentes;
import EstadioDeFutbol.Asistentes;
import java.util.ArrayList;
import EstadioDeFutbol.Asistentes;

public class AsistentesArr {
	private ArrayList <Asistentes> listaAsistentes;
	
	public AsistentesArr() {
		this.listaAsistentes=new ArrayList();
	}
	
	public void entraAsistente(Asistentes newAsistente) {
		if(listaAsistentes.size()>=15000) {
			System.out.println("Ya esta completo el estadio de asistentes.");
		}else{
			listaAsistentes.add(newAsistente);	
		}
	}
	
	public void saleAsistente(int newCodAs) {
		int i=0;
		if(listaAsistentes.isEmpty()) {
			System.out.println("No existen todavia asistentes.");		
		}else{
		for(Asistentes asistente:listaAsistentes) {
			if(asistente.getCodigoAsistente()==newCodAs) {
				if(asistente.getSonSocis()==true){
				listaAsistentes.remove(i);
				Asistentes.restarSoci();
				}else{
				listaAsistentes.remove(i);
				}
				break;
				}
			i++;
			}
		}
	}
	
	public void verAsistentes() {
		if(listaAsistentes.isEmpty()) {
			System.out.println("No existen todavia asistentes.");		
		}else{
		for(Asistentes asistente:listaAsistentes) {
			System.out.println(asistente.getNombre()+" "+asistente.getEdad()+" "+asistente.getSonSocis()+" "+asistente.getCodigoAsistente());
				}
			}
		}
	
	public void verAsistentesSocis() {
		if(listaAsistentes.isEmpty()) {
			System.out.println("No existen todavia asistentes.");		
		}else{
		for(Asistentes asistente:listaAsistentes) {
			if(asistente.getSonSocis()==true) {
			System.out.println(asistente.getNombre()+" "+asistente.getEdad()+" "+asistente.getSonSocis()+" "+asistente.getCodigoAsistente());
					}
				}
		System.out.println("Hay un total de "+Asistentes.devolverTotalSoci()+" socios asistentes en el estadio");
			}
		}
	
}
