/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturaambiente;

import java.util.Scanner;

/**
 *
 *      Desarrollar un algoritmo que permita monitorear la temperatura del ambiente. 
 *      Es por ello que se le ha encargado al Centro Meteorológico de Progra, 
 *      registrar las temperaturas diurnas y nocturnas, donde muestra el promedio diario, 
 *      a lo largo de una semana. Al final deberá de mostrar la temperatura promedio semanal, diurno y nocturno.
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
public class TemperaturaAmbiente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempIngresoDiurno = 0.0;
        double tempIngresoNocturno = 0.0;
        double acumuladorDiurno = 0.0;
        double promedioTempDiurno = 0;
        
        double acumuladorNocturno = 0.0;
        double promedioTempNocturno = 0;
        
        double promedioSemana = 0;
        double promedioDiario = 0;
        final int SEMANA = 7;
        int dia = 0;
        
        while(dia < SEMANA){
            
            //Diurno
            System.out.printf("Ingrese la temperatura Diurna %d: ",dia + 1);
            tempIngresoDiurno = scan.nextDouble();
            System.out.printf("Temperatura Diurna dia %d: %.2f",dia + 1, tempIngresoDiurno);
            acumuladorDiurno += tempIngresoDiurno; // acumuladorDiurno = acumuladorDiurno + tempIngreso;
            System.out.printf("%nAcumulador Diurno: %.2f %n",acumuladorDiurno);
            
            //Nocturno
            System.out.println("");
            System.out.printf("Ingrese la temperatura Nocturna %d: ",dia + 1);
            tempIngresoNocturno = scan.nextDouble();
            System.out.printf("Temperatura Nocturna dia %d: %.2f",dia + 1, tempIngresoNocturno);
            acumuladorNocturno += tempIngresoNocturno; // acumuladorDiurno = acumuladorDiurno + tempIngreso;
            System.out.printf("%nAcumulador Nocturno: %.2f %n",acumuladorNocturno);
                        
            promedioDiario = (tempIngresoDiurno + tempIngresoNocturno) / 2;
            System.out.printf("%nPromedio Diario: %.2f",promedioDiario);
            System.out.println("\n");
            dia++;
        }//Fin While
        System.out.println("");
        System.out.println("***********");
        System.out.println(" Promedios");
        System.out.println("***********");
        promedioTempDiurno = acumuladorDiurno / SEMANA;
        promedioTempNocturno = acumuladorNocturno / SEMANA;
        promedioSemana = (promedioTempDiurno+promedioTempNocturno)/2;
        System.out.printf("El promedio diurno es: %.2f",promedioTempDiurno);
        System.out.printf("%nEl promedio Nocturno es: %.2f",promedioTempNocturno);
        System.out.printf("%nEl promedio Semanal es: %.2f",promedioSemana);
        
    }//Fin Main
    
}//Fin Class
