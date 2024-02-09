import java.util.Scanner;

public class ejemplo4 {

    public static String ocultarContrasenya(String contr) {
        
        int tamañoContrasenya=(contr.length()-2);
        String caracteresOcultos="";

        if (contr.length() < 6) {
            return "La contraseña es demasiado corta. Debe contener al menos 6 caracteres.";
        }

        String primerasDosLetras = contr.substring(0, 2);

        int posicion = contr.indexOf("123");
        if (posicion != -1) {
            System.out.println("¡Cuidado! La contraseña contiene la secuencia '123' en la posición " + posicion +
            ", es recomendable que utilices otra contraseña");
        }

        for (int i = 0; i < tamañoContrasenya; i++) {
            caracteresOcultos = caracteresOcultos+"*";
        }

        String contrasenyaOculta = primerasDosLetras + caracteresOcultos;

        return contrasenyaOculta;
    }

    public static void main(String[] args) {
        Scanner Introducir = new Scanner(System.in);
        String contrasenya = "";
        System.out.println("Introduce la contraseña que quieras poner (que ocupe por lo menos 6 letras)");
        contrasenya = Introducir.nextLine();

        String contrasenyaOculta = ocultarContrasenya(contrasenya);

        System.out.println("Contraseña original: " + contrasenya);
        System.out.println("Contraseña oculta: " + contrasenyaOculta);
        }
    }