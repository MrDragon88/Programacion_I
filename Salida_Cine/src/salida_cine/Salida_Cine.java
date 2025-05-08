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
        char opcion = '@';//Caracter; letras, digitos, caracteres  especiales
        
        System.out.println("Bienvenido al Cine de Programacion");
        System.out.println("1. Accion");
        System.out.println("2. Hechos Reales");
        System.out.println("3. Terror");
        System.out.print("Cual es tu eleccion: ");
        opcion = scan.next().charAt(0);
        
       //Caso -> numeros enteros, caracteres o palabras
        switch(opcion){
            case '1':
                System.out.println("Accion");
               break;
            
            case '2':
                System.out.println("Hechos Reales");
               break;   
            
            case '3':
                System.out.println("Terror");
               break;
               
            default:
                System.out.println("Romanticas!!");
                break;
 
        }//Fin Switch
       
        
        
    }//Fin Main
    
}//Fin de Class
