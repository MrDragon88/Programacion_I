/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedioclase;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class PromedioClase {

    /**
     * 1. Estructuras de Secuencia
     * 2. Estructuras de Seleccion
     * 3. Estructuras de Repeticion
     *      a. While
     *      b. do...while
     *      c. for
     */
    
    /*
        Desarrollar un algoritmo que permita encontrar
        el promedio de varones y mujeres que se matriculan
        en el TUDAW.
    
        *Saber la Cantidad de Personas que se matriculan
            *Determinar cuantos son varones/mujeres.
            *Calcular el promedio -: la suma parcial divido por el total
    
        Estructura de Repeticion
        1.  Condicion a Evaluar 
        2.  Las instrucciones que se deben repetir
        3.  El modificador de la condicion inicial que se evalua.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int totalVarones = 0;
        int totalMujeres = 0;
        int totalPersonas = 0;
        char seleccionGenero = '@';
        
        double promedioVarones =0.0;
        double promedioMujeres = 0.0;
        
        /*
            Se va a ejecutar el ciclo WHILE
            siempre que la condicion se mantenga VERDADERO
        */
        /*
        //Concepto de Contador
        while(totalPersonas < 10){
            System.out.printf("Ciclo #%d\n",totalPersonas+1);
            System.out.println("Sos varon o mujer?");
            System.out.println("Varon => v");
            System.out.println("Mujer => m");
            seleccionGenero = input.next().charAt(0);
        
            if(seleccionGenero == 'm'){
                totalMujeres++; 
            }
            else{
                totalVarones++;
            } 
            totalPersonas++;
        }//Fin de While
        */
        
        //Concepto de Centinela
        int respuesta = 0;
        while(respuesta != 1){
            System.out.printf("Ciclo #%d\n",totalPersonas+1);
            System.out.println("Sos varon o mujer?");
            System.out.println("Varon => v");
            System.out.println("Mujer => m");
            seleccionGenero = input.next().charAt(0);
        
            if(seleccionGenero == 'm'){
                totalMujeres++; 
            }
            else{
                totalVarones++;
            } 
            totalPersonas++;
            System.out.println("Desea ingresar otro estudiante?");
            System.out.println("1. No, 0. Si");
            respuesta = input.nextInt();
        }//Fin de While
        
        promedioVarones = (double)totalVarones / (double)totalPersonas;
        promedioMujeres = (double)totalMujeres / (double)totalPersonas;
        
        System.out.printf("Total Personas %d\n",totalPersonas);
        System.out.printf("Total Mujeres: %d\n",totalMujeres);
        System.out.printf("Total Varones: %d\n",totalVarones);
        System.out.printf("Promedio de Mujeres: %.2f\n",promedioMujeres*100);
        System.out.printf("Promedio de Varones: %.2f\n",promedioVarones*100);
      
        
    }//Fin Main
    
}//Fin Class
