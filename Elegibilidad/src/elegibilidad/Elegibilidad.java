/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elegibilidad;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Elegibilidad {

    /**
     * Se tiene una plataforma de streaming que organiza
     * eventos exclusivos. Un usuario es elegible para participar
     * si cumple con dos criterios independientes.
     * 
     * 1. Debe de tener una suscripcion activa
     * 2. Debe haber visto al menos 50 horas de contenido en el ultimo
     * mes.
     * 
     * Por lo tanto, el algoritmo debe de tener la capacidad 
     * de verificar la suscripcion y mosrar un mensaje apropiado.
     * Luego debe de verificar de manera aislada las horas de visualizacion
     * y mostrar un 2do mensaje. 
     * 
     * Determinar si el usuario puede o no ingresar
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        char suscripcionActiva='@';
        int horasVisualizadas =0;
        
        System.out.println("Bienvenido a BOT de Eventos");
        System.out.println("Participa y veras si puedes ingresar");
        System.out.println("");
        
        System.out.print("Tienes una suscripcion al canal del Ing? (Si = s, No = n)");
        suscripcionActiva = input.next().toLowerCase().charAt(0);
        
        //Estructura de Seleccion SIMPLE / DOBLE
        
        if(suscripcionActiva=='s'){
            System.out.println("Tenemos Suscripcion Activa");
        }
        else{
            System.out.println("Lastima que no tienes suscripcion");
        }
        
        System.out.println("\nCuantas horas has visto (No se permiten negativos)?");
        horasVisualizadas = input.nextInt();
        //Class Math
        horasVisualizadas = Math.abs(horasVisualizadas);
        
        if(horasVisualizadas >= 50)
        {
            System.out.println("Que monton has visto");
        }
        else{
            System.out.println("Deberias de ver un poco mas!!");
        }
        
        //Operacion Booleana
        /*
            AND   &&    Y       
            OR    ||    O
            NOT   !     Negado
        
        AND -> Todos los criterios tienen que ser verdaderos
                para que la salida sea verdadera
        
        OR  -> Todos los criterios tienen que ser falsos
                para que la salida sea falsa.
        */
        
        //Estructura Seleccion Simple
        if(suscripcionActiva == 's' && horasVisualizadas >=50){
            System.out.println("Pase companiero al salon del evento!!");
        }
        
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
    }//Fin de Main
    
}//Fin Class
