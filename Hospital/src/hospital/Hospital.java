/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author Oscar Andrade
 * @version 0.0
 * @since 16-julio-2025
 * 
 * 
 *
 */

//Un solo comentario
/*
    Bloque de comentario
*/

/**
 * Documento de Java Doc
*/

/**
 *   En un hospital existen 3 áreas: Urgencias, Pediatría y Traumatología. 
 *   El presupuesto anual del hospital se reparte de la siguiente manera:
 *   Área Presupuesto
 *   a. Urgencias 37%
 *   b. Pediatría 42%
 *   c. Traumatología 21%

    Debe ingresar el monto de donación que recibe por parte de los patrocinadores
    y mostrar en pantalla cuanto es el monto que tiene el departamento/área de su elección. 
    Función que acepta un parámetro y no devuelve nada.

    Incorporar un ciclo de repeticion del tipo do while, de forma que se ejecute 
    hasta que el usuario diga lo contrario.

*/

    //Documentacion Tecnica
    //Robustez en la ejecucion del algoritmo.
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        char opcionSala ='@';
        double montoDonacion = 0.0;
        char respuesta = '@';
        
        while(respuesta != 'n'){
            System.out.println("Presupuesto Anual del Hospital");
            System.out.println("------------------------------");
            System.out.println("");
            //Conexion a una Base Datos
            //Abrir y/o Leer un archivo
            //Division por Cero
            //Indice de Arreglos
            try{
                System.out.print("Monto de Donacion: ");

                montoDonacion = scan.nextDouble();
                //String monto = scan.next();
                //montoDonacion = Double.parseDouble(monto);
                System.out.println("Mensaje de Try");
            }
            catch(NumberFormatException e)
            {
                System.out.println(""+e);
                System.out.println("Mensaje de Catch");
            }
            catch(Exception e){
                System.out.println("Formato Ingresado NO VALIDO");
                scan.nextLine();//Limpiar Buffer
            }
            finally{
                System.out.println("Mensaje de Finally");
            }

            System.out.println("\n\tDepartamento Especializado");
            System.out.println("A. Urgencias");
            System.out.println("B. Pediatria");
            System.out.println("C. Traumatologia");
            System.out.print("Seleccion: ");
            opcionSala = scan.next().toLowerCase().charAt(0);
            //System.out.println(""+opcionSala);

            CalculoPresupuesto(montoDonacion, opcionSala);
            System.out.println("Desea hacer otro calculo? S/N");
            respuesta = scan.next().toLowerCase().charAt(0);
        }//Fin de While
        
        
        
    }//Fin  Main
    
    /**
     * La funcion calculo prespuesto determina cuando es el porcentaje
     * que recibe cada departamento usando una estructura de seleccion
     * del tipo switch.
     * 
     * 
     * @param monto -> Es el valor de la donacion
     * @param seleccion -> Es la opcion que viene selecionado por parte del usuario
     * 
     * 
    */
    public static void CalculoPresupuesto(double monto, char seleccion){
        double presupuestoAsignado = 0.0;
        switch(seleccion){
            case 'a':
                System.out.println("Urgencias");
                presupuestoAsignado = monto * 0.37;
                System.out.println("Presupuesto: "+presupuestoAsignado);
                break;
            case 'b':
                System.out.println("Pediatria");
                presupuestoAsignado = monto * 0.42;
                System.out.println("Presupuesto: "+presupuestoAsignado);
                break;
            case 'c':
                System.out.println("Traumotologia");
                presupuestoAsignado = monto * 0.21;
                System.out.println("Presupuesto: "+presupuestoAsignado);
                break;
            default:
                System.out.println("Opcion No valida");
                break;
        }//Fin de Switch
    }//Fin de Funcion Calculo Presupuesto
}//Fin Class
