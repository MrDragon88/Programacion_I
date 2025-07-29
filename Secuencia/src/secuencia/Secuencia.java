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
            Buenas Practicas de Programacion
        
            FUERA DEL MAIN
            1. Librerias
            2. Variables Globales
        
            DENTRO DEL MAIN
            3. Los objetos a utilizar => Scanner , Random
            4. Variables Locales
            5. Instrucciones Ejecutarse (Entrada, Procesamiento, Salida)
                5.1 Ingresar como usuario los datos a la aplicacion (Entrada)
                5.2 Calculos (Procesamiento)
                5.3 Mostrar Resultados (Salida)
        */
            //Calculadora Simple
            Scanner input = new Scanner(System.in);
            double num1 = 0.0;
            double num2 = 0.0;
            double resultado = 0.0;
            
            System.out.println("Dime el valor de Numero 1: ");
            num1 = input.nextDouble();
            
            System.out.println("Dime el valor de Numero 2: ");
            num2 = input.nextDouble();
            
            resultado = num1 + num2;
            
            //Numeros enteros => %d
            //Numeros decimales => %f
            System.out.printf("La suma de %f + %.1f es igual a %.2f",
                                            num1,num2,resultado);
            
            
            //Desarrollar un algoritmo que me permita hacer
            //conversion de moneda. El usuario ingresa la cantidad
            //de dolares que el banco le va a comprar. Cuantos
            //lempiras debería de darle el banco al usuario
            //Asumir lo siguiente 1$ = L 26.13
            //Mostrar el resultado
            
             double dolarLemp=0;
             double cantidadDolares = 0;
             
             System.out.println("Cuantos dolares a cambiar?");
             cantidadDolares = input.nextDouble();
             
             dolarLemp = cantidadDolares * 26.13;
             
             System.out.printf("Total Lempiras: %4.2f",dolarLemp);
    }//Fin de Main
   
}//Fin Class
