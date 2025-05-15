/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areaimprimible;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class AreaImprimible {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        char seleccionPapel = '@';
        double  margenSUP = 0;
        double  margenINF = 0;
        double  margenIZQ = 0;
        double  margenDER = 0;
        
        double largoIMP =0;
        double anchoIMP = 0;
        double areaIMP = 0; //largoIMP * anchoIMP
        
        System.out.println("Tamanio Papel");
        System.out.println("A. A4");
        System.out.println("B. B5");
        System.out.println("C. Carta");
        System.out.print("Cual eliges: ");    
        seleccionPapel = scan.next().toLowerCase().charAt(0);
        
        System.out.println("Indicame los margenes en CM ");
        System.out.print("Margen Superior: ");
        margenSUP = scan.nextDouble();
        
        if(margenSUP >3){
            System.out.println("Valor no permitido...nuevo valor sera 2.5 cm");
            margenSUP = 2.5;
        }
        
        System.out.print("\nMargen Inferior: ");
        margenINF = scan.nextDouble();
        if(margenINF >3){
            System.out.println("Valor no permitido...nuevo valor sera 2.5 cm");
            margenINF = 2.5;
        }
        
        System.out.print("\nMargen Izquierdo: ");
        margenIZQ = scan.nextDouble();
        if(margenIZQ >3){
            System.out.println("Valor no permitido...nuevo valor sera 2.5 cm");
            margenIZQ = 2.5;
        }
        System.out.print("\nMargen Derecho: ");
        margenDER = scan.nextDouble();
        if(margenDER >3){
            System.out.println("Valor no permitido...nuevo valor sera 2.5 cm");
            margenDER = 2.5;
        }
        
        
        switch(seleccionPapel){
            case 'a':
                //Tamanio A4 - 297mm x 210mm 
                largoIMP = (297/10) - margenSUP - margenINF;
                anchoIMP = (210/10) - margenIZQ - margenDER;
                areaIMP = largoIMP * anchoIMP;
                break;
                
            case 'b':
                //Tamanio B5 - 182mm x 257mm 
                
                largoIMP = (182/10) - margenSUP - margenINF;
                anchoIMP = (257/10) - margenIZQ - margenDER;
                areaIMP = largoIMP * anchoIMP;
                break;
                
            case 'c':
                //Tamanio Carta - 8.5"x 11"
                largoIMP = (8.5 *2.54) - margenSUP - margenINF;
                anchoIMP = (11 * 2.54) - margenIZQ - margenDER;
                areaIMP = largoIMP * anchoIMP;
                break;
                
            default:
                break;
        }//Fin de Switch
        
        System.out.printf("Area Imprimible es: %.2f",areaIMP);
    }//Fin Main
    
}//Fin Class

































