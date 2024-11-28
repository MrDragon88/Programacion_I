/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intropoo;
import java.util.Scanner;
/**
 *
 * @author Oscar Andrade
 */
public class IntroPOO {

    /*
        Estructuras Secuenciales
        Estructuras Condicionales / Seleccion
        Estructuras de Repeticion (While, Do While, For, Foreach)
        Arreglos
        Funciones
    
    
        Estudiante, que ingresamos las notas, 2 de examen y dos acumulativo
        sacar la nota final y determinar aprobo o reprobo
    
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        Estudiante Oscar = new Estudiante("Oscar","Andrade");
        Estudiante Edgardo = new Estudiante("Edgardo","Gonzales");
        Estudiante Prueba = new Estudiante();
        
        Oscar.DatosEstudiante();
        //Edgardo.DatosEstudiante();
        //Prueba.DatosEstudiante();
        Oscar.setNombre("DANIEL");
        Oscar.DatosEstudiante();
        
        System.out.print("Ingrese Nombre: ");
        String tempNombre = scan.next();
        
        Oscar.setNombre(tempNombre);
        Oscar.DatosEstudiante();

        
    }//Fin  Main
    
}//Fin Class
