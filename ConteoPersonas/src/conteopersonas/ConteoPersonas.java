/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conteopersonas;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class ConteoPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Vamos a desarrollar un algoritmo que me permita contabilizar
            el numero de personas que ingresan a una discoteca, sobretodo
            cuantos son varones y cuantos son mujeres. Por estar cerca 
            de la fiesta de el amor y la amistad, se van a estar regalando
            rosas a las mujeres que estén en un rango de edad 21 - 30
            a las demás será un chocolate.
            Contar cuantas mujeres se llevaron rosas y cuantas chocolates.
            El algoritmo se detiene hasta la disco esté lleno!!.
        
            REPETICION (DO...WHILE)
            1a. Contar el numero de personas que ingresan a una discoteca.
            1b. Determinar si, siguen ingresando personas o no.
            
            SELECCION (IF ...ELSE)
            2a. Determinar quienes son mujeres y quienes son varones
            2b. Conteo de varones y mujeres
            2c. Mejorar de seleccion de opciones ingresadas, 
                validar ingreso de dato.
            
            SECUENCIAL
            3. Conocer la edad de las mujeres
        
            SELECCION (IF...ELSE, OPERACION BOOLEANA)
            4. Clasificar el rango de edad de las mujeres.
        
            SECUENCIAL
            5. Conteo de rosas y chocolates.
        
            SECUENCIAL
            6. Mostrar los resultados, total de personas, total de mujeres
            total de varones, numero rosas y chocolates.
        */
            Scanner input = new Scanner(System.in);
            int conteoPersonas = 0;
            char cabenPersonas = 's';
            int conteoVarones = 0;
            int conteoMujeres = 0;
            char genero =  '@';
            int edadMujeres = 0;
            int conteoChocolates = 0;
            int conteoRosas = 0;
            
            do{
                System.out.println("Ingresa una persona...excelente");
                conteoPersonas++;
                
                do{
                    System.out.print("Ingrese su genero (H = hombre, M = Mujer): ");
                    genero = input.nextLine().toUpperCase().charAt(0);
                
                    if(genero == 'M'){
                        System.out.println("Bienvenida querida dama");
                        conteoMujeres++;
                        System.out.print("Querida dama, me ayuda con sus edad: ");
                        edadMujeres = input.nextInt();
                        input.nextLine();
                        /*
                        Opcion 1
                        if(edadMujeres >= 21 && edadMujeres <=31){
                            System.out.println("Tome su rosa");
                        }
                        else{
                            System.out.println("Tome su chocolate");
                        }
                        */
                        
                        //Opcion Dos
                        if(edadMujeres <21 || edadMujeres >31){
                            System.out.println("Tome su chocolate");
                            conteoChocolates++;
                        }
                        else{
                            System.out.println("Tome su rosa");
                            conteoRosas++;
                        }
                    }else if(genero=='H'){
                        System.out.println("Pase maistro!!");
                        conteoVarones++;
                    }else{
                        System.out.println("Opcion no valida...ingrese nuevamente!!!");
                    }
                }while(genero != 'M' && genero !='H');
                
                
                System.out.println("Caben mas personas en discoteca (Si =s)? ");
                cabenPersonas = input.nextLine().toLowerCase().charAt(0);
            }while(cabenPersonas == 's');
            
            System.out.println("Resumen Ejecutivo");
            System.out.printf("Total de Personas: %d",conteoPersonas);
            System.out.printf("\nHombres: %d",conteoVarones);
            System.out.printf("\nMujeres: %d",conteoMujeres);
            System.out.printf("\nRosas: %d",conteoRosas);
            System.out.printf("\nChocolates: %d",conteoChocolates);
            
            System.out.printf("Aqui este texto %d"+conteoVarones,conteoMujeres);
            /*
                %d
                %f
                %s
                %c
                %b
            */
            
            
            
    }//Fin Main
    
}//Fin Class
