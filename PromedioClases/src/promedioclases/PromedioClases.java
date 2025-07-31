/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedioclases;
import java.util.Scanner;
/**
 *
 * @author Oscar Andrade
 */
public class PromedioClases {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Vamos a determinar si un estudiante X, despues
            te ingresar tres notas, calculando su promedio,
            ver si aprueba o no la materia.
        
            El mensaje tiene que ser personalizado.
        */
        Scanner sc = new Scanner(System.in);
        int nota1 =0;
        int nota2 = 0;
        int nota3 = 0;
        double promedio = 0;
        String nombre ="John Doe";
        
        System.out.println("Calculando Promedios");
        System.out.print("Dime tu 1ra Nota: ");
        nota1 = sc.nextInt();
        
        System.out.print("\nDime tu 2da Nota: ");
        nota2 = sc.nextInt();
        
        System.out.print("\nDime tu 3ra Nota: ");
        nota3 = sc.nextInt();
        
        //Calcular el promedio->Sumando todas las notas para
        //luego dividir entre el total de notas sumadas.
        
//Opcion 1
        //promedio = (nota1 + nota2 + nota3) / 3.0;
        
        //Opcion 2 ->casting
        promedio = (
                    (double)nota1 + 
                    (double)nota2 + 
                    (double)nota3
                   ) / 3;
        
        System.out.printf("Mi promedio es: %.2f",promedio);
        
        /*
            Estructura de Una Decision es
            Palabras clave: if, else
            a. Condicion de Evaluacion
            b. LLaves {} para establecer el bloque entero
            
            Comparar un dato contra otro
            a. Numeros a y b
                Dentro de un Rango
               a > b        -> a mayor b
               a < b        -> a menor b
               a >= b       -> a mayor o igual b
               a <= b       -> a menor o igual b
        
               a == b       -> a es igual b
               a !=b        -> a es distinto a b
            
        */
        //Condicion solo puede tener dos estados
        //  i.  VERDADERO
        //  ii. FALSO
        //La condicion sea un operador booleano
        if(promedio >= 65){
            //Condicion VERDADERA
            System.out.printf("%nAPROBADO con %.2f",promedio);
        }//Fin del IF
        //Else no lleva condicion
        else{
            //Condicion FALSO
            System.out.printf("%nREPROBADO con %.2f",promedio);
            
        }//Fin del ELSE
        
        System.out.println("Como te llamas?");
        nombre = sc.next();
        
        //Comparacion Cadena
        if(nombre.equals("oscar")){
            System.out.println("ohhh mira, te llamas como yo");
        }
        else{
            System.out.println("yo me llamo oscar");
        }
    }//Fin Main
    
}//Fin Class
