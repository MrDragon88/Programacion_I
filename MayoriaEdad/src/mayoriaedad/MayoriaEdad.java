/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayoriaedad;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class MayoriaEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Desarrollar un algoritmo que me permita
            determinar la edad de una persona cuando
            ingresa su anio de nacimiento para poder establecer:
            1. Que tiene mayoria de edad (18 anios para arriba)
            2. Que es ciudadano hondurenio (21 anios para arriba)
        */
        
        Scanner scan = new Scanner(System.in);
        int edad = 0;
        int anioNacimiento = 0;
        char genero = '@';
        
        System.out.print("Ingrese su Anio de Nacimiento: ");
        anioNacimiento = scan.nextInt();
        edad = 2025 - anioNacimiento;
        
        System.out.println("Ingrese su Genero (M = Masculino, F = Femenino)");
        genero = scan.next().toUpperCase().charAt(0);
        
        
        //Estructura de Seleccion Anidada
        if(edad >= 18){
            System.out.println("Ya cumpliste tu mayoria de edad");
            
            if(edad>=21){
            System.out.println("Ya eres ciudadano hondurenio tambien");
            }
        }
        else{
            System.out.println("Falta todavia para alcanzar mayoria edad");
        }
        
        //Estructura de Seleccion Multiple
        /*
            LIM_INF y LIM_SUP
            0 - 17 anios => ninio
            18 - 30 anios => joven adulto
            31 - 59 anio  -> adulto
            60 - 79 anio -> Adulto Tercera Edad
            80 parra arriba -> Adulto de 4ta Edad
        */
        
        System.out.printf("\nLa edad del usuario es: %d\n",edad);
        //Operacion Booleana (AND)- (Y)
        
        if(edad >= 0 && edad<=17)
        {
            System.out.println("Usted es un ninio");
        }
        else if(edad >=18 && edad<=30)
        {
            System.out.println("Usted es un joven adulto");
        }
        else if(edad>=31 && edad<=59)
        {
            System.out.println("Usted es un adulto");
        }
        else if(edad>=60 && edad<=79)
        {
            System.out.println("Usted es un adulto de la tercera edad");
        }
        else if(edad>=80 && edad<=125)
        {
            System.out.println("Usted es un adulto de la 4ta edad.");
        }
        else{
            System.out.println("Mijo...ingrese anios que tengan sentido!!!");
        }
        
        if(edad >=18 || genero == 'F'){
            System.out.println("Ingresate a Disco");
        }
        else{
            System.out.println("Pierdase.....!!!");
        }
        
        //Operacion Booleana
        /*
            AND (&&)
            
            E1      E2      S
            Falso   Falso   Falso
            Falso   True    Falso
            True    Falso   Falso
            True    True    True
            
            OR  (||)
        
            E1      E2      S
            Falso   Falso   Falso
            Falso   True    True
            True    Falso   True
            True    True    True
            NOT (!)
        */
        
        /*
        if(edad>=80)
        {
            System.out.println("4ta Edad");
        }
        else if(edad>=60)
        {
            System.out.println("3ra Edad");
        }
        else if(edad >=30)
        {
            System.out.println("Adulto");
        }
        else if(edad>=18)
        {
            System.out.println("Joven Adulto");
        }
        else
        {
            System.out.println("ninio");
        }
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//Fin Main
    
}//Fin Class
