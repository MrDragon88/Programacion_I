/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Arreglos {
    

    /**
     * @param args the command line arguments
     * 
     * Crear un algoritmo que me permita almacenar las notas
     * de los estudiantes en su diferentes parciales (tres parciales) 
     * y mostrar el notas de cada parcial y el promedio general.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
   
        
        int ciclo  =0;
        double promedio = 0;
        String[] asignatura = new String[3];
        
        
        //Opcion 1 Declarando y luego creando
        int[] notas;//Arreglo
        notas = new int[3];
        
        
        //Opcion 2
        //[] ->Corchetes (El ing les cambio el nombre a llaves cuadradas)
        //{} ->Llaves
        int[] notas2 = new int[3];//3 es la Dimension o tamanio del Arreglo
        notas2[0] = 100;
        notas2[1] = 90;
        notas2[2] = 80;
        
        //Opcion 3 Declarando e Inicializando
        int[] notas3 = {100,90,80};
        
        //Opcion 4 Declarando, Creando e Inicializando
        int[] notas4 = new int[]{100,90,80};
        
        while(ciclo<3){
            System.out.printf("Ingrese la Nota %d:",ciclo + 1);
            notas[ciclo]=scan.nextInt();//100 \n
            scan.nextLine();//Limpieza de Buffer
            
            notas[ciclo]= ValidacionIngreseNota(notas[ciclo], scan);
            System.out.print("\nNombre de la asignatura: ");
            asignatura[ciclo] = scan.nextLine();
            ciclo++;
        }//Fin de While     
        
        promedio = (notas[0]+notas[1]+notas[2])/3;
        System.out.println("\nNotas de Asignatura");
        System.out.printf("\nNota %s: %d",asignatura[0],notas[0]);
        System.out.printf("\nNota %s: %d",asignatura[1],notas[1]);
        System.out.printf("\nNota %s: %d",asignatura[2],notas[2]);
        System.out.printf("\nPromedio: %.2f",promedio);
        
        
    }//Fin de Main
    
    public static int ValidacionIngreseNota(int nota, Scanner input){
        
        int notaTemp = nota;
        
        do{
            if(notaTemp>100 || notaTemp<0){
                System.out.println("Nota no valida");
                System.out.println("Tiene que estar entre 0 y 100");
                System.out.println("Ingrese nuevamente");
                notaTemp = input.nextInt();
            }
        }while(notaTemp>100 || notaTemp<0);
        
        return notaTemp;
    }//Fin de Funcion de Nota
    
}//Fin de Class
