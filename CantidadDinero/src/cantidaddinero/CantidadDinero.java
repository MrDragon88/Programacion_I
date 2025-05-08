/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cantidaddinero;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class CantidadDinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Escriba un algoritmo que permita determinar cuánto dinero se 
            tiene en total al ingresar la cantidad de lempiras que se tiene
            en sus diferentes denominaciones. (1 lempira, 2 lempiras, 5 lempiras, 
            10 lempiras, 20 lempiras, 50 lempiras, 100 lempiras, 200 lempiras 
            y 500 lempiras).
        */
        Scanner scan = new Scanner(System.in);
        int totalDinero = 0;
        int cantidadLemp_1 = 0;
        int cantidadLemp_2 = 0;
        int cantidadLemp_5 = 0;
        int cantidadLemp_10 = 0;
        int cantidadLemp_20 = 0;
        int cantidadLemp_50 = 0;
        int cantidadLemp_100 = 0;
        int cantidadLemp_200 = 0;
        int cantidadLemp_500 = 0;
        
        System.out.print("Cuantos billetes de L. 1 tienes?");
        cantidadLemp_1 = scan.nextInt();
        
        System.out.print("Cuantos billetes de L. 2 tienes?");
        cantidadLemp_2 = scan.nextInt();
        
        System.out.print("Cuantos billetes de L. 5 tienes?");
        cantidadLemp_5 = scan.nextInt();
        
        System.out.print("Cuantos billetes de L. 10 tienes?");
        cantidadLemp_10 = scan.nextInt();
        
        System.out.print("Cuantos billetes de L. 20 tienes?");
        cantidadLemp_20 = scan.nextInt();
        
        System.out.print("Cuantos billetes de L. 50 tienes?");
        cantidadLemp_50 = scan.nextInt();
        
        System.out.print("Cuantos billetes de L. 100 tienes?");
        cantidadLemp_100 = scan.nextInt();
        
        System.out.print("Cuantos billetes de L. 200 tienes?");
        cantidadLemp_200 = scan.nextInt();
        
        System.out.print("Cuantos billetes de L. 500 tienes?");
        cantidadLemp_500 = scan.nextInt();
        
        totalDinero =   (cantidadLemp_1 * 1 ) +
                        (cantidadLemp_2 * 2 ) +
                        (cantidadLemp_5 * 5 ) +
                        (cantidadLemp_10 * 10 ) +
                        (cantidadLemp_20 * 20 ) +
                        (cantidadLemp_50 * 50 ) +
                        (cantidadLemp_100 * 100 ) +
                        (cantidadLemp_200 * 200 ) +
                        (cantidadLemp_500 * 500 );
        
        System.out.printf("Total Dinero: %d",totalDinero);
        
    }//Fin de Main
    
}//Fin de Class
