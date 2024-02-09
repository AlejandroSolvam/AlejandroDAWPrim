
import java.util.Scanner;

public class ejemplo3{

    public static String respuestaSaludo(String resp) {
        Scanner Introduce=new Scanner(System.in);
        System.out.println("Introduce una respuesta al saludo:");
        resp=Introduce.nextLine();
        System.out.println("");
        return resp;
    }

    public static void main(String[] args) {
        String saludo="";
        String respuesta="";

        Scanner Introducir=new Scanner(System.in);
        System.out.println("Introduce un saludo:");
        saludo=Introducir.nextLine();
        System.out.println("");
        System.out.println("El saludo introducido es:"+saludo);

        respuesta=respuestaSaludo(respuesta);
        System.out.println("La respuesta introducida es:"+respuesta);
    }
}