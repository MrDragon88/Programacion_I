/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encuesta;

import java.util.Scanner;

/**
 *
 *      
 *      
        Una empresa de marketing necesita un programa para recolectar 
        datos de encuestas en línea. El programa debe registrar la 
        cantidad de respuestas de cada sección y calcular el puntaje 
        total de la encuesta.

        Requisitos:

        *Sección 1: Datos demográficos (contador ascendente):

        Al inicio, el programa debe preguntar cuántas personas se
        entrevistaron.

        Usando un ciclo while con un contador ascendente, el programa 
        debe solicitar al tabulador que ingrese la edad de los 
        participantes, uno por uno. 
        El programa debe contar cuántas edades se han ingresado y 
        sumar las edades para calcular el promedio al final de 
        la sección.

        *Sección 2: Opinión sobre productos (contador descendente):

        El programa debe preguntar cuántas preguntas de satisfaccion 
        sobre productos se hicieron.

        Usando un ciclo while con un contador descendente, 
        el programa debe pedir que se ingrese un puntaje de 
        satisfacción para cada producto (1 al 10). 
        El programa debe sumar estos puntajes para obtener 
        el total de la sección.

        *Sección 3: Comentarios adicionales (bucle centinela):

        El programa debe comenzar a recibir comentarios 
        adicionales de los encuestados.

        Se debe usar un valor centinela para indicar el 
        final de la entrada de datos. 
        Por ejemplo, el usuario podría ingresar la palabra 
        "FIN" o "TERMINAR" para dejar de ingresar comentarios. 
        
        El bucle while debe continuar pidiendo entradas hasta 
        que se ingrese el valor centinela. Contar el # de veces
        que se ingresan comentarios

 */

public class Encuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
        
        int edad =0;
        int totalPersonasEntre=0;
        int numPersonas =1;
        int sumaEdades = 0;
        double promedio =0;
        
        int totalComentario = 0;
        int totalPuntaje = 0;
        int puntaje =0;
        
        String comentario = "John Doe";
        String centinela = "FIN";
        int contadorComentario = 0;
        
        
        System.out.print("Cuantas personas se entrevistaron: ");
        totalPersonasEntre = scan.nextInt();
        System.out.println("Dime las edades de cada uno");
        while(numPersonas<=totalPersonasEntre){
            System.out.printf("Persona Entrevistada No. %d",numPersonas);
            System.out.printf("\tEdad: ");
            edad= scan.nextInt();
            sumaEdades +=edad;
            numPersonas++;
        } //Fin de While ASCENDENTE
        promedio = sumaEdades / totalPersonasEntre;
        System.out.printf("Promedio de Edad es: %.2f",promedio);
        
        System.out.println("\n");
        System.out.println("*********");
        System.out.println("Seccion 2");
        System.out.println("*********");
        
        System.out.println("Cuantos comentarios se hicieron? ");
        totalComentario = scan.nextInt();
        while(totalComentario>0){
            System.out.printf("Satisfacion Producto #%d:",totalComentario);
            puntaje = scan.nextInt();
            if(puntaje>=1 && puntaje<=10){
                totalPuntaje +=puntaje;
            }else{
                System.out.println("Puntaje No valido");
            }
            totalComentario--;
        }//Fin While DESCEDENTE
        System.out.printf("%nPuntaje Total es: %d",totalPuntaje);
        scan.nextLine();
        
        System.out.println("\n");
        System.out.println("*********");
        System.out.println("Seccion 3");
        System.out.println("*********");
        while(!centinela.equals(comentario)){
            System.out.printf("Dime tu comentario # %d: ",contadorComentario+1);
            comentario = scan.nextLine().toUpperCase();
            if(!comentario.equals(centinela)){
                contadorComentario++;
            }   
        }//Fin de While Centinela
        System.out.printf("# de Comentarios %d",contadorComentario);
        System.out.println("");
    }//Fin de Main
    
}//Fin de Class