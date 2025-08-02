/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaonline;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class TiendaOnline {

    /*
        Proceso de Compra en una Tienda Online
        Problema: En el proceso de checkout de una tienda online, 
        se aplican dos reglas de forma separada:

        1. Si el cliente tiene un cupón de descuento, se aplica.
        2. Si el total de la compra supera los $100, se le notifica 
           que ha calificado para envío gratis.

        Crear un algoritmo que reciba el total de la compra
        y si el cliente tiene un cupón. El programa debe aplicar 
        el descuento si corresponde y luego, en una sección diferente 
        del código, verificar y notificar sobre el envío gratuito.
        
        */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        char cupon ='@';
        double total =0;
        
        System.out.println("Tienda ONLINE DE PROGRA");
        System.out.println("***********************");
        
        System.out.println("\nTienes cupon?(Si = s, No = n)");
        cupon = input.next().toLowerCase().charAt(0);
        
        if(cupon == 's'){
            System.out.println("Tienes un cupon de $20");
        }
        else{
            System.out.println("No tienes cupon, ni modo!!");
        }
        
        System.out.print("\nDime el total de tu compra");
        total = input.nextDouble();
        total = Math.abs(total);
        if(total>=100){
            System.out.println("Aplicas para envio gratis");
        }
        else{
            System.out.println("Toca pagar envio o venga traigalo!!");
        }
        
        
        //Operadores Booleanos
        /*
            AND - &&    Y
            OR  - ||    O
            NOT - !     Negado
        
            AND - Todas las entradas tienen que ser verdadero
        para que la salida sea verdadera
        
            OR - Todas las entradas tiene qeu ser falsa
        para que la salida sea falsa
        
        NOT - Es la opcion contraria
        
        */
        
        if(cupon == 's' && total >= 120){
            System.out.println("Aun con cupon tienes envio gratis");
        }
        /*
            Asistencia a Evento
        
            Se requiere de un bot ejecute un algoritmo que indique
            quienes pueden participar en el evento exclusivo del anio
            VER JUGAR AL ING
            
            Para ello el bot tiene que hacer dos preguntas independientes
            1. Tienes una suscripcion al canal de Programacion?
            2. Haber visto mas de 50 horas del canal en el ultimo mes.
            
            En ambos casos de las preguntas, 
            debera mostrar un mensaje personalizado
        
        Para poder participar, se tiene que tener una suscripcion y
        mas de 50 horas de streaming
        
        */
        
    }//Fin Main
    
}//Fin Class
