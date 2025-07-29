/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuencia;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Secuencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variante 1 de Secuencias
        System.out.println("1.Iniciando Programa");
        System.out.println("2. Se tiene que saludar Hola Mundo");
        System.out.println("3. Hay que despedirse, Adios");
        System.out.println("4. Finalizando Programa");
        
        //Variante 2 de Secuencias
        System.out.println("1.Iniciando Programa");
        System.out.println("4. Finalizando Programa");
        System.out.println("3. Hay que despedirse, Adios");
        System.out.println("2. Se tiene que saludar Hola Mundo");
        
        /*
            AFUERA DEL MAIN
            1. Librerias a Utilizar
            2. Variables Globales
            
            ADENTRO DEL MAIN
            3. Crear el objeto Scanner
            4. Variables Locales
            5. Algoritmo Secuencial que se necesita
                5.1 Pedidos al Usuario          (Entrada Datos)
                5.2 Calculos del Algoritmo      (Procesamiento de Datos)
                5.3 Resultados hacia el Usuario (Salida Informacion)
        */
        //Calculadora Simple de Suma de Decimales
        Scanner entrada = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        
        System.out.print("Dime el valor de Num 1: ");
        num1 = entrada.nextDouble();
        
        System.out.print("Dime el valor de Num 2: ");
        num2 = entrada.nextDouble();
        
        resultado = num1 + num2;
        
        System.out.printf("La suma de %f y %1f es : %.2f",
                                        num1,num2,resultado);
        
    }//Fin Main
    
}//Fin Class
