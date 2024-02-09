public class Ejercicio14{
    public static void main(String [] args){
        byte a=5;
        byte b=8;
        byte guardarVariable;

        guardarVariable=a;
        a=b;
        b=guardarVariable;
        System.out.println("Ahora a que equivalía a 5 es " + a + " y b que equivalía a 8 es " + b);

    } 
}