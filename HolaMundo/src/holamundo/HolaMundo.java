/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;
import java.util.Scanner;


//Doble Diagonal -> Sirve para comentarios de una sola linea
/*
    Sirve para comentarios en
    bloque...es decir
    varias lineas.

    Todo lo que esté entre barras-asterisco -- asterisco - barras
    sera de Comentario
*/

/*
    Este programa lo que prentendee realizar
    es conocer el entorno de desarrollo IDE 
    Apache NEtbeans para poder programar
    en Java haciendo por 1ra vez
    un Hola Mundo!!!!
*/

/**
 *
 * @author Oscar Andrade
 */
public class HolaMundo {

    /**
     * @param args the command line arguments

     */
    public static void main(String[] args) {
        // El codigo siempre debe´ra de estar dentro de llaves
        
        //Elementos de Salida o Mostrar en pantalla
        //Mostrar o Escribir -> Palabras claves en PSEINT
        System.out.print("Hola Mundo");
        System.out.println("Me llamo Oscar");
        System.out.println("Esta es la clase de Proga");
        System.out.println("Es semana 1");
        
        /*
            Caracteres de Escape
            \n -> Nueva Linea
            \t -> Espacio de Tabulacion
            \r -> Retorno de Carro
            \\ -> Imprimir Contra Barra
            \" -> Imprimir Comillas Dobles
            \' -> Imprimir Comillas Simples
        
            %s, imprimir un cadena en minuscula
            %S, imprimir un cadena en MAYUSCULA
            %d, imprimir un numero entero
            %f, imprimir un numero decimal
            %c, imprimir un caracter
            %b, imprimir un booleano (true/false)        
        */
        System.out.printf("Me %s la %s %S\n","gusta","clase","mucho");
        System.out.printf("Me %s %s la %S\n","gusta","clase","mucho");
        System.out.printf("%s %s %S Me  la  \n","gusta","clase","mucho");
        System.out.println("");
        
        System.out.println("Hola Mundo \nme llamo oscar y \nme \tgusta la clase de progra es semana 1");
        System.out.printf("\nUn numero entero %d",5);
        System.out.printf("\nUn numero decimal %f",101.2);
        System.out.printf("\nUn numero decimal %.2f",101.2);
        System.out.printf("\nUn numero decimal %2.3f",101.2);
        System.out.printf("\nUna letra %c",'f');
        
        //Elementos de Entrada
        Scanner scan = new Scanner(System.in);
        
        //Segmento en memoria llamado variable para guardar datos.
        //Variable est[a compuesto de dos cosas
        //1. Tipo de Dato
        //2. Nombre de la Variable
        //  a. Tiene que ser significativo o entendible.
        //  b. Utilizar nomenclatura lowerCamelCase
        //  c. Inicializar las variables.
        //Dato Numerico Entero
        
        //Null es diferente a Cero
        int edad = 0;
        int numeroClasesCursadas =0;
        int notaFinal = 0;
        int notaProgra_1 = 0;
        
        //Dato Numerico Decimal
        float pesoKG = 0;
        double estaturaCM = 0.0;
        
        //Dato Palabra o frase
        String nombre = "John";
        String apellido = "Doe";
        
        //Dato Caracteres Especiales, letras o digitos
        char inicial = '@';
        char posicion = '1';
        
        System.out.println("Ingresa tu nombre completo: ");
        nombre = scan.nextLine();
        
        System.out.println("Ingresa tus apellidosssss: ");
        apellido = scan.next();
        scan.nextLine();//Borrar buffer en memoria.
        
        System.out.println("Ingrese su Edad: ");
        edad = scan.nextInt();
        
        System.out.println("Ingresa tu estatura: ");
        estaturaCM = scan.nextDouble();
        
        
        
        System.out.printf("\nLa edad es: %d",edad);
        System.out.printf("\nLa estatura es: %.2f",estaturaCM);
        System.out.printf("\nEl nombre del fulano es: %s",nombre);
        System.out.printf("\nY sus apellidos son: %s",apellido);
    }//Fin de la Funcion Main
    
}//Fin de la Clase Hola Mundo
