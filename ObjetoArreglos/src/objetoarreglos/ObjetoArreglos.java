/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objetoarreglos;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author Oscar Andrade
 */
public class ObjetoArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ArrayList
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>(); 
        
        ArrayList<Double> estatura = new ArrayList<>(); 
        double[] estatura2;
        
        ArrayList<Integer> edad = new ArrayList<>(); 
        int[] edad2;
        
        ArrayList<Character> iniciales = new ArrayList<>(); 
        char[] iniciales2;
        
        ArrayList<Boolean> estado = new ArrayList<>(); 
        boolean estado2;
        
        nombres.add("Oscar");//Add es para agregar en array List
        nombres.add("Roger");
        nombres.add("Kevin");
        nombres.add("Nahum");
        nombres.add(0,"Xavier");//Indice 0 - > 1ra Posicion
        
        System.out.printf("Nombre de la Persona en el Arreglo");
        System.out.println("");
        for (int i = 0; i < nombres.size(); i++) {//size indica el tamanio del arreglo
            System.out.printf("%d)%s",i+1,nombres.get(i));//get -> Obtiene el valor guardado
            System.out.println("");
         }
        System.out.println("\nNombres Arreglados de Forma Ascendente");
        Collections.sort(nombres);
        for (int i = 0; i < nombres.size(); i++) {//size indica el tamanio del arreglo
            System.out.printf("%d)%s",i+1,nombres.get(i));//get -> Obtiene el valor guardado
            System.out.println("");
         }
        
        System.out.println("\nNombres Arreglados de Forma Descendente");
        Collections.sort(nombres,Collections.reverseOrder());
        for (int i = 0; i < nombres.size(); i++) {//size indica el tamanio del arreglo
            System.out.printf("%d)%s",i+1,nombres.get(i));//get -> Obtiene el valor guardado
            System.out.println("");
         }//Fin de For
        
        //Modificacion de algun elemento dentro del arreglo
        nombres.set(3, "Pedro");
        System.out.println("\nNombre de Arregla Modificado");
        for (int i = 0; i < nombres.size(); i++) {//size indica el tamanio del arreglo
            System.out.printf("%d)%s",i+1,nombres.get(i));//get -> Obtiene el valor guardado
            System.out.println("");
         }//Fin de For
        
        //Eliminando algun elemento dentro del arreglo
        nombres.remove(3);
        System.out.println("\nQuitando un elemento del ArrayList");
        //For Mejorado que solo sirve para visualizar una colección elementos
        for(String despligue:nombres){
            System.out.printf("%s\n",despligue);  
        }
        
    }//Fin Main
    
}//Fin Class
