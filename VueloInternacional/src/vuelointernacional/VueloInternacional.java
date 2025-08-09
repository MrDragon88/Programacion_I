/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vuelointernacional;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class VueloInternacional {

    /**
     * Imagina que estas desarrollando un algoritmo que es para clientes
     * de millas frecuentes de la aereolinea VolandoconProgra
     * 
     * El detalle esta para el proceso de embarque, donde dependiendo
     * del cumplimiento de la regla de estatus podra asignarle un embarque prioritario
     * si tiene los siguientes criterios a su favor
     * 1. Tiene un estatus GOLD - string
     * 2. Vuelo internacional   - char
     * 3. Tiene mas de 35 anios - int
     * 
     * Si la persona tiene mas de 60 anios, pasa de primero en el embarque prioritario.
     * 
     * Luego se le asigna una un upgrade de asiento (Primera clase) si cumple 
     * cualquier de los siguientes elementos
     * 1. Pago con tarjeta de credito
     * 2. Selecciono un asiento que da a la ventanilla de emergencia
     * 3. El pago de la maleta extra es arriba de $100
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String estatus = "NI IDEA";
        char tipoVuelo = '#';
        int edad = 99;
        
        String respuestaTarjeta = "SIIIIIII";
        char lugarAsiento ='Q';
        int costoMaletaExtra = 0;
        
        System.out.print("Tipo de Estatus: Gold, Silver, Bronze..etc");
        estatus = input.nextLine().toUpperCase();
        
        System.out.print("Vuelo Local (L) / Vuelo Internacional (I)");
        tipoVuelo = input.next().toUpperCase().charAt(0);
        
        System.out.print("Tu edad es: ");
        edad = input.nextInt();
        input.nextLine();
        if(estatus.equals("GOLD") && tipoVuelo == 'I' && edad>=21)
        {
            System.out.println("Tienes embarque prioritario");
            if(edad>=60){
                System.out.println("PAse de 1ro en el embarque prioritario");
            }
        }
        else{
            System.out.println("Espere en la fila a que le llamen!!");
        }
                
        
        System.out.print("Pago con tarjeta de Credito, si o no:  ");
        respuestaTarjeta = input.nextLine().toUpperCase();
        
        System.out.print("Lugar de Asiento en Ventanilla, si o no:  ");
        lugarAsiento = input.next().toUpperCase().charAt(0);
        
        System.out.print("Costo de Maleta Extra: ");
        costoMaletaExtra = input.nextInt();
        
        if(respuestaTarjeta.equals("SI") || lugarAsiento == 'S' || costoMaletaExtra >=100)
        {
            System.out.println("Tienes un UPGRADE  de 1ra Clase !!!!");
        }
        
        
    }//Fin de Main
    
}//Fin Class
