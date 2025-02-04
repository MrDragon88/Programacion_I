/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructuraseleccionmultiple;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class EstructuraSeleccionMULTIPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Me solicitan un algoritmo en la que debemos seleccionar un
            numero del 1 al 7 y me diga algo especial de ese día.
        */
        
        Scanner scan = new Scanner(System.in);
        int numeroSeleccionado = 0;
        
        System.out.print("Ingrese un numero del 1 - 7: ");
        numeroSeleccionado = scan.nextInt();
        
        /*
            Un entero y un caracter....se puede con una palabra tambien
        */
        
        switch (numeroSeleccionado) {
            

            case 1:
                System.out.println("Domingo 1er Dia de la Semana");
                break;
            case 2:
                System.out.println("Lunes 2do dia de la Semana");
                break;
            case 3:
                System.out.println("Martes 3er dia de la Semana");
                break;
            case 4:
                System.out.println("Miercoles 4to dia de la Semana");
                break;
            case 5:
                System.out.println("Jueve 5to dia de la Semana");
                break;
            case 6:
                System.out.println("Viernes 6to dia de la Semana");
                break;
            case 7:
                System.out.println("Sabado 7mo y ultimo dia de la semana");
                break;
            default:
                System.out.println("Ingresar un numero valido entre el 1 y 7");
                break;
        }//Fin de Switch
        
        
    }//Fin Main
    
}//Fin Class
