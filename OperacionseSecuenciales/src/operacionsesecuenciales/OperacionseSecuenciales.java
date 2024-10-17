/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionsesecuenciales;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class OperacionseSecuenciales {

    /**
     * Operaciones Aritmeticas
     * Suma y Resta
     * Multiplicacion y Division
     * Modulos y Exponentes
     * Operadores Incremento y  Decremento
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int numero1 =0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        
        int resultadoOperacion_Primera = 0;
        int resultadoOperacion_Segunda = 0;
        double resultadoOperacion_Tercera = 0;
        
        System.out.print("Ingrese 1er Numero: ");
        numero1 = sc.nextInt();
        
        System.out.print("Ingrese 2do Numero: ");
        numero2 = sc.nextInt();
        
        System.out.print("Ingrese 3er Numero: ");
        numero3 = sc.nextInt();
        
        System.out.print("Ingrese 4to Numero: ");
        numero4 = sc.nextInt();
        
        //Orden de Operaciones
        /*
            1. Parentesis
            2. Exponentes
            3. Multiplicacion o Division, izq a der
            4. Suma o Resta, izq a der
        */
        resultadoOperacion_Primera = numero1 + numero2 - numero3;
        resultadoOperacion_Segunda = numero4 * numero1 + numero3;
        resultadoOperacion_Tercera = (double)numero2 / (double)numero4;
                                    //Casting
        System.out.println("\n1ra Operacion: "+resultadoOperacion_Primera);
        System.out.println("2da Operacion: "+resultadoOperacion_Segunda);
        System.out.println("3ra Operacion: "+resultadoOperacion_Tercera);
        
        //resultadoOperacion_Primera = numero1 * numero1 * numero1 *numero1 * numero1;
        resultadoOperacion_Primera = (int) Math.pow(numero1,5);
        
        resultadoOperacion_Segunda = numero2 % numero3;
        resultadoOperacion_Tercera = numero2 / numero3;
        
        System.out.println("\n1ra Operacion: "+resultadoOperacion_Primera);
        System.out.println("2da Operacion: "+resultadoOperacion_Segunda);
        System.out.println("3ra Operacion: "+resultadoOperacion_Tercera);
        
        int a = 0;
        int b = 0;
        int c = 1;
        int d1 = 10;
        int d2 = 10;
        
        a +=7;
        b -=5;
        c *=2;
        
        System.out.printf("\nResultado de A: %d",a);
        System.out.printf("\nResultado de B: %d",b);
        System.out.printf("\nResultado de C: %d",c);
        
        System.out.println("\nPostIncremento");
        System.out.printf("D1: %d\n",d1);
        System.out.printf("D1: %d\n",d1++);//operacion unitaria
        System.out.printf("D1: %d\n",d1);

        System.out.println("\nPreIncremento");
        System.out.printf("D2: %d\n",d2);
        System.out.printf("D2: %d\n",++d2);
        System.out.printf("D2: %d\n",d2);
        
        
        
        
    
    }//Fin Main
    
}//Fin Class
