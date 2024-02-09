/* 5. Es vol saber si: “Es deu fer la declaració de la renda”
Per a fer la declaració de la renda es deu tenir al menys 18 anys i menys de 66, o bé si, tenim al menys 66 anys, els
ingressos anuals son més de 20000 €.
Reompli el codi Java corresponent. */
public class Ejercicio5{
private static int edad = 67;
private static int ingresoAnual = 30000;
public static void main(String[] args) {
        if ((edad>=18 && edad<66)) {
            System.out.println("Tienes que hacer la declaración de la renta, ya que eres mayor de 18 años o menor de 66 años.");
        } else if (edad>=66 && ingresoAnual>20000) {
            System.out.println("Tienes que hacer la declaración de la renta, ya que tienes unos ingresos anuales mayores a 20.000");
        }else {
            System.out.println("El ciudadano no cumple ninguna de las condiciones, por lo tanto, no tiene que hacer la declaración de la renta");
        }
        for(int i=10; i>5; i=i+2){
System.out.println("Hola");
}
    }
}