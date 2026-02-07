/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contandonumeros;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class ContandoNumeros {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        int contadorWhile = 0;
        int contadorDoWhile = 0;
        
        final int LIMITE = 10;
        
        System.out.println("Estructura del While");
        while(contadorWhile < LIMITE){
            System.out.printf("Ciclo:%d\n",contadorWhile);
            contadorWhile++;
        }//Fin de While
        
        System.out.println("\nEstructura del Do While");
        do{
            
            System.out.printf("Ciclo: %d\n",contadorDoWhile);
            contadorDoWhile++;
        }while(contadorDoWhile<LIMITE);
        
        System.out.println("\nEstructura del For");
        
        
        for (int contadorFor = 0; contadorFor < LIMITE; contadorFor++) {
            System.out.printf("Ciclo: %d\n",contadorFor);
        }        
        /*
            While y Do While -> Contador (Finito) o Centinela ("Infinito")
            For -> Contador(Finito)
        */
        
        /*
            Variables segun su Alcance
            1. Locales
            2. Globales
            3. Funciones
        */
        
        
    }//Fin de Main
    
}//Fin de Class
