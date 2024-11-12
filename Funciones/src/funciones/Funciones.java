/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Funciones {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        
        int num3 = 0;
        int num4 = 0;
        
        int num5 = 0;
        int num6 = 0;
        
        int sumaTotal = 0;
        
        //Suma de 1er Par de Numeros
        ImpresionEncabezado(1,2);
        
        System.out.print("Ingrese 1er Numero: ");
        num1 = scan.nextInt();
        num1 = ValidacionNumerosPositivos(num1);
        
        System.out.print("Ingrese 2do Numero: ");
        num2 = scan.nextInt();
        num2 = ValidacionNumerosPositivos(num2);
        
        //sumaTotal = num1 + num2;
        sumaTotal = sumaDosEnteros(num1, num2);
        System.out.printf("Resultado de Suma es: %d",sumaTotal);
        
        //Suma de 2do Par Numeros
        ImpresionEncabezado(3,4);
        System.out.print("Ingrese 3er Numero: ");
        num3 = scan.nextInt();
        num3 = ValidacionNumerosPositivos(num3);
        System.out.print("Ingrese 4to Numero: ");
        num4 = scan.nextInt();
        num4 = ValidacionNumerosPositivos(num4);
        
        //sumaTotal = num3 + num4;
        sumaTotal = sumaDosEnteros(num3, num4);
        
        System.out.printf("Resultado de Suma es: %d",sumaTotal);
        
        //Suma de 3er Par de Numeros
        ImpresionEncabezado(5,6);
        System.out.print("Ingrese 5to Numero: ");
        num5 = scan.nextInt();
        num5 = ValidacionNumerosPositivos(num5);
        System.out.print("Ingrese 6to Numero: ");
        num6 = scan.nextInt();
        num6 =ValidacionNumerosPositivos(num6);
        
        //sumaTotal = num5 + num6;
        sumaTotal = sumaDosEnteros(num5, num6);
        System.out.printf("\nResultado de Suma es: %d",sumaTotal);
    }//Fin Main
    
    public static int sumaDosEnteros(int n1, int n2){
        int resultado = 0;
        resultado = n1 + n2;
        return resultado;
    }//Fin de Funcion Suma Dos Enteros
  
    public static int ValidacionNumerosPositivos(int numero){
        Scanner scan = new Scanner(System.in);
        do
        {
            if(numero <0){
                System.out.println("Solo se permite numeros +");
                System.out.print("Ingrese nuevo numero: ");
                numero = scan.nextInt();
            }
        }while(numero<0);
        
        return numero;
    }//Fin de Funcion Validacion Numeros Positivos
    
    public static void ImpresionEncabezado(int n1, int n2){
        System.out.println("\n");
        System.out.printf("Num %d y Num %d\n",n1,n2);
        System.out.println("*************\n");
    }
    /*
  
        Estructura de una Funcion
        1. Tipo de Acceso -> public, private, protected
        2. Tipo de Retorno/Devolucion ->
            a. void (Nada)
            b. int (entero)
            c. double (double)
            d. char (caracter)
            e. String (cadena)
            f. array (arreglo)
        3. Nombre de la Funcion
        4. Parametros para trabajar
            a.Cantidad elementos necesarios para la tarea
            b.Tipo de Datos (int,double,char,string, array.....void)
    */
    
}//Fin Class
