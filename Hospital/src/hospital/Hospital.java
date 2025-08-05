/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Hospital {

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
            Banco de Prueba
            Monto a Donar:          $100
            a. Urgencias 45%        $45
            b. Pediatría 30%        $30
            c. Traumatología 15%    $15
            d. Psiquiatría 10%      $10
        */
        //Estructura de Seleccion
        //IF / ELSE ->Dos caminos, donde es TRUE/FALSE
        //SWITCH
        
        /*
            Estructura del Switch
            Se trabaja cuando se tiene más de dos opciones
                que están al mismo nivel jerarquico.
        
            Palabra Clave
            1. switch
            2. case
            3. break
            4.  default
            
            Se encierra entre corchetes { } las instrucciones
        */
        Scanner sv = new Scanner(System.in);
        
        char opcion_1 ='@';
        int  opcion_2 = 0;
        double montoDonado = 0.0;
        double montoDepa = 0.0;
        String nombreDepa = "John Doe";
        
        System.out.println("Programando Hospitales");
        System.out.println("**********************");
        System.out.print("\nCuanto dinero vas a donar al hospital: ");
        montoDonado = sv.nextDouble();
        
        System.out.println("\nQuieres ver el presupuesto de alguna area?");
        System.out.println("1. Urgencias");
        System.out.println("2. Pediatria");
        System.out.println("3. Traumatologia");
        System.out.println("4. Microbologia");
        System.out.print("Opcion Seleccionada: ");
        //opcion_1 = sv.next().toUpperCase().charAt(0);
        opcion_2 = sv.nextInt();
        
        //condicion puede ser:
        //a. Caracter(letras, numeros, simbolos especiales)
        //b. digito entero
        
        //Equivalente para if/else -> ==
        switch(opcion_2){
            case 1:
                //Departamento de Urgencias
                montoDepa = montoDonado * 0.45;
                nombreDepa = "Urgencias";
                break;//Interrupcion - quiebre
            case 2:
                //Departamento de Pediatria
                montoDepa = montoDonado * 0.30;
                nombreDepa = "Pediatria";
                
                break;
            case 3:
                //Departamento de Traumatologia
                montoDepa = montoDonado * 0.15;
                nombreDepa = "Traumatologia";
                break;
                
            case 4:
                //Departamento de Microbiologia
                montoDepa = montoDonado * 0.10;
                nombreDepa = "Microbiologia";
                break;
                
            default:
                System.out.println("El dinero va para las "
                        + "arcas del hospital");
                break;
        }//Fin de Switch
        
        System.out.printf("Tiene recursos por concepto de $%.2f para el"
                + "area de %s",montoDepa,nombreDepa);
    }//Fin Main
    
}//Fin Class
