/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class ArreglosBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final int DIM = 3;
        final int COL = 4;
        final int FIL = 3;
        
        String[] estudiante = new String[DIM];//Arreglo Unidimensional
        double[] promedio = new double[DIM];//Arreglo Unidimensional
        int[][] notas = new int[FIL][COL];//Arreglo BIdimensional
        
        for (int i = 0; i < DIM; i++) {
            
            System.out.print("Ingresa tu nombre: ");
            estudiante[i]=scan.nextLine().toUpperCase();
        }//Fin de Ciclo FOR
        
        System.out.println("");
        
        for (int i = 0; i < FIL; i++) {
            System.out.printf("Ingreso de Notas del Estudiante %s",estudiante[i]);
            System.out.println("\n-----------------------------------------------");
            
            //Acum I, Acum II, Examen I, Examen II
            for (int j = 0; j < COL; j++) {
                System.out.printf("Nota %d:",j+1);
                notas[i][j] = scan.nextInt();
            }//Fin Ciclo FOR a nivel de FILAS
            System.out.println("------------------------------------------------\n");
            
        }//Fin Ciclo FOR a nivel de FILAS
        promedio = CalculoPromedio(notas);
        //MostrarEstudiantes(estudiante);
        //MostrarNotas(estudiante, notas);
        MostrarPromedio(promedio);
    }//Fin de Main
    
    public static void MostrarEstudiantes(String[] nombre){
        
         for (int i = 0; i < nombre.length; i++) {
             System.out.printf("Estudiante %d: %s",i+1,nombre[i]);
             System.out.println("");
        }
    }//Fin de Funcion MostrarEstudiantes
    
    public static void MostrarNotas(String[] nombre, int[][] parciales){
        for (int i = 0; i <parciales.length ; i++) {
            System.out.printf("Estudiante %s\t",nombre[i]);
            for (int j = 0; j <parciales[i].length; j++) {
                System.out.printf("Nota %d: %d\t",j+1,parciales[i][j]);
            }//Fin Ciclo FOR Columna
            System.out.println("");
        }//Fin Ciclo FOR Fila
    }//Fin Funcion MostrarNotas
    
    public static double[] CalculoPromedio(int[][] parciales){
        int dimension = parciales.length;//Dimension del # Filas
        double[] promedioTEMP = new double[dimension];
        int acumulador = 0;
        
        for (int i = 0; i < parciales.length; i++) {
            for (int j = 0; j < parciales[i].length; j++) {
                acumulador += parciales[i][j];
            }
            promedioTEMP[i]= acumulador / parciales[i].length;
            acumulador = 0;
        }
        
        return promedioTEMP;
        
    }//Fin Funcion Calculo Promedio

    public static void MostrarPromedio(double[] prom){
        for (int i = 0; i < prom.length; i++) {
            System.out.printf("Promedio %d: %.2f",i+1,prom[i]);
            System.out.println("");
        }
    }//Fin Funcion Promedio
}//Fin de Class
