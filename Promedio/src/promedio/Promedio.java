/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            Determinar si un estudiante X, ha aprobado o no
        la materia que esta cursando. Siendo necesario calcular
        el promedio apartir de tres notas ingresadas. El mensaje
        tendra que ser personalizado.
        */
        
        Scanner scan = new Scanner(System.in);
        
        //Creacion de Variables
        
        int nota1=0;
        int nota2=0;
        int nota3=0;
        double promedio =0;
        String nombre ="John Doe";
        
        System.out.println("Calculando Promedios");
        System.out.print("Dime tu 1ra Nota: ");
        nota1 = scan.nextInt();
        
        System.out.print("Dime tu 2da Nota: ");
        nota2 = scan.nextInt();
        
        System.out.print("Dime tu 3ra Nota: ");
        nota3 = scan.nextInt();
        
        //Calculando el promedio, siguiendo el orden de operacion
        //Opcion 1
        //promedio = (nota1 + nota2 + nota3 )/ 3;
        
        //Opcion 2
        //Casting ->Creacion Temporal de una Variable
        promedio = (
                        (double)nota1 +
                        (double)nota2 +
                        (double)nota3 
                   )/3;
        
        //Mostrar el resultado
        System.out.printf("%n Tu promedio fue de :%.2f",promedio);
        
        /*
            Estructuras de Seleccion (Toma de Decision)
            1. Simple
            2. Doble
            3. Multiple
            4. Anidadas
        
            SIMPLE/DOBLE
            Palabras Claves: if,else
            
            1. Condicion de Evaluacion (Comparar)
                a. VERDADERO /TRUE
                b. FALSO     /FALSE
            2. Bloques de Instrucciones van
               dentro de { } y no llevan ;
        
            3. if   -> Lleva la condicion
               else -> NO LLEVA condicion

               Comparacion de Datos Numericos
               i.   a >  b     -> a es mayor b
               ii.  a <  b     -> a es menor b
               iii. a >= b     -> a es mayor o igual b
               iv.  a <= b     -> a es menor o igual b
        
               v.   a == b     -> a es IGUAL b 
                    (Un igual equivale a ASIGNACION)
                    (Dos iguales equivale a COMPARACION)
               vi   a != b      -> a es distinto b     
               
       
        */

        if(promedio>=65){
            //VERDADERO
            System.out.printf("%n estas APROBADO con %.2f",promedio);
        }//Fin de IF
        else {
            //FALSO
            System.out.printf("%nREPROBASTE con %.2f",promedio);
        }//Fin de Else
        
        
        System.out.println("Dime tu nombre");
        nombre = scan.next();
        
        if(nombre.equals("oscar")){
            System.out.println("heyyy, nos llamamos igual");
        }
        else
        {
            System.out.println("Mi nombre es oscar");
        }
        
    }//Fin Main
    
}//Fin Class
