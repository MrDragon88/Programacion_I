/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedionotas;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class PromedioNotas {
    
    /*
        Estructura Secuencia
        Estructura de Seleccion
            Simple (if)
            Doble   (if/else)
            Multiple (switch)
            Anidado (Mixto)
        Estructura de Repeticion
            While
                Finito
                "Infinito"
            Do....While
                Finito
                "Infinito"
            For
                Finito
    */
    
    /*
            Estructura del While (Se ejecuta mientras la condicion sea TRUE)
            1. Valor Inicial
            2. Condicion a Evaluar
            3. Modificador de la Condicion
    */

    /**
     * Se necesita un algortimo que permita calcular el promedio
     * de cada uno de los estudiantes de la seccion de program I.
     * Son en total 5 estudiantes.
     * 
     * La asignatura consta de 3 notas parciales, valorados en 100%
     * cada uno.
     * mostrar el promedio de cada estudiante.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        //Variables
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        
        double promedio =0;
        int numEstudiantes = 0;
        //Ciclo de Repeticion
        while(numEstudiantes<5){
            //Todas instrucciones a repetir
            System.out.printf("%nEstudiante %d: ",numEstudiantes+1);
            
                System.out.println("");
                System.out.print("Nota 1: ");
                nota1 = scan.nextDouble();
                System.out.print("Nota 2: ");
                nota2 = scan.nextDouble();
                System.out.print("Nota 3: ");
                nota3 = scan.nextDouble();

                promedio = (nota1 + nota2+ nota3)/3;

                System.out.printf("%nEl promedio es: %.2f",promedio);

        numEstudiantes++;//Sumar de 1 en 1
        }//Fin While
        
       
    }//Fin Main
    
}//Fin Class
