/* 3. Escriu un programa que mostra el signe zodiacal d'una persona. Per a això l'usuari
ha d'introduir únicament el dia i el mes de naixement i el programa
determinarà immediatament el signe zodiacal de la persona. */

import java.util.Scanner;
public class Ejercicio3{
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

        if((NumMes==3 && NumDia>=21 && NumDia<=31)){
                System.out.println("Tu signo del zodiaco es Aries");
            }
              if(NumMes==4 && NumDia>=1 && NumDia<=19){  
                 System.out.println("Tu signo del zodiaco es Aries");
                 
            }else{
            if(NumMes==4 && NumDia>=20 && NumDia<=30){
                System.out.println("Tu signo del zodiaco es Tauro");
            }
               if(NumMes==5 && NumDia>=1 && NumDia<=20){  
                    System.out.println("Tu signo del zodiaco es Tauro");
            }else{
            if(NumMes==5 && NumDia>=21 && NumDia<=31){  
                System.out.println("Tu signo del zodiaco es Géminis");
            }
               if(NumMes==6 && NumDia>=1 && NumDia<=20){  
                    System.out.println("Tu signo del zodiaco es Géminis");
               }else{
            if(NumMes==6 && NumDia>=21 && NumDia<=30){
               System.out.println("Tu signo del zodiaco es Cáncer");
               }
               if(NumMes==7 && NumDia>=1 && NumDia<=22){  
                    System.out.println("Tu signo del zodiaco es Cáncer");
            }else{
            if(NumMes==7 && NumDia>=23 && NumDia<=31){
              System.out.println("Tu signo del zodiaco es Leo");
              }
              if(NumMes==8 && NumDia>=1 && NumDia<=22){  
                    System.out.println("Tu signo del zodiaco es Leo");
            }else{
            if(NumMes==8 && NumDia>=23 && NumDia<=31){
              System.out.println("Tu signo del zodiaco es Virgo");
              }
              if(NumMes==9 && NumDia>=1 && NumDia<=22){  
                    System.out.println("Tu signo del zodiaco es Virgo");
        }else{
            if(NumMes==9 && NumDia>=23 && NumDia<=30){
              System.out.println("Tu signo del zodiaco es Libra");
              }
              if(NumMes==10 && NumDia>=1 && NumDia<=22){  
                    System.out.println("Tu signo del zodiaco es Libra");
        }else{
            if(NumMes==10 && NumDia>=23 && NumDia<=31){
              System.out.println("Tu signo del zodiaco es Escorpio");
              }
              if(NumMes==11 && NumDia>=1 && NumDia<=21){  
                    System.out.println("Tu signo del zodiaco es Escorpio");
        }else{
            if(NumMes==11 && NumDia>=22 && NumDia<=30){
              System.out.println("Tu signo del zodiaco es Sagitario");
              }
              if(NumMes==12 && NumDia>=1 && NumDia<=21){  
                    System.out.println("Tu signo del zodiaco es Sagitario");
        }else{
            if(NumMes==12 && NumDia>=22 && NumDia<=31){
              System.out.println("Tu signo del zodiaco es Capricornio");
              }
              if(NumMes==1 && NumDia>=1 && NumDia<=19){  
                    System.out.println("Tu signo del zodiaco es Capricornio");
        }else{
            if(NumMes==1 && NumDia>=20 && NumDia<=31){
              System.out.println("Tu signo del zodiaco es Acuario");
              }
              if(NumMes==2 && NumDia>=1 && NumDia<=18){  
                    System.out.println("Tu signo del zodiaco es Acuario");
        }else{
            if(NumMes==2 && NumDia>=19 && NumDia<=28){
              System.out.println("Tu signo del zodiaco es Piscis");
              }
              if(NumMes==3 && NumDia>=1 && NumDia<=20){  
                    System.out.println("Tu signo del zodiaco es Piscis");
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
                    
                
            
        
    
