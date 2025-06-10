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
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Estudiante Roger = new Estudiante();
        Estudiante Andrea = new Estudiante("Andrea",'f');
        
        int[] notasTemporales = new int[4];
        
        Roger.MostrarDatosEstudiante();
        Andrea.MostrarDatosEstudiante();
        
        System.out.println("");
        Roger.setNombre("Roger");
        System.out.println(""+Roger.getNombre());
        
        System.out.println("");
        Andrea.setNombre("Andrea Maria");
        System.out.println(""+Andrea.getNombre());

        System.out.println("");
        
        System.out.printf("Ingresemos las Notas para %s",Roger.getNombre());
        for (int i = 0; i < notasTemporales.length; i++) {
            System.out.printf("Nota %d: ",i+1);
            notasTemporales[i]=scan.nextInt();
        }
        
        Roger.setNotas(notasTemporales);
        Roger.MostrarNotas();
    }//Fin Main
    
}//Fin Class

