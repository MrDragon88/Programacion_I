/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author Oscar Andrade
 */
public class Administrativo extends Persona{
    
    private String areaTrabajo;
    
    
    public Administrativo(){
        this.areaTrabajo ="administrativo";
    }
    
    public Administrativo(String nombre, double salario, String area){
        this.areaTrabajo = area;
        super.setNombre(nombre);
        super.setSueldo(salario);
    }
    
    public void setAreaTrabajo(String area){
        this.areaTrabajo = area;
    }
    
    public String getAreaTrabajo(){
        return this.areaTrabajo;
    }
    
    @Override
    public void setSueldo(double salario){
        this.sueldo =salario*1.1;
    }

    
}//Fin Class Administrativo
