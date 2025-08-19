/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorapromedios;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class CalculadoraPromedios {

    /**
     * Calcular el promedio de los datos ingresados segun la cantidad que 
     * se tengan.
     * Los valores no pueden ser menores a 1 ni mayores a 5.
     * Repetir el ciclo de calculo hasta que el usuario diga lo contrario. 
     * Mostrar como resultado, cuantas veces se calculo el promedio, una
     * vez finalizado el ciclo de repeticion
     * 
     * Utilizar la estructura del ciclo Do - While
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Estructura
            do{
            
            }while(condicion);
        
            Se ejecuta primero y luego se evalua.
            El ciclo de repeticion do while se completa
            al menos una vez.!
        */
        /*
        int contador = 3;
        //int contador = 1;
        System.out.println("Ciclo Do While");
        do{
            System.out.println("Contador "+contador );
            contador++;
        }while(contador <3);
        
        System.out.println("");
          contador = 3;
        //contador = 1;
        System.out.println("Ciclo While");
        while(contador <3){
            System.out.println("Contador "+contador );
            contador++;
        }
        */
        Scanner input = new Scanner(System.in);
        
        int acumuladorNotas = 0;
        int contadorNotas = 1;
        double promedioNotas = 0;
        int nota = 0;
        String continuar = "si";
        
        int contadorPromedios = 0;
        do
        {
           do{
                System.out.printf("Ingrese nota (1 - 5) #%d: ",contadorNotas);
                nota = input.nextInt();
                
                if(nota<1 || nota>5){
                    System.out.println("Nota No Valida");
                }
                else{
                    acumuladorNotas += nota;
                    contadorNotas++;
                }
                

                input.nextLine();//Limpieza de Buffer

                System.out.print("Desea continuar (Si/No):");
                continuar = input.nextLine();
            }while(continuar.equalsIgnoreCase("si"));
            
            contadorNotas--;
            promedioNotas = acumuladorNotas/contadorNotas;
            System.out.printf("%nPromedio %.2f",promedioNotas);
            contadorPromedios++;
            contadorNotas = 1;
            acumuladorNotas = 0;
            
            System.out.println("Calcular otro promedio? (Si/No)");
            continuar = input.nextLine(); 
        }while(continuar.equalsIgnoreCase("si"));
        
            System.out.printf("%nSe calculo el promedio %d veces",contadorPromedios);
        
    }//Fin de Main
    
}//Fin de Class
