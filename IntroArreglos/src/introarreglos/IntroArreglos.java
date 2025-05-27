/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introarreglos;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class IntroArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*******************************
        **  Arreglos Unidimensionales **
        ********************************/
        Scanner sc = new Scanner(System.in);
        final int DIMENSION = 8;//Asignado, No se Puede Modificar!!!!!
        
        int acumuladorNotas = 0;
        //Forma #1 Definir un arreglo 
        int[] notas;
        notas = new int[DIMENSION];//Creando el arreglo de dimension 4
        notas[0]= 100; //Indice 0, posicion 1
        notas[1]= 100; //Indice 1, posicion 2
        notas[2]= 100; //Indice 2, posicion 3
        notas[3]= 100;//Indice 3, posicion 4
       
        //Forma #2 Definir y crear el arreglo en una misma linea
        char[] letras = new char[DIMENSION];
        letras[0] = 'A';
        letras[1] = 'B';
        letras[2] = 'C';
        letras[3] = 'D';
        
        //Forma #3 Defino el arreglo y lo inicializo
        boolean[] estadoNota ={true,false,true,false};
        System.out.println(""+estadoNota[0]);
        System.out.println(""+estadoNota[1]);
        System.out.println(""+estadoNota[2]);
        System.out.println(""+estadoNota[3]);
        
        //Forma #4 Defino, creo e inicializo el arreglo
        String[] nombreAsignatura = new String[]{"Progra 1", "Disenio","Socio","Desarrollo",
                                                "Intro","Algebra","Ofimatia","Historia"};
        notas[0]= 100; //Indice 0, posicion 1
        notas[1]= 100; //Indice 1, posicion 2
        notas[2]= 100; //Indice 2, posicion 3
        notas[3]= 100;//Indice 3, posicion 4
        double promedio = 0;
        
        System.out.println("Indice de Calificaciones");
        for (int i = 0; i < DIMENSION; i++) {
            System.out.printf("Ingrese la nota #%d\t",i+1);
            notas[i] = sc.nextInt();
        }//Fin de Ciclo 
        
        System.out.println("Resultados segun la clase\n");
        for (int i = 0; i < DIMENSION; i++) {
            System.out.printf("Clase: %s\t Nota:%d",nombreAsignatura[i],notas[i]);
            System.out.println("");
        }//Fin de Ciclo
        System.out.println("Dimension de Arreglo: "+notas.length);
        for (int i = 0; i < notas.length; i++) {
            acumuladorNotas +=notas[i];
        }
        promedio = acumuladorNotas/DIMENSION;
        
        System.out.printf("Promedio es: %.2f",promedio);
        
        
        
    }//Fin de Main
    
}//Fin Class
