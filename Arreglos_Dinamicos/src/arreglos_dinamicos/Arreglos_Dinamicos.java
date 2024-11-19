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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> notas= new ArrayList<>(); //Tipo entero (int)
        Scanner scan = new Scanner(System.in);
        int notaTemporal = 0;
        
        while(notaTemporal>=0){
            System.out.printf("Ingrese Nota: ");
            notaTemporal = scan.nextInt();
            if(notaTemporal >= 0){
                notas.add(notaTemporal);
            }
        }//Fin While
        
        for(int i = 0 ; i<notas.size();i++ ){
            System.out.printf("Nota %d: %d\n",i+1,notas.get(i));
        }//Fin For
                
        
    }//Fin Main
    
}//Fin Class
