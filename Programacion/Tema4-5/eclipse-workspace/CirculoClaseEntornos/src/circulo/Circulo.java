package circulo;

public class Circulo {
	protected double radius;
	private String color;
	
	public Circulo() {
		this.radius=1.0;
		this.color="red";
	}
	
	public Circulo(double rad) {
		this.radius=rad;
		this.color="red";
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return 3.14*(this.radius*2);
	}
	
	public String toString(){
		String radioString = String.valueOf(radius);
		return radioString;
	}
}
