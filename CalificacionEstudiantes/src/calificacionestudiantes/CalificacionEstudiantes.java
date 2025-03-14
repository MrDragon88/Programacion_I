/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificacionestudiantes;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Oscar Andrade
 * @version 0.0
 * @since 12/marzo/24
 * 
 * Realizar un algoritmo que me permita guardar 10 notas en un arreglo
 * unidimensional y yo pueda obtener los siguientes elementos:
 * a. Mostrar las notas
 * b. Obtener el promedio de notas
 * c. Eliminar una nota de cualquier posicion
 * c. Nota Maxima
 * d. Nota Minima
 * e. Histograma -> Estudiantes Aprobados y Reprobados
 * 
 */
public class CalificacionEstudiantes {
    static Scanner scan = new Scanner(System.in);
    static Random rd = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Integer = int
        //Double = double
        //Character = char
        //Boolean = boolean
        //String = string
        
        ArrayList<Integer> calificaciones = new ArrayList<Integer>();
        int numeroNotas = 0;
        double promedioCalculado = 0.0;
        int valorX = 0;
        int notaAlta = 0;
        int notaBaja = 0;
        
        System.out.print("Cuantas notas seran ingresadas? ");
        numeroNotas = scan.nextInt();
        System.out.println("----------");
        calificaciones = IngresoNotas(numeroNotas);
        
        MostrarCalificaciones(calificaciones);
        promedioCalculado = CalculoPromedioNotas(calificaciones);
        System.out.printf("El promedio de notas es: %.2f",promedioCalculado);
        System.out.println("");
        
        MostrarCalificaciones(calificaciones);
        System.out.println("Indicar que numero de calificacion quieren eliminar");
        valorX = scan.nextInt();
        EliminarNota(valorX, calificaciones);
        MostrarCalificaciones(calificaciones);
        
        notaAlta = NotaMasAlta(calificaciones);
        notaBaja = NotaMasBaja(calificaciones);
        
        System.out.println("Nota Mas Alta:"+notaAlta);
        System.out.println("\nNota Mas Baja:"+notaBaja);
        
        
    }//Fin Main
    
    /**
     * Es una funcion que me permite ingresar notas dentro de un rango
     * 70 y 100;
     * @param cantidadNotas Es la variable que se utiliza para determinar
     * cuantas notas ser[an agregadas por medio de la funcion random en el
     * arreglo.
     * @return notasTemporales Variable que tiene almacenado en forma de 
     * ArrayList las calificaciones generadas por la libreria Random.
    */
    public static ArrayList<Integer> IngresoNotas(int cantidadNotas){
        ArrayList<Integer> notasTemporales = new ArrayList<Integer>();
        int notaRandomGenerado = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            //notaRandomGenerado = rd.nextInt(100);//0 y 99
            notaRandomGenerado = rd.nextInt(31)+70; //70 - 100
            notasTemporales.add(notaRandomGenerado);
        }
        return notasTemporales;
    }//Fin Funcion
    
    /**
     @param colecionDatos Variable que recibe el ArrayList de las notas almacenadas
     */
    public static void MostrarCalificaciones(ArrayList<Integer> colecionDatos){
        int dimensionArreglo = colecionDatos.size();//Obtener tamanio del ArrayList
        for (int i = 0; i < dimensionArreglo; i++) {
            System.out.printf("Calificacion %d: %d",i+1,colecionDatos.get(i));
            System.out.println("");
        }
    }//Fin Funcion
    
    /**
     * @param colecionDatos, Variable que recibe el ArrayList de las notas almacenadas
     */
    public static double CalculoPromedioNotas(ArrayList<Integer> colecionDatos){
        double resultado = 0;
        int sumaNotas = 0;
        
        for (int i = 0; i < colecionDatos.size(); i++) {
            sumaNotas += colecionDatos.get(i);
        }
        resultado = sumaNotas / colecionDatos.size();
        return resultado;
    }//Fin de Funcion
    
    
    public static void EliminarNota(int posicion,ArrayList<Integer> cd){
        cd.remove(posicion-1);       
    }//Fin Funcion
    
    public static int NotaMasAlta(ArrayList<Integer> cd){
        int notaMAX = 0;
        
        for (int i = 0; i < cd.size(); i++) {
            int temporal = 0;
            temporal = cd.get(i);
            
            if(temporal>notaMAX){
                notaMAX = temporal;
            }
        }
        
        return notaMAX;
    }//Fin Funcion
    
    public static int NotaMasBaja(ArrayList<Integer> cd){
        int notaMIN = 100;
        
        for (int i = 0; i < cd.size(); i++) {
            int temporal = 0;
            temporal = cd.get(i);
            
            if(temporal<notaMIN){
                notaMIN = temporal;
            }
        }
        
        return notaMIN;
    }
    
}//Fin Class
