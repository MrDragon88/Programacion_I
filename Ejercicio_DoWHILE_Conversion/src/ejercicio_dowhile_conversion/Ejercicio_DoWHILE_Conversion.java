/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_dowhile_conversion;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Ejercicio_DoWHILE_Conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        String opcion = "John Doe";
        boolean continuacion= true;//true o false
        double valorIngresado =0;
        double km_millas = 0;
        double mi_kilometros =0;
        double kg_libras=0;
        double lb_kilogramos=0;
        do{
            
            System.out.println("menu de conversiones...escoger");
            System.out.println("UNO. Kilometros a Millas");
            System.out.println("DOS. Millas a Kilometros ");
            System.out.println("TRES. Libras a Kilogramos");
            System.out.println("CUATRO. Kilogramos a Libras");
            System.out.println("SALIR del Menu");
            System.out.print("Opcion que selecciona es: ");
            opcion = scan.next().toUpperCase();

            switch (opcion) {
                case "UNO":
                    System.out.print("Ingrese el numero de KM: ");
                    valorIngresado = scan.nextDouble();
                    km_millas = valorIngresado / 1.6; //1mi = 1.6km 
                    System.out.printf("Millas: %.2f",km_millas);
                    break;

                case "DOS":
                    System.out.print("Ingrese el numero de MI: ");
                    valorIngresado = scan.nextDouble();
                    mi_kilometros = valorIngresado * 1.6; //1mi = 1.6km 
                    System.out.printf("Kilometros: %.2f",mi_kilometros);
                    break;

                case "TRES":
                    System.out.print("Ingrese el numero de Libras: ");
                    valorIngresado = scan.nextDouble();
                    lb_kilogramos = valorIngresado /2.2; //1kg  = 2.2 lb 
                    System.out.printf("Kilogramos: %.2f",lb_kilogramos);
                    break;

                case "CUATRO":
                    System.out.print("Ingrese el numero de Kilogramos: ");
                    valorIngresado = scan.nextDouble();
                    kg_libras = valorIngresado *2.2; //1kg  = 2.2 lb 
                    System.out.printf("Libras: %.2f",kg_libras);
                    break;

                case "SALIR":
                    continuacion = false;
                    break;
                default:
                    System.out.println("MIjo..lea las opcioens que tienes...no invente");
            }//Fin de Switch
        }while(continuacion);
        
        System.out.println("gracias por participar");
    }//Fin Main
    
}//Fin Class
