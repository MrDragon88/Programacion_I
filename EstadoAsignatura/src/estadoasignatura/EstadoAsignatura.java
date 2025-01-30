/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estadoasignatura;

import java.util.Scanner;

/**
 * 
 * @author Oscar Andrade
 */

/*
    1. Estructuras Secuenciales
    2. Estructuras Condicionales/Seleccion
        a. Simple
        b. Dobles
        c. Multiples / Anidadas
    3. Estructuras de Repeticion
        a. while
        b. do ..while
        c. for
        d. foreach
*/
public class EstadoAsignatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Desarrollar un algoritmo que me permita
            determinar si he aprobado o reprobado la materia
            de programacion I con el Ing Andrade.
        */
       Scanner scan = new Scanner(System.in);
       int acumI = 0;
       int acumII = 0;
       int examenI = 0;
       int examenII = 0;
       int notaFinal = 0;
       
        System.out.print("Ingrese Nota Acumulativa 1er Parcial (Max. 25): ");
        acumI = scan.nextInt();
        System.out.print("Ingrese Nota Acumulativa 2do Parcial (Max. 25): ");
        acumII = scan.nextInt();
        System.out.print("Ingrese Nota Examen 1er Parcial (Max. 25): ");
        examenI = scan.nextInt();
        System.out.print("Ingrese Nota Examen 2do Parcial (Max. 25): ");
        examenII = scan.nextInt();
       
        notaFinal = acumI + acumII + examenI + examenII;
        System.out.printf("\nSu nota Final es: %d",notaFinal);
        System.out.println("\nSu nota final es: "+notaFinal);
        
        if(notaFinal >=65){
            System.out.println("Aprobaste");
        }
        else{
            System.out.println("Reprobaste");
        }
        
    }//Fin Main
    
}//Fin Class
