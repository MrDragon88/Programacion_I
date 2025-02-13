/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclodowhile;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class CicloDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int notaIngresada = 0;
        int sumaNotas = 0;
        int contadorNotas = 1;
        double promedio = 0.0;
        
        
           
        while (contadorNotas <=3){
            System.out.println("DENTRO DEL WHILE");
            do{
                System.out.println("Dentro del DO WHILE");
                System.out.printf("Ingrese Nota %d) (0 - 100): ",contadorNotas);
                notaIngresada = scan.nextInt();
                if(notaIngresada <=-1 || notaIngresada>=101){
                System.out.println("Nota Ingresa no es valida");
                }
                
            }while(notaIngresada <=-1 || notaIngresada>=101);
            System.out.println("SALI DEL DO WHILE");
            //sumaNotas +=notaIngresada;
            sumaNotas = sumaNotas + notaIngresada;
            contadorNotas++; //contadorNotas = contadorNotas + 1
        }//Fin While
        contadorNotas--;
        
        promedio = sumaNotas / contadorNotas;//Hard coded
        System.out.printf("Nota Final es: %.2f",promedio);
    }//Fin Main
    
    /*
    wwhile y do while...se ejecuta mientras la condicion sea verdadera
    caso contrario se sale.
    */
    
    /*
    OR
    
    E1  E2  S
    0   0   0
    0   1   1
    1   0   1
    1   1   1
    
    */
    
    
}//Fin Class
