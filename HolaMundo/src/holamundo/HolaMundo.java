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
    
    // ->Doble Barra Diagonal = comentario en una sola linea
    /*
        ->Barra Asterisco para abrir el bloque de comentario
        ->Asterisco Barra para cerrar el bloque de comentario
    */
    public static void main(String[] args){ 
        // TODO code application logic here
        
        //Mostrar un mensaje en pantalla
        //JAva es sensible a mayusculas y minusculas
        //Toda sentencia debe de terminar con punto y coma
        System.out.println("Hola Mundo");
        System.out.println("Me llamo OSCAR!!!!!");
        System.out.println("Andrade");
        System.out.print("Tengo 99 anios");
        //Caracteres de Escape
        /*
            \n => Nueva Linea
            \t => Tabulacion
            \r => Retorno Carro
            \\ => \
            \" => "
        */
        //Hardcoding
        System.out.print("\nEstado \n\nCivil: \"Casado\"\tSexo: Masculino");
        
        //Variables
        //Java entorno fuertemente Tipado
        /*
            Buenas practicas de Programacion
            a. Variables con nombre Significativo
            b. Variables de varias palabras se usa nomenclatura camelcase
            c. Variables se deben inicializar.
        */
        int numeroEnteros = 0; //Guardar numeros enteros
        double numeroDecimal = 0.0;//Guardar numerso decimales
        char caracteres = '@'; //una letra, un numero, un caracter especial
        String palabras ="John Doe"; //cadena de caracteres
        
        //Uso de Variables
        Scanner scan = new Scanner(System.in);
        
        int edadPersona = 0;
        double pesoKG = 0.0;
        String nombrePersona = "default";
        char sexo = '#';
        
        System.out.println("\nIngresa tu edad: ");
        edadPersona = scan.nextInt();//Capturar enteros
        
        System.out.println("Dime tu peso: ");
        pesoKG = scan.nextDouble();//Capturar Decimales
        
        scan.nextLine();//Limpieza de Buffer
        System.out.println("Dime tu nombre: ");
        nombrePersona = scan.nextLine();//Capturar Cadenas
        
        System.out.println("Dime tu Genero: ");
        sexo = scan.next().charAt(0);//Captura de Caracter segun posicion
        
        //Mostrando Datos de las Variables
        System.out.println("Te llamas "+nombrePersona);
        System.out.println("Tu edad segun las estrellas es "+edadPersona);
        System.out.println("Un peso corporal "+pesoKG);
        System.out.println("Genero: "+sexo);
        
    }//Fin de Main
    
}//Fin de Class
