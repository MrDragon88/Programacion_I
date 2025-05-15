/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ingresonumeros;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class IngresoNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Ingresar 10 numeros aleatorios al sistema, de forma que me cuente
            los números que están dentro del grupo A (11 - 13), grupo B (14-16)
            y grupo C (17-20), el resto de numeros no se puede aceptar.
            Mostrar la cantidad de numeros que pertenencen a cada grupo.
        
            Fases
            1. Ingresar los 10 numeros desde teclado
            2. Clasificar x grupo los numeros
            3. Contar los numeros para cada grupo.
            4. Mostrar los resultados
            5. Implementar restriccion de numeros fuera del rango
            6. Generar los numeros de manera aleatoria.
        */
        
        //Estructura Repeticion
        //1.Condicion se cumple(verdadero) o no (falso)
        //2.Instrucciones de Repeticion
        //3.Modificador de la Condición
        /*
            - Contador  ->cuenta de manera FINITA/LIMITADO
            - Centinela ->cuenta de manera "INFINITO"
            
            *While
                Evalua la condicion primero para determinar si se ejecuta o no.
            *Do ... While
                Ejecuta al menos 1 vez antes de evaluar la condicion y determinar
                si se continua o no.
            
        */
        
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        int numeroIngresado = 0;
        int conteoNumero = 1;
        int totalGrupoA = 0;
        int totalGrupoB = 0;
        int totalGrupoC = 0;
        
        while(conteoNumero <= 10){
            
            do{
                //System.out.printf("\nIngresar numero %d: ",conteoNumero);
                //numeroIngresado = input.nextInt();
                
                numeroIngresado = rd.nextInt(11,21);//11-20
                System.out.printf("\nIngresar numero %d: %d",conteoNumero,numeroIngresado);
                
            }while(numeroIngresado<11 || numeroIngresado>20);
            
            
            
            //Operacion Booleana AND - OR - NOT
            //AND -> "Y" = multiplicacion -simbolo &&(ampersand)
                //Para que la salida AND sea VERDADERO, todas las condiciones tienen que ser
                //Verdadero
            //OR -> "O" = suma -simbolo ||(valor absoluto)
                //Para que la salida OR sea VERDADERO, al menos una condicion tiene que ser
                //verdadero
            //NOT -> No = negacion - simbolo !(exclamacion)
                //La salida NOT es opuesto a la condicion de entrada
                
            if(numeroIngresado>=11 && numeroIngresado <=13){
                System.out.println("Grupo A");
                totalGrupoA++;
            }
            else if(numeroIngresado>=14 && numeroIngresado <=16){
                System.out.println("Grupo B");
                totalGrupoB++;
            }
            else if(numeroIngresado>=17 && numeroIngresado <=20){
                System.out.println("Grupo C");
                totalGrupoC++;
            }
            else{
                System.out.println("Numero No valido...tiene que ser entre 11 y 20");
            }
            conteoNumero++;//Contando de 1 en 1
        }//Fin de While
        System.out.println("---------------------------");
        System.out.printf("Total Numeros Grupo A: %d",totalGrupoA);
        System.out.printf("\nTotal Numeros Grupo B: %d",totalGrupoB);
        System.out.printf("\nTotal Numeros Grupo C: %d",totalGrupoC);
        
        
   
        
           
    }//Fin Main
    
}//Fin Class
