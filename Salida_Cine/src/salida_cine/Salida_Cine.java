/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salida_cine;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Salida_Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Estructura Seleccion Tipo Multiple
        /*
            Desarrollar un algoritomo que me permita escoger el tipo
            de pelicula que me gustaria visualizar.
        */
        Scanner scan = new Scanner(System.in);
        char opcion = '@';
        int presupuesto = 0;
        
        System.out.print("Cuanto presupuesto tiene? ");
        presupuesto = scan.nextInt();
        
        if (presupuesto < 300){
           System.out.println("Bienvenido al cine de programacion ");
           System.out.println("1. Accion ");
           System.out.println("2. Hechos reales ");
           System.out.println("3. Terror ");
           System.out.println("Cual es tu eleccion: ");
           opcion = scan.next().charAt(0);
            
        //Caso -> numero enteros, caracteres o palabras
        
            switch(opcion) {
              case '1': 
                  System.out.println("Accion");
                  if (presupuesto > 100){
                      System.out.println("Tienes un muñeco de accion ");
                      
                  }
                      
                  break; 

              case '2':               
                  System.out.println("Hechos reales");
                  if (presupuesto > 250){
                      System.out.println("\"Puede tener una visita tras bambalinas\" ");
                      
                  }
                  break;   

              case '3':  
                  System.out.println("Terror");
                  break;

              default:  
                  System.out.println("Romanticas!!");
                  break;   

          }//Fin Switch 
        }//Fin de If
        else {
           System.out.println("Bienvenido al cine de programacion ");
           System.out.println("1. Ciencia Ficcion ");
           System.out.println("2. Accion ");
           System.out.println("3. Comedia ");
           System.out.println("Cual es tu eleccion: ");
           opcion = scan.next().charAt(0);
           
            switch(opcion) {
              case '1': 
                  System.out.println("Ciencia Ficcion");
                  if (presupuesto > 600)
                      System.out.println("Te llevas una replica de la nave ");
                  break; 

              case '2':               
                  System.out.println("Accion");
                  break;   

              case '3':  
                  System.out.println("Comedia");
                  
                  break;

              default:  
                  System.out.println("Quedate en casa!!");
                  break;   

          }//Fin Switch 
        }
        
    }//Fin Main
    
}//Fin Class