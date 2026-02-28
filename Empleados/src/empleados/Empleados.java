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
    /*
        Estructura de una Funcion
    1. Tipo de Acceso -: public, private, protected
    2. Tipo de Retorno -: void, int, string, double etc
    3. Nombre de la Funcion
    4. Parametros de la Funcion -: separados por coma, int, double, string, void, etc..
    */

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
        
        System.out.println("Empleado 1");
        nombre1 = IngreseNombre();        
        
        salario1 = ValidacionNumerica("Dime cuanto ganas:");
        antiguedad1 = (int)ValidacionNumerica("Dime hace cuanto trabajas: ");
        
        
        // scanner.nextLine(); // Limpiar el buffer

        // Cálculos Empleado 1
        bono1 = CalculoBono(salario1, antiguedad1);//Llamado de la Funcion
        salarioTotal1 = salario1 + bono1;
        seguro1 = CalculoSeguro(salarioTotal1);
        
        neto1 = salarioTotal1 - seguro1;

        // Recibo Empleado 1
        MostrarResumenEmpleado(nombre1, salario1, bono1, seguro1, neto1);
        
        System.out.println("\n-----------------\n");
        
        System.out.println("Empleado 2");
        nombre2 = scanner.nextLine();
        
        salario2 = ValidacionNumerica("Dime cuanto ganas: ");
        
        antiguedad2 = (int)ValidacionNumerica("Hace cuanto est[as laborando: ");

        // Cálculos Empleado 2
        bono2 = CalculoBono(salario2, antiguedad2);
        salarioTotal2 = salario2 + bono2;
        seguro2 = CalculoSeguro(salarioTotal2);
        neto2 = salarioTotal2 - seguro2;

        MostrarResumenEmpleado(nombre2, salario2, bono2, seguro2, salario2);

       
    }
    
    /**
        Funcion para ingresar el nombre
    */
    public static String IngreseNombre(){
        Scanner scan = new Scanner(System.in);
        String nombreTemp = "HOLA";
        
        System.out.println("--- DATOS DEL DOCENTE ---");
        System.out.print("Nombre de la Persona: ");
        nombreTemp= scan.nextLine();
        
        return nombreTemp;
    }//Fin de Funcion IngreseNombre

    /**
     * Funcion que permite validar que el salario sea positivo
    */
    public static double ValidacionSalario(){
        Scanner scan = new Scanner(System.in);
        double salarioTEMP = 0.0;
        do{
            System.out.print("Dime tu salario base: ");
            salarioTEMP = scan.nextDouble();
        
            if(salarioTEMP <0){
                System.out.println("No puede ser un valor negativo");
                System.out.println("Ingrese nuevamente el valor");
            }
        }while(salarioTEMP <0);
        return salarioTEMP;
    }//Fin de Funcion Validacion Salario

    public static double ValidacionNumerica(String mensaje){
        Scanner scan = new Scanner(System.in);
        double numeroTEMP = 0.0;
        do{
            System.out.print(mensaje);
            numeroTEMP = scan.nextDouble();
        
            if(numeroTEMP <0){
                System.out.println("No puede ser un valor negativo");
                System.out.println("Ingrese nuevamente el valor");
            }
        }while(numeroTEMP <0);
        return numeroTEMP; 
    }//Fin de Validacion Numerica

    public static double CalculoBono(double sueldo, int tiempoTrabajo){
        double calculoTEMP = 0.0;
        
            if(sueldo>1000){
                calculoTEMP = sueldo * 0.05 * tiempoTrabajo;
            }
            else
            {
                calculoTEMP = 2000;
            }
        return calculoTEMP;
    }//Fin de Calculo Bono

    public static double CalculoSeguro(double salarioTotal){
        double seguroTEMP = 0;
        
        if(salarioTotal < 15000){
            seguroTEMP = 1000;
        }else if(salarioTotal <20000){
            seguroTEMP = salarioTotal * 0.05;
        }else if(salarioTotal <25000){
            seguroTEMP = salarioTotal * 0.08;
        }else{
            seguroTEMP = 2500;
        }
        return seguroTEMP;
    }//Fin de Funcion Calculo Seguro

    public static void MostrarResumenEmpleado(String nom, double sala, double bono, 
            double seguro, double salaNeto){
        System.out.printf("\n--- RECIBO DE %s ---\n",nom.toUpperCase());
        System.out.printf("Salario Base: $%.2f\n", sala);
        System.out.printf("Bono Antiguedad: $%.2f\n", bono);
        System.out.printf("Seguro Medico: -$%.2f\n", seguro);
        System.out.printf("SALARIO NETO: $%.2f\n", salaNeto);

    }//Fin de Resumen



}//Fin de Class

