/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosbidimensionales;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class ArreglosBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        final int FILAS = 5;
        final int COLUMNAS = 5;
        char[][] letras = new char[FILAS][COLUMNAS];
        
        //Fila Primera
        letras[0][0]='a';
        letras[0][1]='b';
        letras[0][2]='c';
        letras[0][3]='d';
        letras[0][4]='e';

        //Fila Segunda
        letras[1][0]='a';
        letras[1][1]='b';
        letras[1][2]='c';
        letras[1][3]='d';
        letras[1][4]='e';

        //Fila Tercera
        letras[2][0]='a';
        letras[2][1]='b';
        letras[2][2]='c';
        letras[2][3]='d';
        letras[2][4]='e';

        //Fila Cuarta
        letras[3][0]='a';
        letras[3][1]='b';
        letras[3][2]='c';
        letras[3][3]='d';
        letras[3][4]='e';

        //Fila Quinta
        letras[4][0]='a';
        letras[4][1]='b';
        letras[4][2]='c';
        letras[4][3]='d';
        letras[4][4]='e';
        
        for(int i = 0 ; i<FILAS;i++){
            System.out.printf("Fila %d\n",i+1);
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.printf("[%d][%d]: %s\n",i,j,letras[j][i]);
            }//Fin Columnas
            System.out.println("");
        }//Fin Fila

        /*
            1. Elabore un algoritmo para que un arreglo de tamaño 10,
                se almacenen 10 numeros, luego se quiere mostrarlos en pantalla
                pero presentando al reves.
        
        Ej: 
            5   10  60  80  70  10  60  40  60  100
            100 60  40  60  10  70  80  60  10  5
            
            2. Elaborar un algoritmo que permita agregar cualquier cantidad de 
                marcas de vehículos en un arreglo dinamico, mostrar en pantalla aquel que 
                yo desee, en la que se le indica el rango permitido de valores
                al usuario.
                
        
        
        */
        
        /*
            Esquema para crear un arreglo bidimensional, con dimensiones
            definidas por el usuario al momento de ejecutar el algoritmo.
        
        int filas;
        System.out.println("Ingrese dimension de filas");
        filas = scan.nextInt();
        
        int columnas;
        System.out.println("Ingrese dimension de columnas");
        columnas = scan.nextInt();
        int[][] numeros = new int[filas][columnas];
        */

    }//Fin Main
    
}//Fin Class
