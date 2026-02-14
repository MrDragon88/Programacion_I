/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ingresoparque;

import java.util.Scanner;

/**
 *
 * @author oscar
 * 
 * Se quiere una aplicacion que permita contabilizar
 * el numero de personas que ingresan al parque de diversiones,
 * ya que este tiene una capacidad limitada de 30 personas.
 * 
 * Solo pueden ingresar personas mayores de 18 anios solos o
 * pueden ingresar menores de 18 pero mayores de 15 si estan 
 * acompañados de un adulto responsble.
 * 
 * Mostrar en pantalla el "resumen de personas que han ingresado"
 * *Varones, Mujeres, Jovenes
 * *Promedio de Edad General y por genero.
 * 
 * Tareas
 * 1. Contar el numero de personas que ingresan al parque
 * 2. Ingresos de Datos
 *      2.a Validar datos coherentes
 *          Edad no sea mayor a 100 o menor a 0
 *          Genero, no sea diferente a M o V.
 * 3. Clasificar a las personas de acuerdo a su edad.
 *      3.b Determinar si va solo o no  
 * 4. Clasificar a las personas de acuerdo al genero
 * 5. Contar el ingreso de las personas
 *      5.a Varones y Mujer
 *      5.b Joven y Adulto
 * 6. Mostrar resultados
 */
public class IngresoParque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        final int CAPACIDADMAX = 30;
        int personas = 1;
        int edad = 0;
        char genero = '@';
        char tutor = '#';
 
        //for(int i = 1 ; i<CAPACIDADMAX ; i++){
        while(personas <=30){
            
            do{
                System.out.printf("%d) Que edad tienes? ",personas);
                edad = scan.nextInt();
                
                //Operacion OR -> Unas de las condiciones 
                // que se vuelva Verdadero
                if(edad<=0 || edad>100 ){
                    System.out.println("Humanamente no es posible");
                }
            }while(edad<=0 || edad>100);
                
            do{
                System.out.print("Mujer(M) o Varon(V)");
                System.out.print("\nSeleccion: ");
                genero = scan.next().toUpperCase().charAt(0);

                if(genero !='M' && genero != 'V'){
                    System.out.println("Solo puede ser");
                    System.out.println("Varon (V) o Mujer(M)");
                }
            }while(genero !='M' && genero != 'V');
            
            //Validando los Datos ingresados
            System.out.println("\n***********");
            System.out.printf("Edad: %d",edad);
            System.out.printf("\nGenero: %c",genero);
            System.out.println("\n*************");
            //******************************************
            
            if(edad>= 18){
                System.out.println("Tienes Mas de 18");
                System.out.println("Puedes ingresar solo!!!");
            }
            else if(edad>=15){
                System.out.println("Andas acompaniado (S/N)?");
                tutor = scan.next().toUpperCase().charAt(0);
                if(tutor == 'S'){
                    System.out.println("Si puedes ingresar");
                    System.out.println("pero siempre tienes que");
                    System.out.println("estar con tu companiero");
                }
                else{
                    System.out.println("Solo puedes ingresar");
                    System.out.println("acompaniado");
                }
            }else{
                System.out.println("No tienes la edad minima para");
                System.out.println("ingresar solo o acompaniado");
            }
            personas++;
        }//Fin del While
    }//Fin de Main
    
}//Fin Class
