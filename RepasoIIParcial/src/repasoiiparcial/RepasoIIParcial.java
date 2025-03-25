/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoiiparcial;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 * 
 * Desarrolllar un algoritmo que recoja las ventas mensuales
 * de cada uno de los empleados que tiene la empresa para poder
 * determinar las ventas anuales por empleado, promedio de ventas
 * y quien fue el vendedor que más logro al final del año.
 * 
 * Requerimientos
 * 1. Guardar los datos del empleado en un arreglo unidimensinoal
 * 2. Preservar las ventas de cada empleado en una matriz.
 * 3. Utilizar funciones para mostrar datos del empleado, sus ventas y calcular
 * los resultados esperados.
 */
public class RepasoIIParcial {
    final static int MESES = 12;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();
        
        final int totalEmpleados = 3;
        
        String[] nombre = new String[totalEmpleados];
        String[] apellido = new String[totalEmpleados];
        int[] edad = new int[totalEmpleados];
        double[][] ventas = new double[totalEmpleados][MESES];
        double ventaTotal = 0.0;
        double ventaPromedio = 0.0;
        double ventaMaxima = 0;
        int numeroEmpleado = 0;
        
        //1ra Tarea...Ingresar Datos del Empleado
        for(int i = 0; i<totalEmpleados;i++){
            System.out.print("Nombre del Empleado: ");
            nombre[i] = scan.nextLine().toUpperCase();

            System.out.print("Apellido del Empleado: ");
            apellido[i] = scan.nextLine().toUpperCase();
            
            System.out.print("Edad del Empleado: .......");
            edad[i] = rd.nextInt(42)+18;//18 - 60 anios
            System.out.println("");
        }
        
        //2da Tarea.....Ingresar Ventas de cada empleado
        for (int i = 0; i < totalEmpleados; i++) {
            ventas[i] = VentaMensualxAnio(rd);
        }
        
        //MostrarDatosEmpleado(nombre, apellido, edad);
        
        
        //MostrarVentaxEmpleado(nombre, ventas);
        
        //3ra Tarea Calcular Venta Anual, Promedio y Maximo de Venta
        for (int i = 0; i < totalEmpleados; i++) {
            ventaTotal = SumaVentaAnual(ventas, i);
            ventaPromedio = PromedioVentaAnual(ventaTotal);
            if(ventaTotal>ventaMaxima){
                ventaMaxima = ventaTotal;
                numeroEmpleado = i;
            }
            System.out.printf("Empleado: %s\t VentaTotal: %.2f\tPromedio: %.2f",
                                nombre[i],ventaTotal,ventaPromedio);
            System.out.println("");
        }
        
        System.out.printf("El empleado que mas vendido fue: %s",nombre[numeroEmpleado]);
        System.out.printf("\nTotal Vendido: %.2f",ventaMaxima);
        
    }//Fin de Main
    
    public static void MostrarDatosEmpleado(String[] nom, String[] ape, int[]edad){
        for (int i = 0; i < nom.length; i++) {
            System.out.printf("\nNombre: %s",nom[i]);
            System.out.printf("\nApellido: %s",ape[i]);
            System.out.printf("\nEdad: %d",edad[i]);
        }
    }//Fin de Funcion Mostrar Datos Empleado

    public static double[] VentaMensualxAnio(Random venta){
        double[] ventaTemporal = new double[MESES];
        for (int i = 0; i < MESES; i++) {
            ventaTemporal[i] = venta.nextDouble(5000);
        }
        
        return ventaTemporal;
    
    }//Fin de Funcion

    public static void MostrarVentaxEmpleado(String[] nombre, double[][] venta){
        for (int numEmpleado= 0; numEmpleado < venta.length; numEmpleado++) {
            System.out.printf("%d)Nombre: %s ",numEmpleado+1, nombre[numEmpleado]);
            for (int j = 0; j < venta[numEmpleado].length; j++) {
                System.out.printf("%.2f\t\t",venta[numEmpleado][j]);
            }//Recorrido Mensual (cada columna)
            System.out.println("");
        }//Recorrido por Empleado (cada fila)
    }//Fin Funcion Mostrar Ventas x Empleado
    
    public static double SumaVentaAnual(double[][]venta, int posicionEmpleado){
        double sumaVentaTemporal = 0;
        
        for (int i = 0; i < venta[posicionEmpleado].length; i++) {
            sumaVentaTemporal += venta[posicionEmpleado][i]; 
        }
        
        return sumaVentaTemporal;
    }
    
    public static double PromedioVentaAnual(double sumaVenta){
        double promedioTemp = 0.0;
        
            promedioTemp = sumaVenta/MESES;
        
        return promedioTemp;
    }
}//Fin de Class
