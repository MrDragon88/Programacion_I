/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intropoo;

/**
 *
 * @author Oscar Andrade
 */
public class Estudiante {
    
        //Atributos
        //Variables GLOBALES
        private String nombre;
        private String apellido;
        private int notaACUM_1;
        private int notaACUM_2;
        private int notaEXA_1;
        private int notaEXA_2;
        private int notaFINAL;
        
        
        //Constructor
        public Estudiante(){
            this.nombre = "John";
            this.apellido = "Doe";
            this.notaACUM_1 = 0;
            this.notaACUM_2 = 0;
            this.notaEXA_1 = 0;
            this.notaEXA_2 = 0;
        }
        
        public Estudiante(String nom, String ape){
            this.nombre = nom;
            this.apellido = ape;
        }
        
        public void setNombre(String nom){
            this.nombre = nom.toLowerCase();
        }
        
        public String getNombre(){
            return this.nombre;
        }
        //Metodos
        public void DatosEstudiante(){
            System.out.printf("Nombre: %s",this.nombre);
            System.out.printf("\nApellido: %s",this.apellido);
            System.out.println("");
        }
        
    
}//Fin Class Estudiante
