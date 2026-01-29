/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadoclase;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class EstadoClase {

    /**
     * @param args the command line arguments
     * 
     * Estructuras de Seleccion
     * 1. Simple    if
     * 2. Doble     if/else
     * 3. Multiple  switch
     * 4. Anidado   una seleccion dentro de otra seleccion
     * 
     * Palabra Clave (Condicion) {
     *  Grupo de Instrucciones
     *  dentro de llaves
     * }
     * 
     * La condicion no termina con un ;
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int notaFinal = 0;
        
        System.out.print("Ingresa la nota de Progra:");
        notaFinal = scan.nextInt();
        /*
            Condicion
            >      mayor
            <       menor
            >=      mayor o igual
            <=      menor o igual
            ==      igual
            !=      distinto
        */
        //1ra Etapa
        //Booleano ->Dato Logico que solo puede tener
        // true ->verdadero
        // false ->falso
        /*
        //if(notaFinal >= 60)
        if(notaFinal <= 60) //Devuelve un estado booleano
        {
            //Condicion Verdadero
            //System.out.println("Aprobado");
            System.out.println("Reprobado");
        }
        else{
            //Condicion Falsa
            //System.out.println("Reprobado");
            System.out.println("Aprobado");
            
                
        }
        */
        if(notaFinal >= 60)//Devuelve un estado booleano
        {
            //Condicion Verdadero
            System.out.println("Aprobado");
            
            if(notaFinal >=90){
                System.out.println("Excelente");
            }//IF de nota arriba de 90
            else if(notaFinal >= 80){
                System.out.println("Muy bueno");
            }
            else if(notaFinal >=70) {
                System.out.println("Bueno");
            }
            else{
                System.out.println("Bien pero puedes mejorar");
            }
            
        }//If de Aprobado   
            
        
        else{
            //Condicion Falsa
            System.out.println("Reprobado");         
        }
        /*
            Un signo igual (=)-> es para asignar
            Dos signos de igualdad (==) -> es para comparar
        */
        
    }//Fin de Main
    
}//Fin de Clase
