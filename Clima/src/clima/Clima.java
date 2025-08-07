/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clima;

import java.util.Scanner;

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
 */
public class Clima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        char tiempoDia ='@';
        double temperatura = 0.0;
        
        System.out.println("Que tiempo de medicion vamos a realizar");
        System.out.println("M. Manana");
        System.out.println("T. Tarde");
        System.out.println("N. Noche");
        System.out.print("Seleccion: ");
        tiempoDia = scan.next().toLowerCase().charAt(0);
        
        System.out.print("Que valor muestra el termometro? ");
        temperatura = scan.nextDouble();
        
        switch (tiempoDia) {
            case 'm':
                System.out.println("Midiendo por la maniana");
                
                if(temperatura>23){
                    System.out.println("Hoy si que amanecio caliente");
                }//Fin if
                else if(temperatura>= 20){
                    System.out.println("Amanecio agradable");
                }
                else{
                    System.out.println("A ponerse chumpa por que esta frio!!!");
                }
                break;
            case 't':
                System.out.println("Estamos por la tarde");
                
                if(temperatura>30){
                    System.out.println("Hoy si que caliente");
                }//Fin if
                else if(temperatura>= 25){
                    System.out.println("Esta agradable");
                }
                else{
                    System.out.println("A ponerse chumpa por que esta frio!!!");
                }
                break;
            case 'n':
                System.out.println("Es de noche");
                
                if(temperatura>19){
                    System.out.println("Hoy si dormimos asados");
                }//Fin if
                else if(temperatura>= 16){
                    System.out.println("Noche agradable");
                }
                else{
                    System.out.println("Dormiremos con frio!!!");
                }
                break;
                
            default:
                System.out.println("Mala seleccion..no existe opcion");
                break;
        }//Fin del Switch
        
        /*
        //Opcion 2
        if(tiempoDia == 'm'){
        System.out.println("Midiendo por la maniana");
            if(temperatura>23){
                    System.out.println("Hoy si que amanecio caliente");
                }
                else if(temperatura>= 20){
                    System.out.println("Amanecio agradable");
                }
                else{
                    System.out.println("A ponerse chumpa por que esta frio!!!");
                }
        }
        else if(tiempoDia =='t'){
        System.out.println("Estamos por la tarde");
        }
        else if(tiempoDia =='n'){
        System.out.println("Es de noche");
        }
        else{
        System.out.println("Mala seleccion..no existe opcion");
        }
         */
        
        
    }//Fin Main
    
}//Fin Class
