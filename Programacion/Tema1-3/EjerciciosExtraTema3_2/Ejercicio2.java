/* 2.Crea un programa de inicio de sesión.
Crea un menu principal, la opción uno es iniciar sesión, y la dos, registrar un nuevo usuario.
Utiliza un método para cada opción.
El registro de nuevo usuario tiene que tener una restriccion, que tienen que ser el usuario y la
contraseña mayor de 5 caracteres y guardaremos la información en un array.
Para el inicio de sesión el usuario y contraseña deberán estar almacenados en el array. Si hace 3
veces el login mal, cierra el programa. Utiliza un método para cada opción del menú. */

import java.util.Scanner;
import java.lang.String;

public class Ejercicio2{

    public static String iniciarSesion(String[] user, String[] pass) {
        Scanner Introduce=new Scanner(System.in);
        String usuario="";
        String contraseña="";
        boolean restar=false;
        int intentos=3;
        String finalizarProg="No";

        while(intentos>0){
        System.out.println("Introduce el nombre del usuario:");
            usuario=Introduce.nextLine();
            System.out.println("Introduce la contraseña del usuario:");
            contraseña=Introduce.nextLine();
        
        for(int i=0;i<user.length;i++){

            if(user[i] != null && pass[i] != null && user[i].equals(usuario) && pass[i].equals(contraseña)){
                System.out.println("Ha iniciado usted sesión!!:");
                finalizarProg="No";
                restar=true;
                return finalizarProg;
                }
            }
            if(restar==false){
                intentos=intentos-1;
                System.out.println("Ha fallado, le quedan:"+intentos+" intentos");
            }
                if(intentos==0){
                    System.out.println("Ya no le quedan intentos, mala suerte :(");
                    finalizarProg="Si";
                    return finalizarProg;

        }
    }
       finalizarProg="No";
       return finalizarProg; 
}

    public static void crearCuenta(String[] user, String[] pass, int cantidad) {
        Scanner Introduce=new Scanner(System.in);
        String usuario="";
        String contraseña="";
        int cuentasCreadas=0;
        
        for(int j=0;j<cantidad;j++){
            if(user[j]!=null){
              cuentasCreadas=cuentasCreadas+1;  
            }
        }
        
        for(int i=0;i<user.length;i++){

            System.out.println("Introduce el nombre del nuevo usuario:");
            usuario=Introduce.nextLine();
            System.out.println("Introduce la contraseña del nuevo usuario:");
            contraseña=Introduce.nextLine();

            if(usuario.length()<=5 || contraseña.length()<=5){
                System.out.println("Necesita introducir tanto un usuario como una contraseña de más de 5 carácteres:");
            }else{
                if(usuario.length()>5 && contraseña.length()>5){
                    if(cuentasCreadas==cantidad){
                        System.out.println("Ya no puede crear más cuentas, esta en su límite:");    
                         return;    
                    }else{
                    user[cuentasCreadas]=usuario;
                    pass[cuentasCreadas]=contraseña;
                System.out.println("Se ha creado el usuario con éxito:");
                return;
                    }
                }
            }
        }
    } 



    public static void main(String[]args){
        int cantidadCuentas=0;
        Scanner Introducir=new Scanner(System.in);
        System.out.println("Introduce cuantas cuentas vas a querer crear:");
        cantidadCuentas=Introducir.nextInt();
        String [] usuario=new String[cantidadCuentas];
        String [] contraseña=new String[cantidadCuentas];
        int seguir=1;
        int opcion=0;
        String continuarPrograma="Si";


        while(seguir!=0){
        System.out.println("Introduce la opción que quieres escoger:");
        System.out.println("0. Terminar programa:");
        System.out.println("1. Iniciar sesión:");
        System.out.println("2. Registrar un nuevo usuario:");
        opcion=Introducir.nextInt();
        switch(opcion){
            case 0:
                seguir=0;
                break;
            case 1:
                continuarPrograma=iniciarSesion(usuario,contraseña);
                if(continuarPrograma==("Si")){
                    seguir=0;
                }else{
                    seguir=1;
                }
                break;
            case 2:
                crearCuenta(usuario,contraseña,cantidadCuentas);
                break;
        }
        
        
        }
    }
} 