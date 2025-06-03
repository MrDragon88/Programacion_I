/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introfunciones;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class IntroFunciones {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
            
            Scanner sc  = new Scanner(System.in);
            int acumI = 0;
            int acumII = 0;
            int examenI = 0;
            int examenII = 0;
            double notaFinal = 0;
            /*
            do{
                System.out.print("Ingrese la nota del Acum del I Parcial (0 - 30): ");
                acumI = scan.nextInt();
                
                if(acumI < 0 || acumI>30){
                    System.out.println("Nota no valida...tiene que ser entre 0  y 30");
                    System.out.println("Ingrese nuevamente la nota.!!");
                }
            }while(acumI < 0 || acumI>30);
            System.out.println("");
                        
            do{
                System.out.print("Ingrese la nota del Acum del II Parcial (0 - 30): ");
                acumII = scan.nextInt();
                
                if(acumII < 0 || acumII>30){
                    System.out.println("Nota no valida...tiene que ser entre 0  y 30");
                    System.out.println("Ingrese nuevamente la nota.!!");
                }
            }while(acumII < 0 || acumII>30);
            
            System.out.println("");
            do{
                System.out.print("Ingrese la nota del Exam del I Parcial (0 - 20): ");
                examenI = scan.nextInt();
                
                if(examenI < 0 || examenI>20){
                    System.out.println("Nota no valida...tiene que ser entre 0 y 20");
                    System.out.println("Ingrese nuevamente la nota.!!");
                }
            }while(examenI < 0 || examenI>20);
            
            System.out.println("");
            do{
                System.out.print("Ingrese la nota del Exam del II Parcial (0 - 20): ");
                examenII = scan.nextInt();
                
                if(examenII < 0 || examenII>20){
                    System.out.println("Nota no valida...tiene que ser entre 0  y 20");
                    System.out.println("Ingrese nuevamente la nota.!!");
                }
            }while(examenII < 0 || examenII>20);
            */
            System.out.print("Ingrese la nota del Acum del I Parcial (0 - 30): ");
            acumI = sc.nextInt();
            acumI = ValidarNota(acumI);
            
            System.out.print("Ingrese la nota del Acum del II Parcial (0 - 30): ");
            acumII = sc.nextInt();
            acumII = ValidarNota(acumII);
            
            System.out.print("Ingrese la nota del Examen del I Parcial (0 - 20): ");
            examenI = sc.nextInt();
            examenI = ValidarNota(examenI);
            
            System.out.print("Ingrese la nota del Examen del II Parcial (0 - 20): ");
            examenII = sc.nextInt();
            examenII = ValidarNota(examenII);
            
            
            notaFinal = acumI + acumII + examenI + examenII;
            
            System.out.println("Su promedio es: "+notaFinal);
 
    }//Fin Main
    
    static public int ValidarNota(int notaIngresada){
        Scanner scan  = new Scanner(System.in);

        int notaValidada = 0;        
        do {
            if (notaIngresada < 0 || notaIngresada > 30) {
                System.out.println("Nota no valida...tiene que ser entre 0  y 30");
                
                System.out.print("Ingrese la nota Nuevamente: ");
                notaIngresada = scan.nextInt();
            }
        } while (notaIngresada < 0 || notaIngresada > 30);
        notaValidada = notaIngresada;
        System.out.println("");
        
        return notaValidada;
    }//Fin Funcion Validar Nota
    
    /*
        Una función/método está construido por 4 partes
        1. Tipo/Modificar de Acceso
           a. Public
           b. Private
           c. protected
    
        2. Tipo de Retorno
            a. int
            b. double
            c. String
            d. char
            e. boolean
            f. void
    
        3. Nombre de la Funcion
    
        4. Parametros
    
    */
    
    
}//Fin Class
