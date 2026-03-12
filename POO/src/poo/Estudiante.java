/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author oscar
 */
public class Estudiante {
    
    //Variables - Atributos
    private String _nombre;
    private int _nota1;
    private int _nota2;
    private int _nota3;
    private double _promedio;
    

    //Constructor
    public Estudiante(){
        this._nombre = "John Doe";
        this._nota1 = 10;
        this._nota2 = 20;
        this._nota3 = 30;
        this._promedio = 40;
    }
    
    //Constructor -
    public Estudiante(String nombre){
        this._nombre = nombre;
        this._nota1 = 0;
        this._nota2 = 0;
        this._nota3 = 0;
    }
    
    //Funcion - Metodo
    public void MostrarDatos(){
        System.out.println("Datos del Estudiante");
        System.out.println("---------------------");
        System.out.printf("Nombre: %s\n",this._nombre);
        System.out.printf("Nota 1: %d\n",this._nota1);
        System.out.printf("Nota 2: %d\n",this._nota2);
        System.out.printf("Nota 3: %d\n",this._nota3);
        System.out.printf("Promedio: %.2f\n",this._promedio);
    }//Fin de Funcion
    
    //Get y Set
    //Get - Obtener
    public String GETnombre()
    {
        return this._nombre;
    }
    //Set - Establecer/Definir
    public void SETnombre(String nom){
        this._nombre = nom;
    }
    
    public int GETNota1()
    {
        return this._nota1;
    }
    public void SETNota1(int nota){
        this._nota1 = nota;
    }
    public int GETNota2()
    {
        return this._nota2;
    }
    public void SETNota2(int nota){
        this._nota2 = nota;
    }
    public int GETNota3()
    {
        return this._nota3;
    }
    public void SETNota3(int nota){
        this._nota3 = nota;
    }
    
    public double GETPromedio(int n1, int n2, int n3){
        return CalculoPromedio(n1, n2, n3);
        //return this._promedio;
    }
    
    private double CalculoPromedio(int n1, int n2, int n3){
        this._promedio = (n1+n2+n3)/3;
        return this._promedio;
    }
    
}//Fin de Class Estudiante
