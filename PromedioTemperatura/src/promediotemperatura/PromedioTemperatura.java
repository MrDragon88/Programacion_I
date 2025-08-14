/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promediotemperatura;

import java.util.Scanner;

/**
 *
 *      Desarrollar un algoritmo que permita monitorear la temperatura del ambiente. 
 *      Es por ello que se le ha encargado al Centro Meteorológico de Progra, 
 *      registrar las temperaturas diurnas y nocturnas, donde muestra el promedio diario, 
 *      a lo largo de una semana. Al final deberá de mostrar la temperatura promedio 
 *      semanal, diurno y nocturno.
 * 
 *      Tareas a Seguir
 *      1. Crear Variables
 *      2. Ingresar temperatura diurna
 *      3. Calcular Promedio de Temperatura Diurna
 *      4. Mostrar Resultado de Promedio Diurno
 *      5. Ingresar temperatura nocturna
 *      6. Calcular promedio de Temperatura Nocturna
 *      7. Mostrar Resultado de Promedio Nocturno
        8  Calcular promedio de Temperatura General Semanal
 *      9. Calcular promedio de Temperatura Diaria
 *      10. Mostrar Resultado de Promedio Semanal y Diario
 */
public class PromedioTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner (System.in);
        
        double temIngreso = 0;
        double acumuladordiurno = 0;
        double promedioTemDiurno = 0;
        int dia = 0;
        final int SEMANA = 7; // Constante que no va cambiar en el codigo no se va poder modificar 
        double acumuladorNocturno = 0;
        double promedioTemNocturno = 0;
        double promedioSemana = 0;
        double promedioDiario = 0;
        double temperaturaTemporal = 0;
        
        while (dia < SEMANA) {
            System.out.printf("Ingresemos la Temperatura Diurna Dia %d:", dia + 1);
            temIngreso = scan.nextDouble();
            temperaturaTemporal += temIngreso;
            System.out.printf("Temperatura diurna %d: %.2f", dia + 1, temIngreso);
            acumuladordiurno += temIngreso;
            System.out.printf("%nAcumulador diurno %.2f", acumuladordiurno);
            System.out.println("\n");
            
            System.out.printf("Ingresemos la Temperatura Nocturna dia %d:", dia + 1);
            temIngreso = scan.nextDouble();
            temperaturaTemporal += temIngreso;
            promedioDiario = (temperaturaTemporal) / 2;
            temperaturaTemporal = 0;
            System.out.printf("Temperatura nocturna %d: %.2f", dia + 1, temIngreso);
            acumuladorNocturno += temIngreso;
            System.out.printf("%nAcumulador nocturna %.2f", acumuladorNocturno);
            System.out.println("");
            System.out.printf("\nPromedio Diario: %.2f", promedioDiario);
                        System.out.println("\n");
            dia++;
        }

        promedioTemDiurno = acumuladordiurno / SEMANA;
        promedioTemNocturno = acumuladorNocturno / SEMANA;
        System.out.printf("%nPromedio diurno %.2f", promedioTemDiurno);
        System.out.printf("%nPromedio nocturno %.2f", promedioTemNocturno);
        
        promedioSemana = (promedioTemDiurno + promedioTemNocturno) / 2;


        System.out.printf("\n Temperatura semana: %.2f", promedioSemana);


    }//Fin Class
    
}//Fin Main