/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conteoascedentedescendente;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class ConteoAscedenteDescendente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Desarrollar un algoritmo que en la que el 
            usuario de manera dinámica determine el 
            punto de inicio y el punto final del conteo 
            secuencial de los números. El usuario escoge 
            como quiere contar, si de forma ascendente o descendente
        */
        Scanner scan = new Scanner(System.in);
        int puntoInicial = 0;
        int puntoFinal = 0;
        String formaConteo = "default";
        
       
        System.out.println("El conteo que sea ascendente o descendente? ");
        formaConteo = scan.next().toLowerCase();
        
         System.out.print("Ingrese el punto de partida: ");
            puntoInicial = scan.nextInt();
            System.out.print("Ingrese el punto de llegada: ");
            puntoFinal = scan.nextInt();
            
        if(formaConteo.equals("ascendente")){
            //Conteo Ascendente
            while(puntoInicial <=puntoFinal){
            System.out.printf("Conteo: %d",puntoInicial);
            puntoInicial++;
            }//Fin While
        }
        else{
            //Conteo Descedente
            while(puntoInicial >=puntoFinal){
            System.out.printf("Conteo: %d",puntoInicial);
            puntoInicial--;
            }//Fin While
        }
        
   }//Fin Main
    
}//Fin Class
