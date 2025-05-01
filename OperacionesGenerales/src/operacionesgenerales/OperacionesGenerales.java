/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesgenerales;
import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class OperacionesGenerales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Crear un programa en la cual me permita
            visualizar las diferentes operaciones aritmeticas
            y formatos abreviados que tenemos opcion
            de utilizar en java.
        */
        Scanner sc = new Scanner(System.in);
        //Variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        double num4 = 0.0;
        double sumaTotal = 0;
        double restaTotal = 0;
        double multiTotal = 0;
        double divisionTotal = 0;
        int modulo = 0;
        int incrementos = 0;
        int decrementos = 0;
        
        System.out.print("Ingrese el 1er numero: ");
        num1 = sc.nextInt();
        
        System.out.print("Ingrese el 2do numero: ");
        num2 = sc.nextInt();
        
        System.out.print("Ingrese el 3er numero: ");
        num3 = sc.nextInt();
        
        System.out.print("Ingrese el 4to numero: ");
        num4 = sc.nextDouble();
        
        sumaTotal = num1 + num2 + num3;
        restaTotal = num1 - (num3 + num2);//1ro Parentesis, 2do Multi/Div, 3ro Sum/Res
        multiTotal = num1 * num4;
        divisionTotal = num2 / num4;
        
        //(int) -> Proceso denominado CASTING, temporalmente creando una variable
        modulo = num2 % (int)num4; // Simbolo % (modulo)-> Resultado del Residuo
                
        System.out.printf("La suma total es: %f",sumaTotal);
        System.out.printf("\nLa Resta es :%.2f",restaTotal);
        System.out.printf("\nLa multiplicacion es: %.1f",multiTotal);
        System.out.printf("\nLa division es: %.3f",divisionTotal);
        System.out.printf("\nEl modulo es: %d",modulo);//Imprimir numeros enteros
    }//Fin de Main
    
}//Fin de Class
