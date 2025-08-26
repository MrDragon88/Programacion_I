/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclofor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class CicloFor {

    /**
     * Ciclo For
     * 1. Valor Inicial
     * 2. Condicion
     * 3. Modificador
     * 4. Instrucciones Repeticion
     * 
     * Ingreso de Notas de tres parciales y obtner el promedio
     * para determinar si aprobó o no la materia.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random  rd = new Random();
        
        double promedio = 0;
        int notaIngresada = 0;
        int acumuladorNota = 0;
        String nombreEstudiante = "John Wick";
        String nombreMateria = "Guns!!";
        
        System.out.print("Nombre del Estudiante: ");
        nombreEstudiante = input.nextLine().toUpperCase();
        
        System.out.print("Nombre de la Asignatura: ");
        nombreMateria = input.nextLine().toUpperCase();
        System.out.println("");
        for(int i =0 ; i<3 ; i++){
            //Instrucciones a Repetir
            notaIngresada = rd.nextInt(101);
            System.out.printf("Ingrese Nota %d: %d",i+1,notaIngresada);
            //notaIngresada = input.nextInt();
            
            //System.out.printf("%nNumero Random: %d",notaIngresada);
            acumuladorNota +=notaIngresada;
            System.out.println("");
        }//Fin Ciclo For
        promedio = acumuladorNota / 3;
        System.out.printf("%nEstudiante: %s",nombreEstudiante);
        System.out.printf("%nMateria: %s",nombreMateria);
        System.out.printf("%nPromedio: %.2f",promedio);
    }//Fin Main
    
}//Fin Class
