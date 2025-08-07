/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conteodinero;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class ConteoDinero {

    /**
     * Prueba 1
     * Dinero => 1500
     *  L 500 =   3   L 20 = 0   L 1 = 0
     *  L 200 =   0   L 10 = 0
     *  L 100 =   0   L 5  = 0
     *  L 50  =   0   L 2  = 0
     * 
     *  Prueba 2
     *  Dinero => 1200
     *  L 500 =   2   L 20 = 0   L 1 = 0
     *  L 200 =   1   L 10 = 0
     *  L 100 =   0   L 5  = 0
     *  L 50  =   0   L 2  = 0
     *  
     *  Prueba 3
     *  Dinero => 957
     *  L 500 =   1   L 20 = 0   L 1 = 0
     *  L 200 =   2   L 10 = 0
     *  L 100 =   0   L 5  = 1
     *  L 50  =   1   L 2  = 1
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        int dinero =  0;
        int remante = 0;
        int billete500 = 0;
        int billete200 = 0;
        int billete100 = 0;
        int billete50 = 0;
        int billete20 = 0;
        int billete10 = 0;
        int billete5 = 0;
        int billete2 = 0;
        int billete1 = 0;
        
        System.out.print("Cuanto de dinero tengo que darte de vuelto? ");
        dinero = scan.nextInt();
        
        billete500 = dinero / 500;
        remante = dinero % 500;
        
        dinero = dinero - (billete500 *500);
        
        billete200 = dinero / 200;
        remante = dinero % 200;
        
        dinero = dinero - (billete200 *200);
        
        billete100 = dinero / 100;
        remante = dinero % 100;
        
        dinero = dinero - (billete100 *100);
        
        billete50 = dinero / 50;
        remante = dinero % 50;
        
        dinero = dinero - (billete50 *50);
        
        billete20 = dinero / 20;
        remante = dinero % 20;
        
        dinero = dinero - (billete20 *20);
        
        billete10 = dinero / 10;
        remante = dinero % 10;
        
        dinero = dinero - (billete10 *10);
        
        billete5 = dinero / 5;
        remante = dinero % 5;
        
        dinero = dinero - (billete5 *5);
        
        
        billete2 = dinero / 2;
        remante = dinero % 2;
        
        dinero = dinero - (billete2 *2);
        
        billete1 = dinero;
        
        
        
        System.out.println("Remante: "+remante);
        System.out.printf("%nDenominacion 500 =>%d",billete500);
        System.out.printf("%nDenominacion 200 =>%d",billete200);
        System.out.printf("%nDenominacion 100 =>%d",billete100);
        System.out.printf("%nDenominacion 50 =>%d",billete50);
        System.out.printf("%nDenominacion 20 =>%d",billete20);
        System.out.printf("%nDenominacion 10 =>%d",billete10);
        System.out.printf("%nDenominacion 5 =>%d",billete5);
        System.out.printf("%nDenominacion 2 =>%d",billete2);
        System.out.printf("%nDenominacion 1 =>%d",billete1);

    }//Fin de Main
    
}//Fin Class
