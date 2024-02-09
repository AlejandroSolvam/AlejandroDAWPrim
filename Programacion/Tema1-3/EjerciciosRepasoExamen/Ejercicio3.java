/* Exercici 3. Es demana un programa per a calcular el import a pagar al efectuar una compra: Si
adquirim més de 100 unitats d’un mateix article, ens fa un descompte de un 40%;
entre 25 i 100 un descompte de un 20%;
entre 10 i 24 un descompte de un 10%;
i no hi ha descompte per a una adquisició de menys de 10 unitats.
El programa demanarà la quantitat i el preu. El programa obtindrà el descompte i el total a pagar.  */

import java.util.Scanner;

public class Ejercicio3{
    public static void main(String [] args){
        double num=0;
        double precio=0;
        double descuento=0;
        double totalConDescuento=0;
        Scanner Introducir=new Scanner(System.in);
    System.out.println("Introduce cuántos artículos quieres adquirir:");
    num=Introducir.nextInt();

    System.out.println("Introduce cuánto quieres que cueste cada artículo:");
    precio=Introducir.nextInt();

    if(num>100){
        precio=num*precio;
        descuento=precio*0.40;
        totalConDescuento=precio-descuento;
        System.out.println("Las "+num+ " unidades te han costado "+totalConDescuento+" euros aplicandoles un 40% de descuento.");
    }else{
        if(num>=25 && num<=100){
        precio=num*precio;
        descuento=precio*0.20;
        totalConDescuento=precio-descuento;
        System.out.println("Las "+num+ " unidades te han costado "+totalConDescuento+" euros aplicandoles un 20% de descuento.");
        }else{
            if(num>=10 && num<=24){
        precio=num*precio;
        descuento=precio*0.10;
        totalConDescuento=precio-descuento;
        System.out.println("Las "+num+ " unidades te han costado "+totalConDescuento+" euros aplicandoles un 10% de descuento.");        
            }else{
            if(num>=0 && num<10){
        precio=num*precio;
        descuento=precio;
        System.out.println("Las "+num+ " unidades te han costado "+descuento+" sin descuento.");       
             }else{
        System.out.println("No has puesto un número correcto.");       
             }    
            }
        }
    }
    }
}