/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package area;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Area {

    /**
     * Diseñar un programa que sirva para calcular el área del círculo en 
     * función del radio. 
     * Fórmula: 𝐴 = 𝜋 𝑟² donde
     * A corresponde a área 
     * r es igual al radio. 
     * 
     * Mostrar el área del círculo
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double radio = 0.0;
        double area = 0.0;
        
        //Ingresar Datos
        System.out.print("Dime el radio de la manguera: ");
        radio = input.nextDouble();
        
        //Procesar Datos
        //Opcion 1
        area = 3.1416 * radio * radio;
        
        //Opcion 2
            //area = Math.PI * Math.pow(radio, 2);
        
        //Mostrar Informacion / Resultados
        System.out.printf("\nEl area del circulo con radio %.2f es %.2f",radio,area);
        System.out.println("");
        
        
    }//Fin de Main
    
}//Fin de Class
