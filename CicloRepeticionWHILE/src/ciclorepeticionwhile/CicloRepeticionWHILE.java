/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionwhile;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class CicloRepeticionWHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            Estructura de Secuencia
            Estructura de Seleccion
            Estructura de Repeticion
                a. While (Mientras)
                b. Do While (Hacer - Mientras)
                c. For (Para)
                d. Foreach -> recorrido en arreglos (javascript, python)
        */
        /*
            Esquema de las Estructuras de Repeticion
            a. Condicion
            b. Las instrucciones que se repiten.
            c. Modificador de la condicion
            
        */
        
        /*
        /*
            Elaborar un programa que le permita ingresar el acumulativo 
            (no más de 50 puntos) y la nota de examen (no más de 50 puntos) 
            de un estudiante de las tres clases que está llevando y que con 
            ello pueda calcular el promedio del período. Se muestra en pantalla 
            el acumulativo y nota de examen de cada una de las clases y el 
            promedio final.
        */
        Scanner scan = new Scanner(System.in);
        int acum = 0;
        int exam = 0;
        int notaFinal = 0;
        int acumulador = 0;
        int numeroClases = 0;
        
        double promedioPeriodo = 0;
        //Se ejecuta el ciclo de repeticion y se mantien en ejecucion
        //mientras la condicion sea verdadero...caso contrario deja de 
        //repetir las instruccion.
        
        while(numeroClases <3){
            //Instrucciones que se repiten
            System.out.printf("Clase %d ->Acumulativo: ",numeroClases+1);
            acum = scan.nextInt();
        
            //Estructura de Seleccion Simple        
            if(acum >50){
                System.out.println("Acumulativo no puede ser mas de 50");
                acum = 50;
            }

            System.out.printf("Clase %d ->Examen: ",numeroClases+1);
            exam = scan.nextInt();
            //Estructura de Seleccion Simple
            if(exam >50){
                System.out.println("Examen no puede ser mas de 50");
                exam = 0;
            }
            
            notaFinal = acum + exam;
            acumulador += notaFinal;

            //Modificador de la condicion
            numeroClases++;
        }//Fin de While
        
        promedioPeriodo = acumulador / 3;
        System.out.printf("\nNota Promedio: %.2f",promedioPeriodo);
    }//Fin Main
    
}//Fin Class
