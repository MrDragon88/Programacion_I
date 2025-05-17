/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacionciclosrepeticion;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class ComparacionCiclosRepeticion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Parte 1->Realizar un codigo que aparezca tu nombre 3 veces
            Parte 2->Que aparezca X nombre 3 veces
            Parte 3->Aparezca X nombre X veces
        */
        Scanner input = new Scanner(System.in);
        String nombre = "Oscar";
        int numeroRepeticiones = 0;
        int conteoWHILE = 0;
        int conteoDO_WHILE = 0;
        int conteoFOR = 0;
        
        System.out.print("Ingresa tu nombre: ");
        nombre = input.next().toLowerCase();
        //input.nextLine();
        System.out.print("Cuantas veces que se repita: ");
        numeroRepeticiones = input.nextInt();
        
        System.out.println("WHILE");
        while(conteoWHILE < numeroRepeticiones){
            System.out.println(""+nombre);
            conteoWHILE++;
        }//Fin While
        
        System.out.println("\nDO WHILE");
        do{
            System.out.println(""+nombre);
            conteoDO_WHILE++;
        }while(conteoDO_WHILE<numeroRepeticiones);
        
        System.out.println("\nFOR");
        for (int i = 0; i < numeroRepeticiones; i++) {
            System.out.println(""+nombre);
        }//Fin For
        
    }//Fin Main
    
}//Fin Class
