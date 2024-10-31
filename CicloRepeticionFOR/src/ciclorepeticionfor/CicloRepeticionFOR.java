/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionfor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class CicloRepeticionFOR {

    /**
     * Ciclo de Repeticion FOR
     * a. Condicion
     * b. Instruccion Repeticion
     * c. Modificador
     * 
     * Que la condicion y el modificador estan een una sola linea.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int nota = 0;
        int sumaNotas = 0;
        final int NOTAMINIMA = 0;
        final int NOTAMAXIMA = 100;
        final int LIMITENOTAS = 3;
        double promedio = 0.0;
        
        for(int i = 0; i<LIMITENOTAS; i++){      
            nota = rand.nextInt(NOTAMINIMA, NOTAMAXIMA+1);
            sumaNotas +=nota;
            System.out.printf("Nota %d: %d\n",i+1,nota);

        }//Fin de Ciclo For
        
        promedio = sumaNotas/LIMITENOTAS;
        System.out.printf("\nEl promedio fue: %.2f\n",promedio);
        
        //Operacion Ternaria
        String resultado = (promedio >=70)?"Aprobado":"Reprobado";
        System.out.println(resultado);
        /*
        if(promedio >=70){
            System.out.println("Aprobado");
        }
        else
        {
            System.out.println("Reprobado");
        }
*/
    }//Fin Main
    
}//Fin Class
