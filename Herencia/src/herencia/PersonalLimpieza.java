/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Oscar Andrade
 */
public class PersonalLimpieza extends Persona{
    private String turno;
    
    
    public PersonalLimpieza(){}
    
    public PersonalLimpieza(String nombre, double salario, String turno){
        this.turno = "Turno A";
        super.setNombre(nombre);
        super.setSueldo(salario);
    }
    
    public void setTurno(String jornada){
       this.turno = jornada; 
    }//
    
    public String getTurno(){
        return this.turno;
    }
    
    
}//Fin Class Personal Limpieza
