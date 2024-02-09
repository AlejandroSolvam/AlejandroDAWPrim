/*8. Demana un número entre 0 i 9.999 i mostrar’l amb les xifres a l’inrevés.*/

import java.util.Scanner;
public class Ejercicio8{
    public static void main(String [] args){
        int PrimerNum;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        PrimerNum=Lectura.nextInt();
        int NumContrario=PrimerNum;
        int variableOp;
        if(PrimerNum>=1000){
            variableOp=PrimerNum%10;
            System.out.println(variableOp);
            NumContrario=PrimerNum;
            NumContrario=NumContrario/10;
        }
        if((NumContrario>=100 && NumContrario<999)){
            variableOp=NumContrario%10;
            System.out.println(variableOp);
            NumContrario=PrimerNum;
            NumContrario=NumContrario/10;
            if(NumContrario>=100 && NumContrario<999){
                NumContrario=NumContrario/10;    
            }

            }
        
        if(NumContrario>=10 && NumContrario<100){
            variableOp=NumContrario%10;
            System.out.println(variableOp);
            NumContrario=NumContrario/10;
            }
                    System.out.println(NumContrario);
        }
    
       
}
