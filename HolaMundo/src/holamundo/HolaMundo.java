/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        // =>Comentarios en una sola linea - linea individual
        /*
            Barra Asterisco - Inicio del Bloque Comentario
            Asterisco Barra - Cierra el Bloque de Comentario
        */
        
        //Mostrar en Pantalla
        //Java es sensible a mayusculas y minusculas
        //Toda sentencia tiene que terminar con punto y coma
        System.out.println("Hola Mundo");
        System.out.println("Mi nombre es Oscar!!!");
        System.out.print("Tengo 99 anios");
        System.out.print("Mi apellido es: Andrade");
        /*
            Caracteres de Escape
            \n = Nueva Linea
            \t = Tabulador
            \r = Retorno de Carro
            \\ = Diagonal
            \" = Comilla Doble
        */
        System.out.print("\nEstado\n\nCivil:\"Casado\"\tSexo:Masculino");
      
        //Hardcoding ->Grabado en el programa
        
        //Variables
        //Java es un lenguaje fuertemente tipado
        /*
            Buenas de Programacion
            a. El nombre de la variable tiene que ser significativo
            b. Los nombres de las variables tiene una nomenclatura
                de escritura conocida como camelCase.
            c. Todas las variables deben de inicializarse
        */
        
        int numeroEntero =100;//Guardar numeros del tipo entero
        double numeroDecimales=0.0; //Guardar numeros del tipo decimal
        char caracteres='@'; //letras, digitos, simbolos especiales
        String palabras="John Doe"; //cadena de caracteres
        
        Scanner scan = new Scanner(System.in);
        
        int edadPersona = 100;
        double pesoKG = 0.0;
        String nombrePersona = "default";
        char genero ='#';
        
        System.out.println("Dime tu edad: ");
        edadPersona = scan.nextInt();//Capturando un Entero
        
        System.out.println("Cuanto pesas?");
        pesoKG = scan.nextDouble();//Capturando un Decimal
        
        scan.nextLine();
        System.out.println("Como te llamas: ");
        nombrePersona = scan.nextLine();//Captura una cadena
        
        System.out.println("Tu genero es: ");
        genero = scan.next().charAt(0);//Capturando una cadena
        
        System.out.println("Tu nombres es: " + nombrePersona);
        System.out.println("Cuya edad gatuna es: " + edadPersona);
        System.out.println("Tu peso saturino anda por "+pesoKG);
        System.out.println("Genero Terricola: "+genero);
        
        //Operaciones Aritmeticas
        int num1 = 175;
        int num2 = 200;
        int opSuma = 0;     // Simbolo +
        int opResta = 0;    // Simbolo -
        int opMul = 0;      // Simbolo *
        int opDIV = 0;      // Simbolo /
        int opMOD = 0;      // Simbolo % (porcentaje)
        
        opSuma = num1 + num2;
        opResta = num1 - num2;
        opMul = num1 * num2;
        opDIV = num2 / num1;
        opMOD = num2 % num1;
        
        System.out.println("\nResultados de Operaciones\n");
        System.out.printf("\nSuma es %d",opSuma);
        System.out.printf("\nResta es %d",opResta);
        System.out.printf("\n%d la multiplicacion es ",opMul);
        System.out.printf("\n%d entre %d es %d",num2,num1,opDIV);
        System.out.printf("\n%d MOD %d es %d",num2,num1,opMOD);
    }//Fin de Main
    
}//Fin Class
