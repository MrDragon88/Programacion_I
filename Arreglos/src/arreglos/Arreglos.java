/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;
import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int nota1 = 0; //Acum I Parcial
        int nota2 = 0; //Examen I Parcial
        int nota3 = 0; //Acum II Parcial
        int nota4 = 0; //Examen II Parcial
        
        int total = 0;
        
        //Declaracion de un Arreglo y Creacion de un Arreglo
        final int DIMENSION = 4;
        int[] notas = new int[DIMENSION]; //Datos son Homogeneos, Tamanio fijo, Datos primitivo /objeto
        
        //Inicializar Arreglos
        notas[0] = 0; //Indice 0, Posición 1
        notas[1] = 0; //Indice 1, Posición 2
        notas[2] = 0; //Indice 2, Posicion 3
        notas[3] = 0; //Indice 3, Posición 4
        /*
        //Declaracion de un arreglo e inicializando el arreglo
        int[] estudiantes = {1,1,1,1,1,1};//Tamanio 6
        
        //Declarar el arreglo, crear el arreglo e inicializar el arreglo
        int[] docentes = new int[]{2,2,2,2,2,2,2,2};//Tamanio 8
        final int TAMANIO = docentes.length;
        */
        int contadorNotas = 0;
        for (int i = 0; i < DIMENSION; i++) {
            System.out.printf("Ingrese nota %d: ",i+1);
            int notaTemporal = scan.nextInt();
            notas[i] = ValidacionIngresoNotas(notaTemporal, scan);
        }
        
        /*
        do
        {
            System.out.printf("Ingrese nota %d: ",contadorNotas+1);
            int notaTemporal = scan.nextInt();
            notas[contadorNotas] = ValidacionIngresoNotas(notaTemporal, scan);
            
            contadorNotas++;
            
        }while(contadorNotas <4);
        */
        //total = nota1 + nota2 + nota3 + nota4;
        total = notas[0]+ notas[1]+ notas[2]+ notas[3];
        System.out.printf("Nota Final: %d",total);
    }//Fin de Main
    
    public static int ValidacionIngresoNotas(int nota, Scanner scan){
        do{
            if(nota<0 || nota>25){
                System.out.println("Nota no valida...");
                System.out.println("Tiene que ser entre 0 y 25");
                nota = scan.nextInt();
            }
        }while(nota<0 || nota>25);
        
        return nota;
    }//Fin Funcion Validacion Ingreso Notas
    
}//Fin de Class
