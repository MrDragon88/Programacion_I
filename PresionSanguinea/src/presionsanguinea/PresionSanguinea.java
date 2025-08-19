/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package presionsanguinea;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class PresionSanguinea {

    /**
     * Sistolica (cuando corazón se contrae para bombear)
     *      Promedio -: 100 - 120 mmHG
     * Diastolica (cuando corazon se expande/abre para llenar cavidades)
     *      Promedio -: 80 - 100 mmHG
     * 
     * Determinar si una persona a nivel muy general, está saludable o no
     */
    public static void main(String[] args) {
        /*
            Do - While
            1. Ejecuta y luego evalua
            2. Se realiza al menos una vez, sin importar la condicion
        */
        
        Scanner captura = new Scanner(System.in);
        int preSistolica = 0;
        int preDiastolica = 0;
        int edad = 0;
        char genero ='m';
        String respuesta = "si";
        
        final int SIS_INF_H1 = 105;
        final int SIS_SUP_H1 = 139;
        final int DIA_INF_H1 = 62;
        final int DIA_SUP_H1 = 88;
        
        final int SIS_INF_H2 = 108;
        final int SIS_SUP_H2 = 139;
        final int DIA_INF_H2 = 65;
        final int DIA_SUP_H2 = 89;
        
        final int SIS_INF_H3 = 110;
        final int SIS_SUP_H3 = 145;
        final int DIA_INF_H3 = 68;
        final int DIA_SUP_H3 = 92;
        
        final int SIS_INF_M1 = 100;
        final int SIS_SUP_M1 = 130;
        final int DIA_INF_M1 = 60;
        final int DIA_SUP_M1 = 85;
        
        final int SIS_INF_M2 = 102;
        final int SIS_SUP_M2 = 135;
        final int DIA_INF_M2 = 60;
        final int DIA_SUP_M2 = 86;
        
        final int SIS_INF_M3 = 105;
        final int SIS_SUP_M3 = 139;
        final int DIA_INF_M3 = 65;
        final int DIA_SUP_M3 = 89;
        
        do{
            System.out.println("Presion Arterial");
            System.out.println("Parametros");
            
            System.out.print("Dime tu edad: ");
            edad = captura.nextInt();
            
            System.out.print("Genero (H/M): ");
            genero = captura.next().toLowerCase().charAt(0);
            
            System.out.print("Sistolica: ");
            preSistolica = captura.nextInt();
            System.out.print("Diastolica: ");
            
            preDiastolica = captura.nextInt();
            captura.nextLine();//Limpieza de buffer
            System.out.println("");
            
            switch (genero) {
                case 'h':
                    if (edad >= 19 && edad <= 24) {

                        if (preSistolica >= SIS_INF_H1 && preSistolica <= SIS_SUP_H1) {
                            //Presion Sistolica dentro de parametros
                            if (preDiastolica >= DIA_INF_H1 && preDiastolica <= DIA_SUP_H1) {
                                System.out.println("Presion Arterial Normal");
                            }//Fin IF diastolico
                            else {
                                System.out.println("Hipotenso");
                            }//fin else diastolico
                        }//Fin IF Sistolico
                        else {
                            System.out.println(" Presion Alta- Hipertenso");
                        }//Fin ELSE Sistolico

                    } else if (edad > 24 && edad <= 29) {
                        if (preSistolica >= SIS_INF_H2 && preSistolica <= SIS_SUP_H2) {
                            //Presion Sistolica dentro de parametros
                            if (preDiastolica >= DIA_INF_H2 && preDiastolica <= DIA_SUP_H2) {
                                System.out.println("Presion Arterial Normal");
                            }//Fin IF diastolico
                            else {
                                System.out.println("Hipotenso");
                            }//fin else diastolico
                        }//Fin IF Sistolico
                        else {
                            System.out.println(" Presion Alta- Hipertenso");
                        }//Fin ELSE Sistolico

                    } else if (edad > 29 && edad <= 39) {
                        if (preSistolica >= SIS_INF_H3 && preSistolica <= SIS_SUP_H3) {
                            //Presion Sistolica dentro de parametros
                            if (preDiastolica >= DIA_INF_H3 && preDiastolica <= DIA_SUP_H3) {
                                System.out.println("Presion Arterial Normal");
                            }//Fin IF diastolico
                            else {
                                System.out.println("Hipotenso");
                            }//fin else diastolico
                        }//Fin IF Sistolico
                        else {
                            System.out.println(" Presion Alta- Hipertenso");
                        }//Fin ELSE Sistolico
                    } else {
                        System.out.println("Fuera de Rango");
                    }
                    
                    
                    break;
                    
                case 'm':
                    
                    if(edad>=19 && edad<=24){
                        
                        if (preSistolica >= SIS_INF_M1 && preSistolica <= SIS_SUP_M1) {
                            //Presion Sistolica dentro de parametros
                            if (preDiastolica >= DIA_INF_M1 && preDiastolica <= DIA_SUP_M1) {
                                System.out.println("Presion Arterial Normal");
                            }//Fin IF diastolico
                            else {
                                System.out.println("Hipotenso");
                            }//fin else diastolico
                        }//Fin IF Sistolico
                        else {
                            System.out.println(" Presion Alta- Hipertenso");
                        }//Fin ELSE Sistolico
                        
                    }else if(edad>24 && edad<=29){
                        if (preSistolica >= SIS_INF_M2 && preSistolica <= SIS_SUP_M2) {
                            //Presion Sistolica dentro de parametros
                            if (preDiastolica >= DIA_INF_M2 && preDiastolica <= DIA_SUP_M2) {
                                System.out.println("Presion Arterial Normal");
                            }//Fin IF diastolico
                            else {
                                System.out.println("Hipotenso");
                            }//fin else diastolico
                        }//Fin IF Sistolico
                        else {
                            System.out.println(" Presion Alta- Hipertenso");
                        }//Fin ELSE Sistolico
                        
                    }else if(edad>29 && edad<=39){
                        if (preSistolica >= SIS_INF_M3 && preSistolica <= SIS_SUP_M3) {
                            //Presion Sistolica dentro de parametros
                            if (preDiastolica >= DIA_INF_M3 && preDiastolica <= DIA_SUP_M3) {
                                System.out.println("Presion Arterial Normal");
                            }//Fin IF diastolico
                            else {
                                System.out.println("Hipotenso");
                            }//fin else diastolico
                        }//Fin IF Sistolico
                        else {
                            System.out.println(" Presion Alta- Hipertenso");
                        }//Fin ELSE Sistolico
                    }else{
                        System.out.println("Fuera de Rango");
                    }
                    break;
                    
                default:
                    System.out.println("Error de Seleccion");
                    break;
            }//Fin Switch
            
            
            
           
            
            System.out.println("Desea continuar, si o no?");
            System.out.print("Respuesta: ");
            respuesta = captura.nextLine();
        }while(respuesta.equalsIgnoreCase("si"));
        
    }//Fin de Main
    
}//Fin de Class
