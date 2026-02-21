/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Funciones {

    /**
     * Desarrollar un algoritmo que me permita encontrar el promedio
     * de nota de la clase de programacion, cuando
     * ingresamos tres notas parciales, 0 - 100.
     * 
     * @param args the command line arguments
     */
    
    /*
        Funcion es un segmento de codigo que se reutiliza
    
        Estructura de una Funcion
        1. Tipo de Acceso
            Publico
            Privado
            Protected
        2. Tipo de Dato a Retornar
            void
            int
            double
            string
            char
            boolean
            arreglo
            etc
        3. Nombre de la Funcion
        4. Parametros de Operacion de la Funcion
            Elementos que puede ser, ninguno, uno, dos o muchos
    */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        double promedio = 0.0;
        
        System.out.println("Ingrese las notas de cada parcial");
      
            System.out.print("Nota 1: ");
            nota1 = scan.nextInt();
            nota1 = ValidarNumeroIngresado(nota1);
            
            System.out.print("Nota 2: ");
            nota2 = scan.nextInt();
            nota2 = ValidarNumeroIngresado(nota2);
        
            System.out.print("Nota 3: ");
            nota3 = scan.nextInt();
            nota3 = ValidarNumeroIngresado(nota3);
            
         
            promedio = PromedioNotas(nota1,nota2,nota3);
        
            MostrarResultado(promedio, "Progra");
    }//Fin de Main
    
    public static int ValidarNumeroIngresado(int notaIngresada){
            Scanner sc = new Scanner(System.in);
        do{
            if(!(notaIngresada>=0 && notaIngresada<=100)){
                System.out.println("Nota no valida");
                System.out.println("Tiene que ser entre 0 y 100");
                System.out.println("Ingrese Nuevamente");
                
                System.out.print("Nota : ");
                notaIngresada = sc.nextInt();
            }
        }while(!(notaIngresada>=0 && notaIngresada<=100));
        
        
        return notaIngresada;
    }//Fin de la Funcion ValidarNumeroIngresado
    
    public static double PromedioNotas(int n1, int n2, int n3){
        double temporalPromedio= 0;
        temporalPromedio = (n1 + n2 + n3)/3;
    
        return temporalPromedio;
    }
    
    public static void MostrarResultado(double promedio, String nombreAsignatura){
        System.out.printf("La nota de %s ha sido aprobado con"
                + "una nota final de %.2f",nombreAsignatura,promedio);
    }//Fin Funcion Mostrar Resultado
}//Fin de Class
