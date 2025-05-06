/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedioperiodo;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class PromedioPeriodo {

    /**
     * Programacion Estructurada
     * 1. Estructura Secuencial -> Despertar, Comer, Aseo Personal, Arreglarse,  y Salir
     * 2. Estructura Seleccion -> DiaSemana: Vestimenta Formal, sino FindeSemana: VestimentaInformal
     *      a. Simple
     *      b. Doble
     *      c. Anidado
     *      d. Multiple
     * 3. Estructura Repeticion ->  Ciclos de Trabajo
     * 
     * Programcion Orientada Objetos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            < menor
            > mayor
            <= menor o igual
            >= mayor o igual
            == igual
            != distinto
        
        
        if(genero == "Femenino"){
            //Segmento Verdadero
            //Ejecuta todo este bloque
        }
        else{
            //Segmento Falso
            //Ejecuta este bloque
        }
        */
        
        /*
        Elaborar un programa que le permita ingresar el acumulativo 
        (no más de 50 puntos) y la nota de examen (no más de 50 puntos) 
        de un estudiante de las tres clases que está llevando y que con 
        ello pueda calcular el promedio del período. Se muestra en pantalla 
        el acumulativo y nota de examen de cada una de las clases y el 
        promedio final.
        */
        Scanner scan = new Scanner(System.in);
        int acumI = 0;
        int examI = 0;
        int notaFinalI = 0;
        
        System.out.print("Clase 1 ->Acumulativo: ");
        acumI = scan.nextInt();
        
        //Estructura de Seleccion Simple        
        if(acumI >50){
            System.out.println("Acumulativo no puede ser mas de 50");
            acumI = 50;
        }
        
        System.out.print("Clase 1 ->Examen: ");
        examI = scan.nextInt();
        //Estructura de Seleccion Simple
        if(examI >50){
            System.out.println("Examen no puede ser mas de 50");
            examI = 0;
        }
        notaFinalI = acumI + examI;
        
        System.out.printf("Clase 1 ->Nota Final: %d",notaFinalI);
        
           if(notaFinalI >= 70){
            System.out.println("Aprobado!!!!");
        }else
        {
            System.out.println("Reprobado!!!!!");
        } //Estructura de Seleccion DOBLE
    
        /*
        OPCION 2
        if(notaFinalI < 70){
            System.out.println("Reprobado!!!!");
        }else
        {
            System.out.println("Aprobado!!!!!");
        }
        */
        
    }//Fin Main
    
}//Fin Class
