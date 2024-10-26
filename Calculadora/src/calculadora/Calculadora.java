/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 * Estructura Condicional
 *  a. Multiple => Condicion Puntual
 *      switch
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double resultado = 0;
        int opcion = 0;
        
        /*
            if(condicion)
            donde la condicion puede ser 
            a. Un rango (<, >, <=, >=)    
            b. Elemento Puntual (== , !=)
        */
        System.out.print("Ingrese el 1er Numero: ");
        num1 = scan.nextDouble();
        
        System.out.print("Ingrese el 2do Numero: ");
        num2 = scan.nextDouble();
        
        System.out.println("Que operacion desea realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        opcion = scan.nextInt();
        
        switch(opcion){
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Ingresar una opcion valida!!");
                System.out.println("Rango...del 1 al 4");
                break;
        }//Fin del Switch
        
        /*
            Operacion Booleana
            1. OR  (Una entrada al menos es verdadero)
            2. AND (Todas las entradas tiene que ser verdadera)
        */
        if(opcion >=1 && opcion <=4){
            System.out.printf("El resultado de la operacion es: %.2f",resultado);
            System.out.println("");
        }
        
        char opcionLetra = '@';
        System.out.println("Que fondo sería para la calculadora?");
        System.out.println("a. Blanco");
        System.out.println("b. Negro");
        System.out.println("c. Azul");
        opcionLetra = scan.next().toLowerCase().charAt(0);
        
        switch(opcionLetra){
            case 'a':
                System.out.println("Fondo Blanco con Letras Oscuras");
                break;
            case 'b':
                System.out.println("Fondo Negro con Letras Claras");
                break;
            case 'c':
                System.out.println("Fondo Azul con Letras Claras");
                break;
            default:
                System.out.println("Esa opcion no existe!");
                break;
        }
        
        /*
            Desarrollar un algoritmo que me permita a mi ingresar una
            opcion en la que me relacione los d[ias de la semana con
            algo en especial que suceda ese d[ia
            1. Lunes, nadie quiere ir a trabajar
            2. Martes, segundo dia de la semana...no quiero trabajar
            3. Miercoles, mitad de semana...ya casi se acaba el trabajo.
        
                Que suene algo tranquilo mientras programan!!
        
            
        */
        
        
    }//Fin Main
    
}//Fin Class
