/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contarvocales;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class ContarVocales {

    static int vocal_A = 0;
    static int vocal_E = 0;
    static int vocal_I = 0;
    static int vocal_O = 0;
    static int vocal_U = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int resultado = 0;
        String cadena  = "default";
        
        System.out.print("Ingrese palabra: ");
        cadena = scan.next();
        
        resultado = contarVocales(cadena);
        System.out.printf("El total de Vocales son: %d",resultado);
        System.out.println("Total de Vocales Individuales");
        System.out.printf("A: %d\n",vocal_A);
        System.out.printf("E: %d\n",vocal_E);
        System.out.printf("I: %d\n",vocal_I);
        System.out.printf("O: %d\n",vocal_O);
        System.out.printf("U: %d\n",vocal_U);
        
    }//Fin Main
    
    public static int contarVocales(String palabra){
        int totalVocales = 0;
        
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.toLowerCase().charAt(i);
            if(letra == 'a'|| letra == 'e'|| letra == 'i'|| letra == 'o'|| letra == 'u'){
               totalVocales++;
               
               ConteoIndividualVocales(letra);
            }
        }//Fin Ciclo For
        return totalVocales;
    }//Fin Funcion Contar Vocales
    
    public static void ConteoIndividualVocales(char letra){
        
        switch(letra){
            case 'a':
                vocal_A++;
                break;
            
            case 'e':
                vocal_E++;
                break;
            
            case 'i':
                vocal_I++;
                break;
            
            case 'o':
                vocal_O++;
                break;
            
            case 'u':
                vocal_U++;
                break;
        }//Fin Switch
    }
}//Fin Class
