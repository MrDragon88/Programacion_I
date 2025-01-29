/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesaritmeticas;

import java.util.Scanner;


/**
 * @date 27/enero/2025
 * @author Oscar Andrade
 * 
 * Reealizar un algoritmo que me muestre las diferentes operaciones
 * aritmeticas que podemos realizar; aparte conocer un poco
 * de la libreria de MATH.
 */
public class OperacionesAritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int suma = 0;
    int resta = 0;
    double multi = 0;
    int division = 0;
    double division2 = 0;
    int modulo = 0;
    
    int numero1 = 0;
    int numero2 = 0;
    double num3 = 0.0;
    double num4 = 0.0;
    
        System.out.print("Ingrese 1er Numero: ");
        numero1 = sc.nextInt();
        System.out.print("Ingrese 2do Numero: ");
        numero2 = sc.nextInt();
        
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        System.out.printf("\nEl total de la suma es: %d\n",suma);
        System.out.printf("El total de la resta es: %d\n",resta);
        System.out.println("");

        System.out.print("Ingrese Numero 3: ");
        num3 = sc.nextDouble();

        System.out.print("Ingrese Numero 4: ");
        num4 = sc.nextDouble();
        //Casting
        multi = num3 * num4;
        System.out.printf("El resultado de la multiplicacion es: %.1f",multi);
        
        division2 = num3 / num4;
        division = (int)num3 / (int)num4;
        modulo = (int)num3 % (int)num4;
        System.out.printf("\nLa division (decimal) es: %.2f",division2);
        System.out.printf("\nLa division es: %d",division);
        System.out.printf("\nEl modulo es: %d",modulo);
        
        //Valores antes de Operacion
        System.out.println("Valores Almacenados");
        System.out.printf("\nEl valor de suma es: %d",suma);
        System.out.printf("\nEl valor de resta es: %d",resta);
        System.out.printf("\nEl valor de multi es: %.2f",multi);
        System.out.printf("\nEl valor de division es: %d",division);
        System.out.println("");
        
        suma +=5; //suma = suma + 5
        resta -=3; //resta = resta - 3
        multi *= 2; // multi = multi * 2 
        division /= -3.2; //division = division / -3.2
        
        System.out.println("Valores Nuevos despues de operacion");
        System.out.printf("\nEl valor de suma es: %d",suma);
        System.out.printf("\nEl valor de resta es: %d",resta);
        System.out.printf("\nEl valor de multi es: %.2f",multi);
        System.out.printf("\nEl valor de division es: %d",division);
        System.out.println("");
        
        

    
    }//Fin Main
    
}//Fin Class
