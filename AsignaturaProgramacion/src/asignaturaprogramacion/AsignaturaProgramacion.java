/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asignaturaprogramacion;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class AsignaturaProgramacion {

    /***
     * El ing Andrade le ha pedido que desarrolle un algoritmo
     * que permita encontrar la nota final de la clase de Programacion I.
     * 
     * El esquema de evaluacion es de dos parciales de 50 puntos cada uno, de 
     * la cual 20 puntos corresponden a examen y 30 puntos al valor acumulativo;
     * esto para cada parcial.
     * 
     * Las notas que se ingresen no pueden ser más grande que límite establecido
     * y tampoco inferior a 0.
     * 
     * Mostrar un mensaje si aprobó (mas de 65) o no la clase de Programacion I 
     * al final del periodo.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int parcialI = 0;
        int parcialII = 0;
        int notaExamen = 0;
        int notaAcum = 0;
        
        int cicloParcial = 1;
        
        while(cicloParcial <=2){
            System.out.printf("\n* Nota del Parcial %d *",cicloParcial);
            System.out.println("\n**********************\n");
            
            do{
            System.out.printf("Nota Examen %d:\t",cicloParcial);
            notaExamen =scan.nextInt();
            /* 
                Operadores Booleanos
            
                AND (Y)     -> && = Salida Verdadero solamente si
                                    todas las entradas son verdaderas.
                                    Entrada 1   Entrada 2   Salida
                                    Verdadero   Verdadero   Verdadero
                                    Falso       Verdadero   Falso
                                    Verdadero   Falso       Falso
                                    Falso       Falso       Falso
            
                OR  (O)     -> || = Salida verdadera si al menos
                                    una entrada es verdadero.
                                    Entrada 1   Entrada 2   Salida
                                    Verdadero   Verdadero   Verdadero
                                    Falso       Verdadero   Verdadero
                                    Verdadero   Falso       Verdadero
                                    Falso       Falso       Falso
                NOT (INV)   -> !  = Salida contrario a la entrada.
            */
            
            //Opcion 1
                if(notaExamen >20 || notaExamen<0){
                    System.out.println("Nota no valida...tiene que ser ");
                    System.out.println("menor de 20 o mayor igual a 0");
                }else
                {
                    System.out.println("Nota Valida y Aceptada");
                }
            }while(notaExamen >20 || notaExamen<0);
            
            do{
                System.out.printf("Nota Acum %d:\t",cicloParcial);
                notaAcum =scan.nextInt();
            
                //Opcion 2
                if(notaAcum <=30 && notaAcum>=0){
                    System.out.println("Nota Valida y Aceptada");
                }else{
                    System.out.println("Nota no valida...tiene que ser ");
                    System.out.println("menor de 30 o mayor igual a 0");
                }
           
            }while(!(notaAcum <=30 && notaAcum>=0));
            
            if(cicloParcial ==1){
                parcialI = notaAcum+notaExamen;
            }
            else{
                parcialII = notaAcum+notaExamen;
            }
            cicloParcial++;//Modificador
        }//Fin de While
        
        System.out.printf("\nNota Parcial I: %d",parcialI);
        System.out.printf("\nNota Parcial II: %d",parcialII);
        System.out.println("");
    }//Fin de Main
    
}//Fin de Class
