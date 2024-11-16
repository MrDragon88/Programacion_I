/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesstring;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 */
public class FuncionesString {
    /*
        equals() -> Comparar dos cadenas y determinar si son iguales
        contains() -> buscar dentro de una cadena una palabra, frase
        substring() -> extraer una porcion del texto
        toLowerCase() -> Cadenas en minuscula
        toUpperCase() ->Cadenas en mayuscula
    
    */
    /**
     * @param args the command line arguments
     */
    
     /*
            Realizar un algoritmo donde la persona al momento
            de querer ingresar con sus credenciales a una cuenta
            bancaria, este tenga que ingresar su nombre de usuario
            y contraseña.
            Validar si ambos están en lo correcto para brindar el
            acceso correspondiente.
        
        username:
        password:
        
        Si ambos están correctors...login exitosos
        Si alguno de los dos está malo...login incorrecto o no existe
        
        */
    public static void main(String[] args) {
        // TODO code application logic here
        
     compararUsername();
     compararPassword ();
    }//Fin de Main
    
    public static void compararUsername (){
    
        String username="@";
        String defaultUsername="g3rar2";
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Ingrese el username: \n");
        username=scan.next();
        
        if (username.equals(defaultUsername)) {
            System.out.println("Usuario Correcto");
        } else  {
            System.out.println("Usuario Incorrecto");
        }

    }//Fin Metodo comparar username
    

    public static void compararPassword (){
    
        String password="@";
        String defaultPassword="123456789";
        
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Ingrese el Password: \n");
        password=scan.next();
        
        if (password.equals(defaultPassword)) {
            System.out.println("Password Correcto");
        } else  {
            System.out.println("Password Incorrecto");
        
        }
        
        
    
    }//Fin Metodo comparar username
    
    public static boolean comparacionCadenas(String ingresoManual, String predeterminado)
    {
        boolean resultadoComparacion = false;
        resultadoComparacion = predeterminado.equals(ingresoManual);
        if(resultadoComparacion){
            System.out.println("Valores Iguales");
        }else{
            System.out.println("Valores Distintos");
        }
        
        return resultadoComparacion;
    }
    
}//Fin de Class
