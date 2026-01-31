/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comidarapida;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class ComidaRapida {

    /**
     * @param args the command line arguments
     * 
     * Estructuras de Seleccion
     * a. Tipo Multiple ->switch ->Una unica opcion pero dentro de mismo nivel
     * 
     * Wendys
     * Popeyes
     * Dominos
     * Trio ->Baleadas de la Ceiba
     * Parque ->Baleadas tambien despues de la fiesta
     * 
     * b. Tipo Simple o Doble -> condicion a nivel de rango
     *  
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        char seleccionCHAR = '0';
        int seleccionINT = 0;
        
        /*
        System.out.println("Comidas Rapidas");
        System.out.println("1. Wendys");
        System.out.println("2. Popeyes");
        System.out.println("3. Dominos");
        System.out.println("4. Trios");
        System.out.println("5. After en el Parque");
        
        seleccionINT = sc.nextInt();
        
        //Enteros, caracteres, cadenas
        switch(seleccionINT){
            case 1:
                //Instrucciones de cada Caso / Escenario
                System.out.println("Hamburguesa para comer....");
                break;

            case 2:
                System.out.println("Pollo, pollo y mas pollo");
                break;

            case 3:
                System.out.println("Pizza con todo los ingredientes");
                System.out.println("sobre todo con piña");
                break;

            case 4:
                System.out.println("Baleadas con todo!!");
                break;
              
            case 5:
                System.out.println("La fiesta no acaba aun es");
                System.out.println("es hasta que ......");
                break;
                
            default:
                System.out.println("Opcion no existe");
                break;
        }//Fin de Switch
   */     
        //Opciones con CHAR
        System.out.println("Comidas Rapidas");
        System.out.println("a. Wendys");
        System.out.println("b. Popeyes");
        System.out.println("c. Dominos");
        System.out.println("d. Trios");
        System.out.println("e. After en el Parque");
        //seleccionCHAR = sc.next().charAt(0);
        seleccionCHAR = sc.next().toLowerCase().charAt(0);//Minusculas
        //seleccionCHAR = sc.next().toUpperCase().charAt(0);//Mayuscula
        
        switch(seleccionCHAR){
            case 'a':
                //Instrucciones de cada Caso / Escenario
                System.out.println("Hamburguesa para comer....");
                break;
            
            case 'b':
                System.out.println("Pollo, pollo y mas pollo");
                break;
             
            case 'c':
                System.out.println("Pizza con todo los ingredientes");
                System.out.println("sobre todo con piña");
                break;
             
            case 'd':
                System.out.println("Baleadas con todo!!");
                break;
              
            case 'e':
                System.out.println("La fiesta no acaba aun es");
                System.out.println("es hasta que ......");
                break;
                
            default:
                System.out.println("Opcion no existe");
                break;
        }//Fin de Switch
        
    }//Fin de Main
    
}//Fin Class
