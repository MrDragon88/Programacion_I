/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conteonumeros;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class ConteoNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        /*Realizar un algoritmo que me muestre los numeros del 1 al 20*/
        /*
            Las estructuras de repeticion deben de tener los siguientes puntos:
            1. Condicion a Evaluar
            2. Instrucciones que se repiten
            3. Modificador de la condicion que esta siendo evaluada.
        */
        /*
            Una estructura de repeticion WHILE puede tener dos tipos de repeticiones:
            1. Repeticion Definida
            2. Repeticion "Indefinida"
        */
        int conteo = 1;
        while(conteo <=20){
            System.out.printf("%d\n",conteo);
            
            //Forma Abreviada de ir sumando 1
            conteo++; //Incremento Post - Unitario 
            //conteo = conteo + 1;
            //conteo +=10; //conteo = conteo + 10
        }//Fin While
        
        conteo = 1;
        char centinela = 's';
        while (centinela =='s'){
            System.out.printf("%d\n",conteo);
            conteo++;
            System.out.print("Desea Continuar? (S = si)");
            centinela = scan.nextLine().toLowerCase().charAt(0);
        }//Fin de While
        
        /*
            Contar del 1 al 100 pero pero pero.... que se mire
            asi
        
            1   2   3   4   5   6   7   8   9   10
            11  12  13  14  15  16  17  18  19  20
            21  222 23  24  25  26  27  28  29  30.
            .
            .
            .
            ..........................           100
        
        */
        
        conteo = 1;
        int cantidadNumeroxFila = 0;
        while(conteo <=100){
            System.out.printf("%d\t", conteo);
            conteo++;
            cantidadNumeroxFila++;
            if(cantidadNumeroxFila == 10){
                System.out.println("");
                cantidadNumeroxFila = 0;
            }//Fin If
        }//Fin While
        
    }//Fin de Main
    
}//Fin de Class
