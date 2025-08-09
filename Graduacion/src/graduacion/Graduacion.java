/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graduacion;

import java.util.Scanner;

/**
 *
 * Ejercicio
 * 
 * Imagine su persona que ya esta en la recta final del tecnico, pronto a graduarse
 * pero no sabe si lo va poder completar. Para poder graduarse necesita
 * 1ro tener un indice de graduacion mayor a 70
 * 2do, el saldo con la universidad tiene que ser 0 deuda
 * 3er, el numero de horas de vinculacion, mayor a 25 horas.
 * 
 * Para la premiacion en la ceremonia de graduacion se hace de acuerdo a cualquier
 * de los siguientes elementos:
 * 1. Un indice mayor a 85 
 * 2. Haber realizado a lo largo del tecnico, dos proyectos  de investigacion.
 * 
 * 
 */
public class Graduacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Operadores Boleanos
            1. AND (&&) -> Y
            2. OR  (||) -> O
            3. NOT (!)  -> Negado
        
        AND-> Todas las condiciones de entrada, tiene que ser verdadero (true)
        para que la salida seaa factible (true).
        
        OR -> Todas las condiciones de entrada tienen que ser falsa (false)
        para que la salida sea falsa. 
        Con que una de las entradas sea verdadera, la salida sera verdadera.
        
        NOT -> Es la negacion o el valor opuesta. La salida sera opuesto a
        la entrada.
            
        
        */
        Scanner graduacion = new Scanner(System.in);
        double indice = 0.0;
        char deuda = '@';
        int horasVinculacion = 0;
        int numProyectos = 0;
        
        System.out.println("Cual es tu indice final?");
        indice = graduacion.nextDouble();
        
        System.out.println("Cuentas con tu deuda en 0? (S/N)");
        deuda = graduacion.next().toUpperCase().charAt(0);
        
        System.out.println("Indicanos tus horas de vinculacion");
        horasVinculacion = graduacion.nextInt();
        
        if (indice >= 70 && deuda == 'S' && horasVinculacion > 25){
            System.out.println("Te puedes graduar");
            System.out.println("Cuantos proyectos realizaste?");
            numProyectos = graduacion.nextInt();
            if (indice >= 85 || numProyectos >= 2){
                System.out.println("Felicidades, recibiste mencion honorifica");
            }//Fin IF Interno
        }//Fin IF Externo
        
        else{
            System.out.println("No cumples con todos los requisitos");
        }
    }//Fin de Main
    
}//Fin de Class
