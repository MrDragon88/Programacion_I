/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author Oscar Andrade
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Persona[] general= new Persona[2];
    Administrativo[] Teodoro = new Administrativo[2];
    
    general[0]=new Persona("Daniel",100);
    Teodoro[0]=new Administrativo("Carlos",100,"Finanzas");
    
        System.out.printf("Salario de %s es :%f",general[0].getNombre(),general[0].getSueldo());
        System.out.println("");
        Teodoro[0].setSueldo(100);
        System.out.printf("Salario de %s es :%f",Teodoro[0].getNombre(),Teodoro[0].getSueldo());
    
    
    
    }//Fin Main
    
}//Fin Class
