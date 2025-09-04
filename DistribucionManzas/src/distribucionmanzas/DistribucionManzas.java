/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distribucionmanzas;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class DistribucionManzas {

    /**
     * Desarrollar un algoritmo que se ingresen el numero de manzanas
     * que hay en las diferentes cestas y que serán distribuidas
     * entre el numero de personas que estén allí presente almomento de 
     * abrir la cesta.
     * 
     * 5 cestas -
     * a. 10 manzanas
     * b. 6 manzanas
     * c. 7 manzanas
     * d. 3 manzanas
     * e. 1 manzana
     * 
     * try...catch......finally
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        final int NUMERO= 3;
        int[] cestas = new int[NUMERO];
        int numPersonas = 0;
        double resultado = 0;
        
            System.out.println("Ingresemos el # de manzanas en cada cesta");
        for (int i = 0; i < NUMERO; i++) {
            System.out.printf("Cesta # %d:",i+1);
            cestas[i]= scan.nextInt();
        }//Fin ciclo For
        
        System.out.println("\n-------------------");
        
        for (int i = 0; i < 5; i++) {
            try{
                System.out.printf("Cuantas personas hay en la tanda %d: ",i+1);
                numPersonas = scan.nextInt();
            
                resultado = cestas[i]/numPersonas;
            
                System.out.printf("Le tocan %.2f manzanas a cada persona",resultado);
                System.out.println("\n");
            }catch(InputMismatchException e){
                System.out.println("Error: "+e);
                System.err.print(e);
                scan.next();  
                System.out.println("");
            }catch(ArrayIndexOutOfBoundsException e){
                System.err.print("Error: "+e);
                System.out.println("");
                i = 5;
                break;
            }catch(ArithmeticException e){
                System.err.print("Error: "+e);
                System.out.println("No se puede dividir por cero!!!");
                i--;
            }catch(Exception e){
                System.err.print("Error: "+e);
                System.out.println("NullPointerException");
                System.out.println("IOException");  
            }finally{
                System.out.println("Esta es una instruccion que se ejecuta"
                        + "Siempre, no importa si hay un try exitoso o un catch"
                        + "fallido");
            }
            
        }
    }//Fin Main
    
}//Fin Class
