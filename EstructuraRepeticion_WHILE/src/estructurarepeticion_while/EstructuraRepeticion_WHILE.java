/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurarepeticion_while;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class EstructuraRepeticion_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Desarrollar un algoritmo que me permita ingresar
            5 notas para poder calcular el promedio y saber
            si tiene una nota final (promedio) arriba de 85.
        */
        Scanner scan = new Scanner (System.in);
        //Estructura Secuencial
        /*
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;
        int nota5 = 0;
        double promedio = 0;
        
        System.out.printf("Ingrese Nota 1: ");
        nota1 = scan.nextInt();
        
        System.out.printf("Ingrese Nota 2: ");
        nota2 = scan.nextInt();
        
        System.out.printf("Ingrese Nota 3: ");
        nota3 = scan.nextInt();
        
        System.out.printf("Ingrese Nota 4: ");
        nota4 = scan.nextInt();
        
        System.out.printf("Ingrese Nota 5: ");
        nota5 = scan.nextInt();
        
        promedio = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
        System.out.printf("Su promedio es: %.2f\n",promedio);
        if(promedio >=85){
            System.out.println("La nota es superior a 85");
        }//Fin de If
        */
        //Estructura Repetitiva
        
        int notasIngresadas = 0;
        int nota = 0;
        int sumaNotas = 0; //Acumulador
        double promedio = 0;
        
        /*
            Toda estructura de repeticion, tiene 3 elementos 
            que se deben implementar.
            1. Condicion de Evaluacion
            2. Las instrucciones que se repiten
            3. El modificador de la condicion evaluada.
            
        */
        //Se ejecuta la repeticion de la estructura while
        //cuando la condicion es verdadera y termina hasta
        //que se vuelve falso.
        while(notasIngresadas<5){
            /*
                Todo lo que esta dentro de las llaves,
                se considera las instrucciones que deberan 
                de repetirse.
            */
            
            System.out.printf("Ingrese Nota %d: ",notasIngresadas + 1);
            nota = scan.nextInt();
            sumaNotas += nota; //sumaNotas = sumaNotas + nota
            //System.out.printf("\nAcumulador: %d\n",sumaNotas);//Demo de Acumulador
            notasIngresadas = notasIngresadas + 1;
            
        }//Fin de While
        
        promedio = sumaNotas/5;
        System.out.printf("Su promedio es: %.2f\n",promedio);
        if(promedio >=85){
            System.out.println("La nota es superior a 85");
        }//Fin de If
    }//Fin de Main
    
}//Fin de Class
