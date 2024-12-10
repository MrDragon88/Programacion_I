/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoexameniiparcial;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Oscar Andrade
 */
public class RepasoExamenIIParcial {
    
    static Scanner scan = new Scanner(System.in);

    /**
     * Desarrollar una aplicacion que nos permita registrar el nombre y la edad
     * de una persona en un arreglo dinámico, donde a su vez se tenga la capacidad
     * de poder actualizar los datos, incluyendo buscar y eliminar datos.
     * 
     * Todo ello será hasta que se cierre el programa.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ArrayList<String> nombre = new ArrayList<String>();
        ArrayList<Integer> edad = new ArrayList<Integer>();
        char opcion = '@';
        String nombreTemp = "John Doe";
        int edadTemp = 0;
        
        do{
            System.out.println("************");
            System.out.println("**  Menu  **");
            System.out.println("*************");
            System.out.println("");
            
            System.out.println("A. Agregar Persona");
            System.out.println("B. Actualizar Datos Persona");
            System.out.println("C. Obtener Lista de Personas");
            System.out.println("D. Buscar Persona en Particular");
            System.out.println("E. Eliminar Persona");
            System.out.println("F. Eliminar Listado Completo");
            System.out.println("G. Salir");
            System.out.print("Seleccion: ");
            opcion = scan.next().toUpperCase().charAt(0);
            scan.nextLine();
            
            switch (opcion) {
                case 'A':
                    //Agregar Persona
                    System.out.println("\nRegistrando Nueva Persona\n");
                    System.out.print("Ingrese Nombre de la Persona: ");
                    nombreTemp = IngresoNombre();
                    
                    System.out.print("Ingrese Edad de la Persona: ");
                    edadTemp = scan.nextInt();
                    edadTemp = ValidacionEdad(edadTemp);
                    
                    nombre.add(nombreTemp);//Funcion Agregar en ArrayList
                    edad.add(edadTemp);
                    
                break;
                
                case 'B':
                    //Actualizar Datos de Persona
                    System.out.println("Desea Cambiar Nombre?(Si = s, No = n)");
                    int deseo = scan.next().toLowerCase().charAt(0);
                    if(deseo == 's'){
                        System.out.print("Posicion de la Persona: ");
                        int posicion = scan.nextInt();
                        nombreTemp = IngresoNombre();
                        nombre.set(posicion,nombreTemp);//Cambiar datos seg[un posicion  
                    }
                    
                break;
                
                case 'C':
                    //Obtener Listado de Personas
                    int tamanoTemp = nombre.size();//Obtener el tamanio o dimension del arreglo
                    for(int i = 0; i<tamanoTemp;i++){
                        System.out.printf("Registro %d\n",i+1);
                        System.out.printf("Nombre: %s \n",nombre.get(i));//Obtener datos segun indice
                        System.out.printf("Edad: %d \n",edad.get(i));
                        System.out.println("");
                    }
                    
                    
                break;
                
                case 'D':
                    //Busqueda de Persona
                    System.out.print("Nombre de Persona Buscada: ");
                    nombreTemp = IngresoNombre();
                    boolean resultadoBusqueda = BusquedaNombre(nombre, nombreTemp);
                    if(resultadoBusqueda){
                        System.out.println("Existe la Persona que Busca");
                    }
                    else
                    {
                        System.out.println("No esta la persona registrada!!!!");
                    }
                    
                    
                break;
                
                case 'E':
                    
                break;
                
                case 'F':
                    
                break;
                
                case 'G':
                    
                break;
                
                default:
                    break;
                    
            }
    
            
            
            
        }while(opcion != 's');//Fin de Ciclo While
        
    }//Fin Main
    
    public static int ValidacionEdad(int edad){
        
        while(edad <0 || edad >110){
            System.out.println("Rango de Edad no valido");
            System.out.println("No existe persona con dichas edades");
            System.out.print("Ingreselo nuevamente: ");
            edad = scan.nextInt();
            System.out.println("");
        }
        return edad;
    }//Fin Funcion Validacion Edad
    
    public static String IngresoNombre(){
        String nombreTemporal = "John Doe";
        nombreTemporal = scan.next().toLowerCase();
        return nombreTemporal;
    }//Fin Funcion Ingreso Nombre
    
    public static boolean BusquedaNombre(ArrayList<String> lista, String nombre){
        boolean estado = true;
        estado = lista.contains(nombre);//Funcion de Arraylist para buscar
        return estado;
    }
    
}//Fin Class
