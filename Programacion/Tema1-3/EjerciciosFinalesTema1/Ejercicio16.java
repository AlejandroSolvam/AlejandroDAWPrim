public class Ejercicio16 {
    public static void main(String[] args) {
        
        int numAleatorio = (int) (Math.random() * 26);

        char letraAleatoria = (char) ('A' + numAleatorio);

        System.out.println("Letra aleatoria generada: " + letraAleatoria);
    }
}