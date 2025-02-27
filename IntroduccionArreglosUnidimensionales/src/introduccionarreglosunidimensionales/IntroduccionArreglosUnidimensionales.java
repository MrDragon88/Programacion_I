/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionarreglosunidimensionales;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class IntroduccionArreglosUnidimensionales {

    /**
     * @param args the command line arguments
     */
    /*
        Calcular el promedio de un curso de Programacion que tiene 5
        estudiantes matriculados. Quiere saber el numero de estudiantes
        que sacaron una nota mayor al promedio de la clase.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Un arreglo es una estructura de datos que me permite
        //almacenar multiples elementos del mismo tipo.

        //1ra Forma. Declaracion del Arreglo y luego crear el arreglo
        //int[] notas;
        //notas = new int[5];
        
        //2da Forma. Declarlo y Crearlo en la misma linea
        final int DIM = 5;
        Scanner scan = new Scanner(System.in);
        int[] notas = new int[DIM];//Tamanio del Arreglo es 5
        int sumaNotas = 0;
        int conteoEstudiantes = 0;
        double promedio =0.0;
        /*
        notas[0]=100;
        notas[1]=100;
        notas[2]=100;
        notas[3]=100;
        notas[4]=100;
    */
        //3ra Forma. Declarlo e Inicializarlo.
        //int[] notas = {0,0,0,0,0};
        
        //4ta Forma. Declarlo, Crearlo e Inicializarlo
        //int[] notas = new int[]{0,0,0,0,0};
        
        //Inicializacion de Arreglo
        for (int i = 0; i < DIM; i++) {
            notas[i] = 0;
        }//Fin Ciclo For
        
        System.out.println("Ingrese las notas de los estudiantes");
        for (int i = 0; i < DIM; i++) {
            System.out.printf("Nota %d: ",i+1);
            notas[i]=scan.nextInt();
            sumaNotas +=notas[i];
        }//Fin Ciclo For
        
        promedio = sumaNotas / DIM;
        
        System.out.println("\nNotas Ingresadas");
        for (int i = 0; i < DIM; i++) {
            System.out.printf("\nNota %d:%d",i+1,notas[i]);
            if(notas[i]>promedio){
                conteoEstudiantes++;
            }
        }//Fin Ciclo For
      
        System.out.printf("Promedio de Asignatura: %.2f",promedio);
        System.out.printf("# Estudiantes Arriba del Promedio: %d",conteoEstudiantes);
    }//Fin Main
    
}//Fin Class
