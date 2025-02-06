/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiemposproceso;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class TiemposProceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int tiempoH = 0;
        int tiempoM = 0;
        int tiempoS = 0;
        int totalSegundos = 0;
        double costoProceso = 0.0;
        
        System.out.println("Ingrese los tiempos que le indiquen");
        System.out.println("No use decimales, porque sino...sale malo!!!");
        System.out.println("");
        
        System.out.print("Hora: ");
        tiempoH = scan.nextInt();
        
        System.out.print("Minutos: ");
        tiempoM = scan.nextInt();
        
        System.out.print("Segundos: ");
        tiempoS = scan.nextInt();
        totalSegundos = (tiempoH * 3600) + (tiempoM *60) + tiempoS;
        
        costoProceso = totalSegundos * 0.2345;
        
        System.out.printf("Total Segundos son: %d",totalSegundos);
        System.out.printf("\nCosto del Proceso es: L.%.2f",costoProceso);
        if(totalSegundos>= 3750){
            System.out.println("\nTiene que mejorar el proceso");
        }
    }//Fin de Main
    
}//Fin de Class
