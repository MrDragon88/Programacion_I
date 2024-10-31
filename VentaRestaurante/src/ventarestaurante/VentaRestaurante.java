/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ventarestaurante;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class VentaRestaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        double ventaIndividual= 0.0;
        double ventaTotal = 0.0;
        double sumaDescuentos = 0.0;
        double descuento = 0.0;
        int numeroVentas = 1;
        final double INFERIOR = 1000;
        final double SUPERIOR = 10000;
        final int LIMITEVENTA = 5;//Constante de VENTAS
        
        while(numeroVentas <=LIMITEVENTA){
            System.out.printf("Numero de Venta: %d",numeroVentas);
            System.out.print("\nCuanto fue tu venta de ahorita? ");
            //Opcion 1..Usar Random
            //ventaIndividual = rand.nextDouble(INFERIOR,SUPERIOR);
            
            //Opcion2 ...Ingresado manualmente
            ventaIndividual = scan.nextDouble();
            do{
                if(ventaIndividual<0){
                    System.out.println("No puede existir, venta negativa...ingrese nuevamente valor");
                    ventaIndividual = scan.nextDouble();
                }
            }while(ventaIndividual<0);
            
            
            
            System.out.printf("Precio Venta Original: %.2f",ventaIndividual);
            System.out.println("");
            
            if(ventaIndividual <3000){
                descuento = 0;
            }
            else if(ventaIndividual >=3000 && ventaIndividual<8000){
                descuento = ventaIndividual * 0.10;
                
            }
            else
            {
                descuento = ventaIndividual *0.15;
            }

            ventaIndividual = ventaIndividual - descuento;
            sumaDescuentos +=descuento; 
            ventaTotal +=ventaIndividual;
            
            System.out.printf("El descuento es de: %.2f",descuento);
            System.out.printf("\nVenta ya con descuento: %.2f",ventaIndividual);
            
            numeroVentas++;
            System.out.println("\n");
        }//Fin de While
        System.out.printf("\nVenta Total: %.2f",ventaTotal);
        System.out.printf("\nDescuento Total: %.2f",sumaDescuentos);
        
        
    }//Fin de Main
    
}//Fin Class
