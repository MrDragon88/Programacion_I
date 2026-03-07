/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package personas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nombre = new ArrayList<String>();
        ArrayList<Integer> edad = new ArrayList<Integer>();
        ArrayList<Double> peso = new ArrayList<Double>();
        ArrayList<Character> genero = new ArrayList<Character>();
        
        String tempString = "";
        //Agregar datos a un arraylist
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingresa tu nombre: ");
            tempString = scan.nextLine();
            nombre.add(tempString);
            
        }//Fin de Ciclo  FOR
            
        nombre.addAll(AgregarNombres(scan));
        
        char respuesta = '@';
        int indice = 0;
        do{
            MostrarNombres(nombre);
            
            System.out.println("Desea Modificar?(s/n)");
            respuesta = scan.next().toLowerCase().charAt(0);
                        
            if(respuesta == 's'){
                System.out.println("Dime el indice a modificar");
                indice = scan.nextInt();
                scan.nextLine();//Limpieza de Buffer
                System.out.println("Dame el nuevo nombre: ");
                tempString = scan.nextLine();
                nombre.set(indice, tempString);
            }
        }while(respuesta != 'n');
        
        nombre.remove(indice);//Remove es para eliminar un dato
        nombre.clear();//Elimina todos los datos
      
        
    }//Fin de Main
    
    public static ArrayList<String> AgregarNombres(Scanner scan){
        ArrayList<String> temp = new ArrayList<String>();
        char respuesta = '@';
        
        while(respuesta != 'n'){
            System.out.print("Ingrese los nombres: ");
            temp.add(scan.nextLine());
            
            System.out.println("Desea agregar otro?(s/n)");
            respuesta = scan.next().toLowerCase().charAt(0);
            scan.nextLine();
        }
        
        return temp;
    }
    
    public static void MostrarNombres(ArrayList<String> personas){
        System.out.println("\nMostrando Datos");
        //Mostrar datos de un arraylist
        for (int i = 0; i < personas.size(); i++) {
            System.out.printf("Nombre %d: %s\n",i,personas.get(i));
        }
    }//Fin de Funcion Mostrar
    
}//Fin de Class

/*
     *
    ***
   *****

*/