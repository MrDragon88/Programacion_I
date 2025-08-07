/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturaambiente;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class TemperaturaAmbiente {

    /**
 *
 * Desarrollar un algoritmo que tome la temperatura y la humedad
 * de la ciudad en tres momentos diferentes; mañana, tarde, noche.
 * Segun el horario de medicion, indicar si esta caliente, agradable, frio.
 * 
 * Manaña
 * Caliente => si la temperatura esta arriba de 23
 * Agradable => si la temperatura esta entre 20 y 23
 * Frio => si la temperatura esta abajo de 20
 * 
 * Tarde
 * Caliente => si la temperatura esta arriba de 30
 * Agradable => si la temperatura esta entre 25 y 30
 * Frio => si la temperatura esta abajo de 25
 * 
 * Noche
 * Caliente => si la temperatura esta arriba de 19
 * Agradable => si la temperatura esta entre 16 y 19
 * Frio => si la temperatura esta abajo de 16
 * 
 * 
 * Si la humedad está arriba del 50% se mantienen los mensajes anteriores
 * caso contrario indicar que se tiene un clima alterado
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        char jornada = '@';
        double temperatura = 0;
        boolean humedad = true;
        
        System.out.println("Clima de la Ciudad");
        System.out.println("Que momento buscas conocer? ");
        System.out.println("M. Mañana");
        System.out.println("T. Tarde");
        System.out.println("N. Noche");
        System.out.print("Seleccion: ");
        jornada = scan.next().toUpperCase().charAt(0);
        
        System.out.print("Que valor muestra el termometro? ");
        temperatura = scan.nextDouble();
        
        switch (jornada) {
            case 'M':
                System.out.println("Estamos por la manania");
                
                System.out.println("Sientes que amanecio humedo? (true/false)");
                humedad = scan.nextBoolean();
                if(temperatura > 23 && humedad == true){
                    System.out.println("si que amanecio caliente");
                }
                else if(temperatura>=20 && humedad == true){
                    System.out.println("Esta agradable la maniana");
                }
                else{
                    System.out.println("que frio, tan temprano.!!!");
                }
                break;
            case 'T':
                System.out.println("Ya es la tarde");
                if(temperatura > 30){
                    System.out.println("si que esta caliente esta tarde");
                }
                else if(temperatura>=25){
                    System.out.println("Esta agradable la tarde");
                }
                else{
                    System.out.println("que frio, y no termina todavia.!!!");
                }
                break;
            case 'N':
                System.out.println("Cayo la noche--Soy Batman!!!");
                if(temperatura > 19){
                    System.out.println("Hoy la noche no se duerme x caliente");
                }
                else if(temperatura>=16){
                    System.out.println("Esta agradable la noche");
                }
                else{
                    System.out.println("que frio!!.!!!");
                }
                break;
            default:
                System.out.println("Opcion no existente en el dia");
                break;
        }//Fin de Switch
        
    }//Fin de  Main
    
}//Fin de Class
