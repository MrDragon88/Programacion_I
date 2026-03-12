/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Estudiante Oscar = new Estudiante();
        Estudiante Andrade = new Estudiante("Ing");
        
        Oscar.MostrarDatos();
        Andrade.MostrarDatos();
        System.out.println("");
        
        Oscar.SETnombre("Oscar");
        Oscar.SETNota1(100);
        Oscar.SETNota2(90);
        Oscar.SETNota3(85);
        Oscar.GETPromedio(100, 90, 85);
        Oscar.MostrarDatos();
        
        

        
        
    }//Fin de Main
    

    
}//Fin Class
