/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleados;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Empleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        String nombre1 = "John Doe";
        String nombre2 = "John Doe";
        
        double salario1 = 0;
        double salario2 = 0;

        int antiguedad1 = 0;
        int antiguedad2 = 0;
        
        double bono1 = 0;
        double salarioTotal1 = 0;
        double seguro1 = 0;
        double neto1 = 0;
        
        double bono2 = 0;
        double salarioTotal2 = 0;
        double seguro2 = 0;
        double neto2 = 0;
        
        System.out.println("--- DATOS DEL EMPLEADO 1 ---");
        System.out.print("Nombre: ");
        nombre1 = scanner.nextLine();
        
        
        do{
            System.out.print("Salario base: ");
            salario1 = scanner.nextDouble();
            
            if(salario1 <0){
                System.out.println("No puede ser un valor negativo");
                System.out.println("Ingrese nuevamente el valor");
            }
        }while(salario1<0);
        
        do{
         System.out.print("Años de antigüedad: ");
         antiguedad1 = scanner.nextInt();
         if(antiguedad1 <0){
             System.out.println("No puede ser un valor negativo");
             System.out.println("Ingrese nuevamente el valor");
         }
        }while(antiguedad1<0);
         scanner.nextLine(); // Limpiar el buffer

        // Cálculos Empleado 1
        bono1 = salario1 * 0.05 * antiguedad1;
        salarioTotal1 = salario1 + bono1;
        
        if(salarioTotal1 < 15000){
            seguro1 = 1000;
        }else if(salarioTotal1 <20000){
            seguro1 = salarioTotal1 * 0.05;
        }else if(salarioTotal1 <25000){
            seguro1 = salarioTotal1 * 0.08;
        }else{
            seguro1 = 2500;
        }
            
        
        
        neto1 = salarioTotal1 - seguro1;

        // Recibo Empleado 1
        System.out.println("\n--- RECIBO DE " + nombre1.toUpperCase() + " ---");
        System.out.println("Salario Base: $" + salario1);
        System.out.println("Bono Antigüedad: +$" + bono1);
        System.out.println("Seguro Médico: -$" + seguro1);
        System.out.println("SALARIO NETO: $" + neto1);

       

        System.out.println("\n--- DATOS DEL EMPLEADO 2 ---");
        System.out.print("Nombre: ");
        nombre2 = scanner.nextLine();
        System.out.print("Salario base: ");
        salario2 = scanner.nextDouble();
        System.out.print("Años de antigüedad: ");
        antiguedad2 = scanner.nextInt();

        // Cálculos Empleado 2
        bono2 = salario2 * 0.05 * antiguedad2;
        salarioTotal2 = salario2 + bono2;
        
        if(salarioTotal2 < 15000){
            seguro2 = 1000;
        }else if(salarioTotal2 <20000){
            seguro2 = salarioTotal2 * 0.05;
        }else if(salarioTotal2 <25000){
            seguro2 = salarioTotal2 * 0.08;
        }else{
            seguro2 = 2500;
        }
    
        neto2 = salarioTotal2 - seguro2;

        // Recibo Empleado 2 
        System.out.println("\n--- RECIBO DE " + nombre2.toUpperCase() + " ---");
        System.out.println("Salario Base: $" + salario2);
        System.out.println("Bono Antigüedad: +$" + bono2);
        System.out.println("Seguro Médico: -$" + seguro2);
        System.out.println("SALARIO NETO: $" + neto2);

       
    }
}

