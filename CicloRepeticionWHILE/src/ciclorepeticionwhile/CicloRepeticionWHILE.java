/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclorepeticionwhile;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class CicloRepeticionWHILE {

    /**
     * Estructuras de Repeticion
     * a. While
     * b. Do...while
     * c. For
     * d. foreach
     * 
     * 
     * Elementos de Estructura de Repeticion
     * a. Condicion
     * b. Modificacion de la Condicion
     * c. Instrucciones que se van repetir
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Desarrollar un algoritmo que tenga que ingresar
            tres notas y calcular el promedio. Determinar
            si se aprueba(>70) la asignatura o no.
        */
        
        Scanner scan = new Scanner(System.in);
       /*
        double promedio = 0.0;
        int contadorNotas = 1;
        int nota = 0;
        int sumaNotas = 0;
        
        //While se ejecuta siempre que la condicion sea verdadera
        while(contadorNotas <=3){
            
            //Instrucciones a Repetir
            System.out.printf("Ingrese Nota %d: ",contadorNotas);
            nota = scan.nextInt();
            sumaNotas += nota; // sumaNotas = sumaNotas + nota;
            
            //Modificador de la Condicion
            contadorNotas++;
            
            //System.out.printf("Contador: %d",contadorNotas);
            //System.out.println("");
        }//Fin de While
        
        promedio = sumaNotas / --contadorNotas;
        System.out.printf("\nPromedio: %.2f",promedio);
        System.out.println("");
        if(promedio >= 70){
            System.out.println("Asignatura Aprobada");
        }
        else{
            System.out.println("Asignatura REPROBADA!!!");
        }
       
        */

    
    }//Fin Main
    
}//Fin  Class.

/*
    Ejercicio 1
    Desarrollar el algoritmo que me permita simular el comportamiento
    de un cajero del supermercado; donde el usuario lleva 10 productos.
    Indicar por medio de teclado, el precio de cada uno de los productos
    forma dinámica.

    Mostrar la suma total en precio de los productos que se llevan a comprar
    Si la compra es más de Lps 1000.00, indicarle al usuario que tiene
    que pagar con tarjeta de credito/debito, sino...puede pagar en efectivo.
    Mostrar el mensaje donde indique la forma de pago que se estará haciendo.

    Ejercicio2
    Su persona va camino al mercado para abastecerse de provicios alimenticias 
    para semana; sin embargo todos en su familia, le encarga siempre porque
    no les gusta irse a meter al mercado. Desarollar un algoritmo que
    me indique cuatro cosas.
    a. Cantidad de Libras que se llevan
    b. Cantidad de libras que se lleva por categoria
    c. Gasto total de compra
    c. Gato de compra por categoria.

    Categorias
    1. Lacteos, Lps 60.00 x lbs
    2. Carnes,  Lps 120.00 x lbs
    3. Verduras Lps 30.00 x lbs
    4. Frutas   Lps 50.00 x lbs

    Pasar por 5 puestos comprando las cosas
*/
