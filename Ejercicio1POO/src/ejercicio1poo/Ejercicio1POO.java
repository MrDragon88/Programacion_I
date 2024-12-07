/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1poo;

import java.util.Scanner;

/**
 *      Desarrollar un algoritmo que simule el funcionamiento de una calculadora,
 * donde tendrá la capacidad de sumar, restar, multiplicar, dividir y calcular 
 * potencias;  utilizando dos números para la operacion.
 * 
 * Crear una clase llamada Calculadora donde se recojan los atributos y metodos
 * de una calculadora.
 * 
 * El programa deberá validar que se ingresan números únicamente para las operaciones
 * aritméticas y letras para el menú de opciones.
 * 
 * El programa se termina cuando el usuario lo indique.
 * @author Oscar Andrade
 */
public class Ejercicio1POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calculo = new Calculadora();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese 1er Numero");
        double num1 = scan.nextDouble();
        calculo.setNum1(num1);
        
        System.out.print("\nIngrese 2do Numero");
        double num2 = scan.nextDouble();
        calculo.setNum2(num2);
        
        System.out.printf("El resultado de la suma es: %.2f",calculo.CalcularSuma());
    }//Fin Main
    
}//Fin Class
