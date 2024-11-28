/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos_dinamicos;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Oscar Andrade
 */
public class Arreglos_Dinamicos {

    static Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> notas= new ArrayList<>(); //Tipo entero (int)
        
        notas = CreacionArray();
        MostrarResultados(notas);
        

    }//Fin Main
    
    public static ArrayList<Integer> CreacionArray(){
        ArrayList<Integer> notas= new ArrayList<>(); //Tipo entero (int)
        int notaTemporal = 0;
        
        while(notaTemporal>=0){
            System.out.println("Ingresar un Numero Negativo para Salir");
            System.out.printf("Ingrese Nota: ");
            notaTemporal = scan.nextInt();
            if(notaTemporal >= 0){
                notas.add(notaTemporal);
            }
        }//Fin While

        return notas;
    }//Fin Funcion CreacionArray
    
    public static void MostrarResultados(ArrayList<Integer> arreglo){
        for(int i = 0 ; i<arreglo.size();i++ ){
            System.out.printf("Nota %d: %d\n",i+1,arreglo.get(i));
            
        }//Fin For
    }//Fin Funcion Mostrar Resultados
    
}//Fin Class
