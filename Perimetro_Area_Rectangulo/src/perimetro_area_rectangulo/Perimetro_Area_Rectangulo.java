/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perimetro_area_rectangulo;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Perimetro_Area_Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Realizar un programa que calcule el área y perímetro de un rectángulo, 
            los valores de los lados del rectángulo deben ser ingresados por el usuario. 
            Mostrar únicamente el resultado del área y del perímetro del rectángulo.
        
            1. Figura Geometrica -: Rectangulo
             Perimetro -: suma total de cada uno de los lados del figura geometrica (4 lados)
             Area -: superficie de la figura geometrica
        
            2. Calcular de un Rectangulo
            2.a. Area.   -> Area = base x altura (b * h)
            2.B  Perimetro -> Perimetro = lado1 + lado2 + lado3 + lado4
                            -> Perimetro = base + altura + base + altura
                            -> Perimetro = 2*base + 2*altura
        
            3. Ingresar Datos por parte del usuario
            3.a Ingresar los lados del rectangulo -> Ingresar la base y la altura
        
            4. Mostrar Resultados
            4.a Mostrar el area del rectangulo
            4.b Mostrar el perimetro del rectangulo
        */
        
        Scanner scan = new Scanner(System.in);
        int base = 0;
        int altura = 0;
        int perimetro = 0;
        int area = 0;

        //Ingreso de Datos
        System.out.println("Ingrese el valor de la altura: ");
        altura = scan.nextInt();
        
        System.out.println("Ingrese el valor de la base: ");
        base = scan.nextInt();
        
        //Calculo de Area
        area = base * altura;
        
        //Calculo de Perimetro
        perimetro = (2*base) + (2*altura);
        
        //Mostrar Resultados
        System.out.printf("El area del rectangulo es: %d",area);
        System.out.printf("El perimetro del rectangulo es: %d",perimetro);
        
        
        
        
        
    }//Fin Main
    
}//Fin Class
