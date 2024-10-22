/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 * @version 1.0
 * @date 18/oct/2024
 * 
 * Estructuras Condicionales (if...else)
 * a. Simple
 * b. Doble
 * c. Anidadas
 * d. Multiple
 * 
 * En las estructuras condicionales, se evalúa una condición
 * a. >  Mayor que
 * b. <  Menor que
 * c. >= Mayor o igual que
 * d. <= Menor o igual que
 * e. == Igualdad
 * f. != Distinto
 * 
 * Resultado de dicha condición evaluada va a brindar cualquiera 
 * de los dos posibles estados:
 * a. true (verdadero)
 * b. false (false)
 * boolean
 */
public class Temperatura {

    /**
     * Realizar un algoritmo que permita determinar si una persona
     * tiene fiebre o no. Si la persona tiene fiebre, clasificar su estado
     * de gravedad.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        temp > 37.5 => tiene fiebre
        temp > 39 => tiene fiebre alta
        temp >40.5 => tiene fiebre muy muy alta
        temp >42 => Hospitalizacion
        */
        Scanner scan = new Scanner(System.in);
        double tempTomada = 0.0;
        
        System.out.println("Temperatura Leida en el termometro digital");
        tempTomada = scan.nextDouble();
        //Doble 
        if(tempTomada >37.5){
            //Ejecutar el Bloque Verdadero
            System.out.println("Tiene temperatura la persona!!");
            //Anidado
            //Multiple
            if(tempTomada >= 42){
                System.out.println("Urgencia...tiene que ser hospitalizado");
            }
            else if(tempTomada >=40.5){
                System.out.println("Tiene fiebre muy muy alta....ya convulsiona!!");
            }
            else if(tempTomada>=39){
                System.out.println("Tiene fiebre Alta");
            }
            else
            {
                System.out.println("Tiene Fiebre");
            }
        } 
        else{
            //Ejecutar el Bloque Instrucciones con la Condición FALSE
            System.out.println("Demos gracias a Dios que estamos bien!!");
        }
        
       
    }//Fin Main
    
}//Fin Class
