/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/***
 * La clase persona, esta disenada para tener todos los atributos
 * de una persona que trabaja y percibe una remuneraci[on
 * por sus servicios.
 * 
 * 
 * @author Oscar Andrade
 * @version 1.0
 * @since 6/dic/2024
 */
public class Persona {
    private String nombrePersona;
    protected double sueldo;
    
    /**
     * Constructor Persona
     * Sin Parametros
     * Inicializador de la persona
    */
    public Persona(){
        this.nombrePersona = "John Doe";
        this.sueldo = 0.0;
    }//Fin Constructor
    
    /**
     * Constructor Persona con Parametros
     * @param nombre
     * @param sueldo
    */
    public Persona(String nombre, double sueldo){
        this.nombrePersona = nombre;
        this.sueldo = sueldo;
    }//Fin Constructor
    
    public void setNombre(String nombre){
        this.nombrePersona = nombre;
    }
    
    public String getNombre(){
        return this.nombrePersona;
    }
    
    public void setSueldo(double salario){
        this.sueldo = salario;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
}//Fin Class Persona
