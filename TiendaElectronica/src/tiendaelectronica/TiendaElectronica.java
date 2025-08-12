/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaelectronica;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class TiendaElectronica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        char categoria = '@';
        int montoCompra = 0;
        double descuento =0;
        double total = 0;
        
        System.out.println("Tienda Electronica");
        System.out.println("1. Categoria A (Electronica)");
        System.out.println("2. Categoria B (Hogar)");
        System.out.println("3. Categoria C (Otros)");
        System.out.print("Seleccion: ");
        categoria = input.next().toLowerCase().charAt(0);
        
        System.out.print("\nCuanto fue tu compra: ");
        montoCompra = input.nextInt();
        
        switch (categoria) {
            case '1':
                    System.out.println("Categoria de Electronica");
                    
                    if(montoCompra<5000){
                        descuento = montoCompra * 0.05;
                    }
                    else{
                        descuento = montoCompra *0.10;
                    }
                break;
            case '2':
                System.out.println("Categoria de Hogar");
                if(montoCompra<3000){
                        descuento = montoCompra * 0.08;
                    }
                    else{
                        descuento = montoCompra *0.15;
                    }
                break;
            case '3':
                System.out.println("Categoria Otros");
                descuento = 0;
                
                break;
            default:
                System.out.println("Opcion no Valida");
               
        }//Fin de Switch
        
        total = montoCompra - descuento;
        
        System.out.printf("%nFactura de Compra");
        System.out.printf("%nMonto Original: %d",montoCompra);
        System.out.printf("%nDescuento: %.2f",descuento);
        System.out.printf("%nTotal: %.2f",total);
        
        
    }//Fin de Main
    
}//Fin de Class
