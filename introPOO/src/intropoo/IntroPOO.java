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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Estudiante Pepito = new Estudiante();
        Estudiante Menganito = new Estudiante();
        Estudiante Oscar = new Estudiante("Oscar",21);
        
        Ventana principal = new Ventana();
        principal.setVisible(true);
       /* 
        Pepito.MostrarDatos();
        System.out.println("");
        
        System.out.println("Nombre: "+ Pepito.getNombre());
        Pepito.setNombre("James");
        System.out.println("Nombre: "+ Pepito.getNombre());
        
        //Menganito.MostrarDatos();
        //Oscar.MostrarDatos();
        */
        
    }//Fin Main
    
}//Fin Class
