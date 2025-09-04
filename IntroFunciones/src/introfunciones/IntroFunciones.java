/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introfunciones;
import java.util.Scanner;
/**
 *
 * @author Oscar Andrade
 */
public class IntroFunciones {

    /**
     * @param args the command line arguments
     * 
     * Estructura de una Funcion
     * 1. Tipo de Acceso
     *      Public
     *      Private
     *      Protected
     * 2. Tipo de Dato a Devolver
     *      int, double
            string, char
            boolean, arreglo[]
            void -> No devuelve
       3. Nombre de la Funcion
       4. Parametros ->ninguno, uno o varios (mixtos)....separados por una coma
       *    int, double
       *    string, char,
       *    boolean, arreglo[]
       *    void ->Sin Parametros
       * 
       *Uso de las Funciones
       *    1. Declarar la funcion -> Se declara afuera del main
       *    2. Llamar a la funcion -> Donde se necesite
       * 
       * Cuando se implementa una funcion?
       * 1. Tratar un dato
       * 2. Validar un dato
       * 3. Calculos
       * 4. Mostrar
     */
    
   
    public static void main(String[] args) {
        
        final int DIM = 5;
        double[] nota = new double[DIM];
        double Notaingresada = 0;
        String nameEstudiante = "";
        String lastnameEstudiante = "";
        String nickNameEstudiante = "";
        double promedio = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estidiante: ");
        nameEstudiante = scan.nextLine();
        System.out.println("Ingrese el apellido del estidiante: ");
        lastnameEstudiante = scan.nextLine();
        System.out.println("Ingrese el apodo del estidiante: ");
        nickNameEstudiante = scan.nextLine();
        
        nameEstudiante = CapitalizacionCadenas(nameEstudiante);
        lastnameEstudiante = CapitalizacionCadenas(lastnameEstudiante);
        nickNameEstudiante = CapitalizacionCadenas(nickNameEstudiante);
        
        System.out.printf("%nNombre: %s",nameEstudiante);
        System.out.printf("%nApellido: %s",lastnameEstudiante);
        System.out.printf("%nApodo: %s",nickNameEstudiante);
        
        for (int i = 0; i < DIM; i++) {
            System.out.printf("Ingrese la nota %d: ", i + 1);
            Notaingresada = scan.nextDouble();

            if (Notaingresada >= 0 && Notaingresada <= 100) {
                nota[i] = Notaingresada;

            } else {
                System.out.println("Fuera de rango");
                i--;
            }

        }
        promedio = (nota[0] + nota[1] + nota[2]) / 3;

        System.out.printf("El nombre es: %s promedio es: %.2f", nameEstudiante, promedio);

    }  //Fin de Main
    
    public static String CapitalizacionCadenas(String dato){
       String temporal = "";
       temporal = dato.toUpperCase();
       temporal = temporal.concat(" 2025 ");
      return temporal;
    }
    
}//Fin de Class
