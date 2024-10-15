/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola_mundo;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Hola_Mundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Doble Barra Diagonal es para una linea de comentario
        /*
            Conjunto de Lineas para hacer comentarios, es usar
            un * seguido de una barra diagonal y se cierra el bloque
            de comentario en sentido contrario, es decir barra diagonal 
            seguido de *.
        */
        
        //Imprimir en pantalla
        
        //1er Forma - println
        System.out.println("Hola Mundo");
        
        //2da Forma - print
        System.out.print("Mi nombre es Oscar\t");
        System.out.print("Docente de Programacion\n");
        
        //3ra Forma - printf
        System.out.printf("Mi profesion es %s\n","Ing en Electronica");
        System.out.printf("Mi %s profesion es \n","Ing en Electronica");
        System.out.printf("%s Mi \"profesion\" es \n","Ing en Electronica");
        System.out.printf("Tengo %d de horas estudiadas \n",100);
        System.out.printf("Por eso me dicen Ing %c \n",'D');
        System.out.printf("Tengo \nde \npromedio %f \n",99.999);
        System.out.printf("Si vamos %S al salon de %s tendremos %d nota\n",
                            "corriendo","PrOgRaMaCIoN",100);
        
        //Caracteres de Escape
        /*
            \n -> Salto Linea
            \t -> Espacio tabulado
            \\ -> Imprime una diagonal
            \" -> Imprime "
            Alt + 92 => \
            Alt + 64 => @
        */
        
        // Las variables son espacio es memoria que utilizamos
        //para almacenar informaci[on que ingresa, que se calcula
        //o que se quiere mostrar despues de un tratamiento
        Scanner sc = new Scanner(System.in);
        int numeroEntero;
        double numerosDecimales;
        float numerosDecimales_2;
        short numeroEntero_2;
        byte numeroEntero_3;
        char caracteres; //letras, digitos, simbolos especiales
        boolean estado; //true o false
        
        System.out.println("\nIngresemos un numero:");
        numeroEntero = sc.nextInt();
        System.out.println("Este es el numero entero: "+numeroEntero);
        System.out.printf("\nEste es el numero entero: %d",numeroEntero);
        
        //Operaciones Aritmeticas
        
        int numero1 = 0;
        int numero2 = 0;
        double numero3 = 0.0;
        double numero4 = 0.0;
        int total_1 = 0;
        double total_2 = 0;

        System.out.print("\nIngrese Numero 1: ");
        numero1 = sc.nextInt();
        System.out.print("\nIngrese Numero 2: ");
        numero2 = sc.nextInt();
        System.out.print("\nIngrese Numero 3: ");
        numero3 = sc.nextDouble();
        System.out.print("\nIngrese Numero 4: ");
        numero4 = sc.nextDouble();
        
        total_1 = numero1 + numero2;
        total_2 = numero3 / numero4;
        
        System.out.printf("\nLa suma es: %d",total_1);
        System.out.printf("\nLa Division es: %.2f",total_2);
        
               
        
        
    }//Fin Main

}//FIN de Class
