package Ejercicio6;

import java.util.Scanner;

public class EjecutableVirus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner leer = new Scanner(System.in);
			System.out.println("¿Cuantos virus quieres?");
			int numViruses = leer.nextInt();
			if (numViruses > 0) {
			Virus[] virii = new Virus[numViruses];
			for (int i = 0; i < numViruses; i++) {
			virii[i] = new Virus(i);
			}
			for (int i = 0; i < numViruses; i++) {
			 System.out.println("Virus num: " + virii[i].getNumVirus());
			}
			System.out.println("Hay" + Virus.getVirusCount() + "viruses.");
			}
			}
		
	}

