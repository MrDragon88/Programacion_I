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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        //Variables
        double presuUrgencia= 0;
        double presuPediatria =0; 
        double presuTrauma=0; 
        double presuPsiqui=0;
        double montoDonado = 0;
        double montoGlobal = 0;
        char opCliente = ' ';
        String nombreDonante = "John Doe";
        
        System.out.println("Ingrese el monto de Donacion:");
        montoDonado = entrada.nextDouble();
        entrada.nextLine(); //buffer
        System.out.println("Ingresa el nombre del Donante Anonimo:");
        nombreDonante = entrada.nextLine().toUpperCase(); //Mayuscula
        System.out.println("Ingrese su seleccion por favor:");
        System.out.println("a.Urgencias");
        System.out.println("b.Pediatria");
        System.out.println("c.Traumatología");
        System.out.println("d.Psiquiatría");
        opCliente = entrada.nextLine().toLowerCase().charAt(0);
        
        switch (opCliente) {
            case 'a': //Control + SHIFT + Flecha hacia abajo.
                presuUrgencia = montoDonado*0.45;
                montoGlobal = presuUrgencia;
                break;
            case 'b':
                presuPediatria = montoDonado*0.30;
                montoGlobal = presuPediatria;
                break;
            case 'c':
                presuTrauma = montoDonado*0.15;
                montoGlobal = presuTrauma;
                break;
            case 'd':
                presuPsiqui = montoDonado*0.10;
                montoGlobal = presuPsiqui;
                break;
                
            default:
                System.out.println("Opcion no valida, vuelve a intentar.");
        }//fin de switch
        
        System.out.println("Muchas gracias " + nombreDonante);
        System.out.println("Usted dono: " + montoGlobal);
    }//Fin Main
    
}//Fin Class
