/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosbidimensionales_busquedanombre;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class ArreglosBidimensionales_BusquedaNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int FILA = 3;
        final int COLUM = 5;
        final int LIMITE =3;
        String[][] nombres = new String[FILA][COLUM];
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        String busqueda ="default";
        int posicionX = -1;
        int posicionY = -1;
        
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUM; j++) {
                nombres[i][j]="John Doe";
            }//Fin Fila
        }//Fin Columna
        
        nombres[0][0]="Pamela";
        nombres[0][1]="Nestor";
        nombres[0][2]="Catalina";
        nombres[0][3]="Salvador";
        nombres[0][4]="Kevin";
        
        nombres[1][0]="Roger";
        nombres[1][1]="Devin";
        nombres[1][2]="Jason";
        nombres[1][3]="Fernando";
        nombres[1][4]="Elideth";
        
        nombres[2][0]="Kenenn";
        nombres[2][1]="Xavier";
        nombres[2][2]="Fernanda";
        nombres[2][3]="Jose";
        nombres[2][4]="Daniel";
        
        while(contador<LIMITE){
            System.out.print("Que nombre buscas: ");
            busqueda = scan.next().toLowerCase();
            
            for (int i = 0; i < FILA; i++) {
                for (int j = 0; j < COLUM; j++) {
                    if(busqueda.equals(nombres[i][j].toLowerCase()))
                    {
                        posicionX = i;
                        posicionY = j;
                    }
                }
            }
            
            if(posicionX == -1){
                System.out.println("No se encontro el nombre");
            }
            else{
                System.out.printf("Nombre: %s\n",nombres[posicionX][posicionY]);
                System.out.printf("Posicion X: %d\tPosicionY: %d",posicionX,posicionY);
                posicionX = -1;
                posicionY = -1;
                System.out.println("");
            }
            contador++;
        }//Fin de While
        
    }//Fin Main
    
}//Fin Class
