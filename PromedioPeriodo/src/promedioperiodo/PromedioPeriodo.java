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
        
        int acumII = 0;
        int examII = 0;
        int notaFinalII = 0;
        
        int acumIII = 0;
        int examIII = 0;
        int notaFinalIII = 0;
        
        double promedioPeriodo = 0;
        
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
//-----------------------------------------------------------------------------
        System.out.print("Clase 2 ->Acumulativo: ");
        acumII = scan.nextInt();
        
        //Estructura de Seleccion Simple        
        if(acumII >50){
            System.out.println("Acumulativo no puede ser mas de 50");
            acumII = 50;
        }
        
        System.out.print("Clase 2 ->Examen: ");
        examII = scan.nextInt();
        //Estructura de Seleccion Simple
        if(examII >50){
            System.out.println("Examen no puede ser mas de 50");
            examII = 0;
        }
//--------------------------------------------------------------------------------
        System.out.print("Clase 3 ->Acumulativo: ");
        acumIII = scan.nextInt();
        
        //Estructura de Seleccion Simple        
        if(acumIII >50){
            System.out.println("Acumulativo no puede ser mas de 50");
            acumIII = 50;
        }
        
        System.out.print("Clase 3 ->Examen: ");
        examIII = scan.nextInt();
        //Estructura de Seleccion Simple
        if(examIII >50){
            System.out.println("Examen no puede ser mas de 50");
            examIII = 0;
        }
//-----------------------------------------------------------------------------
        //Calculo de Notas
        notaFinalI = acumI + examI;
        notaFinalII = acumII + examII;
        notaFinalIII = acumIII + examIII;
        
        promedioPeriodo = (notaFinalI + notaFinalII + notaFinalIII)/3; 
        
        System.out.printf("Clase 1 ->Nota Final: %d\t",notaFinalI);
        //Estructura de Seleccion DOBLE
        
        if(notaFinalI >= 70){
            System.out.println("Aprobado!!!!");
        }
        else
        {
            System.out.println("Reprobado!!!!!");
        }
    
        /*
        OPCION 2
        if(notaFinalI < 70){
            System.out.println("Reprobado!!!!");
        }else
        {
            System.out.println("Aprobado!!!!!");
        }
        */
        
        System.out.printf("Clase 2 ->Nota Final: %d\t",notaFinalII);
        //Estructura de Seleccion DOBLE
        
        if(notaFinalII >= 70){
            System.out.println("Aprobado!!!!");
        }
        else
        {
            System.out.println("Reprobado!!!!!");
        }
        
        
        System.out.printf("Clase 3 ->Nota Final: %d\t",notaFinalIII);
        //Estructura de Seleccion DOBLE
        
        if(notaFinalIII >= 70){
            System.out.println("Aprobado!!!!");
        }
        else
        {
            System.out.println("Reprobado!!!!!");
        }
        
        System.out.printf("El promedio del periodo fue: %.2f",promedioPeriodo);
        if(promedioPeriodo >=95){
            System.out.println("Summa Cum Laude");
        }
        else if(promedioPeriodo >=90){
            System.out.println("Magna Cum Laude");
        }
        else if(promedioPeriodo >=85){
            System.out.println("Cum Laude");
        }
        else
        {
            System.out.println("Tenes mas de 70");
        }
    }//Fin Main
    
}//Fin Class
