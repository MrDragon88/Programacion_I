/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoi;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class RepasoI {

    /**
     * @param args the command line arguments
     * 
     *  Desarrollar un programa que presente un menú 
     *  
     *  conversión entre kilómetros y millas
     *  Conversion entre libras y kilogramos. 
     * 
     *  El usuario puede seleccionar el tipo de conversión 
     * 
     *  Realizar varias conversiones hasta que decida salir.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double dato = 0;
        double km_millas = 0;
        double millas_km = 0;
        double lbs_kg = 0;
        double kg_lbs = 0;
        char seleccion ='@';
        boolean estadoPrograma = true;
        

        do{
            System.out.println("");
            System.out.println("\nMenu de Conversiones");
            System.out.println("A. Kilometros a Millas");
            System.out.println("B. Millas a Kilometros");
            System.out.println("C. Libras a Kilogramos");
            System.out.println("D. Kilogramos a Libras");
            System.out.println("E. Salir del Programa");
            System.out.print("Decida presionando la letra: ");
            seleccion = scan.next().toUpperCase().charAt(0);
        
            switch (seleccion) {
                case 'A':
                       //km - Millas
                    System.out.print("Ingrese los datos de km a convertir en millas: ");
                    dato = scan.nextDouble();
                    km_millas = dato * 0.625;
                    System.out.printf("Resultado: %.2f",km_millas);
                    break;

                case 'B':
                    //Millas - km
                   System.out.print("Ingrese los datos de millas a convertir en km: ");
                   dato = scan.nextDouble();
                   millas_km = dato * 1.6; 
                   System.out.printf("Resultado: %.2f",millas_km);
                    break;
                case 'C':
                    //Lbs - Kg
                    System.out.print("Ingrese los datos de lbs a convertir en kg: ");
                    dato = scan.nextDouble();
                    lbs_kg = dato *0.4545;
                    System.out.printf("Resultado: %.2f",lbs_kg);
                    break;
                case 'D':
                        //Kg - Lbs
                    System.out.print("Ingrese los datos de kg a convertir en lbs: ");
                    dato = scan.nextDouble();
                    kg_lbs = dato * 2.2;
                    System.out.printf("Resultado: %.2f",kg_lbs);
                    break;
                
                case 'E':
                    estadoPrograma = false;
                    break;

                default:
                    System.out.println("Opcion no valida");
                    System.out.println("Ingrese nuevamente el dato");
            }//Fin Switch
              
            
        }while(estadoPrograma);
        
        
        
    }//Fin de Main
    
}//Fin de Class
