package paqueteConjuntoDeFiguras;

import paqueteFigura.Figura;
import paqueteCirculo.Circulo;
import paqueteRectangulo.Rectangulo;

public class ConjuntoDeFiguras {
	private Figura[] figurasRegistradas;
	private int numeroFiguras;
	
	public ConjuntoDeFiguras() {
		this.figurasRegistradas=new Figura[10];
		this.numeroFiguras=0;
	}
	
	public ConjuntoDeFiguras(int tamañoArray) {
		this.figurasRegistradas=new Figura[tamañoArray];
		this.numeroFiguras=0;
	}
	
	public void añade(Figura nuevaFigura) {
		if(numeroFiguras==figurasRegistradas.length+1) {
			System.out.println("El array esta completo");
		}else{
			figurasRegistradas[numeroFiguras++]=nuevaFigura;
			System.out.println("Figura introducida con exito");
		}
	}
	
	public double areaTotal(){
		double areaTotal=0;
		for(Figura nuevaFigura:figurasRegistradas) {
			if(nuevaFigura instanceof Circulo) {
				areaTotal=areaTotal+nuevaFigura.Perimetro();
			}
			else if(nuevaFigura instanceof Rectangulo) {
				areaTotal=areaTotal+nuevaFigura.Perimetro();
			}
		}
		return areaTotal;
	}
	
	public void imprimeTodo() {
		for(Figura nuevaFigura:figurasRegistradas) {
			if(nuevaFigura instanceof Circulo) {
				Circulo nuevoCirculo=(Circulo)nuevaFigura;
				System.out.println(nuevoCirculo.DimeColor()+"\n"+nuevoCirculo.DimeRadio()+"\n"+nuevoCirculo.Perimetro()); 
			}
			if(nuevaFigura instanceof Rectangulo) {
				Rectangulo nuevoRectangulo=(Rectangulo)nuevaFigura;
				double[] ladosRectangulo=nuevoRectangulo.DimeLados();
				System.out.println(nuevoRectangulo.DimeColor()+"\n"+"Base:"+ladosRectangulo[0]+"\n"+"Altura:"+ladosRectangulo[1]+"\n"+nuevoRectangulo.Perimetro());				
			}
		}
	}
	
}
