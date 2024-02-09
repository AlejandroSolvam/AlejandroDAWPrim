/* 10. Demana el dia, mes i any d’una data i indicar si la data és correcta. Suposem que tots els mesos
tenen 30 dies. */

import java.util.Scanner;
public class Ejercicio11{
    public static void main(String [] args){
        int NumDia, NumMes, NumAño;
        int primeraVariableP=4;
        int segundaVariableQ=100;
        int terceraVariableR=400;
        int confirmaciónAñoBis;
        
        int enero=1, febrero=2, marzo=3, abril=4, mayo=5, junio=6, julio=7, agosto=8, septiembre=9, octubre=10, noviembre=11, diciembre=12;
        Scanner Lectura= new Scanner(System.in);
        System.out.println("Introduce el día:");
        NumDia=Lectura.nextInt();
        System.out.println("Introduce el mes:");
        NumMes=Lectura.nextInt();
        System.out.println("Introduce el año:");
        NumAño=Lectura.nextInt();


         if(((NumAño%primeraVariableP==0) && (NumAño%segundaVariableQ!=0))
        || ((NumAño%terceraVariableR==0) && (NumAño%primeraVariableP==0) && (NumAño%segundaVariableQ==0))){

            confirmaciónAñoBis=1;
            }else{
                    confirmaciónAñoBis=0;
         }
        
        System.out.println(confirmaciónAñoBis);

        if(NumMes==enero){
            if(NumDia==31 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
              else if(NumDia==31){  
                    System.out.println("La fecha es verdadera");
            }else{
                System.out.println("La fecha es falsa");
                }
        }else{
            if(NumMes==febrero){
                if(NumDia==29 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
               else if(NumDia==28){  
                    System.out.println("La fecha es verdadera");
            }else{
                System.out.println("La fecha es falsa");
                }
        }else{
            if(NumMes==marzo){
                if(NumDia==31 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
               else if(NumDia==31){  
                    System.out.println("La fecha es verdadera");
            }else{
                System.out.println("La fecha es falsa");
                }
        }else{
            if(NumMes==abril){
                if(NumDia==30 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
               else if(NumDia==30){  
                    System.out.println("La fecha es verdadera");
          }else{
                System.out.println("La fecha es falsa");
                }
        }else{
            if(NumMes==mayo){
                if(NumDia==31 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
              else if(NumDia==31){  
                    System.out.println("La fecha es verdadera");
            }else{
                System.out.println("La fecha es falsa");
                }
        }else{
            if(NumMes==junio){
                if(NumDia==30 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
               else if(NumDia==30){  
                    System.out.println("La fecha es verdadera");
            }else{
                System.out.println("La fecha es falsa");
                }
        }else{
            if(NumMes==julio){
                if(NumDia==31 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
               else if(NumDia==31){  
                    System.out.println("La fecha es verdadera");
            }else{
                System.out.println("La fecha es falsa");
                }
        }else{
            if(NumMes==agosto){
                if(NumDia==31 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
               else if(NumDia==31){  
                    System.out.println("La fecha es verdadera");
            }else{
                System.out.println("La fecha es falsa");
                }
        }else{
            if(NumMes==septiembre){
                if(NumDia==30 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
               else if(NumDia==30){  
                    System.out.println("La fecha es verdadera");
            }else{
                System.out.println("La fecha es falsa");
                }
        }else{
            if(NumMes==octubre){
                if(NumDia==31 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
               else if(NumDia==31){  
                    System.out.println("La fecha es verdadera");
            }else{
                System.out.println("La fecha es falsa");
                }
        }else{
            if(NumMes==noviembre){
                if(NumDia==30 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
               else if(NumDia==30){  
                    System.out.println("La fecha es verdadera");
            }else{
                System.out.println("La fecha es falsa");
                }
        }else{
            if(NumMes==diciembre){
                if(NumDia==31 && confirmaciónAñoBis==1){  
                    System.out.println("La fecha es verdadera, además es año bisiesto");
            }
               else if(NumDia==31){  
                    System.out.println("La fecha es verdadera");
            }else{
                System.out.println("La fecha es falsa");
                }
        }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}