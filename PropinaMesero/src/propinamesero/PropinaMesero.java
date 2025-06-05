/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propinamesero;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class PropinaMesero {

    /**
     * @param args the command line arguments
     * 
     * Determinar cuanto de propina recibe el mesero
     * Factura -> 500 : Propina -> 50
     * Factura -> 5000 : Propina -> 500
     * Factura -> 250 : Propina -> 25
     * Factura -> 1750 : Propina -> 175
     * 
     * Hacerlo con una funcion que retorne un valor
     * Hacerlo con una funcion que NO retorne un valor
     */
    public static double Calculo_Propina(double espacioValorFactura){
        //Cuerpo - Instrucciones de que lo que hace la tarea
        //calcular propina
        double resultadoPropina=0;
        
        resultadoPropina = espacioValorFactura * 0.10;
        
        return resultadoPropina;
    }//Fin Funcion CalculoPropina
    
    public static double Calculo_PropinaDOSPARAMETROS(double montoFactura, double porcientoPropina){
        double resultadoPropina = 0;
        
        resultadoPropina = montoFactura * porcientoPropina;
        
        return resultadoPropina;
    }//Fin Funcion Calculo Propina
    
    public static void Calculo_PropinaSINRETORNO(double valorFactura){
        double resultadoPropina = 0;
        
        resultadoPropina = valorFactura * 0.10;
        System.out.println("El monto de la propina fue: "+resultadoPropina);
    }
    
    public static void MensajeAgradecimientoMesero(double tip){
        if(tip>5000){
            System.out.println("Muchas gracias GENTE por su propina:"+tip);
        }else if(tip >1000)
        {
            System.out.println("Me han hecho el dia...gracias por "+tip);
        }
        else if(tip>50){
            System.out.println("Gracias por la semita de a "+tip);
        }
        else{
            System.out.println("Bueno...este, gracias!");
        }

    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double factura = 0;
        double propina = 0;
        
        System.out.println("Cuanto fue el consumo en el restaurante Miguel?");
        factura = scan.nextDouble();
        
        System.out.println("Variante 1");
        propina = Calculo_Propina(factura);
        System.out.println("El monto de la propina fue: "+propina);
        /*
        System.out.println("\nVariante 2");
        propina = Calculo_PropinaDOSPARAMETROS(factura, 0.10);
        System.out.println("El monto de la propina fue: "+propina);
        
        System.out.println("\nVariante 3");
        Calculo_PropinaSINRETORNO(factura);
        
        System.out.println("");
        System.out.println("Cuanto fue el consumo en el restaurante Rafael?");
        factura = scan.nextDouble();
        
        System.out.println("Variante 1");
        propina = Calculo_Propina(factura);
        System.out.println("El monto de la propina fue: "+propina);
        
        System.out.println("\nVariante 2");
        propina = Calculo_PropinaDOSPARAMETROS(factura, 0.10);
        System.out.println("El monto de la propina fue: "+propina);
        
        System.out.println("\nVariante 3");
        Calculo_PropinaSINRETORNO(factura);
        */
        MensajeAgradecimientoMesero(propina);
    }//Fin Main
    
    
}//Fin Class
