/* 5. Es demana un programa per a calcular l'import a pagar, si en efectuar una compra.
Si adquirim més de 100 unitats d'un mateix article, ens fan un descompte d'un 40%;
entre 25 i 100 un 20%;
entre 10 i 24 un 10%;
i no hi ha descompte per a una adquisició de menys de 10 unitats.
Se'ns donen com a dades d'entrada: quantitat comprada=99 i preu unitari 3,5.
Obtingues el descompte i el total.
Haurà d'aparéixer un mètode mitjançant el qual s'obtinga el descompte, perquè des del
programa principal es faça referència al descompte i s'utilitze per a obtindre el total i
l'import a pagar. */

import java.util.Scanner;

public class Ejercicio7{

    public static double descuento(int unidad){
        double descontar=0;
        if(unidad>100){
            descontar=40;
            return descontar;
        }else{
        if(unidad>=25 && unidad<=100){
            descontar=20;
            return descontar;
        }else{
        if(unidad>=10 && unidad<=24){
            descontar=10;
            return descontar;    
        }else{
            descontar=0;
            return descontar;
        }
      }
    }
  }
    public static void main(String [] args){
        int unidad=0;
        double precio=0;
        double descontar=0;
        double resultadoSinDescuento=0;
        double resultado=0;
        double unidadRecon=0;

        Scanner Introducir=new Scanner(System.in);
        System.out.println("Introduce la cantidad de unidades que quieres:");
        unidad=Introducir.nextInt();
        System.out.println("Introduce el precio que quieres darle a cada unidad:");
        precio=Introducir.nextDouble();

        descontar=descuento(unidad);

        unidadRecon=(double)unidad;
        resultadoSinDescuento=unidadRecon*precio;
        resultado=(resultadoSinDescuento-(resultadoSinDescuento*descontar)/100);

        if(descontar==0.0){
            resultado=unidadRecon*precio;
            resultadoSinDescuento=unidadRecon*precio;
        }
        
        System.out.println("El resultado sin descuento es de:"+resultadoSinDescuento);
        System.out.println("Ahora se va a aplicar un :"+descontar+" % de descuento");
        System.out.println("El resultado con descuento es de:"+resultado);
            }
        
}