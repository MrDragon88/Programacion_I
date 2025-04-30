/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;


/**
 *
 * @author Oscar Andrade
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*
        Este es un programa que estaremos desarrollando
        para la clase de Programacion I donde
        buscamos conocer e interactuar por 1ra vez
        con el lenguaje de programación Java
        haciendo un Hola Mundo!!!!!
      */  
      
      //Comando para imprimir/mostrar en pantalla
      System.out.println("Hola Oscar!");
      System.out.println("Hezte ez tu 1er projram[a en Java!!!");
      
      //Comando para imprimir en pantalla
      System.out.print("Yujuuu....sale algo!");
      System.out.print("Veamos otra cosa");
      
      //Caracteres de Escape
      /*
        alt + 92 -> \
        \n -> Salto de Linea
        \t -> Tabulacion
        \" -> "
      */
      System.out.print("\nProbando Salto \nde Linea");
      System.out.print("\tLa tabulacion \tes un espacio \t\"grande\" ");

      //Variable
      //Lenguaje Fuertemente Tipado
      
      //Numeros Enteros
      int edad = 0;
      
      //Numeros Decimales
      double estatura = 0.0;
      
      Scanner scan = new Scanner(System.in);
      System.out.println("Tu edad cual es? ");
      edad = scan.nextInt();
      
      System.out.println("Cual es tu estatura?");
      estatura = scan.nextDouble();
      
      System.out.printf("\nTu edad es: %d \nTu estatura es: %f",edad,estatura);
      }//Fin de MAIN
    
}//FIN de Class
