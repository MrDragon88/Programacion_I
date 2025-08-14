/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Notas {

    /**
     * Estructura Secuencia
     * Estructuras de Seleccion
     *  Simple
     *  Doble
     *  Multiple
     *  Anidada
     * 
     * Estructuras de Repeticion
     *  While
     *      Finita
     *      Infinita
     *  Do...while
     *      Finita
     *      Infinita
     *  For
     *      Finita
     * 
     */
    
    
    /*
        Estructura de los Ciclos Repeticion
            1. Valor Inicial
            2. Condicion de Evaluacion
            3. Valor Modificador de la Condicion

    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            Desarrollar un algoritmo que me permita calcular
        el promedio de cada uno de los estudiantes de la seccion
        siendo un total de 5. Cada estudiante se somete a tres 
        examenes.
        */
        Scanner input = new Scanner(System.in);
        
        //Variables
        int notaExamen1 = 0;
        int notaExamen2 = 0;
        int notaExamen3 = 0;
        
        double promedioEstudiante = 0;
        
        //Variable que lleva la cuenta de cuantas veces 
        //se ha reptido el ciclo
        int numEstudiantes = 10;

//Ciclo de Repeticion
        while(numEstudiantes<=5){
           
            System.out.printf("Estudiante %d:",numEstudiantes+1);
            System.out.println("");
            
            
            //Instrucciones a Repetir
              System.out.print("Nota 1: ");
              notaExamen1 = input.nextInt();

              System.out.print("Nota 2: ");
              notaExamen2 = input.nextInt();

              System.out.print("Nota 3: ");
              notaExamen3 = input.nextInt();

              promedioEstudiante = (  
                                      notaExamen1 + 
                                      notaExamen2 + 
                                      notaExamen3
                                    )/3;
              System.out.printf("Promedio: %3.2f",promedioEstudiante);
              
              numEstudiantes++;//Sumando de 1 en 1
        }//Fin de While
        
        
        
        
        /*
            %d -> Enteros
            %f -> Decimales
            %s -> Cadenas
            %c -> Caracteres
            
        */
    }//Fin de Main
    
}//Fin de Class
