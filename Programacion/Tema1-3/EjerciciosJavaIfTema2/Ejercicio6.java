/*6. Demana tres números i mostrar’ls ordenats de major a menor*/


import java.util.Scanner;
public class Ejercicio6{
    public static void main(String [] args){
        int PrimerNum;
        int SegundoNum;
        int TercerNum;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        PrimerNum=Lectura.nextInt();

        System.out.println("Introduce el segundo número:");
        SegundoNum=Lectura.nextInt();

        System.out.println("Introduce el tercer número:");
        TercerNum=Lectura.nextInt();
        if(PrimerNum>SegundoNum && PrimerNum>TercerNum){
            System.out.println(PrimerNum);
                if(SegundoNum>TercerNum){
                    System.out.println(SegundoNum);
                    System.out.println(TercerNum);
                }else{
                    System.out.println(TercerNum);
                    System.out.println(SegundoNum);
                }
        }else{
             if(SegundoNum>PrimerNum && SegundoNum>TercerNum){
            System.out.println(SegundoNum);
           if(PrimerNum>TercerNum){
                    System.out.println(PrimerNum);
                    System.out.println(TercerNum);
                }else{
                    System.out.println(TercerNum);
                    System.out.println(PrimerNum);
                }
            }else{
                if(TercerNum>PrimerNum && TercerNum>SegundoNum){
                    System.out.println(TercerNum);
                }
                if(PrimerNum>SegundoNum){
                    System.out.println(PrimerNum);
                    System.out.println(SegundoNum);
                }else{
                    System.out.println(SegundoNum);
                    System.out.println(PrimerNum);
                }
            }
        }
    }
}