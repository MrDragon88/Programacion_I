/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introduccionjava;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class IntroduccionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Comentarios
        /*
            Comentario en Bloque
        */
        //println -> nueva linea
        System.out.println("Hola Mundo Ing Andrade Esta aqui programando");
        System.out.print("Ya eres todo ");
        System.out.print("un hacker!!");
        System.out.println("Voy a conquistar el mundo");
        
        System.out.printf("Hola %s, eres todo un campeon %n", "Oscar");
        System.out.printf("Hola, eres todo un campeon %s \n", "Oscar");
        System.out.printf("Hola, eres %s todo un campeon \n", "Oscar");
        
        /*
            %s ->Formatear Cadeanas     (String)
            %d ->Formatear numeros enteros (int)
            %f ->Formatear numeros decimales (double / float)
            %c ->Formatear caracters (char)
            %b ->Formatear booleanos (boolean)
            %n ->Formatear Nueva Linea
            
            \n -> Nueva Linea
            \t -> Tabulacion
            \" -> "
            \' -> '
            \\ -> \
        */
        
        int edad = 15;
        double estatura = 1.7;
        char inicial = 'O';
        String nombre = "Oscar";
        
        System.out.printf("Tengo %d de edad", edad);
        System.out.printf("\nMido %f",estatura);
        System.out.printf("\nLa 1ra letra de mi nombres es %c",inicial);
        System.out.printf("\nMe llamo %s",nombre);   
        
        
        int galones = 10;
        
        /*
            Java es sensible con mayusculas y minusculas
            humanamente se puede interpretar igual
            pero para la maquina es diferente.
        */
        //int Galones = 5;
        //int GaLoNeS = 13;
        
        System.out.println("Cuantos galones de combustible llevaron?");
        System.out.printf("Se llevaron %d galones de combustible para el tractor\n", galones);
        //System.out.printf("Se llevaron %d galones de combustible para el tractor\n", Galones);
        //System.out.printf("Se llevaron %d galones de combustible para el tractor\n", GaLoNeS);
        
        Scanner entrada = new Scanner(System.in);
        
        int manzanas = 0;
        double litrosJugo = 0;
       
        
        System.out.println("Cuantas manzanas compraste?");
        manzanas = entrada.nextInt();
        
        System.out.println("Cuantos litros te tomas?");
        litrosJugo = entrada.nextDouble();
        
        System.out.printf("Se compraron %d manzanas ayer\n",manzanas);
        System.out.printf("Y se lograron sacar %.2f litros de jugo\n",litrosJugo);
        System.out.printf("Y se lograron sacar %f litros de jugo\n",litrosJugo);
        
        int nuevasManzanas = 0;
        int totalManzanas = 0;
        
        System.out.print("Cuantas nuevas manzanas tenemos?");
        nuevasManzanas = entrada.nextInt();
        
        totalManzanas = manzanas + nuevasManzanas;
        
        System.out.printf("Total de Manzanas es: %d\n",totalManzanas);
        
        //Caso 1
        System.out.printf("Total de Manzanas es: %d\n",totalManzanas+1);
        
        //Caso 2
        totalManzanas++;
        System.out.printf("Total de Manzanas es: %d\n",totalManzanas);
        
        //Caso 3
        System.out.printf("Total de Manzanas es: %d\n",totalManzanas+1);
        System.out.printf("Total de Manzanas es: %d\n",totalManzanas+3);
        
        
        
        
        System.out.println("");
        
        
        
        /*
        System.out.printf("Manzanas %d, \tNuevas Manzanas %d, \tTotal Manzanas %d",
                manzanas,nuevasManzanas,totalManzanas);
        
        System.out.println("");
        
        System.out.printf("Manzanas %d\n",manzanas);
        System.out.printf("Nuevas Manzanas %d\n",nuevasManzanas);
        System.out.printf("Total Manzanas %d\n",totalManzanas);
        
        System.out.println("Manzanas "+manzanas);
        System.out.println("Nuevas Manzanas "+nuevasManzanas);
        System.out.println("Total Manzanas "+totalManzanas);
        */
    }//Fin de MAin
    
}//Fin de Class
