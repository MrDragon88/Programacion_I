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
    private String _nombre;
    private char _genero;
    private int[] _notas = new int[4];
    private double _promedio;
    
    //Constructor
    Estudiante(){
        this._nombre = "John Doe";
        this._genero = 'm';
        this._promedio = 0;
        this._notas[0] = 0;
    }
    
    Estudiante(String nombre, char genero){
        this._nombre = nombre;
        this._genero = genero;
        this._promedio = 0;
        this._notas[0] = 0;
    }
    
    public void setNombre(String nombreEstudiante){
        this._nombre = nombreEstudiante;
    }
    
    public String getNombre(){
        return this._nombre;
    }
    
    public void setNotas(int[] notas){
        for(int i = 0; i<notas.length;i++){
            if(notas[i]>0 && notas[i]<=25){
                this._notas = notas;
            }
            else{
                notas[i]=0;
            }
        }//Fin For
        
    }//Fin setNotas
    
    public void MostrarNotas(){
        int dimension = this._notas.length;
        for (int i = 0; i< dimension; i++) {
            System.out.printf("Nota %d: %d",i+1,this._notas[i]);
            System.out.println("");
        }
    }
    
    public void MostrarDatosEstudiante(){
        System.out.println("Nombre: "+this._nombre);
        System.out.println("Genero: "+this._genero);
    }
}//Fin Class Estudiante
