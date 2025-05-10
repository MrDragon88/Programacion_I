/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classstring;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class ClassString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
        
         String palabra = "Default";
         
        int longitud=0;
        
          System.out.println("Ingrese una palabra de comida");
         // palabra=input.next();
          //palabra=input.nextLine();
         // palabra=input.nextLine().toUpperCase();
         // palabra=input.nextLine().toLowerCase();
           //palabra=input.nextLine().toLowerCase().substring(1, 3);
           palabra=input.nextLine().toLowerCase().substring(1);
           //longitud=input.nextLine().toLowerCase().substring(1).length();
             longitud = palabra.length();
             
           
           
          switch(palabra){
              case "pizza":
              System.out.printf("La comida seleccionada es: %s ", palabra);
              break;
              
              case "iz":
              System.out.printf("La porcion de comida es: %s ", palabra);
              break;
              
              case "PIZZA":
              System.out.printf("Mi comida preferida es: %s ", palabra);
              break;
              
              default: 
                  System.out.printf("Imprima la palabra: %s\n",palabra);
                  System.out.printf("%d",longitud);
          }//fin de switch
          
          //System.out.printf("La palabra ingresada es: %s ", palabra);
          
        
    }//fin de main
    
}//fin de class
