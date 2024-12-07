/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Oscar Andrade
 */
public class Docente extends Persona{
    
    private String cargo;
    private short horasTrabajadas;
    
    public Docente(String nombre, double salario){
        this.cargo = "General";
        this.horasTrabajadas = 1;
        super.setNombre(nombre);
        super.setSueldo(salario);
    }
    
    public void setCargo(String puesto){
        this.cargo = puesto;
    }
    
    public String getCargo()
    {
        return this.cargo;
    }
    
    public void setHorasTrabajadas(short horas){
        this.horasTrabajadas = horas;
    }
    
    public short getHorasTrabajas(){
        return this.horasTrabajadas;
    }
    
    
}//Fin Class Docente
