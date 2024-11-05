/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package piramidecaracteres;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 * 
 */
public class PiramideCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        char caracter = '@';
        int niveles = 0;
        int cantCaracteres = 0;
        System.out.print("Que simbolo/caracter se quiere usar? ");
        caracter = scan.next().charAt(0);
        
        System.out.print("Que cantidad de niveles tendra la piramide?");
        niveles = scan.nextInt();
        System.out.println("");
        
        /*
         5 niveles del #
        #   ->nivel 1 y hay un caracter
        ##  ->nivel 2 y hay dos caracteres
        ### -> nivel 3 y hay tres caracteres
        ####
        #####
        
        */
        //Ascendente
        for(int i = 0 ; i<niveles ; i++){
            cantCaracteres =  i +1;
            //System.out.printf("%s\n",caracter);
            for(int j=0 ; j<cantCaracteres ;j++){
                System.out.printf("%s\t",caracter);
            }//Ciclo de Caracteres x Nivel
            System.out.println("");
        }//Ciclo For de Niveles
        
        //Descendente
        for(int i = niveles;i>0;i--){
            for(int j = 1 ; j<cantCaracteres; j++){
                System.out.printf("%s\t",caracter); 
            }//Ciclo de Caracteres x Nivel
            cantCaracteres--;
            System.out.println("");
            
        }//Ciclo Descendente por niveles
        
    }//Fin Main
    
}//Fin Class
