/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalmedico;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class HospitalMedico {

     /*
        Su persona es el nuevo administrador del hospital 
        “Programando Hospitales”. El hospital posee 4 áreas: 
        Urgencias, Pediatría, Traumatología y Psiquiatria, que operan 
        directamente por las donaciones recibidas por las personas; 
        sin embargo, la distribución del dinero no la hace el donante, 
        sino el administrador, dejando un presupuesto anual distribuido
        de la siguiente manera:

    Área Presupuesto
    a. Urgencias 45%
    b. Pediatría 30%
    c. Traumatología 15%
    d. Psiquiatría 10%
    
    Debe ingresar el monto de donación que recibe por parte de 
    los patrocinadores y mostrar en pantalla cuanto es el monto 
    que tiene el departamento/área de su elección.
    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            Banco Prueba
            Ingreso             $1 000 000
            a. Urgencias         $450 000
            b. Pediatría         $300 000
            c. Traumatología     $150 000
            d. Psiquiatría       $100 000
        */
        //Estructura de Seleccion
        //Tipo Multiple (Switch)
        //Switch equivalente con if/else ==
        /*
            Estructura del Switch
            1. Se trabaja con opciones del nivel jerarquico
            2. Se encierra en bloques de { }
            3. Palabras Clave
                a. switch
                b. case -> seguido de dos puntos :
                c. break -> interrupcion
                d. default
        */
        char opcion1 = '#';
        int opcion2 = 0;
        double montoDonado = 0;
        double resultado = 0;
        String nombreDepa="John Doe";
        
        Scanner doc = new Scanner(System.in);
        
        System.out.println("Hospital Medico");
        System.out.println("***************");
        System.out.println("");
        System.out.print("Cuanto quieres donar: ");
        montoDonado = doc.nextDouble();
        
        System.out.println("Seleccion Menu");
        System.out.println("1. Urgencia");
        System.out.println("2. Pediatria");
        System.out.println("3. Traumatologia");
        System.out.println("4. Psiquiatria");
        System.out.print("Cual es tu opcion seleccionada: ");
        opcion1 = doc.next().toUpperCase().charAt(0);
        
        /*
            Condicion
            a. Caracter (letra, digito o simbolo)
            b. Numero Entero
            c. Cadenas
        */
        switch(opcion1){
            case '1':
                resultado = montoDonado * 0.45;
                nombreDepa = "Urgencias";
                break;//Interrupcion
            case '2':
                resultado = montoDonado * 0.30;
                nombreDepa = "Pediatria";
                break;
            case '3':
                resultado = montoDonado * 0.15;
               nombreDepa = "Traumatologia";
                break;
            case '4':
                resultado = montoDonado * 0.10;
                nombreDepa = "Psiquiatria";
                break;
                
            default:
                System.out.println("No existe el departamento");
                System.out.println("Pasa a las arcas de la institucion");
                break;
        }//Fin de Switch
        System.out.printf("Le corresponde: %.2f al departamento"
                + "de %s",resultado,nombreDepa);
    }//Fin de Main
    
}//Fin de Class
