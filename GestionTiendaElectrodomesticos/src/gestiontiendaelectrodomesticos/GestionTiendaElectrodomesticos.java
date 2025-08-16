/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestiontiendaelectrodomesticos;

import java.util.Scanner;

/**
 *
 * 
 * 
    Gestión de una Tienda de Electrodomésticos
    
    Una tienda de electrodomésticos necesita un programa para 
    gestionar las ventas de un día. El programa debe permitir 
    al vendedor ingresar el precio de los productos vendidos y 
    calcular el total de la venta. El programa debe usar ciclos 
    while de diferentes tipos para cada tarea.

    Requisitos:

    1. Ventas de la mañana (contador ascendente):

    Al inicio, el programa debe preguntar al vendedor cuántas ventas 
    se realizaron en la mañana.

    Luego, usando un ciclo while con un contador ascendente, el 
    programa debe pedir al precio de cada uno de esos productos y 
    sumar los precios para obtener el total de ventas de la mañana.

    2. Ventas de la tarde (contador descendente):

    El programa debe volver a preguntar cuántas ventas se realizaron 
    en la tarde.

    Usando un ciclo while con un contador descendente, debe pedir el 
    precio de cada producto y calcular el total de ventas de la tarde.
    si la venta del producto es arriba de 100, decir que esta caro, sino
    que esta barato

* 
* 
* 
    3. Ventas de la noche (bucle centinela):

    El programa debe comenzar a pedir los precios de los productos vendidos
    en la noche.

    Se debe usar un valor centinela para indicar el final de la entrada 
    de datos. Por ejemplo, el vendedor puede ingresar un número negativo 
    (como -1) o una letra para para dejar de ingresar precios. 
    
    El bucle while debe continuar pidiendo precios hasta que el usuario 
    ingrese el valor centinela.

    El valor centinela no debe sumarse al total de las ventas de la noche.

    Resumen final:

    Al finalizar, el programa debe mostrar el total de ventas de la mañana,
    el total de ventas de la tarde y el total de ventas de la noche.

    Finalmente, debe mostrar el total general de ventas del día.
 */
public class GestionTiendaElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        int numVentas = 0;
        double precioVenta = 0;
        double ventaTotalMan = 0;
        int contador = 1;
        
        //Venta de la Maniana
        System.out.println("Ventas de la Maniana");
        System.out.printf("Cuanto vendiste? ");
        numVentas = scan.nextInt();
        
        while(contador<=numVentas){
            System.out.printf("Cuento  te salio en venta producto"
                    + " #%d: ",contador);
            precioVenta = scan.nextDouble();
            ventaTotalMan += precioVenta;
            //ventaTotalMan = precioVenta + ventaTotalMan;
            contador++;
        }//Fin de While Ascendente
        System.out.printf("La venta total de la maniana fue: %.2f",ventaTotalMan);
    }//Fin de Main
    
}//Fin de Class
