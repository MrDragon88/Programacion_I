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
        Saludo();

        // 2. Mostrar el menú
        Menu();

        // 3. Cálculo del total
            subtotal = calculoSubtotal(cantidadCafe, cantidadPastel, cantidadTe);
        // 4. Aplicar descuento (lógica de negocio)
         totalConDescuento = Total(subtotal);

        // 5. Imprimir el recibo final
        System.out.println("---------------------------------");
        System.out.println("Recibo de Compra");
        System.out.println("Café: " + cantidadCafe + " x $" + precioCafe);
        System.out.println("Pastel: " + cantidadPastel + " x $" + precioPastel);
        System.out.println("Té: " + cantidadTe + " x $" + precioTe);
        System.out.println("---------------------------------");
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        ImpresionRecibo(totalConDescuento);
    }//Fin Main
    
    public static void Saludo(){
        System.out.println("¡Bienvenido a la Cafetería Java!");
        System.out.println("---------------------------------");
    }//Fin Funcion Saludo
    
    public static void Menu(){
        System.out.println("Nuestro menú:");
        System.out.println("Café: $3.50");
        System.out.println("Pastel: $4.00");
        System.out.println("Té: $2.50");
        System.out.println("---------------------------------");
    }//Fin Funcion Menu
    
    public static double calculoSubtotal(int cantCafe,int cantPastel,int cantTe){
        double tempSubTotal = 0;
        tempSubTotal = (cantCafe * 3.5) + (cantPastel * 4) + (cantTe * 2.5);
        return tempSubTotal;
    }//Fin Funcion calculoSubtotal
    
    public static double Total(double subTotal){
        double tempTotal = subTotal; // Inicializamos el total con el subtotal
        if (tempTotal > 20.0) {
            tempTotal = subTotal * 0.90; // Aplicamos el 10% de descuento
            System.out.println("¡Felicitaciones! Se ha aplicado un descuento del 10%.");
        }
        
        return tempTotal;
    }//Fin Funcion
    
    public static void ImpresionRecibo(double total){
        System.out.println("Total a pagar: $" + String.format("%.2f", total));
        System.out.println("---------------------------------");
    }
    
}//Fin Class
