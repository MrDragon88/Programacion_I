/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cilindro;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Cilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Realizar un programa que calcule el área superficial y el volumen de un cilindro. 
            El usuario ingresa la altura y el radio del cilindro. 
            Como resultado final deberá mostrar, el radio, la altura, 
            el área superficial y el volumen
        
        1. Ingresar Datos
            altura y el radio
        2. Calcular area y volumen cilindro
            A.S. = 2 * PI * r (r+h) =>Pi = 3.1416 , r = radio, h = altura
            Volumen = PI * (radio* radio) * h
        
        3. Mostrar los resultados
            radio, altura, area, volumen
        */
        Scanner input = new Scanner (System.in);
        double altura = 0.0;
        double radio = 0.0;
        double areaSuperficial = 0.0;
        double volumen = 0.0;
        
        //Ingresar datos
        System.out.print("Ingrese la altura: ");
        altura = input.nextDouble();
        System.out.print("Ingrese el radio: ");
        radio = input.nextDouble();
        
        //Calcular Area de Cilindro
        areaSuperficial = 2 * Math.PI * radio * (radio + altura);
        volumen =3.1416 * (radio * radio) * altura;
        
        //Mostrar los resultados
        System.out.printf("El area superficial es: %.2f",areaSuperficial);
        System.out.printf("\nEl volumen es: %.2f",volumen);
        System.out.printf("\nLa altura tiene un valor de %.2f y el radio de %.2f",altura,radio);
        
    }//Fin Main
    
}//Fin Class
