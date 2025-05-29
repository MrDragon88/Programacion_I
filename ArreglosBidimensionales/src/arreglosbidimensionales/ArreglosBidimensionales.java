/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosbidimensionales;

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
        final int FILA = 3;
        final int COLUM = 4;
        char[][] matriz = new char[FILA][COLUM];
        
        //Fila 1 - Columna 1 - 4
        matriz[0][0] = 'A';
        matriz[0][1] = 'B';
        matriz[0][2] = 'C';
        matriz[0][3] = 'D';
        
        //Fila 2 - Columna 1 - 4
        matriz[1][0] = 'E';
        matriz[1][1] = 'F';
        matriz[1][2] = 'G';
        matriz[1][3] = 'H';
        
        //Fila 3 - Columna 1 - 4
        matriz[2][0] = 'I';
        matriz[2][1] = 'J';
        matriz[2][2] = 'K';
        matriz[2][3] = 'L';
     
        
        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COLUM; j++) {
                System.out.printf("%c\t",matriz[i][j]);
            }//Recorrido de la Columna
            System.out.println("");
        }//Recorrido de la Fila
    }//Fin Main
    
}//Fin Class
