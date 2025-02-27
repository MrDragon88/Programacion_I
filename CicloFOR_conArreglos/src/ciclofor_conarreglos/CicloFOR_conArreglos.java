/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclofor_conarreglos;

/**
 *
 * @author Oscar Andrade
 * 
 * Estructuras de Secuencia
 * Estructuras de Seleccion/Condicion
 *  Simple
 *  Doble
 *  Multiple
 *  Anidada
 * Estructuras de Repeticion
 *  While
 *  Do....While
 *  For
 *  
 * Cuerpo de una Estructurad de Repeticion
 *  Condicion Evaluar
 *  Instrucciones que se Repiten
 *  Modificador de la Condicion
 */
public class CicloFOR_conArreglos {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // TODO code application logic here
               
        /*
        for(int nota=0 ; nota <5 ; nota++){
            //Instrucciones que se repiten
        }
        */
        /*
            1. Valor Inicial
            2. Valor Final
            3. Pasos
        */
        
        //Contar del 1 al 10
        for(int i = 1 ; i<=10 ; i++){
            System.out.printf("Iteracion: %d",i);
            System.out.println("");
        }//Fin Ciclo For
        
        //Contar del 1 al 20, de dos en dos
        for (int i = 2; i <= 20; i +=2) {
            System.out.printf("%d",i);
            System.out.println("");
        }//Fin Ciclo For
        
        //Contar del 20 al 1 de uno en uno
        for (int i = 20; i > 0; i--) {
            System.out.printf("Posicion: %d\n",i);
            
        }//Fin Ciclo For
        
        /*
            Variables del Tipo Local
            Variables del Tipo Goblal
            Variables del Tipo Temporal
            Variables del Tipo Estatico
        */
        /*
            *
            * *
            * * *
            * * * *
            * * * * *
        
        */
        //i = numeros filas
        //j = numero de Columna
        
        for (int fila = 1; fila <= 5; fila++) {
            System.out.printf("\n%d) ",fila);
            for (int columna = 0; columna < fila; columna++) {
                System.out.print(" * ");
            }//Fin Ciclo For COLUMNA
        }//Fin Ciclo For FILAS
        
        /*
            * * * * *
            * * * *
            * * *
            * *
            *
        
        */
        /*
            * * * * *
              * * * *
                * * *
                  * *
                    *
        
                    *
                  * *
                * * *
              * * * *
            * * * * *
        */
        
    }//Fin Main
    
}//Fin Class
