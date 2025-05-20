/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurante;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double tiempo = 0;
        int presupuesto = 0;
        char opcionRestaurante = '@';
        
        System.out.print("Ingrese el tiempo disponible para esperar: ");
        tiempo = sc.nextDouble();
        System.out.print("Ingrese cuanto billete quiere gastar: ");
        presupuesto = sc.nextInt();
        
        System.out.println("Restaurantes Disponibles");
        System.out.println("A. Especialistas en Mariscos");
        System.out.println("B. Especialistas en Carnes");
        System.out.println("C. Especialistas en Postres");
        System.out.println("D. Especialistas en Sopas");
        System.out.print("Cual será tu eleccion para salir con tu peor es nada? ");
        opcionRestaurante = sc.next().toUpperCase().charAt(0);
        
        if(opcionRestaurante == 'A'){
            System.out.println("Restaurante con Especialidad en Mariscos");
            if(tiempo >=2 && presupuesto >=2000){
                System.out.println("Podra disfrutar de la velada");
            }else{
                System.out.println("Papa...vaya silbe y cante mejor!!");
            }
        }//Fin de IF...opcion Mariscos
        else if(opcionRestaurante == 'B'){
            System.out.println("Restaurante con Especialidad en Carnes");
            String mensaje = (tiempo >=1.5 && presupuesto >=1200)?
                      "Podra disfrutar de la velada":
                      "Papa...vaya silbe y cante mejor!!";
            System.out.println(""+mensaje);
        }//Fin de IF...opcion Carnes
        else if(opcionRestaurante == 'C'){
            System.out.println("Restaurante con Especialidad en Postres");
            if(tiempo >=0.5 && presupuesto >=500){
                System.out.println("Podra disfrutar de la velada");
            }else{
                System.out.println("Papa...vaya silbe y cante mejor!!");
            }
        }//Fin de IF...opcion Postres
        else if(opcionRestaurante == 'D'){
            System.out.println("Restaurante con Especialidad en sOPAS");
            String mensaje = (tiempo >=1 && presupuesto >=750)?
                      "Podra disfrutar de la velada":
                      "Papa...vaya silbe y cante mejor!!";
            System.out.println(""+mensaje);
        }//Fin de IF...opcion sOPAS
        else{
            System.out.println("Mjo...esa opcion no existe!!!");
        }
    }//Fin de Main
    
}//Fin de Class
