/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglobidimensional_funciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class ArregloBidimensional_FUNCIONES {
    //Variables Globales
    static final int FILAS = 5;
    static final int COLUM = 5;
    static int[][] matrizOriginal = new int[FILAS][COLUM];
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char opcion = '@';
                        
        int[] sumaFila = new int[FILAS];
        int[] sumaColum = new int[COLUM];
        int sumaDiagonal =0;
        int sumaDiagonalINV = 0;
        boolean estadoPrograma = true;
        
        do{
           
            GenerandoNumerosAleatorios();
       
            opcion = DesplegarMenu();
        
        //Tarea 2
        switch (opcion) {
            case 'A':
                MostrarMatrizOriginal();
                sumaFila = SumarValoresMatriz("Fila", FILAS);
                
                MostrarResultados("Fila",FILAS, sumaFila);
                break;
            
            case 'B':
                
                MostrarMatrizOriginal();
                
                sumaColum = SumarValoresMatriz("Columnas", COLUM);
                
                MostrarResultados("Columnas",COLUM, sumaColum);
               
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

    }//Fin de Main
    
    //1ra Variante de Tipo de Funcion, sin retorno sin parametros
    static public void GenerandoNumerosAleatorios(){
        Random rd = new Random();
        //Generacion de Valores Aleatorios para la Matriz
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUM; j++) {
                    matrizOriginal[i][j] = rd.nextInt(100);
                }//Fin FOR para COLUMNAS
            }//Fin FOR para FILAS
        
    }//Fin Funcion
    
    static public void MostrarMatrizOriginal(){
        
        //Mostrar Resultado
        System.out.println("Matriz De Valores");
        System.out.println("\tCOL 0\tCOL 1\tCOL 2\tCOL 3\tCOL 4");
        for (int i = 0; i < FILAS; i++) {
            System.out.printf("Fila %d:",i);
            for (int j = 0; j < COLUM; j++) {
                System.out.printf("\t%d",matrizOriginal[i][j]);
            }//Fin FOR para COLUMNAS
            System.out.println("");
        }//Fin FOR para FILAS
        
    }//Fin Funcion
    
    //2da Variante de Tipo de Funcion, con retorno, sin parametros
    static public char DesplegarMenu(){
        Scanner sc = new Scanner(System.in);
        
        char resultado='@';
        
        System.out.println("Indique la operacion a realizar");
        System.out.println("A. Sumar Filas");
        System.out.println("B. Sumar Columnas");
        System.out.println("C. Sumar Diagonal");
        System.out.println("D. Sumar Diagonal Inversa");
        System.out.println("E. Salir de Programa");
        System.out.print("Teclee su opcion: ");
        resultado = sc.next().toUpperCase().charAt(0);
        
        return resultado;       
    }//Fin Funcion Desplegar Menu
    
    //3ra Variante de Tipo de Funcion, con retorno y con parametros
    static public int[] SumarValoresMatriz(String tipoSuma, int dimension){
        int[] suma = new int[dimension];
        
                //Sumando Filas
                for (int i = 0; i < dimension; i++) {
                    for (int j = 0; j < COLUM; j++) {
                        if(tipoSuma.equals("Fila")){
                            suma[i] += matrizOriginal[i][j];
                        }
                        else{
                            suma[j] += matrizOriginal[i][j];
                        }
                        
                    }//Recorrido de Columnas
                }//Recorrido de Filas
        
        return suma;
    }
    
    //4ta Variante de Tipo de Funcion, sin retorno con parametros
    static public void MostrarResultados(String tipoSuma, int dimension, int[]arreglo){
        for (int i = 0; i < dimension; i++) {
            System.out.printf("%s %d: %d\n",tipoSuma,i,arreglo[i]);
        }
    }//Fin Funcion Mostrar Resultados
    
}//Fin Class
