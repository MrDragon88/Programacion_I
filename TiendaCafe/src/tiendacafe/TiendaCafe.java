/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendacafe;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class TiendaCafe {

    /**
     * @param args the command line arguments
     * 
     *  El estudiante debe resolver este problema utilizando los siguientes métodos:

        1. Un método para mostrar un saludo de bienvenida. Sin parametros, sin devolucion

        2. Un método para mostrar el menú del café con los precios. Sin parametros, sin devolucion

        3. Un método que calcule el costo total de la compra. Con tres parametros, con devolucion

        4. Un método que aplique un descuento del 10% si el total supera $20. 
        * Con un parametro, con devolucion

        5.Un método que imprima el recibo final. Con un parametro, sin devolucion
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantidadCafe = 2;
        int cantidadPastel = 1;
        int cantidadTe = 1;

        double precioCafe = 3.50;
        double precioPastel = 4.00;
        double precioTe = 2.50;
        
        double subtotal=0;
        double totalConDescuento = 0;

        // 1. Saludo de bienvenida
        System.out.println("¡Bienvenido a la Cafetería Java!");
        System.out.println("---------------------------------");

        // 2. Mostrar el menú
        System.out.println("Nuestro menú:");
        System.out.println("Café: $3.50");
        System.out.println("Pastel: $4.00");
        System.out.println("Té: $2.50");
        System.out.println("---------------------------------");

        // 3. Cálculo del total
            subtotal = (cantidadCafe * precioCafe) + (cantidadPastel * precioPastel) + (cantidadTe * precioTe);

        // 4. Aplicar descuento (lógica de negocio)
         totalConDescuento = subtotal; // Inicializamos el total con el subtotal
        if (subtotal > 20.0) {
            totalConDescuento = subtotal * 0.90; // Aplicamos el 10% de descuento
            System.out.println("¡Felicitaciones! Se ha aplicado un descuento del 10%.");
        }

        // 5. Imprimir el recibo final
        System.out.println("---------------------------------");
        System.out.println("Recibo de Compra");
        System.out.println("Café: " + cantidadCafe + " x $" + precioCafe);
        System.out.println("Pastel: " + cantidadPastel + " x $" + precioPastel);
        System.out.println("Té: " + cantidadTe + " x $" + precioTe);
        System.out.println("---------------------------------");
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Total a pagar: $" + String.format("%.2f", totalConDescuento));
        System.out.println("---------------------------------");
    }//Fin Main

    
}//Fin Class