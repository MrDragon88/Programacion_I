/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticiondowhile;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Oscar Andrade
 */
public class CicloRepeticionDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int nota = 0;
        int sumaNota =0;
        int contador = 0;
        int centinela = 0;
        double promedio = 100;
        final int MAX = 100;
        final int MIN = 0;
  
    //Ejecuta al menos 1 vez antes de evaluar si continua o no
    
    while(centinela != 'a'){
        System.out.printf("Ingrese su nota %d: ",contador + 1);
        //nota = sc.nextInt();

        //Opcion 1 de Numero Aleatorio
        nota = (int)(Math.random()*MAX) + MIN;
        
        //Opcion 2 de Numero Aleatorio
        //import java.util.Random;
        nota = rand.nextInt(100);
        System.out.printf("\nNota Random: %d",nota);
        do{
            //alt + 124 ->|
            //Operador OR -> ||
            if(nota<0 || nota>100){
                System.out.println("Nota tiene que ser entre 0  y 100");
                System.out.printf("Nota %d: ",contador+1);
                nota = sc.nextInt();
            }
        }while(nota<0 || nota>100);
        
        sumaNota += nota;
        contador ++;
        
        System.out.print("\nDesea ingresar otra nota (-1 = No)? ");
        centinela = sc.nextInt();
    }//Fin de While
    promedio = sumaNota / contador;
    System.out.printf("Promedio es: %.2f",promedio);
      
    
    
    }//Fin Main
    
}//Fin Class
