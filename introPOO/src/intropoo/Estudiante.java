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
    
    //Atributos -> Variables
    private String _nombre;
    private int _edad;
    private int[] _notas;
    private double _promedio;
    
    //Constructor
    public Estudiante(){
        System.out.println("Clase Estudiante Vacia");
        this._nombre = "John Doe";
        this._edad = 0;
        this._notas = new int[3];
        this._promedio = 0.0;
    }
    
    public Estudiante(String nombre, int edad){
        System.out.println("Clase con Parametros");
        this._nombre = nombre;
        this._edad = edad;
        
        this._notas = new int[3];
        this._promedio = 0.0;
    }
    
    //Metodos ->Funciones
    public String getNombre(){
        return this._nombre;
    }
    
    public void setNombre(String nombre){
        this._nombre = nombre;
    }
    
    public void MostrarDatos(){
        System.out.println("\n----------------------------------------");
        System.out.printf("%nNombre del Estudiante %s",this._nombre);
        System.out.printf("%nEdad del Estudiante: %d",this._edad);
        System.out.printf("%nNota 1: %d",this._notas[0]);
        System.out.printf("%nNota 2: %d",this._notas[1]);
        System.out.printf("%nNota 3: %d",this._notas[2]);
        System.out.printf("%nPromedio: %.2f",this._promedio);
    }
    
}//Fin Class
