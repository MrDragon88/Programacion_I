/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurafor;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class EstructuraFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            Estructura de Repeticion
            1. Condicion
            2. Modificador
            3. Instrucciones Repetidas
        */
        //Contador del 1 - 10
        System.out.println("Conteo Ascedentene");
        for(int i = 1 ; i<=10 ;i++){
            //Instrucciones que se repiten
            System.out.printf("# %d\n",i);
        }//Fin de For
        
        System.out.println("\nConteo Descendente");
        //Contador del 10 - 1
        for (int i = 10; i >0 ; i--) {
            System.out.printf("# %d\n",i);
        }//Fin de For
        
        //Parte 1->Desarrollar un conteo del 1 al 30, en secuencia
        //de 2.
        //Parte 2->Modificarlo de forma tal que el usuario 
        //indique donde inicia y donde termina.
        //Parte 3-> Repetir la ejecucion del conteo
        //hasta que el usuario diga lo contrario
        Scanner sc = new Scanner(System.in);
        int inicio = 0;
        int fin = 0;
        char respuesta = '@';
        while(respuesta != 'n'){
            System.out.println("Conteo 1 - 30");
            System.out.println("");

            System.out.print("Donde comienzas: ");
            inicio = sc.nextInt();
            System.out.print("Donde terminas: ");
            fin = sc.nextInt();     

            for (int i = inicio; i <= fin; i +=2) {
                System.out.printf("# %d\n",i);
            }//Fin de For
            
            System.out.println("Desea Repetir Conteo?");
            System.out.print("Si = s, No = n\tRespuesta: ");
            respuesta = sc.next().toLowerCase().charAt(0);
        }//Fin de While
        
        
    }//Fin Main
    
}//Fin Class
