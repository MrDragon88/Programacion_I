/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoralibreriamath;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 * Desarrollar una calculadora de funciones, en la que se emplee 
 * funciones de la libreria MATH, debiendo mostrar al menos un resultado
 * de cualquier funcion. La ejecución del algoritmo será hasta que, el usuario
 * decida salirse.
 * 
 * Math.abs(0);
        Math.pow(, 0);
        Math.ceil(0);
        Math.floor();

 */
public class CalculadoraLibreriaMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        char opcionSeleccion = '@';
        double numero1 = 0;
        double numero2 = 0;
        double resultado = 0;
        do
        {
            System.out.println("**********************************");
            System.out.println("  Calculadora de Funciones MATH  ");
            System.out.println("**********************************");
            System.out.println("");
            System.out.println("Menu de Opciones");
            System.out.println("1. Valor Absoluto");
            System.out.println("2. Potencia");
            System.out.println("3. Redondeo para Abajo");
            System.out.println("4. Redondeo para Arriba");
            System.out.println("5. Salir");
            opcionSeleccion = scan.next().charAt(0);
        
            switch(opcionSeleccion){
                case '1':
                    System.out.print("Ingrese su Numero: ");
                    numero1 = scan.nextInt();
                    resultado = Math.abs(numero1);
                    System.out.printf("Valor Absoluto de %d es %.0f",(int)numero1,resultado);
                    System.out.println("\n");
                    break;
                case '2':
                    System.out.print("Ingrese Base: ");
                    numero1 = scan.nextInt();
                    
                    System.out.print("Ingrese Potencia: ");
                    numero2 = scan.nextInt();
                    resultado = Math.pow(numero1, numero2);
                    System.out.printf("\nPotencia de %d Elevado a %d es %f: ",(int)numero1,(int)numero2,resultado);
                    System.out.println("\n");
                    break;
                case '3':
                    System.out.print("Ingrese el numero a redondear: ");
                    numero1 = scan.nextDouble();
                    resultado = Math.floor(numero1);
                    System.out.printf("Redondeo para Abajo de %.1f es %d",numero1,(int)resultado);
                    System.out.println("\n");
                    break;
                case '4':
                    System.out.print("Ingrese el numero a redondear: ");
                    numero1 = scan.nextDouble();
                    resultado = Math.ceil(numero1);
                    System.out.printf("Redondeo para Arriba de %.1f es %d",numero1,(int)resultado);
                    System.out.println("\n");
                    break;
                case '5':
                    System.out.println("\nSaliendo del programa....");
                    System.out.println("Muchas Gracias....sayonara!!!");
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Opcion no valida...tiene que ser entre el 1 y 4");
                    break;
            
            }//Fin de Switch 
        }while(opcionSeleccion != '5');
        
        
        
    }//Fin de Main
    
}//Fin de Class
