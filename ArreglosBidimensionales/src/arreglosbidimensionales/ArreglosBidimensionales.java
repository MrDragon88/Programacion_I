/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class ArreglosBidimensionales {

    /**
     * @param args the command line arguments
     */
    /*
        Desarrollar un algoritmo que me permita almacenar
        en una matriz, numeros ingresados de manera aleatorioa.
        En la cual, se ejecuta cualquiera de las siguientes 
        opciones.
        1. Suma de Filas
        2. Suma de Columnas
        3. Multiplicación de Diagonal
    
        Mostrar el resultado el final de la operacion y la matriz
        de donde se toman los valores.
    
        El programa se detiene cuando el usuario lo diga.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        char opcion = '@';
        
        final int FILAS = 5;
        final int COLUM = 5;
        
        int[][] matrizOriginal = new int[FILAS][COLUM];
        /*      COL 0   COL 1   COL 2   COL3     COL4 
        FILA 0   (0,0)  (0,1)   0,2     0,3      0,4   
        FILA 1    1,0   1,1     1,2     1,3      1,4  
        FILA 2
        FILA 3
        FILA 4
        */
                       
        int[] sumaFila = new int[FILAS];
        int[] sumaColum = new int[COLUM];
        int sumaDiagonal =0;
        int sumaDiagonalINV = 0;
        boolean estadoPrograma = true;
        do{
            
                    //Tarea 1
        //Generacion de Valores Aleatorios para la Matriz
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUM; j++) {
                matrizOriginal[i][j] = rd.nextInt(100);
            }//Fin FOR para COLUMNAS
        }//Fin FOR para FILAS
        
        //Bonus
        //Mostrar Resultado
        System.out.println("Matriz De Valores");
        System.out.println("\tCOL 0\t COL 1\t COL 2\t COL 3\t COL 4");
        for (int i = 0; i < FILAS; i++) {
            System.out.printf("Fila %d:",i);
            for (int j = 0; j < COLUM; j++) {
                System.out.printf("\t%d",matrizOriginal[i][j]);
            }//Fin FOR para COLUMNAS
            System.out.println("");
        }//Fin FOR para FILAS
        
        System.out.println("Indique la operacion a realizar");
        System.out.println("A. Sumar Filas");
        System.out.println("B. Sumar Columnas");
        System.out.println("C. Sumar Diagonal");
        System.out.println("D. Sumar Diagonal Inversa");
        System.out.println("E. Salir de Programa");
        System.out.print("Teclee su opcion: ");
        opcion = sc.next().toUpperCase().charAt(0);
        
        //Tarea 2
        switch (opcion) {
            case 'A':
                //Tarea 3
                //Sumando Filas
                for (int i = 0; i < sumaFila.length; i++) {
                    for (int j = 0; j < COLUM; j++) {
                        sumaFila[i] += matrizOriginal[i][j];
                    }//Recorrido de Columnas
                }//Recorrido de Filas
                
                //Mostrar Resultados
                //Mostrar Matriz Original
                System.out.println("Matriz De Valores");
                System.out.println("\tCOL 0\tCOL 1\tCOL 2\tCOL 3\tCOL 4");
                for (int i = 0; i < FILAS; i++) {
                    System.out.printf("Fila %d:",i);
                    for (int j = 0; j < COLUM; j++) {
                        System.out.printf("\t%d",matrizOriginal[i][j]);
                    }//Fin FOR para COLUMNAS
                    System.out.println("");
                }//Fin FOR para FILAS
                
                //Mostrar Filas Sumadas
                for (int i = 0; i < FILAS; i++) {
                    System.out.printf("Fila %d: %d\n",i,sumaFila[i]);
                    
                }
                break;
            
            case 'B':
                //Tarea 4
                //Sumar Columnas
                
                for (int i = 0; i < FILAS; i++) {
                    for (int j = 0; j < COLUM; j++) {
                        sumaColum[j] +=matrizOriginal[i][j];
                        //  sumaColum[i] +=matrizOriginal[j][i];
                       // System.out.printf("F: %d\tC:%d\tValor:%d\t IndiceSumCol%d ValorSumaCol:%d",
                       //                     i,  j,      matrizOriginal[i][j],j,     sumaColum[j]);
                        
                        //System.out.println("");
                    }//Recorrido Columnas
                }//Recorrido de Filas
                
                //Mostrar Filas Sumadas
                for (int i = 0; i < COLUM; i++) {
                    System.out.printf("Columna %d: %d\n",i,sumaColum[i]);
                    
                }
                break;
            
            case 'C':
                for (int i = 0; i < FILAS; i++) {
                    sumaDiagonal += matrizOriginal[i][i];
                }//Fin de Recorrido Fila
                System.out.println("Valor de Diagonal: "+sumaDiagonal);
                break;
            
            case 'D':
                for (int i = 0; i < FILAS; i++) {
                    sumaDiagonalINV += matrizOriginal[i][COLUM -1 - i];
                }//Fin de For
                System.out.println("Suma Diagonal Inversa: "+sumaDiagonalINV);
                break;
                
            case 'E':
                estadoPrograma = false;
                break;
            default:
                System.out.println("Opcion no valida...ingrese nuevamente");
        }//Fin Switch
            
        }while(estadoPrograma);

    }//Fin Main
    
}//Fin Class
