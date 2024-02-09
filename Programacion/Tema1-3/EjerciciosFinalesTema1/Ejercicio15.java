import java.lang.Math;
public class Ejercicio15 {
    public static void main(String[] args) {
        double radio = 5.2;
        double area;

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área de la circunferencia con un radio de " + radio + " centimetros es de: " + area + " cm²");
    }
}